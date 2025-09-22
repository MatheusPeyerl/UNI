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
public class Cliente extends Pessoa {
    
    private String usuario;
    private String senha="teste";
    private boolean se;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean equal (Object obj){
        return ((Cliente) obj).senha.equals(this.senha); 
}
	
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    @Override
    public void exibeDados(){
       super.exibeDados();
        System.out.println("\n----Cliente----\nusuario:"+this.usuario+"\nsenha:"+this.senha);
        System.out.println("nome:"+getNome());
        System.out.println("Documento:"+getDocumento());
        System.out.println("Password is:"+getSe());  
    }

	public void setSe(String senha){
		
		this.senha = senha;
	}
	
	public boolean getSe(){			
	    if(senha == null || senha.equals("")){
	    	se = false;
	    }else 
                if("123456".equals(senha)){	    	
	    	se = true;
	    }

	    return se;
	}
}

    




