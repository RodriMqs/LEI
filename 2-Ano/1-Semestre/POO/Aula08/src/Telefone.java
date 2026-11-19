
public class Telefone {
		private String tipo; // Casa | Emprego | Móvel | 
		private int numero;

		public Telefone(String tipo, int numero) {
			super();
			this.tipo = tipo;
			this.numero = numero;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public String toString (){
		String s = "Tipo: " + tipo + " Número: " + numero;
		return s;
		} 
		
		public boolean equals(Object obj) {
	        boolean iguais = false;
	        if (obj != null && this.getClass() == obj.getClass()) {
	            Telefone t = (Telefone) obj;
	            iguais = this.numero == t.numero && this.tipo.equals(t.tipo);
	        }
	        return iguais;
	    }
		
		public Object clone() {
	        Telefone t = new Telefone(this.tipo, this.numero);
	        return t;
	    }
		
		





}
