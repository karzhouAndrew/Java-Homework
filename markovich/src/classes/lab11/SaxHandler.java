package classes.lab11;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import static classes.lab11.GardenTags.*;

import java.util.*;

public class SaxHandler extends DefaultHandler {

    public List<Plant> plantList = new ArrayList<Plant>();

    private Stack<String> elementStack = new Stack<String>();
    private Stack<Object> objectStack = new Stack<Object>();
    Plant tree;
    Plant shrub;

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        this.elementStack.push(qName);

        if (TREE.toString().equalsIgnoreCase(qName)) {
            tree = new Tree();
            this.objectStack.push(tree);
        } else if (SHRUB.toString().equalsIgnoreCase(qName)) {
            shrub = new Shrub();
            this.objectStack.push(shrub);
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {

        this.elementStack.pop();

        if (TREE.toString().equalsIgnoreCase(qName)) {
            plantList.add(tree);
        } else if (SHRUB.toString().equalsIgnoreCase(qName)) {
            plantList.add(shrub);
        }
    }

    public void characters(char ch[], int start, int length) throws SAXException {

        String value = new String(ch, start, length).trim();

        if (NAME.toString().equalsIgnoreCase(currentElement()) && TREE.toString().equalsIgnoreCase(currentElementParent())) {
            tree.setName(value);
        } else if (AGE.toString().equalsIgnoreCase(currentElement()) && TREE.toString().equalsIgnoreCase(currentElementParent())) {
            tree.setAge(Double.parseDouble(value));
        } else if (HEIGHT.toString().equalsIgnoreCase(currentElement()) && TREE.toString().equalsIgnoreCase(currentElementParent())) {
            tree.setHeight(Double.parseDouble(value));
        } else if (TRUNK.toString().equalsIgnoreCase(currentElement()) && TREE.toString().equalsIgnoreCase(currentElementParent())) {
            ((Tree) tree).setTrunk(Double.parseDouble(value));
        } else if (NAME.toString().equalsIgnoreCase(currentElement()) && SHRUB.toString().equalsIgnoreCase(currentElementParent())) {
            shrub.setName(value);
        } else if (AGE.toString().equalsIgnoreCase(currentElement()) && SHRUB.toString().equalsIgnoreCase(currentElementParent())) {
            shrub.setAge(Double.parseDouble(value));
        } else if (HEIGHT.toString().equalsIgnoreCase(currentElement()) && SHRUB.toString().equalsIgnoreCase(currentElementParent())) {
            shrub.setHeight(Double.parseDouble(value));
        } else if (BERRIES.toString().equalsIgnoreCase(currentElement()) && SHRUB.toString().equalsIgnoreCase(currentElementParent())) {
            ((Shrub) shrub).setBerries(Boolean.parseBoolean(value));
        } else if (FLOWERS.toString().equalsIgnoreCase(currentElement()) && SHRUB.toString().equalsIgnoreCase(currentElementParent())) {
            ((Shrub) shrub).setFlowers(value);
        }
    }

    private String currentElement() {
        return this.elementStack.peek();
    }

    private String currentElementParent() {
        if (this.elementStack.size() < 2) return null;
        return this.elementStack.get(this.elementStack.size() - 2);
    }
}