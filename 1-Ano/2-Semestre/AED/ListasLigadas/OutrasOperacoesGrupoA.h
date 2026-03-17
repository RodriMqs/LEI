
/* ------------------------------------------------------- */
/* ---------- Biblioteca OutrasOperacoesGrupoA ----------- */
/* ------------------------------------------------------- */
#include <stdio.h>
#include <stdlib.h>

#include "Aleatorio.h"
#include "OperacoesBasicasGrupoA.h"
#include "EADLista.h"

// Protótipos/headers das funções

PNodoLista criarListaAleatoria (int);



// Implementação das funções

PNodoLista criarListaAleatoria (int N)
{
    PNodoLista L = criarLista();
    DadosLista X;
    int i = 0;
    while (i < N)
    {
        X = criarElementoLista();
        if(pesquisarLista(X, L) == NULL)
        {
            L = inserirListaCabeca(X, L);
            i++;
        }

    }
    return L;
}




