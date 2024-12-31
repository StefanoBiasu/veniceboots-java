package it.sb.resdev;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "it.sb.resdev")
public class Application extends SpringBootServletInitializer {

	static Logger LOGGER = LogManager.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
	}
}