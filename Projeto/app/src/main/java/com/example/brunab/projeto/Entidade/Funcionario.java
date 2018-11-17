package com.example.brunab.projeto.Entidade;

import java.util.Date;

public class Funcionario {

    private String id;
    private String cpfFunc;
    private String rgFunc;
    private String nomeFunc;
    private String endFunc;
    private String cargo;
    private Date dataDemissao;
    private Date dataAdmissao;
    private Boolean supervisor;

    public Funcionario(){
        //construtor vazio, exigencia do Firebase
    }

    public Funcionario(String id, String cpfFunc, String rgFunc, String nomeFunc, String endFunc, String cargo){
        this.id = id;
        this.cpfFunc = cpfFunc;
        this.rgFunc = rgFunc;
        this.nomeFunc = nomeFunc;
        this.endFunc = endFunc;
        this.cargo = cargo;
    }

    public String getCpfFunc() {
        return cpfFunc;
    }

    public String getRgFunc() {
        return rgFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public String getEndFunc() {
        return endFunc;
    }

    public String getCargo() {
        return cargo;
    }

    public Date getDataDemissao() {
        return dataDemissao;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public Boolean getSupervisor() {
        return supervisor;
    }
}
