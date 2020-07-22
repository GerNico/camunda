package com.example.workflow;

import org.springframework.stereotype.Component;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Class CheckControlableDevices that responsible for
 *
 * @author Mykola.Matsishin <br> created on 21 July 2020
 * @since 4.9
 */
@Component
public class CheckControllableDevices implements JavaDelegate {
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("checking devices");
	}
}
