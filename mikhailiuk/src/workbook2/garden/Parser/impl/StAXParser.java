package workbook2.garden.Parser.impl;

import workbook2.garden.Parser.Parser;
import workbook2.garden.entity.Plant;
import workbook2.garden.entity.PlantFactory;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Natashka on 24.03.2015.
 */
public class StAXParser implements Parser {
    @Override
    public List<Plant> parse(File file) {
        XMLInputFactory factory = XMLInputFactory.newFactory();
        XMLStreamReader reader = null;
        List<Plant> plantList = new ArrayList<Plant>();
        PlantFactory plantFactory = new PlantFactory();
        Random random = new Random();
        try {
            reader = factory.createXMLStreamReader(new FileInputStream(file));
            Plant plant = null;
            String tagName;
            boolean name = false;
            boolean age = false;
            boolean height = false;
            while (reader.hasNext()) {
                int result = reader.next();
                if (result == XMLStreamConstants.START_ELEMENT) {
                    tagName = reader.getLocalName();
                    if (tagName.equals("garden")) {
                        System.out.println("Получение обьектов растений...");
                    } else if (tagName.equals("tree")) {
                        plant = plantFactory.createPlant(tagName, reader.getAttributeValue(0), reader.getAttributeValue(1));
                    } else if (tagName.equals("bush")) {
                        plant = plantFactory.createPlant(tagName, reader.getAttributeValue(0), reader.getAttributeValue(1));
                    } else if (tagName.equals("name")) {
                        name = true;
                    } else if (tagName.equals("age")) {
                        age = true;
                    } else if (tagName.equals("height")) {
                        height = true;
                    }
                } else if (result == XMLStreamConstants.CHARACTERS) {
                    if (name) {
                        plant.setName(reader.getText());
                        name = false;
                    } else if (age) {
                        plant.setAge(Integer.parseInt(reader.getText()));
                        age = false;
                    } else if (height) {
                        plant.setHeight(Double.parseDouble(reader.getText()));
                        height = false;
                    }
                } else if (result == XMLStreamConstants.END_ELEMENT) {
                    tagName = reader.getLocalName();
                    if (tagName.equals("tree") || tagName.equals("bush")) {
                        plant.plant(plantList,plant);
                    }
                }
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return plantList;
    }
}

