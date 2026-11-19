import java.util.ArrayList;

public class Empregado {
	private int NSS;
	private String nome;
	private double salario;
	private ArrayList<Telefone> contactos;
	
	public Empregado() {
		this.NSS = 0;
		this.nome = "";
		this.salario= 0.0;
		this.contactos = new ArrayList<Telefone>();
	}
	
	public Empregado(int NSS, String nome, double salario, ArrayList<Telefone> contactos) {
		this.NSS = NSS;
		this.nome = nome;
		this.salario = salario;
		this.contactos = (ArrayList<Telefone>)contactos.clone();
	}

	public int getNSS() {
		return NSS;
	}

	public void setNSS(int nSS) {
		NSS = nSS;
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

	public ArrayList<Telefone> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Telefone> contactos) {
		this.contactos = (ArrayList<Telefone>)contactos.clone();
	}
	
	public void aumentarSalario(double percentagem) {
		if(percentagem > 0) {
			this.salario = salario += (salario*percentagem/100);
		}
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
	
	public boolean adicionarContacto(Telefone novocontacto) {
		if(novocontacto == null) {
			return false;
		}
		for(int i = 0 ; i<contactos.size(); i++) {
			if(contactos.get(i).equals(novocontacto)) {
				return false;
			}			
		}
		contactos.add(novocontacto);
		return true;
	}
	
	public int numeroTipo (String tipo) {
		if(tipo == null) {
			return -1;
		}
		for(int i = 0; i<contactos.size(); i++) {
			Telefone t = contactos.get(i);
			if(t.getTipo().equals(tipo)) {
				return t.getNumero();
			}
		}
		return -1;
	}
	public String toString() {
        String s = "Empregado [NSS=" + NSS + ", Nome=" + nome + ", Salário=" + salario + ", Contactos=[";
        for (int i = 0; i < contactos.size(); i++) {
            s += contactos.get(i);
            if (i < contactos.size() - 1) {
                s += ", ";
            }
        }
        s += "]]";
        return s;
	}
	
	public boolean equals(Object obj) {
		boolean iguais = false;
		if(obj!=null && this.getClass() == obj.getClass()) {
			Empregado e = (Empregado) obj;
            iguais = this.NSS == e.NSS && 
                     this.salario == e.salario && 
                     this.nome.equals(e.nome) && 
                     this.contactos.equals(e.contactos);
		}
		return iguais;
	}
	
	public Object clone() {
        Empregado e = new Empregado(this.NSS, this.nome, this.salario, this.contactos);
        return e;
    }
	
	
	
	
	
	
}
