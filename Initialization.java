package org.shirdrn.workflow.activiti.subprocess;

import java.util.logging.Logger;

public class Initialization implements JavaDelegate {
	
	private static final Logger log = Logger.getLogger(Initialization.class.getName());
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		log.info("variavles=" + execution.getVariables());
		execution.setVariable("m:i", "Mainprocess:Initialization");
		log.info("I am Initialization in mainprocess.");
		
		execution.setVariable("varOutFromMainprocess", "AAAA");
		log.info("in mainprocess set(varOutFromMainprocess): " + execution.getVariable("varOutFromMainprocess"));
	}
}
