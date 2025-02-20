package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args); // this is bootstrap for spring boot
	}

}
/*
Folder resources
	- static folder   : for store bootstrap css javascript
	- templates folder: for store views(html pages or jsp)

JAR diff WAR
 تختلف بينهم هيكلة المشروع واهم اختلاف ملفات التي شرحناها سابقا

 */
