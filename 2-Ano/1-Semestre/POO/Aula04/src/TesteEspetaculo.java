import myinputs.Ler;
public class TesteEspetaculo {

	public static void main(String[] args) {
		Espetaculo espe1;
		Espetaculo espe2;
		
		espe1 = new Espetaculo("Espetaculo 1", 100, 20.0);
		espe2 = new Espetaculo("Espetaculo 2", 50, 30.0);
		
		int opcao = -1;
		
		while (opcao != 0 ) {
			System.out.println("1 - Consultar Espetáculos");
			System.out.println("2 - Comprar bilhete para um espetáculo");
			System.out.println("3 - Consultar o valor total realizado até ao momento na venda de bilhetes para os dois espetáculos");
			System.out.println("0 - SAIR");
			
			opcao = Ler.umInt();
			switch(opcao) {
			case 1:
				System.out.println("Consultar Espetaculo:");
				System.out.println("Espetaculo 1: " + espe1);
				System.out.println("Espetaculo 2: " + espe2);
				break;
				
			case 2:
				System.out.println("Escolha o espetaculo:");
				System.out.println("1 - " + espe1.getNome());
				System.out.println("2 - " + espe2.getNome());
				int escolhaespetaculo = Ler.umInt();
				if(escolhaespetaculo == 1) {
					String compra = espe1.comprarBilhete();
					System.out.println(compra);
				}
				if(escolhaespetaculo == 2) {
					String compra = espe2.comprarBilhete();
					System.out.println(compra);
				}
				else {
					System.out.println("Escolha inválida");
				}
				break;
			
			case 3:
				double total = espe1.valortotal() + espe2.valortotal();
				System.out.println("Valor total ganho com os dois espetaculos = " + total);
				break;
			
			case 0:
				System.out.println("Encerrar");
				break;	
			
			default:
				System.out.println("Opção Inválida");
			}
			
		}
	}

}
