
/* ------------------------------------------------------- */
/* ---------- Biblioteca OutrasOperacoesGrupoA ----------- */
/* ------------------------------------------------------- */


// Protótipos/headers das funções

PNodoLista criarListaAleatoria (int);



// Implementação das funções

PNodoLista criarListaAleatoria (int N)
{
    PNodoLista L = criarLista();
    DadosLista X;
    int N, int i = 0;
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




