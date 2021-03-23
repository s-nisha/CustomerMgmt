package com.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.task.customer.ui.ConsoleUI;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CustomerApplication.class, args);
		
		ConsoleUI Customerui = context.getBean(ConsoleUI.class);
		
		Customerui.start();
	}

}
