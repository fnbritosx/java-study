package javamarathon.javacore.utility_classes.serialization.test;

import javamarathon.javacore.utility_classes.serialization.domain.Aluno;
import javamarathon.javacore.utility_classes.serialization.domain.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) throws IOException {
        Turma turma = new Turma("Bom e novo");
        Aluno aluno = new Aluno(1, "Fernando", 12127, turma);

        Path path = Paths.get("src/javamarathon/javacore/utility_classes/serialization/docs/cadastro_aluno.txt");

        if (Files.notExists(path.getParent())){
            Files.createDirectories(path.getParent());
        }
        
        if (Files.notExists(path)){
            Files.createFile(path);
        }
        
        serializacao(aluno, path);

        desserializacao(path);
    }

    public static void serializacao(Aluno aluno, Path path){

        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void desserializacao(Path path){

        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            System.out.println(ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
           e.printStackTrace();
        }
    }
}
