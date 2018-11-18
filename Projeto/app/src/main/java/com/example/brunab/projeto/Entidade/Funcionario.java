package com.example.brunab.projeto.Entidade;

import java.util.Date;

public class Funcionario {

    private String id;
    private String cpfFunc;
    private String rgFunc;
    private String nomeFunc;
    private String endFunc;
    private Date dataDemissao;
    private Date dataAdmissao;
    private Boolean supervisor;

    public Funcionario(){
        //construtor vazio, exigencia do Firebase
    }

    public Funcionario(String id, String cpfFunc, String rgFunc, String nomeFunc, String endFunc){
        this.id = id;
        this.cpfFunc = cpfFunc;
        this.rgFunc = rgFunc;
        this.nomeFunc = nomeFunc;
        this.endFunc = endFunc;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCpfFunc(String cpfFunc) {
        this.cpfFunc = cpfFunc;
    }

    public void setRgFunc(String rgFunc) {
        this.rgFunc = rgFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public void setEndFunc(String endFunc) {
        this.endFunc = endFunc;
    }

    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setSupervisor(Boolean supervisor) {
        this.supervisor = supervisor;
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
