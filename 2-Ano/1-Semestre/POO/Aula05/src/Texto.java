import myinputs.Ler;
public class Texto {
	public static void main(String[] args) {
		String texto = "The competent programmer is fully aware of the limited size of his own skull. He therefore\r\n"
				+ "approaches his task with full humility, and avoids clever tricks like the plague.";
		
		int quantidadeChar = texto.length();
		
		int quantidadeCharSemEspaco = 0;
		
		for(int i = 0 ; i < quantidadeChar ; i++) {
			if(texto.charAt(i) != ' ' ) {
				quantidadeCharSemEspaco ++;
			}	
		}
		
		
		int qnt_palavras = 0;
		
		
		
		
		
		String textominusculo = texto.toLowerCase();
		for (char letra = 'a' ; letra <= 'z' ; letra++) {
			int contador = 0;
			for(int i = 0 ; i < quantidadeChar ; i++) {
				if (textominusculo.charAt(i) == letra) {
					contador++;
				}
			}
			if (contador > 0) {
	            System.out.println("   '" + letra + "': " + contador);
	        }
		}
				
		
		System.out.println("Digite a palavra que quer procurar: ");
		String procura = Ler.umaString();
		int posicao = texto.indexOf(procura);
		if (posicao != -1) {
			System.out.println("A palavra pertence ao texto e está na posição: " + posicao);

		}
		else {
			System.out.println("A palavra não pertence ao texto");
		}
		
		System.out.println("Quantidade de caracteres: " + quantidadeChar);
		System.out.println("Quantidade de ca
		
	}
	
}
