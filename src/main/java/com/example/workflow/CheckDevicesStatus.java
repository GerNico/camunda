package com.example.workflow;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Class CheckDevicesStatus that responsible for
 *
 * @author Mykola.Matsishin <br> created on 21 July 2020
 * @since 4.9
 */
@Component
public class CheckDevicesStatus implements JavaDelegate {
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("Controlling execution status");
		List<Boolean> statusList = Arrays.asList(true, true, false);
		execution.setVariable("command", "ON");
		execution.setVariable("statusList", statusList);
	}
}
