public class TesteTelefone {
    public static void main(String[] args) {
        Telefone t1 = new Telefone("Móvel", 912345678);
        Telefone t2 = new Telefone("Móvel", 912345678);
        Telefone t3 = new Telefone("Casa", 213456789);   

        System.out.println("equals");
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
        System.out.println("t3: " + t3);
        System.out.println("t1.equals(t2)" + t1.equals(t2));
        System.out.println("t1.equals(t3)" + t1.equals(t3));

        System.out.println("clone");
        Telefone t4 = (Telefone) t1.clone();
        System.out.println("t1:" + t1);
        System.out.println("t4:" + t4);

        System.out.println((t1 == t4)); 
        System.out.println(t1.equals(t4));

        t4.setTipo("Emprego");
        t4.setNumero(999888777);

        System.out.println("\nApós modificar o clone (t4):");
        System.out.println("Original" + t1);
        System.out.println("Clonado" + t4);
    }
}