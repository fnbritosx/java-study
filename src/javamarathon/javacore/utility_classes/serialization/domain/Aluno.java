package javamarathon.javacore.utility_classes.serialization.domain;


import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 1221270120135161780L;

    private int id;
    private String name;
    private transient long password;
    private transient Turma turma;

    public Aluno(int id, String name, long password, Turma turmaTemp) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.turma = turmaTemp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", turma=" + turma +
                '}';
    }

    @Serial
    private void writeObject(ObjectOutputStream oos){
        try{
            oos.defaultWriteObject();
            oos.writeUTF(turma.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois){
        try{
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);

        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
