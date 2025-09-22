package Mapa;

/**
 *
 * @author Matheus
 */
public class Vendedor extends Funcionario {

    private double venda = 2000;

    public Vendedor() {
        super();
    }

    @Override
    public void exibeDados() {
        System.out.println("\n---- Vendedor ----");
        super.exibeDados();
        System.out.println("Salário com comissão: " + (getSalario() + venda * 0.3));
    }

    public double getVenda() {
        return venda;
    }

    public void setVenda(double venda) {
        this.venda = venda;
    }
}
