package com.example.workflow;

import java.util.Optional;

import org.springframework.stereotype.Component;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Class PerformCommand that responsible for
 *
 * @author Mykola.Matsishin <br> created on 21 July 2020
 * @since 4.9
 */
@Component
public class PerformCommand implements JavaDelegate {
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("Performing command");
		Integer times = (Integer) execution.getVariable("times");
		if (times != null) {
			times++;
		} else {
			times = 1;
		}
		execution.setVariable("times", times);
		execution.setVariable("done", false);
	}
}
