package Mapa;

/**
 *
 * @author Matheus
 */
public abstract class Pessoa {

    protected String nome;
    protected String documento;

    public Pessoa() {
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void exibeDados(String nome, String documento) {
        System.out.println("\nNome: " + this.nome + "\nDocumento: " + this.documento);
    }

    public void exibeDados() {
        // Pode ser sobrescrito nas subclasses
    }
}
