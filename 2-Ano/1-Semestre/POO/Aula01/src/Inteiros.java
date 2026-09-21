import javax.swing.JOptionPane;

public class Inteiros {

	public static void main(String[] args) {
		/** EXERCICO 3
		 * String as = JOptionPane.showInputDialog("Introduza o 1º valor inteiro:");
		
		String bs = JOptionPane.showInputDialog("Introduza o 2º valor inteiro:");
		String cs = JOptionPane.showInputDialog("Introduza o 3º valor inteiro:");
		
		int a = Integer.parseInt(as);
		int b = Integer.parseInt(bs);
		int c = Integer.parseInt(cs);
		
		int d = a + b + c;
		
		JOptionPane.showMessageDialog(null, "Soma = " +  d);*/
		
		
		
		// EXERICCIO 4
		/*int positivos = 0;
		int negativos = 0;
		int zeros = 0;
		
		
		for( int i = 1 ; i<= 10000 ; i++) {
			int valor = (int) (Math.random() * 200) - 100;
			if ( valor < 0) negativos++;
			if (valor > 0) positivos++;
			if ( valor == 0) zeros++;
		}
		
		System.out.println("Positivos =  " + positivos);
		System.out.println("Negativos = " + negativos);
		System.out.print("Zeros = " + zeros);
		
		
		JOptionPane.showMessageDialog(null, "Quantidade de positivos = " + positivos + "\nQuantidade de negativos= " + negativos + "\nQuantidade de zeros= " + zeros);*/
		
		
		//EXERCICIO 5
	        /*String horario = JOptionPane.showInputDialog(null, "Introduza as horas: (0 a 23)");
	        	        
	        int horas = Integer.parseInt(horario);
	            switch (horas) {
	                case 5, 6, 7, 8, 9, 10, 11:
	                    JOptionPane.showMessageDialog(null, "Bom dia!");
	                    break;
	                case 12, 13, 14, 15, 16, 17, 18:
	                    JOptionPane.showMessageDialog(null, "Boa tarde!");
	                    break;
	                default:
	                    // Tudo o resto (19 a 23 e 0 a 4) é Boa Noite
	                    JOptionPane.showMessageDialog(null, "Boa Noite!");
	                    break;
	            }
	        System.exit(0);*/
		
	}

}
