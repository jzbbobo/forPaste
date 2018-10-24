package org.shirdrn.workflow.activiti.subprocess;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.shirdrn.workflow.activiti.AbstractTest;

/**
 * @author shirdrn
 */
public class MySubProcessTest extends AbstractTest {

	@Override
	protected void initialize() throws Exception {
		Deployment deployment = repositoryService
		.createDeployment()
		.addClasspathResource(
				"diagrams/SubProcessTest.MySubprocess.bpmn20.xml")
		.deploy();	
		deploymentId = deployment.getId();
	}

	@Override
	protected void destroy() throws Exception {
		repositoryService.deleteDeployment(deploymentId, true);	
	}
	
	public void testSubProcess() {
		// prepare data packet
		Map<String, Object> variables = new HashMap<String, Object>();
		Map<String, Object> subVariables = new HashMap<String, Object>();
		variables.put("maxTransCount", 1000000);
		variables.put("merchant", new Merchant("ICBC"));
		variables.put("protocol", "UM32");
		variables.put("repository", "10.10.38.99:/home/shirdrn/repository");
		variables.put("in", subVariables);
		variables.put("out", new HashMap<String, Object>());
		
		// start process instance
		ProcessInstance pi = runtimeService.startProcessInstanceByKey("MySubprocess", variables);
		
		// enter subprocess
		List<Task> tasks = taskService.createTaskQuery().processInstanceId(pi.getId()).orderByTaskName().asc().list();
		assertEquals(2, tasks.size());
		
		for(Task task : tasks) {
			taskService.complete(task.getId());
		}
		
		// leave subprocess
		Task collectTask = taskService.createTaskQuery().processInstanceId(pi.getId()).singleResult();
		assertEquals("Collect message", collectTask.getName());
		
		Map<String, Object> taskVariables = new HashMap<String, Object>();
		taskVariables.put("att", "anything you need");
		taskService.setVariable(collectTask.getId(), "oper", "shirdrn");
		taskService.complete(collectTask.getId(), taskVariables);
	}

}
