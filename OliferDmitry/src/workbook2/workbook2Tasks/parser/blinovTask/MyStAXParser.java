package workbook2.workbook2Tasks.parser.blinovTask;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class MyStAXParser {

    public static List<Plant> parseXML(String fileName) throws FileNotFoundException, XMLStreamException {

        XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
        XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(new FileInputStream(fileName));
        List<Plant> plantList = new ArrayList<Plant>();
        List<Tree> treeList = new ArrayList<Tree>();
        List<Bush> bushList = new ArrayList<Bush>();
        boolean bTree = false, bBush = false, bTreeName = false, bTreeAge = false, bTreeHeight = false, bBushName = false, bBushAge = false, bBushHeight = false, bBerries = false, bInflorescence = false;
        String treeName = "";
        double treeAge = 0;
        double treeHeight = 0;
        String bushName = "";
        double bushAge = 0;
        double bushHeight = 0;
        boolean bushBerries = false;
        String bushInflorescence = "";

        while (xmlStreamReader.hasNext()) {
            int result = xmlStreamReader.next();
            if (result == xmlStreamReader.START_ELEMENT) {
                String currentNode = xmlStreamReader.getLocalName();
                if (!bTree && !bBush && currentNode.equalsIgnoreCase(Tags.TREE.toString()))
                    bTree = true;
                else if (!bTree && !bBush && currentNode.equalsIgnoreCase(Tags.BUSH.toString()))
                    bBush = true;
                else if (bTree && !bBush && currentNode.equalsIgnoreCase(Tags.NAME.toString()))
                    bTreeName = true;
                else if (bTree && !bBush && currentNode.equalsIgnoreCase(Tags.AGE.toString()))
                    bTreeAge = true;
                else if (bTree && !bBush && currentNode.equalsIgnoreCase(Tags.HEIGHT.toString()))
                    bTreeHeight = true;
                else if (bBush && !bTree && currentNode.equalsIgnoreCase(Tags.NAME.toString()))
                    bBushName = true;
                else if (bBush && !bTree && currentNode.equalsIgnoreCase(Tags.AGE.toString()))
                    bBushAge = true;
                else if (bBush && !bTree && currentNode.equalsIgnoreCase(Tags.HEIGHT.toString()))
                    bBushHeight = true;
                else if (bBush && !bTree && currentNode.equalsIgnoreCase(Tags.BERRIES.toString()))
                    bBerries = true;
                else if (bBush && !bTree && currentNode.equalsIgnoreCase(Tags.INFLORESCENCE.toString()))
                    bInflorescence = true;
            } else if (result == xmlStreamReader.CHARACTERS) {
                if (bTreeName && bTree && !bBush) {
                    treeName = xmlStreamReader.getText();
                    bTreeName = false;
                } else if (bBushName && bBush && !bTree) {
                    bushName = xmlStreamReader.getText();
                    bBushName = false;
                } else if (bTreeAge && bTree && !bBush) {
                    treeAge = Double.parseDouble(xmlStreamReader.getText());
                    bTreeAge = false;
                } else if (bBushAge && bBush && !bTree) {
                    bushAge = Double.parseDouble(xmlStreamReader.getText());
                    bBushAge = false;
                } else if (bTreeHeight && bTree && !bBush) {
                    treeHeight = Double.parseDouble(xmlStreamReader.getText());
                    bTreeHeight = false;
                } else if (bBushHeight && bBush && !bTree) {
                    bushHeight = Double.parseDouble(xmlStreamReader.getText());
                    bBushHeight = false;
                } else if (bBerries && bBush && !bTree) {
                    bushBerries = xmlStreamReader.getText().equalsIgnoreCase("true");
                    bBerries = false;
                } else if (bInflorescence && bBush && !bTree) {
                    bushInflorescence = xmlStreamReader.getText();
                    bInflorescence = false;
                }
                if (bTree && !treeName.equals("") && treeAge != 0 && treeHeight != 0)
                    bTree = false;
                if (bBush && !bushName.equals("") && bushAge != 0 && bushHeight != 0 && !bushInflorescence.equals(""))
                    bBush = false;
            }
            if (!bushName.equals("") && bushAge != 0 && bushHeight != 0 && !bushInflorescence.equals("")) {
                bushList.add(new Bush(bushName, bushAge, bushHeight, bushBerries, bushInflorescence));
                bushName = bushInflorescence = "";
                bushAge = bushHeight = 0;
                bushBerries = false;
            } else if (!treeName.equals("") && treeAge != 0 && treeHeight != 0) {
                treeList.add(new Tree(treeName, treeAge, treeHeight));
                treeName = "";
                treeAge = treeHeight = 0;
            }
        }

        for (Tree tree : treeList) {
            plantList.add(tree);
        }
        for (Bush bush : bushList) {
            plantList.add(bush);
        }
        return plantList;
    }
}
