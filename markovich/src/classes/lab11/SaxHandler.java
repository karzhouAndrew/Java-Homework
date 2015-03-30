package classes.lab11;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import static classes.lab11.GardenTags.*;

import java.util.*;


public class SaxHandler extends DefaultHandler {

    private String treeName, shrubName, shrubFlowers;
    private double treeAge, treeHeight, treeTrunk, shrubAge, shrubHeight;
    private boolean shrubBerries;

    public List<Tree> treeList = new ArrayList<Tree>();
    public List<Shrub> shrubList = new ArrayList<Shrub>();

    private Stack<String> elementStack = new Stack<String>();
    private Stack<Object> objectStack = new Stack<Object>();


    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        this.elementStack.push(qName);

        if (TREE.toString().equalsIgnoreCase(qName)) {
            Tree tree = new Tree("", 0, 0);
            this.objectStack.push(tree);
        } else if (SHRUB.toString().equalsIgnoreCase(qName)) {
            Shrub shrub = new Shrub("", 0, 0);
            this.objectStack.push(shrub);
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {

        this.elementStack.pop();

        if (TREE.toString().equalsIgnoreCase(qName)) {
            treeList.add(new Tree(treeName, treeAge, treeHeight, treeTrunk));
        } else if (SHRUB.toString().equalsIgnoreCase(qName)) {
            shrubList.add(new Shrub(shrubName, shrubAge, shrubHeight, shrubBerries, shrubFlowers));
        }
    }

    public void characters(char ch[], int start, int length) throws SAXException {

        String value = new String(ch, start, length).trim();

        if (NAME.toString().equalsIgnoreCase(currentElement()) && TREE.toString().equalsIgnoreCase(currentElementParent())) {
            treeName = value;
        } else if (AGE.toString().equalsIgnoreCase(currentElement()) && TREE.toString().equalsIgnoreCase(currentElementParent())) {
            treeAge = Double.parseDouble(value);
        } else if (HEIGHT.toString().equalsIgnoreCase(currentElement()) && TREE.toString().equalsIgnoreCase(currentElementParent())) {
            treeHeight = Double.parseDouble(value);
        } else if (TRUNK.toString().equalsIgnoreCase(currentElement()) && TREE.toString().equalsIgnoreCase(currentElementParent())) {
            treeTrunk = Double.parseDouble(value);
        } else if (NAME.toString().equalsIgnoreCase(currentElement()) && SHRUB.toString().equalsIgnoreCase(currentElementParent())) {
            shrubName = value;
        } else if (AGE.toString().equalsIgnoreCase(currentElement()) && SHRUB.toString().equalsIgnoreCase(currentElementParent())) {
            shrubAge = Double.parseDouble(value);
        } else if (HEIGHT.toString().equalsIgnoreCase(currentElement()) && SHRUB.toString().equalsIgnoreCase(currentElementParent())) {
            shrubHeight = Double.parseDouble(value);
        } else if (BERRIES.toString().equalsIgnoreCase(currentElement()) && SHRUB.toString().equalsIgnoreCase(currentElementParent())) {
            shrubBerries = Boolean.parseBoolean(value);
        } else if (FLOWERS.toString().equalsIgnoreCase(currentElement()) && SHRUB.toString().equalsIgnoreCase(currentElementParent())) {
            shrubFlowers = value;
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