import java.io.*;
import myinputs.Ler;
import java.util.Arrays;


public class Ficha02 {
	public static void main(String[] args) {
			/*System.out.println("Introduza 3 Inteiros:");
			int a = Ler.umInt();
			int b= Ler.umInt();
			int c = Ler.umInt();
			System.out.println("Os inteiros que introduziu foi: " + a + ", " + b + ", " + c);
			int maior = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
			System.out.print("Maior inteiro = " + maior);*/
		
		/*ex 1 
		System.out.println("Escreva dois inteiros, p e u, tal que p <= u");
		int p = Ler.umInt();
		int u = Ler.umInt();
		
		if (p > u) {
			System.out.println("Erro , p > u");
			System.exit(0);
		}
	
		int soma = 0;
		for (int i = p; i <= u; i++ ) {
			soma+=i;
		}
		int i = p;
		while( i <= u) {
			soma += i;
			i++;
		}
		
		int i = p;
		do {
			soma += i;
			i++;
		} while(i <= u);
	System.out.println("Soma = " + soma);*/
		
		/*ex 2
		System.out.println("Escreva uma palavra:");
		String s = Ler.umaString();
		if(s.isEmpty()) {
			System.out.print("Nenhuma palavra foi introduzida"); 
			System.exit(0);
		}
		
		char menor = s.charAt(0);
		int tamanho = s.length();
		for (int i = menor; i <= tamanho; i++) {
			char letra =  s.charAt(i);
			if(letra < menor) {
				menor = letra;
			}
		}
		System.out.println("Palavra: " + s);
		System.out.print("Caracter com menor ASCII: " + menor);*/
		
		/*ex 3
		System.out.println("Insira um numero inteiro positivo: ");
		int num = Ler.umInt();
		if (num < 0) {
			System.out.println("ERRO");
			System.exit(0);
		}
		
        int original = num;
        int invertido = 0;
        
        while (num > 0) {   
        	int unidades = num % 10;
            invertido = invertido * 10 + unidades;
            num = num / 10;              
        }
        
        System.out.println("Número original: " + original);
        System.out.println("Número invertido: " + invertido);*/
		
		//ex 4 e 5
		int[] escolha = new int[6];
		        
		for (int i = 0; i < 6; i++) {
			System.out.print("Insira o " + (i + 1) + "º número (entre 1 e 49): ");
			int num = Ler.umInt();
		    escolha[i] = num;
		 }
		         
		Arrays.sort(escolha);
		System.out.println("Sua chave introduzida: " + Arrays.toString(escolha));

		int[] chave = new int[6];
		int fim = 0;
		        
		while (fim < 6) {
			int num = (int) (Math.random() * 49) + 1;
			chave[fim] = num;
			fim++;
		}
		        
		Arrays.sort(chave);
        System.out.println("Chave gerada automaticamente: " + Arrays.toString(chave));
		 
	
	
	
	
	
	
	
	
	
	
	
	}
}