package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@EnableAutoConfiguration
@ComponentScan
@Configuration
سوف يتم استبدالهم مع @SpringBootApplication
*/

//@SpringBootApplication(scanBasePackages = {"controller"}) في حال كان كونتروبر خارج الباكج
@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args); // this is bootstrap for spring boot
		/*
		1- يقوم بعمل كونتير
		2- يقو بتحميل Tomcat ويشغل التطبيق عليه
		 */
	}

}
/*
Folder resources
	- static folder   : for store bootstrap css javascript
	- templates folder: for store views(html pages or jsp)

JAR diff WAR
 تختلف بينهم هيكلة المشروع واهم اختلاف ملفات التي شرحناها سابقا

*/
