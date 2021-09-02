package com.example.spring.openshifht.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class SpringOpenshifhtApplication {
	
	@GetMapping("/")
	public String welcome() throws InterruptedException{
		Thread.sleep(2000);
		return "Bienvenido al mundo OpenShifht";
	}
	
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "Hola "+ input + " tu aplicación ha sido desplega";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringOpenshifhtApplication.class, args);
	}

}
