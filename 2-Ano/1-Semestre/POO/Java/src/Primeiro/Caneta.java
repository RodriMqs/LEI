package Primeiro;

public class Caneta {
    private String modelo;
    String cor;
    private float ponta;
    int carga;
    boolean tampada;

    void estado(){
        System.out.println("Modelo "+ this.getModelo());
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.getPonta());
        System.out.println("Carga " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
//metodo construtor , cada caneta nova criada ja vem com os seguintes status
    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
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

    //GETTERS e SETTERS
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void  setPonta(float p){
        this.ponta = p;
    }

}