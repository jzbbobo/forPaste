package org.shirdrn.workflow.activiti.subprocess;

import java.util.HashMap;

public class CheckMerchantTask implements TaskListener {

	private final Logger log = Logger.getLogger(CheckMerchantTask.class.getName());
	
	@SuppressWarnings("unchecked")
	public void notify(DelegateTask delegateTask) {
		log.info("i am CheckMerchantTask.");
		System.out.println("in : " + delegateTask.getVariables());
		((HashMap<String, Object>)delegateTask.getVariables().get("in")).put("previous", "CheckMerchantTask");
	}
}
