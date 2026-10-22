public class Espetaculo {
	private String nome;
	private int capacidade;
	private int espectadores;
	private double custo;
	
	public Espetaculo(String nomeEspetaculo, int CapacidadeMaxima, double Preco) {
		nome = nomeEspetaculo;
		espectadores = 0;
		capacidade = CapacidadeMaxima;
		custo = Preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getEspectadores() {
		return espectadores;
	}

	public void setEspectadores(int espectadores) {
		this.espectadores = espectadores;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public String toString() {
		return "[nome=" + nome + ", capacidade=" + capacidade + ", espectadores=" + espectadores + ", custo="
				+ custo + "]";
	}
	
	
	public String comprarBilhete() {
		if(espectadores < capacidade) {
			espectadores++;
			return "Preço a pagar: " + custo + "euros";
		}
		else {
			return "Espetaculo esgotado";
		}
	}
	
	public double valortotal() {
		return espectadores * custo;
	}
	
	
}
