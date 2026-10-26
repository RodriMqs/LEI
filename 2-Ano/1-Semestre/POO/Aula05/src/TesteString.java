
public class TesteString {

	public static void main(String[] args) {
		String frase = "Programação Orientada";
		
		char letra = frase.charAt(0);
		System.out.println("Letra no indice 0 = " + letra);
		
		int tamanho = frase.length();
		System.out.println("Tamanho da frase = " + tamanho);
		
		int posicao = frase.indexOf("Orientada");
		System.out.println("Posição = " + posicao);
		
		
		String concatenado = frase.concat(" a Objetos");
		System.out.println("" + concatenado);
		
		String substring = frase.substring(10);
		System.out.println("Substring: " + substring);
		
		String novaString = "Programação Orientada";
		
		int comparacao = frase.compareTo(novaString);
		System.out.println("" + comparacao);
		
	}

}
