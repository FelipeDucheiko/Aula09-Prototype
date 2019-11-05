/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felip
 */
public class EstacionamentoFilial extends Estacionamento {
    
    public EstacionamentoFilial(String nome, int qtdVagas, Endereco endereco, double precoHora, String horarioFuncionamento, boolean vagasEspeciais, boolean sistemaLocalizacaoVagas){
        this.nome = nome;  
        this.qtdVagas = qtdVagas;  
        this.endereco = endereco;  
        this.precoHora = precoHora;  
        this.horarioFuncionamento = horarioFuncionamento;  
        this.vagasEspeciais = vagasEspeciais;  
        this.sistemaLocalizacaoVagas = sistemaLocalizacaoVagas;  
    }

    private EstacionamentoFilial(EstacionamentoFilial filial) throws CloneNotSupportedException {
        this.horarioFuncionamento = filial.getHorarioFuncionamento();
        this.precoHora = filial.getPrecoHora();
        this.sistemaLocalizacaoVagas = filial.isSistemaLocalizacaoVagas();
        this.vagasEspeciais = filial.isVagasEspeciais();
        
        this.endereco = filial.getEndereco().clone();
        this.endereco.setEstado(filial.getEndereco().getEstado());
        this.endereco.setCidade(filial.getEndereco().getCidade());     
    }

    @Override
    public Estacionamento clone() {
        try {
            return new EstacionamentoFilial(this);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(EstacionamentoFilial.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
