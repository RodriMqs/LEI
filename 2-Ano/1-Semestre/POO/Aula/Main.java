package Aula;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(
                "João",
                20,
                "Engenharia Informática"
        );
        aluno1.mostrarDados();
        aluno1.setCurso("Engenharia Eletrotécnica");
        aluno1.mostrarDados();
    }

}