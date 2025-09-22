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
public class Vendedor extends Funcionario {
    
     double venda = 2000;
     

  
    public void Funcionario(){
        
    } 
       
      @Override
    public void exibeDados(){
        System.out.print("\n----Vendedor----");
        super.exibeDados();
        System.out.println("Salario com comissão: "+(getSalario()+venda*0.3));
       
    }
            
    
    
    
}
