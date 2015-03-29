package workbook2.test7_8.parsers.impl;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import workbook2.test7_8.parsers.Parser;
import workbook2.test7_8.entity.Point;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Natashka on 19.03.2015.
 */
public class DOMParser implements Parser {
    public List<Point> parse(File file) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);
        Document document = null;
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(file);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parsing(document);
    }

    private List<Point> parsing(Document document) {
        List<Point> listOfPoints = new ArrayList<Point>();
        Element pointsList = document.getDocumentElement();
        System.out.println(pointsList.getTagName());
        NodeList points = pointsList.getChildNodes();
        setNameAndAttributes(listOfPoints, points);
        return listOfPoints;
    }

    private void setNameAndAttributes(List<Point> listOfPoints, NodeList points) {
        NodeList coordinates = null;
        for (int i = 0; i < points.getLength(); i++) {
            Node pointNode = points.item(i);
            Point point = new Point();
            point.setName(pointNode.getNodeName());
            if (pointNode.hasAttributes()) {
                NamedNodeMap attributes = pointNode.getAttributes();
                for (int j = 0; j < attributes.getLength(); j++) {
                    point.setUnits(attributes.item(j).getTextContent());
                }
            }
            if (pointNode.hasChildNodes()) {
                coordinates = pointNode.getChildNodes();
                setCoordinates(point, coordinates);
                listOfPoints.add(point);
            }
        }
    }

    private void setCoordinates(Point point, NodeList coordinates) {
        boolean coordinateXflag = true;
        boolean coordinateYflag = true;
        for (int k = 0; k < coordinates.getLength(); k++) {
            if (coordinates.item(k).getNodeType() == Node.ELEMENT_NODE) {
                if (coordinateXflag) {
                    point.setCoordinateX(Integer.parseInt(coordinates.item(k).getTextContent()));
                    coordinateXflag = false;
                } else if (coordinateYflag) {
                    point.setCoordinateY(Integer.parseInt(coordinates.item(k).getTextContent()));
                    coordinateYflag = false;
                }
            }
        }
    }
}
