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
public abstract class Pessoa {
      protected String nome;
      protected String documento;

      public Pessoa(){
          
      }
      
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
  
  public String setNome(String nome) {
      this.nome=nome;
          return null;
  }
  public String getNome(){
      return nome;
               
 }
    
public void exibeDados (String nome, String documento){
    System.out.println("\nNome:"+this.nome+"\nDocumento:"+this.documento);
   
    
    
}

    void exibeDados() {
      // change body of generated methods, choose Tools | Templates.
    }



}










    

