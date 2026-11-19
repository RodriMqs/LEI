import java.util.ArrayList;

public class TesteEmpregado {
    public static void main(String[] args) {

        Telefone t1 = new Telefone("Móvel", 912345678);
        Telefone t2 = new Telefone("Casa", 213456789);
        Telefone t3 = new Telefone("Emprego", 210000000);


        ArrayList<Telefone> contactosAna = new ArrayList<>();
        contactosAna.add(t1);


        Empregado emp1 = new Empregado(12345678, "Ana", 1500.0, contactosAna);
        Empregado emp2 = new Empregado(); 
        emp2.setNSS(87654321);
        emp2.setNome("Carlos");
        emp2.setSalario(2000.0);

        System.out.println(emp1);
        System.out.println(emp2);

        boolean add1 = emp1.adicionarContacto(t2);
        boolean add2 = emp1.adicionarContacto(t1);
        boolean add3 = emp2.adicionarContacto(t3); 

        System.out.println("\nAdicionar contactos");
        System.out.println("Adicionar a Ana: " + add1);
        System.out.println("Adicionar repetido a Ana: " + add2);
        System.out.println("Adicionar ao Carlos: " + add3 + "\n");

        System.out.println(emp1);
        System.out.println(emp2);
        
        System.out.println("\nNumero por Tipo");
        System.out.println("Casa Ana: " + emp1.numeroTipo("Casa"));
        System.out.println("movel Ana: " + emp1.numeroTipo("movel")); 
        System.out.println("movel Carlos: " + emp1.numeroTipo("movel"));

        System.out.println("\nAumento");
        System.out.println("Salário incial: " + emp1.getSalario());
        emp1.aumentarSalario(10.0);
        System.out.println("Salário final: " + emp1.getSalario());
        

    }
}