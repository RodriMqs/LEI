public class TesteDisciplina {
	public static void main(String[] args) {
		Disciplina d1 = new Disciplina();
		d1.setCodigo(10000);
		d1.setNome("Bom");
		d1.setProf("Professor Bom");
		
		Disciplina d2 = new Disciplina();
		d2.setCodigo(20000);
		d2.setNome("Mau");
		d2.setProf("Professor Mau");
		
		System.out.println("Professor Disciplina 1" + d1.getProf());
		System.out.println("Código Disciplina 2" + d2.getCodigo());
		
		int inicioIntervalo = 5000;
		int fimIntervalo = 15000;
		
		boolean intervaloD1 = d1.verificarIntervalo(inicioIntervalo, fimIntervalo);
		boolean intervaloD2 = d2.verificarIntervalo(inicioIntervalo, fimIntervalo);
		System.out.println("O código de D1 (" + d1.getCodigo() + ") está em [" + inicioIntervalo + ", " + fimIntervalo + "[? " + intervaloD1);
		System.out.println("O código de D2 (" + d2.getCodigo() + ") está em [" + inicioIntervalo + ", " + fimIntervalo + "[? " + intervaloD2);
		

	}
}
