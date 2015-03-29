package workbook2.garden.Parser.impl;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;
import workbook2.garden.Parser.Parser;
import workbook2.garden.entity.Plant;
import workbook2.garden.entity.PlantFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Natashka on 24.03.2015.
 */
public class SAXParser extends DefaultHandler implements Parser {
    private ArrayList<Plant> plantList = null;
    private Plant plant = null;
    private String tag;
    private boolean name = false;
    private boolean age = false;
    private boolean height = false;

    @Override
    public List<Plant> parse(File file) {
        plantList = new ArrayList<Plant>();
        try {
            XMLReader reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(SAXParser.this);
            reader.parse(new InputSource(file.getAbsolutePath()));
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return plantList;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        tag = localName;
        if (tag.equals("tree") || tag.equals("bush")) {
            PlantFactory plantFactory = new PlantFactory();
            plant = plantFactory.createPlant(localName, attributes.getValue(0), attributes.getValue(1));
        } else if (tag.equals("name")) {
            name = true;
        } else if (tag.equals("age")) {
            age = true;
        } else if (tag.equals("height")) {
            height = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        tag = localName;
        if (tag.equals("tree") || tag.equals("bush")) {
            plant.plant(plantList, plant);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length).trim();
        if (value.length()==0){
            return;
        }
        if (tag.equals("name")) {
            plant.setName(value);
            name = false;
        } else if (tag.equals("age")) {
            plant.setAge(Integer.parseInt(value));
            age = false;
        } else if (tag.equals("height")) {
            plant.setHeight(Double.parseDouble(value));
            height = false;
        }
    }
}
