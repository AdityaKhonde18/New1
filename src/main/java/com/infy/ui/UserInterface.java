package com.infy.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.bean.WelcomeBean;
import com.infy.configuration.SpringConfig;

public class UserInterface {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringConfig.class);
		WelcomeBean welcomeBean = applicationContext.getBean(WelcomeBean.class);
		// WelcomeBean welcomeBean = (WelcomeBean)
		// applicationContext.getBean("welcomeBean");
		welcomeBean.printWelcome();
	}
}
