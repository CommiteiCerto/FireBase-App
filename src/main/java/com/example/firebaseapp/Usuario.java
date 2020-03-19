package com.example.firebaseapp;

public class Usuario {

    private String nome;
    private String sobrNome;
    private int idade;

    public Usuario() {
    }

    public String getNome() { return nome;
    }

    public void setNome(String nome) { this.nome = nome;
    }

    public String getSobrNome() { return sobrNome;
    }

    public void setSobrNome(String sobrNome) { this.sobrNome = sobrNome;
    }

    public int getIdade() { return idade;
    }

    public void setIdade(int idade) { this.idade = idade;
    }
}
