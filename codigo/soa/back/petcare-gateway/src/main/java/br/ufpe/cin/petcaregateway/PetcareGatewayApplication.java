package br.ufpe.cin.petcaregateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PetcareGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetcareGatewayApplication.class, args);
	}

}
