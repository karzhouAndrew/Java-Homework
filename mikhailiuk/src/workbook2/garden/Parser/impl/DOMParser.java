package workbook2.garden.Parser.impl;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import workbook2.garden.Parser.Parser;
import workbook2.garden.entity.Plant;
import workbook2.garden.entity.PlantFactory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Natashka on 24.03.2015.
 */
public class DOMParser implements Parser {
    @Override
    public List<Plant> parse(File file) {
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

    private List<Plant> parsing(Document document) {
        List<Plant> listOfPlants = new ArrayList<Plant>();
        Element garden = document.getDocumentElement();
        System.out.println(garden.getTagName());
        NodeList plants = garden.getChildNodes();
        setTypeAndAttributes(listOfPlants, plants);
        return listOfPlants;
    }

    private void setTypeAndAttributes(List<Plant> listOfPlants, NodeList plants) {
        PlantFactory plantFactory = new PlantFactory();
        Node plantNode = null;
        Plant plant = null;
        if (plants.getLength() != 0) {
            for (int i = 0; i < plants.getLength(); i++) {
                plantNode = plants.item(i);
                NamedNodeMap attributes = plantNode.getAttributes();
                if (plantNode.getNodeType() == Node.ELEMENT_NODE) {
                    plant = plantFactory.createPlant(plantNode.getNodeName(), attributes.item(1).getTextContent(), attributes.item(0).getTextContent());
                    if (plantNode.hasChildNodes()) {
                        NodeList nameAgeHeight = plantNode.getChildNodes();
                        setNameAgeHeight(plant, nameAgeHeight);
                        plant.plant(listOfPlants, plant);
                    }
                }
            }
        }
    }

    private void setNameAgeHeight(Plant plant, NodeList nameAgeHeight) {
        boolean name = true;
        boolean age = true;
        boolean height = true;
        for (int k = 0; k < nameAgeHeight.getLength(); k++) {
            if (nameAgeHeight.item(k).getNodeType() == Node.ELEMENT_NODE) {
                if (name) {
                    plant.setName(nameAgeHeight.item(k).getTextContent());
                    name = false;
                } else if (age) {
                    plant.setAge(Integer.parseInt(nameAgeHeight.item(k).getTextContent()));
                    age = false;
                } else if (height) {
                    plant.setHeight(Double.parseDouble(nameAgeHeight.item(k).getTextContent()));
                    height = false;
                }
            }
        }
    }
}
