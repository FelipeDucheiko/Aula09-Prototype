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
public class Teste {
    
    public static void main(String[] args){
        
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das Flores");
        endereco.setNum(452);
        endereco.setBairro("Centro");
        endereco.setCidade("Ponta Grossa");
        endereco.setEstado("PR");
        
        Estacionamento estacionamento1 = new EstacionamentoFilial("Centro", 500, endereco, 8.00, "8:00 - 20:00", true, true);
        
        Estacionamento estacionamento2 = estacionamento1.clone();
        estacionamento2.setNome("Uvaranas");
        estacionamento2.setQtdVagas(200);
        estacionamento2.getEndereco().setBairro("Uvaranas");
        estacionamento2.getEndereco().setNum(300);
        estacionamento2.getEndereco().setRua("Rua José Silva");
        
        Estacionamento estacionamento3 = estacionamento1.clone();
        estacionamento3.setNome("Jardim Carvalho");
        estacionamento3.setQtdVagas(250);
        estacionamento3.getEndereco().setBairro("Uvaranas");
        estacionamento3.getEndereco().setNum(1259);
        estacionamento3.getEndereco().setRua("Rua Joaquim Lopes");
        
        System.out.println(estacionamento1.exibirInfo());
        
        System.out.println("\n");
        
        System.out.println(estacionamento2.exibirInfo());
        
        System.out.println("\n");
        
        System.out.println(estacionamento3.exibirInfo());
        
    }
    
}
