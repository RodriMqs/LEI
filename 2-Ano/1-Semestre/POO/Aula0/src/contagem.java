
public class contagem {

	public static void main(String[] args) {
		//CONTAGEM COM FOR
		/*for (int n = 1; n <= 100; n++) {
			System.out.println(n);
		}*/
		
		//CONTAGEM COM WHILE
		/*int n = 1;
		while (n <= 100) {
			System.out.println(n);
			n++;
		}*/
		
		//CONTAGEM COM DO WHILE
		/*int n = 1;
		do {
			System.out.println(n);
			n++;
		} while(n <= 100);*/
		
		//SOMATORIO DE 1 A 100 
		/*int somatorio = 0;
		for(int n = 1; n<=100; n++) {
			somatorio = somatorio + n;
		}
		System.out.print("Somatorio: " + somatorio);*/
	
		//SOMATORIO DE 1 A 100 APENAS OS IMPARES
		/*int somatorio = 0;
		for (int n = 1; n<=100; n = n + 2) {
			somatorio = somatorio + n;
		}
		System.out.print("Somatorio: " + somatorio);*/
		
		//PRODUTO DE 1 A 100
		double produto = 1;
		for (int n = 1 ; n <=100 ; n++) {
			produto = produto * n;
			System.out.println("Produto: " + produto);
		}
		
	
	}
}
