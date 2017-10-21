package com.sam.didemo;

import com.sam.didemo.controller.ConstructorInjectedController;
import com.sam.didemo.controller.GetterInjectedController;
import com.sam.didemo.controller.MyController;
import com.sam.didemo.controller.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController myController =(MyController) ctx.getBean("myController");
		myController.hello();


		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
