
package Mapa;

/**
 *
 * @author Matheus
 */
public abstract class  Funcionario extends Pessoa {
    
    protected double salario;
    protected int ramal;
    protected double anual;
    

    public Funcionario(){
        
    }
    

    public void setSalario(double salario) {
        this.salario = salario;
    }
        
        public double getSalario() {
        return salario;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    
    public double setCalculoSalarioAnual(double anual){
        this.anual+=anual*13;
        return anual;
        
    }
    public double getCalculoSalarioAnual(){
        System.out.println("Salario anual:" +this.anual );
        return 0;
    }
    
    
    
    @Override
        public void exibeDados()  {    
        System.out.println("\nNome: "+this.nome+"\nDocumento: "+this.documento);
        System.out.println("salario: "+this.salario+"\nramal: "+this.ramal);
               
    
   
}

    void exbideDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
