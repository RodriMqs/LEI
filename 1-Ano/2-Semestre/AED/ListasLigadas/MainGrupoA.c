
#include <stdio.h>
#include <stdlib.h>

#include "Aleatorio.h"
#include "OperacoesBasicasGrupoA.h"
#include "EADLista.h"
#include "OutrasOperacoesGrupoA.h"

int main()
{
    PNodoLista L;
    int TAM;
    TAM = gerarNumeroInteiro(0, 15);
    L = criarListaAleatoria(TAM);
    printf("Lista de elementos por ordem:\n");
    mostrarListaCabeca(L);
    printf("Lista de elementos por ordem inversa:\n");
    mostrarListaCauda(L);
}

