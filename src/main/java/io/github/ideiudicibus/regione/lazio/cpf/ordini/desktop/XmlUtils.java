package io.github.ideiudicibus.regione.lazio.cpf.ordini.desktop;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * 
 * @author ignazio de iudicibus i.deiudicibus@gmail.com
 * http://stackoverflow.com/questions/18445152/unindent-or-linearize-xml
 * http://stackoverflow.com/questions/139076/how-to-pretty-print-xml-from-java
 */
public class XmlUtils {

	private static final String XML_LINEARIZATION_REGEX = "(>|&gt;){1,1}(\\t)*(\\n|\\r)+(\\s)*(<|&lt;){1,1}";

	private static final String XML_LINEARIZATION_REPLACEMENT = "$1$5";

	
	/**
	 * 
	 * @param xml
	 * @return linearized
	 */
	public static String linarizeXml(String xml) {

		return (xml != null) ? xml.trim().replaceAll(XML_LINEARIZATION_REGEX, XML_LINEARIZATION_REPLACEMENT) : null;
	}

	/**
	 * 
	 * @param xml
	 * @param indent
	 * @return pretty formatted xml
	 */
	public static String prettyFormat(String xml, int indent) {
	    try {
	        Source xmlInput = new StreamSource(new StringReader(xml));
	        StringWriter stringWriter = new StringWriter();
	        StreamResult xmlOutput = new StreamResult(stringWriter);
	        TransformerFactory transformerFactory = TransformerFactory.newInstance();
	        transformerFactory.setAttribute("indent-number", indent);
	        Transformer transformer = transformerFactory.newTransformer(); 
	        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	        transformer.transform(xmlInput, xmlOutput);
	        return xmlOutput.getWriter().toString();
	    } catch (Exception e) {
	        throw new RuntimeException(e); // simple exception handling, please review it
	    }
	}
}
