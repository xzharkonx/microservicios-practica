package com.usuarioservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@EnableJpaRepositories("com.microserviciostutorial.usuarioservice.*")
//@ComponentScan(basePackages = { "com.microserviciostutorial.usuarioservice.*" })
//@EntityScan("com.microserviciostutorial.usuarioservice")  
@SpringBootApplication
public class MicroserviciosTutorialUsuarioServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosTutorialUsuarioServiceApplication.class, args);
	}

}
