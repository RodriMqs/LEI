import java.util.Arrays;

public class Jogador {
	private static int ultimo = 0;
	private int numero;
	private String nome;
	private double salario;
	private int[] golos;
	
	public Jogador(String nomeJogador){
		ultimo++;
		numero = ultimo;
		nome = nomeJogador;
		salario = 0.0;
		golos = new int [4];
	}

	public Jogador(String nomeJogador, double salarioJogador) {
		ultimo++;
		numero = ultimo;
		this.nome = nomeJogador;
		this.salario = salarioJogador;
		golos = new int[4];
	}

	public static int getUltimo() {
		return ultimo;
	}

	public static void setUltimo(int ultimo) {
		Jogador.ultimo = ultimo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int[] getGolos() {
		return golos;
	}

	public void setGolos(int[] golos) {
		this.golos = golos;
	}
	
	public void aumentarSalario(double percentagem) {
		if (percentagem >= 0 && percentagem <= 100) {
            salario += salario * (percentagem / 100.0);
        }
	}
	
	public void setGolosJornada(int jornada, int quantidade) {
        if (jornada >= 1 && jornada <= golos.length) {
            golos[jornada - 1] = quantidade;
        }
	}

	@Override
	public String toString() {
		return "Jogador [numero=" + numero + ", nome=" + nome + ", salario=" + salario + ", golos="
				+ Arrays.toString(golos) + "]";
	}
	
	public int getGolosJornada(int jornada) {
        if (jornada >= 1 && jornada <= golos.length) {
            return golos[jornada - 1];
        }
        return -1;
	}
	
	
	public int consultarGolos() {
		int total = 0;
		for (int i = 0; i < golos.length; i++) {
            total += golos[i];
        }
        return total;
	}
	
}
