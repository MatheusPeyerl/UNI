/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

/**
 *
 * @author Matheus
 */
public class Presidente extends Funcionario{
    @Override
    public void exibeDados(){
       System.out.println("\n----Presidente----");
        System.out.println("nome:"+getNome());
        System.out.println("Documento:"+getDocumento());
        System.out.println("Salario:"+getSalario());
        System.out.println ("Ramal:"+getRamal());
        System.out.println (+getCalculoSalarioAnual());
     
    
    
}

}