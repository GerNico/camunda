package com.example.workflow;

import org.springframework.stereotype.Component;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Class SubProcessDelegate that responsible for
 *
 * @author Mykola.Matsishin <br> created on 14 July 2020
 * @since 4.9
 */
@Component
public class SubProcessDelegate implements JavaDelegate {
	@Override
	public void execute(DelegateExecution delegateExecution) {

		int random = (int) delegateExecution.getVariable("random");
		int dice = 0;
		if (random > 2) {
			for (int i = 0; i < random; i++) {
				dice += (int) (Math.random() * 6);
			}
		} else {
			throw new BpmnError(" is 1 or 0");
		}

		delegateExecution.setVariable("dice", dice);
	}
}