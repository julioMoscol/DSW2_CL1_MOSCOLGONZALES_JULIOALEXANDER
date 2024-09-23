package DSW2.CL1.MOSCOLGONZALES_JULIOALEXANDER.EJERCICIO_2.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;

import java.io.*;
import java.time.Year;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Slf4j
public class FileService {

    private static final String FILE_PATH = "archivo_ejercicio.txt";

    @Async
    public CompletableFuture<String> crearArchivo_1() throws IOException{
        try(FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH); DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)){
            dataOutputStream.writeInt(2);
            dataOutputStream.writeDouble(43.2);
            dataOutputStream.writeUTF("Archivo creado");
            log.info("Se esta creando el archivo 1");
            TimeUnit.SECONDS.sleep(10);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return CompletableFuture.completedFuture("Archivo 1 creado, finalizao");
    }

    @Async
    public CompletableFuture<String> crearArchivo_2() throws IOException{
        try(FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH); DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)){
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
        try(FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH); DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)){
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

    /*public void abrirLeerArchivos() throws IOException{
        try(FileInputStream fileInputStream = new FileInputStream(FILE_PATH); DataInputStream dataInputStream = new DataInputStream(fileInputStream)){
            int n1 = dataInputStream.readInt();
            double n2 = dataInputStream.readDouble();
            String nombre_Archivo = dataInputStream.readUTF();
            log.info("N1: " + n1);
            log.info("N2: " + n2);
            log.info("Nombre del Archivo: " + nombre_Archivo);
        }
    }*/
}
