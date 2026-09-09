package Primeiro;

public class Main{
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Preta", 0.5f);
        //c1.setModelo("BIC"); // é preciso usar um setter pois a variavel é privada
        //c1.cor = "Azul";
        //c1.setPonta(0.5f);
        c1.tampar();
        c1.estado();
        c1.escrever();


        Caneta c2 = new Caneta("MP", "Vermelha", 0.7f);
        c2.estado();
    }
}