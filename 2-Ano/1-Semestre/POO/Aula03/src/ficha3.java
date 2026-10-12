import myinputs.Ler;

public class ficha3{

	static int [] lista;
	public static int menu() {
			System.out.println("Opções: ");
			System.out.println("1 – Ler array ");
			System.out.println("2 - Verificar os elementos e as suas posições");
			System.out.println("3 - Verificar qual o maior valor dentro do array");
			System.out.println("4 - Verificar a existencia de um int x dentro do array");
			System.out.println("0 - Terminar ");
			System.out.println("Qual a sua opção? ");
			int op = Ler.umInt();
			return op;
	}
	public static void lerArray(int [] listaInteiros) {
		System.out.println("Introduza os valores do array ");
		for (int i = 0 ; i < listaInteiros.length; i++ ) {
			System.out.println("Posição " + i + ":");
			listaInteiros[i] = Ler.umInt();
		}
	}
	public static void main(String[] args) {
		int escolha, dim = 0, maior = -1;
		do {
			escolha = menu();
			switch (escolha) {
			case 1:
				System.out.println("Qual a dimensão do array? ");
				dim = Ler.umInt();
				lista = new int [dim];
				lerArray(lista);
				break;
			case 2:
				for(int l = 0; l<dim; l++) {
					System.out.println("Posição[" + l + "] = " + lista[l]);
				}
				Ler.umaString();
				break;
			case 3:
				for (int l=0 ; l<dim ; l++) {
					if(lista[l]>maior) {
						maior = lista[l];
					}
				}
				System.out.println("O maior valor é " + maior);
				Ler.umaString();
				break;
			case 4:
				System.out.println("Insira o valor de x que quer verificar se está no array: ");
				int x = Ler.umInt();
				int cont = 0;
				boolean encontrou = false;
				for(int i = 0; i < dim; i++) {
					if(lista[i] == x) {
						cont++;
						encontrou = true;
					}
				}
				System.out.println("Resultado: " + encontrou + "\nQuandidade de vezes encontrado = " + cont);
				Ler.umaString();
				break;
			}
		} while (escolha != 0);
	}
}