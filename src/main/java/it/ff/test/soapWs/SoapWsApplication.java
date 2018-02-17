package it.ff.test.soapWs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"it.ff.soapWs", "webservice"})
public class SoapWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapWsApplication.class, args);
	}
}
