
public class TesteJogador {

	public static void main(String[] args) {
		Jogador J1 = new Jogador("Cristiano Ronaldo");
		Jogador J2 = new Jogador("Rui Costa", 2.0);
		
		J1.setSalario(20.0);
		System.out.println(J1.toString());
		System.out.println(J2.toString());
		

		J1.setGolosJornada(1,20);
		J1.setGolosJornada(2, 5);
		J1.setGolosJornada(3, 0);
		

		J2.setGolosJornada(1, 0);
		J2.setGolosJornada(2, 1);
		J2.setGolosJornada(3,3);
		
		J1.aumentarSalario(10.0);
        System.out.println("\nNovo salário de " + J1.getNome() + " após aumento de 10%: " + J1.getSalario() + "€");
        System.out.println(J1.getNome() + " marcou na 1ª jornada: " + J1.getGolosJornada(2) + " golo(s).");
        System.out.println(J2.getNome() + " marcou na 4ª jornada: " + J2.getGolosJornada(3) + " golo(s).");
        
        System.out.println("Total de golos do " + J1.getNome() + ": " + J1.consultarGolos());
        System.out.println("Total de golos do " + J2.getNome() + ": " + J2.consultarGolos());
        
	
	}

}
