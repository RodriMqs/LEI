public class TesteCadeirasCriticas {
	public static void main(String[] args) {
		CadeirasCriticas cc1;
		CadeirasCriticas cc2;
		
		cc1 = new CadeirasCriticas("Eng Informática");
		cc2 = new CadeirasCriticas("Eng Aeronatica");
		
		String[] Disciplinacc1 = {"POO" , "IHC", "PE"};
		String[] Disciplinacc2 = {"AVIAO" , "VRUMMMM", "VOA VOA"};
		
		cc1.setDisciplinas(Disciplinacc1);
		cc2.setDisciplinas(Disciplinacc2);
		cc1.setCurso("MATEMATICA");
		
		System.out.println(cc1);
		System.out.println(cc2);
		
		
		String[] novasCriticas = {"Matemática I", "Física I", "Programação I"};
		cc1.setDisciplinas(novasCriticas);
		
		System.out.println(cc1.toString());
		novasCriticas[0] = "CALCULO I";
        novasCriticas[1] = "CALCULO II";
        novasCriticas[2] = "Programação";

        System.out.println(cc1.toString());
        

	}
}
