package Carro;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public void mostrarDados(){
        System.out.println("Marca:" + marca);
        System.out.println("Modelo:" + modelo);
        System.out.println("Ano:" + ano);
        System.out.println("Velocidade:" + velocidade);
    }

    public Carro(String marca, String modelo, int ano, int velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //metodo acelerar
    public void acelerar(){
        velocidade = velocidade + 10;
    }

    public void travar(){
        if(velocidade >= 10){
            velocidade = velocidade - 10;
        } else {
            velocidade = 0;
        }
    }

}

