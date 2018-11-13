package com.example.brunab.projeto.Entidade;

public class Cliente extends Pessoa {

    private String cnh;
    private Integer numDependentes;

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Integer getNumDependentes() {
        return numDependentes;
    }

    public void setNumDependentes(Integer numDependentes) {
        this.numDependentes = numDependentes;
    }
}
