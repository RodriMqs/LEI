
public class Disciplina {
	private int codigo;
	 private String nome;
	 private String prof;
	 
	 public Disciplina(){
		 codigo = 0;
		 nome = "";
		 prof = "";
	 }
	 
	 public Disciplina(int codigo, String nome) {
		 this.codigo = codigo;
		 this.nome = nome;
		 this.prof = "";
	 }

	 public String toString() {
		return "Disciplina [codigo=" + codigo + ", nome=" + nome + ", prof=" + prof + "]";
	 }

	 public int getCodigo() {
		 return codigo;
	 }

	 public void setCodigo(int codigo) {
		 this.codigo = codigo;
	 }

	 public String getNome() {
		 return nome;
	 }

	 public void setNome(String nome) {
		 this.nome = nome;
	 }

	 public String getProf() {
		 return prof;
	 }

	 public void setProf(String prof) {
		 this.prof = prof;
	 }
	 
	 
	 public boolean verificarIntervalo (int inicio, int fim) {
		 if(codigo >=inicio && codigo<fim) {
			 return true;
		 }
		 else{
			 return false;
		 }
	 }
	 
	 
	 
}
