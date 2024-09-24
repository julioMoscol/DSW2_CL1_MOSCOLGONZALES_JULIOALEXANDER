package DSW2.CL1.MOSCOLGONZALES_JULIOALEXANDER.EJERCICIO_2.Controller;

import DSW2.CL1.MOSCOLGONZALES_JULIOALEXANDER.EJERCICIO_2.service.ManejoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RequiredArgsConstructor
@RestController
public class ManejoController {

    private final ManejoService manejoService;

    @GetMapping("/manejar-archivos")
    public String manejarArchivos() throws ExecutionException, InterruptedException, IOException {

        CompletableFuture<String> resultado = manejoService.generarArchivos();
        return resultado.get();
    }
}
