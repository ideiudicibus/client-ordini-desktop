package io.github.ideiudicibus.regione.lazio.cpf.ordini.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Node;
import org.xmlunit.builder.Input;
import org.xmlunit.xpath.JAXPXPathEngine;

public class OrdiniServiceTest {

    private OrdiniService ordiniService;
    private InputStream is;
    private Properties prop;
    
    @Before
    public void constructService() throws IOException{
	String u,p;
	prop = new Properties();
	is =this.getClass().getResourceAsStream(this.getClass().getSimpleName()+".properties");
	prop.load(is);
	u=prop.getProperty("username");
	p=prop.getProperty("password");
	assertNotNull(u);
	assertNotNull(p);
	
	ordiniService=new OrdiniWebServiceWrapperImpl(u,p);
	
	
    }
    @Test
    public void testGetOrdine() {
	
	String ordineId=prop.getProperty("testGetOrdineId.ordineId");
	assertNotNull(ordineId);
	try {
	    String ordineXml=(String) ordiniService.getOrdineDocument(ordineId);
	    
	    Iterable<Node> i = new JAXPXPathEngine().selectNodes("//DocumentID", Input.fromString(ordineXml).build());
	    assertNotNull(i);
	    int count = 0;
	    for (Iterator<Node> it = i.iterator(); it.hasNext();) {
	        count++;
	        Node node = it.next();
	        assertEquals("DocumentID", node.getNodeName());
	        assertEquals(ordineId,node.getTextContent());
	    }
	} catch (OrdiniServiceException e) {
	   
	    e.printStackTrace();
	    fail();
	}
	
    }
    
    @After
    public void releaseResources() throws Exception{
	
	ordiniService=null;
	prop=null;
	if(is!=null){
		
		is.close();
	}
	
    }

}
