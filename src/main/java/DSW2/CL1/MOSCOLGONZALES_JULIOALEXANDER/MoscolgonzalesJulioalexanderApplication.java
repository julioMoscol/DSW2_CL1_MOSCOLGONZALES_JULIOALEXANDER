package DSW2.CL1.MOSCOLGONZALES_JULIOALEXANDER;

import DSW2.CL1.MOSCOLGONZALES_JULIOALEXANDER.EJERCICIO_2.Controller.ManejoController;
import DSW2.CL1.MOSCOLGONZALES_JULIOALEXANDER.EJERCICIO_2.remote.service.FileService;
import DSW2.CL1.MOSCOLGONZALES_JULIOALEXANDER.EJERCICIO_2.service.ManejoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@Slf4j
@RequiredArgsConstructor
@EnableAsync
@SpringBootApplication
public class MoscolgonzalesJulioalexanderApplication implements CommandLineRunner {

	private final ManejoController manejoController;

	public static void main(String[] args) {
		SpringApplication.run(MoscolgonzalesJulioalexanderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Ejecutando Ejercicio");
		manejoController.manejarArchivos();
		log.info("Ejercicio terminado");
	}
}
