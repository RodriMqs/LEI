import Contador.java;

public class Teste {

	public static void main(String[] args) {
		Contador c1 = new Contador();
		System.out.println("Valor incial = 0\n" + c1);
		Contador c2 = new Contador(5);
		System.out.println("Valor incial = 5\n" + c2);
		c1.Incrementar();
		System.out.println("C1 após incremento de 1 unidade\n" + c1);
		c2.Incrementar(10);
		System.out.println("C2 após incremento de 10 unidades\n" + c2);
		c1.Decrementar();
		System.out.println("C1 após decremento de 1 unidade\n" + c1);
		c2.Decrementar(10);
		System.out.println("C2 após decremento de 10 unidades\n" + c2);
		System.out.println("C2 após decremetno de 10 unidades\n" + c2);
		System.out.println("Consultar valor de c1 com getValor()" + "\nContador c1 = " + c1.getValor());
		c2.setValor(100);
		System.out.println("Valor do C2 após setValor(100)" + "\nContador C2 = " + c2.getValor());
		}
}
