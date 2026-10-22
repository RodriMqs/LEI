public class Teste {

	public static void main(String[] args) {
		Livro livro1;
		Livro livro2;
		
		livro1 = new Livro();
		livro1.setTitulo("POO");
		livro1.setPreco(20.0);
		livro1.setExemplares(2);
		
		livro2 = new Livro();
		livro2.setTitulo("IHC");
		livro2.setPreco(10.0);
		livro2.setExemplares(3);
		
		System.out.println("Livro 1: " + livro1);
		System.out.println("Livro 2: " + livro2);
		
		livro1.VenderLivro(1);
		livro2.AumentarPreco(0.10);
		livro1.ComprarLivro(5);
		
		System.out.println("Livro 1: " + livro1);
        System.out.println("Livro 2: " + livro2);
		
	}
	

}
