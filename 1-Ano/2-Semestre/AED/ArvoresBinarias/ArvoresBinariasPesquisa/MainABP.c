
#include <stdio.h>
#include <stdlib.h>

#include "Aleatorio.h"
#include "OperacoesBasicasABP.h"
#include "EADArvoreBinariaPesquisa.h"
#include "ABPPorNiveis.h"
#include "OutrasOperacoesABP.h"

int main()
{
  //ex1
  PNodoABP T;
  //int TAM = gerarNumeroInteiro(0, 15);
    T = criarABPAleatoria(5);
    //ex 2´
    printf("Mostrar Por Niveis:\n");
    mostrarPorNiveisABP(T);
    printf("Travessia em Ordem:\n");
    mostrarEmOrdemABP(T);
    //ex 3
    int altura = alturaABP(T);
    int niveis = altura + 1;
    printf("Altura da ABP: %d\n", altura);
    printf("N�veis da ABP: %d\n", niveis);
    //ex 4
    DadosABP Maior = procurarMaior(T);
    printf("Maior elemento da ABP:\n");
    mostrarElementoABP(Maior);
    //ex 5
    DadosABP menor = procurarMenor(T);
    printf("Menor elemento da ABP: \n");
    mostrarElementoABP(menor);
    //ex 6 
    int tot = contaMaior(T, 72000);
    printf("N�mero de elementos maiores que 72000: %d\n", tot);
    //ex 13
    int minfolha = menorNivFolha(T, 0);
    int maxfolha = altura;
}
