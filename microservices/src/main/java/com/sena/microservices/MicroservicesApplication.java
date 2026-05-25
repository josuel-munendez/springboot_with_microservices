package com.sena.microservices;

import com.sena.microservices.objects.Vehiculo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesApplication.class, args);

		Vehiculo v = new Vehiculo();
		v.setPlaca("adsia");
		v.setId(234325);

		System.out.println("el Vehiculo" +
				v.getPlaca()+" "+
				v.getId()+" "
		);

		Vehiculo v2 = new Vehiculo();
		v2.setPlaca("nba78");
		v2.setId(234325);
	}

}
