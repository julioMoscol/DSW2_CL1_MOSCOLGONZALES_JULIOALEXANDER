package DSW2.CL1.MOSCOLGONZALES_JULIOALEXANDER.EJERCICIO_2.service;

import DSW2.CL1.MOSCOLGONZALES_JULIOALEXANDER.EJERCICIO_2.remote.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

@RequiredArgsConstructor
@Service
public class ManejoService {

    private final FileService fileService;

    public CompletableFuture<String> generarArchivos() throws IOException {
        CompletableFuture<String> archivo1 = fileService.crearArchivo_1();
        CompletableFuture<String> archivo2 = fileService.crearArchivo_2();
        CompletableFuture<String> archivo3 = fileService.crearArchivo_3();

        return CompletableFuture.allOf(archivo1, archivo2, archivo3).thenApply(result -> {
            try{
                String valorArchivo1 = archivo1.join();
                String valorArchivo2 = archivo2.join();
                String valorArchivo3 = archivo3.join();

                return "Resultado de ejecuciones: "
                        +valorArchivo1+"-"
                        +valorArchivo2+"-"
                        +valorArchivo3;
            }catch (Exception ex){
                return "Error al combinar los datos " +ex.getMessage();
            }
        }).exceptionally(ex ->  "Error al ejecutar taras " + ex.getMessage());
    }
}
