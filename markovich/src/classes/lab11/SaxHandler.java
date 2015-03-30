package classes.lab11;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.*;


public class SaxHandler extends DefaultHandler {

    String treeName, shrubName, shrubFlowers;
    double treeAge, treeHeight, treeTrunk, shrubAge, shrubHeight;
    boolean shrubBerries;

    public List<Tree> treeList = new ArrayList<Tree>();
    public List<Shrub> shrubList = new ArrayList<Shrub>();

    private Stack<String> elementStack = new Stack<String>();
    private Stack<Object> objectStack = new Stack<Object>();


    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        this.elementStack.push(qName);

        if ("tree".equals(qName)) {
            Tree tree = new Tree("", 0, 0);
            this.objectStack.push(tree);
        } else if ("shrub".equals(qName)) {
            Shrub shrub = new Shrub("", 0, 0);
            this.objectStack.push(shrub);
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {

        this.elementStack.pop();

        if ("tree".equals(qName)) {
            treeList.add(new Tree(treeName, treeAge, treeHeight, treeTrunk));
        } else if ("shrub".equals(qName)) {
            shrubList.add(new Shrub(shrubName, shrubAge, shrubHeight, shrubBerries, shrubFlowers));
        }
    }

    public void characters(char ch[], int start, int length) throws SAXException {

        String value = new String(ch, start, length).trim();

        if ("name".equals(currentElement()) && "tree".equals(currentElementParent())) {
            treeName = value;
        } else if ("age".equals(currentElement()) && "tree".equals(currentElementParent())) {
            treeAge = Double.parseDouble(value);
        } else if ("height".equals(currentElement()) && "tree".equals(currentElementParent())) {
            treeHeight = Double.parseDouble(value);
        } else if ("trunk".equals(currentElement()) && "tree".equals(currentElementParent())) {
            treeTrunk = Double.parseDouble(value);
        } else if ("name".equals(currentElement()) && "shrub".equals(currentElementParent())) {
            shrubName = value;
        } else if ("age".equals(currentElement()) && "shrub".equals(currentElementParent())) {
            shrubAge = Double.parseDouble(value);
        } else if ("height".equals(currentElement()) && "shrub".equals(currentElementParent())) {
            shrubHeight = Double.parseDouble(value);
        } else if ("berries".equals(currentElement()) && "shrub".equals(currentElementParent())) {
            shrubBerries = Boolean.parseBoolean(value);
        } else if ("flowers".equals(currentElement()) && "shrub".equals(currentElementParent())) {
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