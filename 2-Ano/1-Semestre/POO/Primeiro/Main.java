package Primeiro;

public class Main{
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.modelo = "BIC" ;
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();

        c1.estado();
        c1.escrever();

        Caneta c2 = new Caneta();
        c2.modelo = "MP" ;
        c2.cor = "Preto";
        c2.ponta = 0.7f;
        c2.destampar();

        c2.estado();
        c2.escrever();
    }
}