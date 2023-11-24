package Model;

import java.io.Serializable;

public class Usuario implements Serializable {
    //atributos
    private String nome;
    private int idade;

    //construtor
    public Usuario(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    //gets and sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
