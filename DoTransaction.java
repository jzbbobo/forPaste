package org.shirdrn.workflow.activiti.subprocess;

import java.util.logging.Logger;

public class DoTransaction implements JavaDelegate {
	
	private static final Logger log = Logger.getLogger(DoTransaction.class.getName());
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// varInSubprocess<->varOutFromSubprocess
		String varOutFromSubprocess = (String)execution.getVariable("varOutFromSubprocess");
		log.info("in mainprocess get(varOutFromSubprocess): " + varOutFromSubprocess);
		
		log.info("variavles=" + execution.getVariables());
		execution.setVariable("m:dt", "Mainprocess:DoTransaction");
		log.info("I am DoTransaction in mainprocess.");
	}
}
