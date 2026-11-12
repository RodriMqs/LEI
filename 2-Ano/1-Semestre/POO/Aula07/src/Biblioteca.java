import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	private ArrayList<String> livros;
	public Biblioteca() {
		this.nome = "";
		this.livros = new ArrayList<>();
	}
	
	public Biblioteca(String nome) {
		this.nome = nome;
		this.livros = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<String> livros) {
		this.livros = (ArrayList<String>)livros.clone());
	}


	public String toString() {
		String s = "Nome " + nome + "Livros ";
		for (int i = 0; i<livros.size(); i++) {
			s = s + livros.get(i);
		}
		return s;
	}
	
	public boolean existeLivro(String nome) {
		boolean existe = false;
		for(int i = 0; i<livros.size(); i++) {
			if(livros.get(i).equals(nome)) {
				existe = true;
			}
		}
		return existe;
	}
	
	public ArrayList<String> contemPalavra(String palavra) {
		ArrayList<String> resultado = new ArrayList<String>();
		for(int i = 0; i<livros.size(); i++) {
			if(livros.get(i).contains(palavra)) {
				resultado.add(livros.get(i));
			}
		}
		return resultado;
	}
	
	public boolean adicionarLivro(String nome) {
		boolean adicionado = false;
		if(!existeLivro(nome)) {
			livros.add(nome);
			adicionado = true;
		}
		return adicionado;
	}
	
	public boolean removerLivro(String nome) {
		boolean removido = false;
		if(existeLivro(nome)) {
			livros.remove(nome);
			removido = true;
		}
		return removido;
	}
	
	
	public boolean removerPosicao(int posicao) {
		boolean removido = false;
		if(posicao >=0) {
			livros.remove(posicao);
			removido = true;
		}
		return removido;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean equals(Object obj) {
        boolean iguais = false;
        if (obj != null && this.getClass() == obj.getClass()) {
            Biblioteca b = (Biblioteca) obj;
            iguais = this.nome.equals(b.nome);
            iguais = iguais && this.livros.equals(b.livros);
        }
        return iguais;
    }
	
	
  
    public Object clone() {
        Biblioteca b = new Biblioteca(this.nome);

        b.livros = (ArrayList<String>) this.livros.clone();

        return b;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
