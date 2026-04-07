
/* ------------------------------------------------------- */
/* ---------- Biblioteca OutrasOperacoesGrupoA ----------- */
/* ------------------------------------------------------- */


// Prot�tipos/headers das fun��es

PNodoLista criarListaAleatoria (int);



// Implementa��o das fun��es

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

int totalElementosLista (PNodoLista L)
{
    int total = 0;
    while(L != NULL)
    {
        total++;
        L = L->prox;
    }
    return total;
}

int totalNotaNaLista (PNodoLista L, int nota)
{
    if(L == NULL)
        return 0;
    int c = 0;
    if(L->Elemento.notaFinal == nota)
        c++;
    return c + totalNotaNaLista(L->prox, nota);
    
}

DadosLista melhornotaTE (PNodoLista L)
{
    DadosLista X;
    if(L == NULL)
    {
        X.numAluno = -1;
        return X;
    }
    int melhor = -1, soma;
    while(L != NULL){
        soma = L->Elemento.notasTE[0] + L->Elemento.notasTE[1];
        if(soma > melhor){
            melhor = soma;
            X = L->Elemento;
        }
        L = L->prox;
    }
    return X;
}



PNodoLista removerNotaIgual (PNodoLista L, int nota)
{
    PNodoLista P;
    while(L != NULL && L->Elemento.notaFinal == nota){
        P = L;
	L = L->Prox;
	P = libertarNodoLista(P);
    }
    PNodoLista head, ant;
    head = L;
    ant = L;
    L = L->Prox;
    while (L !=NULL){
        if ( L->Elemento.notaFinal == nota){
        	P = L;
		L = L->Prox;
		P = libertarNodoLista(P);
		ant->Prox = NULL;
        }
        else{
            ant->Prox = L;
            ant = L;
	    L = L->Prox;
        }
    }
    return head;
}


ordenarselectionNotaFinal (PNodoLista L)
{
    PNodoLista P, Q, R; 
    DadosLista X;
    P = L;
    while (P!=NULL)
    {
        R = P;
        Q = P->Prox;
        while (Q!=NULL)
        {
            if (Q->Elemento.notaFinal < R->Elemento.notaFinal){
                R = Q;
            Q = Q->Prox;
        }
    }
    if ( R != P)
    {
        X = P->Elemento;
        P->Elemento = R->Elemento;
        R->Elemento = X;
    }
P = P->Prox;
}
return L;
}







