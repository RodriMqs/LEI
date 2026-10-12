import myinputs.Ler;

public class Contador {
	int valor;
	
	public Contador() {
		valor = 0;
	}
	
	public Contador(int valorinicial) {
		valor = valorinicial;
	}
	
	public void Incrementar() {
		valor++;
	}
	
	public void Incrementar(int SomarValor) {
		valor += SomarValor;
	}
	
	public void Decrementar() {
		valor--;
	}
	
	public void Decrementar(int RetirarValor) {
		valor -= RetirarValor;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int novoValor) {
		valor = novoValor;
	}
	
	public String toString() {
		return "Contador = " + valor;
	}
	
}
	
	
	
	