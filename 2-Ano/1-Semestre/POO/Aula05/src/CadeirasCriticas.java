import java.util.Arrays;

public class CadeirasCriticas {
	private String curso;
	private String[] disciplinas;
	
	public CadeirasCriticas(String nomecurso) {
		curso = nomecurso;
		disciplinas = new String[3];
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] novasdisciplinas) {
		for(int i = 0 ; i < 3; i++) {
			disciplinas[i] = novasdisciplinas[i];
		}
	}

	@Override
	public String toString() {
		return "CadeirasCriticas [curso=" + curso + ", disciplinas=" + Arrays.toString(disciplinas) + "]";
	}
	

	
	
	
}
