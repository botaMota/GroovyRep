package xml;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by a609848 on 14/04/2016.
 */
public class JavaPersonParser {

    public static void main(String[] args){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document =  builder.parse(new File("src/main/resources/people.xml"));
            NodeList names = document.getElementsByTagName("name");
            Node node = names.item(1);
            String nodeValue = node.getFirstChild().getNodeValue();
            System.out.println("The second name is : "+nodeValue);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
