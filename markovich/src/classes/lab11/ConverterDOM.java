package classes.lab11;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;

import static classes.lab11.GardenTags.*;

public class ConverterDOM {

    public static void convertToXMLDOM(String pathFile, List<Plant> plants) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder;
        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();

            Element rootElement = document.createElementNS("http://www.w3schools.com", "garden");
            document.appendChild(rootElement);
            rootElement.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            rootElement.setAttribute("xsi:schemaLocation", "http://www.w3schools.com garden.xsd");

            for (Plant plant : plants) {
                if (plant instanceof Tree) {
                    rootElement.appendChild(printTree(document, plant));
                } else if (plant instanceof Shrub) {
                    rootElement.appendChild(printShrub(document, plant));
                }
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer optimusPrime = transformerFactory.newTransformer();

            optimusPrime.setOutputProperty(OutputKeys.INDENT, "yes");

            optimusPrime.transform(new DOMSource(document), new StreamResult(new File(pathFile)));
            System.out.println("XML-file was created");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Node getPlantElements(Document doc, Element element, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }

    private static Node printShrub(Document doc, Plant plant) {

        Element shrub = doc.createElement(SHRUB.toString().toLowerCase());

        shrub.appendChild(getPlantElements(doc, shrub, NAME.toString().toLowerCase(), plant.getName()));
        shrub.appendChild(getPlantElements(doc, shrub, AGE.toString().toLowerCase(), String.valueOf(plant.getAge())));
        shrub.appendChild(getPlantElements(doc, shrub, HEIGHT.toString().toLowerCase(), String.valueOf(plant.getHeight())));
        shrub.appendChild(getPlantElements(doc, shrub, BERRIES.toString().toLowerCase(), String.valueOf(((Shrub) plant).isBerries())));
        shrub.appendChild(getPlantElements(doc, shrub, FLOWERS.toString().toLowerCase(), String.valueOf(((Shrub) plant).getFlowers())));
        return shrub;
    }

    private static Node printTree(Document doc, Plant plant) {

        Element tree = doc.createElement(TREE.toString().toLowerCase());

        tree.appendChild(getPlantElements(doc, tree, NAME.toString().toLowerCase(), plant.getName()));
        tree.appendChild(getPlantElements(doc, tree, AGE.toString().toLowerCase(), String.valueOf(plant.getAge())));
        tree.appendChild(getPlantElements(doc, tree, HEIGHT.toString().toLowerCase(), String.valueOf(plant.getHeight())));
        tree.appendChild(getPlantElements(doc, tree, TRUNK.toString().toLowerCase(), String.valueOf(((Tree) plant).getTrunk())));
        return tree;
    }

}
