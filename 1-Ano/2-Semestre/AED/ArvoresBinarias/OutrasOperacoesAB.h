
/* ------------------------------------------------------- */
/* ---- protótipos/headers das funções da biblioteca ----- */
/* ------------------------------------------------------- */

PNodoAB criarABAleatoria (int);
int contarNodosRecursivaAB(PNodoAB T);
int contaKAB (PNodoAB T, int K);
int procurarMaior(PNodoAB T);
/* ------------------------------------------------------- */
/* -------------- implementação das funções -------------- */
/* ------------------------------------------------------- */

PNodoAB criarABAleatoria (int N)
{
    PNodoAB T = criarAB();
    int i=0;
    DadosAB X;
    while(i<N){
        X=criarElementoAB();
        if(pesquisarAB(X,T)==NULL){
            T=inserirPorAlturaAB(X,T);
           i++;
        }
    }
    return T;

}
//ex 3
int contarNodosRecursivaAB (PNodoAB T)
{
    if(T==NULL)
        return 0;
    return 1 + contarNodosRecursivaAB(T->Esquerda) + contarNodosRecursivaAB(T->Direita);
}
//ex 4
int contaKAB (PNodoAB T, int K){
    if(T==NULL)
        return 0;
    if(T->Elemento.notaFinal == K)
        return 1 + contaKAB(T->Esquerda, K) + contaKAB(T->Direita, K);
    return contaKAB(T->Esquerda, K) + contaKAB(T->Direita, K);
}


//ex 6
int procurarMaior(PNodoAB T)
{
    if(T==NULL)
        return INT_MIN;
    int maior_esquerda = procurarMaior(T->Esquerda);
    int maior_direita = procurarMaior(T->Direita);
    int maior = T->Elemento.notaFinal;
    if (maior_esquerda > maior)
        maior = maior_esquerda;
    if (maior_direita > maior)
        maior = maior_direita;
    return maior;
}
