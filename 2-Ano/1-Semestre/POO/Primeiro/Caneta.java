package Primeiro;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void estado(){
        System.out.println("Modelo "+ this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    void escrever(){
        if (this.tampada == true){
            System.out.println("ERRO, não pode escrever a caneta está tampada.");
        } else {
            System.out.println("Está a escrever");
        }
    }

    void tampar(){
        this.tampada = true;

    }
    void destampar(){
        this.tampada = false;

    }
}