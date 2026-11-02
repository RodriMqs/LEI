
public class TesteAluno {

	public static void main(String[] args) {
		Disciplina a = new Disciplina(1000,"POO");
		a.setProf("Paula Prata");
		Disciplina b = new Disciplina(2000, "IA");
		b.setProf("Luis ALexandre");
		Disciplina c = new Disciplina(3000, "Multimédia");
		c.setProf("Manuela Pereira");
		Disciplina d = new Disciplina(4000,"Probabilidades e Estatistica");
		d.setProf("João Duque");
		
		
		Aluno a1 = new Aluno("Manuel Silva");
		a1.adicionarDisciplina(a, 0);
		a1.adicionarDisciplina(b, 1);
		a1.adicionarDisciplina(c,2);
		
		Aluno a2 = new Aluno("Maria Espinho");
		a2.adicionarDisciplina(a, 0);
		a2.adicionarDisciplina(d, 1);
		
		System.out.println(a1.toString());
		System.out.println("\n" + a2.toString() + "\n");
		
		System.out.println("O aluno a1 tem a disciplina 1000 POO? " + a1.temDisciplina(a));
		System.out.println("O aluno a2 tem a disciplina 4000 Probabilidades e Estatistica?" + a2.temDisciplina(d));
		System.out.println("O aluno a2 tem a disciplina 2000 IA?" + a2.temDisciplina(b));
		
	}

}
