/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;



public class Principal{
     
   public static void main (String[] args){
      
      Secretaria a= new Secretaria();
      Secretaria f= new Secretaria();
        a.setDocumento("15782");
        a.setNome("Ana");
        a.setSalario(3250);
        a.setRamal(15);
        a.setCalculoSalarioAnual(3250);
        f.setDocumento("14795");
        f.setNome("Fatima");
        f.setSalario(3075);
        f.setRamal(12);
      
       Cliente ma = new Cliente();
       Cliente jo = new Cliente();
       Cliente el = new Cliente();
       Cliente lu = new Cliente();
             ma.setNome("Marcos");
             ma.setDocumento("187000");
             ma.setUsuario("marosfw");
             ma.setSenha("senha");
             jo.setNome("Joana");
             jo.setDocumento("189000");
             jo.setUsuario("joanafw");
             jo.setSenha("123456");
             el.setNome("Elisa");
             el.setDocumento("185000");
             el.setUsuario("elisafw");
             el.setSenha("123456");
             lu.setNome("Lucas");
             lu.setDocumento("184000");
             lu.setUsuario("lucasfw");
             lu.setSenha("teste");
             lu.setSenha("segredo");
            
             
           
             
       Presidente as = new Presidente();
             as.setNome("Asdrubal Leôncio Correa");
             as.setDocumento("0023134057");
             as.setSalario(9000);
             as.setRamal(001);
             as.setCalculoSalarioAnual(9000);
       Vendedor j = new Vendedor();
       Vendedor v = new Vendedor();
       Vendedor c = new Vendedor();
             j.setNome("Joao");
             j.setSalario(3000);
             j.setDocumento("1974");
             j.setRamal(9);
  
             v.setNome("Vanessa");
             v.setSalario(2500);
             v.setDocumento("1624");
             v.setRamal(11);
             c.setNome("Carlos");
             c.setSalario(2300);
             c.setDocumento("1582");
             c.setRamal(7);
         
   
    a.exibeDados();
    a.getCalculoSalarioAnual();
    f.exibeDados();
    j.exibeDados();
    v.exibeDados();
    c.exibeDados();
    as.exibeDados();
    
    
    ma.exibeDados();
    jo.exibeDados();
    el.exibeDados();
    lu.exibeDados();
    lu.setSenha("123456");
    lu.exibeDados();
   
    
   }
   
   
   
      
}