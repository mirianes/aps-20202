package br.ufpe.cin.petcareservicoprocedimento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PetcareServicoProcedimentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetcareServicoProcedimentoApplication.class, args);
	}

}
