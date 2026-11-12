import java.util.*;
import myinputs.Ler;
public class testeBiblioteca {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca("Biblioteca Principal");
		int opcao = -1;
		
		while(opcao != 0) {
	            System.out.println("1 - Mostrar livros da biblioteca");
	            System.out.println("2 - Adicionar um novo livro");
	            System.out.println("3 - Remover um livro da biblioteca");
	            System.out.println("4 - Pesquisar livro por nome");
	            System.out.println("5 - Pesquisar livro por uma palavra contida no título");
	            System.out.println("0 - Terminar");
	            System.out.print("Opção: ");
	            opcao = Ler.umInt();
	            
	            switch(opcao) {
	            case 1: 
	            	ArrayList<String> lista = biblioteca.getLivros();
	            	if(lista.size()== 0) System.out.print("Biblioteca vazia");
	            	else {
	            		for(int i = 0 ; i<lista.size();i++) {
	            			System.out.println(lista.get(i));
	            		}
	            	}
	            	break;
	            case 2:
	            	System.out.println("Titulo do livro que quer adicionar:");
	            	String nome = Ler.umaString();
	            	if(biblioteca.adicionarLivro(nome)) {
	            		System.out.println("Livro adicionado");
	            	}
	            	else {
	            		System.out.println("Livro já exsite");
	            	}
	            	break;
	            case 3:
	            	System.out.print("Título do livro que quer remover: ");
                    String remover = Ler.umaString();
                    if (biblioteca.removerLivro(remover)) {
                        System.out.println("Livro removido");
                    } else {
                        System.out.println("Livro não encontrado");
                    }
                    break;
	            case 4:
	            	 System.out.print("Título do livro a pesquisar: ");
	                    String titulo = Ler.umaString();
	                    if (biblioteca.existeLivro(titulo)) {
	                        System.out.println("O livro existe na biblioteca");
	                    } else {
	                        System.out.println("O livro não existe na biblioteca");
	                    }
	                    break;
	            case 5:
	            	System.out.print("Palavra a pesquisar: ");
                    String palavra = Ler.umaString();
                    ArrayList<String> encontrados = biblioteca.contemPalavra(palavra);
                    if(encontrados.size() == 0) System.out.println("Nenhum titulo contém essa palavra");
                    else {
                    	for( int i = 0; i < encontrados.size() ; i++) {
                    		
                    	}
                    }
	            	
		}
	            	
		}
		
	}

}
