/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.prototype;

/**
 *
 * @author felip
 */
public abstract class Estacionamento {
    String nome;
    int qtdVagas;
    Endereco endereco;
    double precoHora;
    String horarioFuncionamento;
    boolean vagasEspeciais;
    boolean sistemaLocalizacaoVagas;
    
    public abstract Estacionamento clone();
    
    public String exibirInfo(){
        return "Nome: " + getNome() + 
               "\n Quantidade de Vagas: " + getQtdVagas() + 
               "\n Endereço: " + getEndereco().getRua() + ", n. " + getEndereco().getNum() + ", " + getEndereco().getBairro() + ", " + getEndereco().getCidade() + "-" + getEndereco().getEstado() +
               "\n Preço por Hora: " + getPrecoHora() +
               "\n Horário Funcionamento: " + getHorarioFuncionamento() +
               "\n Vagas Especiais: " + isVagasEspeciais() +
               "\n Sistema de Localizaçao de vagas: " + isSistemaLocalizacaoVagas(); 
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the qtdVagas
     */
    public int getQtdVagas() {
        return qtdVagas;
    }

    /**
     * @param qtdVagas the qtdVagas to set
     */
    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the precoHora
     */
    public double getPrecoHora() {
        return precoHora;
    }

    /**
     * @param precoHora the precoHora to set
     */
    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    /**
     * @return the horarioFuncionamento
     */
    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    /**
     * @param horarioFuncionamento the horarioFuncionamento to set
     */
    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    /**
     * @return the vagasEspeciais
     */
    public boolean isVagasEspeciais() {
        return vagasEspeciais;
    }

    /**
     * @param vagasEspeciais the vagasEspeciais to set
     */
    public void setVagasEspeciais(boolean vagasEspeciais) {
        this.vagasEspeciais = vagasEspeciais;
    }

    /**
     * @return the sistemaLocalizacaoVagas
     */
    public boolean isSistemaLocalizacaoVagas() {
        return sistemaLocalizacaoVagas;
    }

    /**
     * @param sistemaLocalizacaoVagas the sistemaLocalizacaoVagas to set
     */
    public void setSistemaLocalizacaoVagas(boolean sistemaLocalizacaoVagas) {
        this.sistemaLocalizacaoVagas = sistemaLocalizacaoVagas;
    }
    
}
