package com.example.workflow;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Class PetJavaDelegate that responsible for
 *
 * @author Mykola.Matsishin <br> created on 13 July 2020
 * @since 4.9
 */
@Component
public class PetJavaDelegate implements JavaDelegate {

	private static Map<String, String> accountConfigs = new HashMap<>();

	static {
		accountConfigs.put("123", "John Smith");
		accountConfigs.put("124", "Big Jack");
		accountConfigs.put("125", "Garry Hogs");
	}

	@Override
	public void execute(DelegateExecution delegateExecution) {
		String accountId = (String) delegateExecution.getVariable("accountId");
		String user = accountConfigs.get(accountId);
		int random = (int) (Math.random() * 10);

		delegateExecution.setVariable("user", user);
		delegateExecution.setVariable("random", random);
	}
}
