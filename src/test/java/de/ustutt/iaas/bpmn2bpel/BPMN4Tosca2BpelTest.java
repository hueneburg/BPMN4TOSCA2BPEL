package de.ustutt.iaas.bpmn2bpel;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.ustutt.iaas.bpmn2bpel.parser.ParseException;
import de.ustutt.iaas.bpmn2bpel.planwriter.PlanWriterException;


public class BPMN4Tosca2BpelTest {
	
	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testTransform() throws ParseException, PlanWriterException, MalformedURLException, URISyntaxException {
/*		URI srcUrl = new URI("file:///Users/wagnerse/Documents/OpenTOSCA/BPMN4TOSCA2BPEL/BPMN4TOSCA2BPEL/src/test/resources/echo/echoplan_setup_vm.json");
		URI targetUrl = new URI("file:///Users/wagnerse/Documents/Echo/managementplan.zip");
		
		BPMN4Tosca2BPEL transformer = new BPMN4Tosca2BPEL();
		transformer.transform(srcUrl, targetUrl);*/
	}
	
}
