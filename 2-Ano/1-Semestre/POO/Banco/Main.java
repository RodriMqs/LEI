package Banco;

public class Main {
    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("cc");

        p1.Depositar(100f);
        p1.sacar(50f);
        p1.pagarMensal();

        Conta p2 = new Conta();
        p2.setNumConta(2222);
        p2.setDono("Rebeca");
        p2.abrirConta("cp");

        p2.Depositar(500f);
        p2.sacar(100f);
        p2.pagarMensal();

        //TENTAR FECHAR UMA CONTA COM SALDO (Deve dar erro)
        p1.fecharConta();

        System.out.println("\nESTADO FINAL DAS CONTAS");
        mostrarEstado(p1);
        mostrarEstado(p2);
    }


    public static void mostrarEstado(Conta c) {
        System.out.println("---------------------------------");
        System.out.println("Conta: " + c.getNumConta());
        System.out.println("Dono: " + c.getDono());
        System.out.println("Tipo: " + (c.getTipo().equals("cc") ? "Conta Corrente" : "Conta Poupança"));
        System.out.println("Saldo: " + c.getSaldo());
        System.out.println("Status: " + (c.getStatus() ? "Aberta" : "Fechada"));
    }
}