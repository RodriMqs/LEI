import java.util.Arrays;
import Disciplina.java;

public class Aluno{
 private static int ultimo = 0;
 private int numero;
 private String nome;
 private Disciplina[] lista; // array de objetos do tipo Disciplina (ver FP5, exerc. 1)
 
 
 public Aluno(String nomeAluno) {
	this.nome = nomeAluno;
	ultimo++;
	this.numero = ultimo;
	this.lista = new Disciplina[3];
	}


 	public static int getUltimo() {
	 return ultimo;
 	}


 	public static void setUltimo(int ultimo) {
	 	Aluno.ultimo = ultimo;
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


 	public Disciplina[] getDisciplinas() {
 		return lista;
 	}


 	public void setDisciplinas(Disciplina[] disciplinas) {
 		this.lista = disciplinas;
 	}

 	
 	public void adicionarDisciplina(Disciplina d , int p) {
 		if(p>= 0 && p<=3) {
 			lista[p] = d; 
 			
 		}
 	}


	@Override
	public String toString() {
		return "Aluno [numero=" + numero + ", nome=" + nome + ", lista=" + Arrays.toString(lista) + "]";
	}
 	
 	public boolean temDisciplina(Disciplina d) {
 		if(d == null ) return false;
 		for(int i = 0 ; i<3 ; i++) {
 			if (lista[i] != null) {
 				if(lista[i].getCodigo() == d.getCodigo()) return true;
 			}
 		}
		return false;	
 	}
}


