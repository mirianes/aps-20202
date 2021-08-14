package br.ufpe.cin.petcarediscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PetcareDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetcareDiscoveryServerApplication.class, args);
	}

}
