package com.sam.didemo;

import com.sam.didemo.controller.ConstructorInjectedController;
import com.sam.didemo.controller.GetterInjectedController;
import com.sam.didemo.controller.MyController;
import com.sam.didemo.controller.PropertyInjectedController;
import com.sam.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController myController =(MyController) ctx.getBean("myController");


		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource);


	}
}
