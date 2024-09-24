package DSW2.CL1.MOSCOLGONZALES_JULIOALEXANDER.EJERCICIO_2.remote.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.io.*;
import java.time.Year;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class FileService {

    private static final String FILE_PATH1 = "archivo_ejercicio_1.txt";
    private static final String FILE_PATH2 = "archivo_ejercicio_2.txt";
    private static final String FILE_PATH3 = "archivo_ejercicio_3.txt";

    @Async
    public CompletableFuture<String> crearArchivo_1() throws IOException{
        try(FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH1); DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)){
            dataOutputStream.writeInt(2);
            dataOutputStream.writeDouble(43.2);
            dataOutputStream.writeUTF("Archivo creado");
            log.info("Se esta creando el archivo 1");
            Thread.sleep(10000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return CompletableFuture.completedFuture("Archivo 1 creado, finalizao");
    }

    @Async
    public CompletableFuture<String> crearArchivo_2() throws IOException{
        try(FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH2); DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)){
            dataOutputStream.writeInt(2);
            dataOutputStream.writeDouble(43.2);
            dataOutputStream.writeUTF("Archivo creado");
            log.info("Se esta creando el archivo 2");
            TimeUnit.SECONDS.sleep(5);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return CompletableFuture.completedFuture("Archivo 2 creado, finalizao");
    }

    @Async
    public CompletableFuture<String> crearArchivo_3() throws IOException{
        try(FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH3); DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)){
            dataOutputStream.writeInt(2);
            dataOutputStream.writeDouble(43.2);
            dataOutputStream.writeUTF("Archivo creado");
            log.info("Se esta creando el archivo 3");
            TimeUnit.SECONDS.sleep(7);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return CompletableFuture.completedFuture("Archivo 3 creado, finalizao");
    }
}
