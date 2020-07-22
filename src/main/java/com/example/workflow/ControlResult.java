package com.example.workflow;

import org.springframework.stereotype.Component;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Class ControllResult that responsible for
 *
 * @author Mykola.Matsishin <br> created on 21 July 2020
 * @since 4.9
 */
@Component
public class ControlResult implements JavaDelegate {
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("controlling execution result");
		Integer times = (Integer) execution.getVariable("times");
		boolean isDone = times > 8;
		execution.setVariable("done", isDone);
	}
}
