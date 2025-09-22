package Mapa;

public class Principal {

    public static void main(String[] args) {

        // --- Secretarias ---
        Secretaria a = new Secretaria();
        Secretaria f = new Secretaria();

        a.setDocumento("15782");
        a.setNome("Ana");
        a.setSalario(3250);
        a.setRamal(15);
        a.setCalculoSalarioAnual(3250);

        f.setDocumento("14795");
        f.setNome("Fatima");
        f.setSalario(3075);
        f.setRamal(12);

        // --- Clientes ---
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
        lu.setSenha("segredo"); // sobrescreve a senha anterior

        // --- Presidente ---
        Presidente as = new Presidente();
        as.setNome("Asdrubal Leôncio Correa");
        as.setDocumento("0023134057");
        as.setSalario(9000);
        as.setRamal(1);
        as.setCalculoSalarioAnual(900
