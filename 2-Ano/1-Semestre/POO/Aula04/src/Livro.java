public class Livro {
	String titulo;
	double preco;
	int exemplares;
	
	
	public Livro() {
		titulo = "";
		preco = 0.0;
		exemplares = 0;
	}
	
	
	public Livro(String EXEMPLO){
		titulo = EXEMPLO;
		preco = 0.0;
		exemplares = 0;
	}
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getExemplares() {
		return exemplares;
	}

	public void setExemplares(int exemplares) {
		this.exemplares = exemplares;
	}
	
	
	public String toString() {
		return "Titulo" + getTitulo() + "\nPreço = " + getPreco() + "\nExemplares = " + getExemplares();
	}
	
	public void AumentarPreco(double percentagem) {
		if(percentagem > 0 || percentagem < 1) {
			preco = preco * percentagem + preco;
		}
	}
	
	public void VenderLivro(int quantidade) {
		if(quantidade > 0 && exemplares>= quantidade) {
			exemplares = exemplares - quantidade;
		}
	}
	
	public void ComprarLivro(int quantidade) {
		if (quantidade > 0) {
			exemplares = exemplares + quantidade;
		}
	}
	
	
	
	
	

}
