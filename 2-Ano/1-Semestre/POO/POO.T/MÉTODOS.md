Os objetos podem ter comportamentos
Para representar comportamentos usamos métodos

exemplo:
class Pessoa {
	 String nome;
	 int idade;

	 void apresentar() {
		 System.out.println("Olá, Eu sou " + nome + " Tenho " + idade + "anos.");
	 }
}

## CHAMAR UM MÉTODO

Pessoa pessoa1 = new Pessoa();

pessoa1.nome = "Ana";
pessoa1.idade = 20;
pessoa1.apresentar();

## COMO UTILIZAR TUDO NUM PROGRAMA FUNCIONAL

class Pessoa {

    String nome;
    int idade;

    void apresentar() {
        System.out.println("Olá! Eu sou " + nome);
        System.out.println("Tenho " + idade + " anos.");
    }
}

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Ana";
        pessoa1.idade = 20;

        pessoa1.apresentar();
    }
}


ex1:
Cria uma classe chamada `Carro` que tenha:

- uma marca
- um modelo
- uma velocidade

E um método:

```
mostrarInformacao()
```

que apresente os dados do carro.

Depois, no `main`, cria um carro:

Marca: BMW
Modelo: Série 1
Velocidade: 120

