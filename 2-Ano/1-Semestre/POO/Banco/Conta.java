package Banco;

public class Conta {
    public int numConta;
    protected String tipo; //cp conta poupança cc conta corrente
    private String dono;
    private float saldo;
    private boolean status; //true conta aberta , false conta fechada

    //contrutor , todas as contas criadas , osaldo é 0 e status é falso
    public Conta() {
        this.saldo = 0f;
        this.status = false;
    }

    //getters and setters
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if( t == "cc"){
            setSaldo(50f);
        } else if (t == "cp") {
            setSaldo(100f);
        }
    }

    public void fecharConta(){
        if(saldo > 0){
            System.out.println("Nao é possivel fechar.");
        } else if (saldo<0) {
            System.out.println("Conta em debido");
        }
        else{
            setStatus(false);
        }
    }

    public void Depositar(float v){
        if(getStatus() == true) {
            setSaldo(getSaldo() + v);
        }else{
            System.out.println("ERRO");
        }
    }

    public void sacar(float v){
        if(getStatus() == true){
            if(saldo > v){
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Nao tem saldo suficiente");
            }
        } else{
            System.out.println("ERRO");
        }
    }

    public void pagarMensal(){
        float v = 0;
        if (getTipo() == "cc"){
            v = 12;
        } else if (getTipo() == "cp") {
            v = 20;
        }
        if (getStatus() == true){
                setSaldo(getSaldo() - v);
        }
    }
}
