#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
#include "Aleatorio.h"
#include "OperacoesBasicasAB.h"
#include "EADArvoreBinaria.h"
#include "ABPorNiveis.h"
#include "OutrasOperacoesAB.h"

int main()
{
    PNodoAB T;
    int TAM = 5;
    //int TAM = gerarNumeroInteiro(0,15);
    T = criarABAleatoria(TAM);
    printf("Arvore Binaria Aleatoria:\n");
    printf("Em ordem:\n");
    mostrarEmOrdemAB(T);
    /**printf("Pre ordem:\n");
    mostrarPreOrdemAB(T);
    printf("Pos ordem:\n");
    mostrarPosOrdemAB(T);**/
    printf("Por Níveis:\n");
    mostrarPorNiveisAB(T);
    int totk = contaKAB(T , 10);
    printf("Total de 10s = %d\n", totk);
    //ex 6
    int maior = procurarMaior(T);
    printf("Maior elemento = %d:\n" , maior);

}
