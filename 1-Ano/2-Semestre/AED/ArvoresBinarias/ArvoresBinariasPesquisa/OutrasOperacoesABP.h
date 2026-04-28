7
/* ------------------------------------------------------- */
/* ---- protótipos/headers das funções da biblioteca ----- */
/* ------------------------------------------------------- */

PNodoABP criarABPAleatoria (int);
DadosABP procurarMaior(PNodoABP T);

/* ------------------------------------------------------- */
/* -------------- implementação das funções -------------- */
/* ------------------------------------------------------- */

// Ex. 1
PNodoABP criarABPAleatoria (int N)
{
  DadosABP X;
  PNodoABP T;
  int k;
  T = criarABP();
  k = 1;
  while (k <= N){
    X = criarElementoABP();
    if (pesquisarABP(X,T) == NULL){
      T = inserirABP(X,T);
      k = k + 1;
    }
  }
  return T;
}

//ex 4
DadosABP procurarMaior(PNodoABP T)
{
  if(T->Direita == NULL)
    return T->Elemento;
  else
    return procurarMaior(T->Direita);
}

//ex 5 recursivo
/**
DadosABP procurarMenor(PNodoABP T)
{
  if(T->Esquerda == NULL)
    return T->Elemento;
  else
    return procurarMenor(T->Esquerda);
}
**/

//ex 5 iterativo
DadosABP procurarMenor(PNodoABP T)
{
  while(T->Esquerda != NULL)
    T = T->Esquerda;
  return T->Elemento;
}

//ex 6
int contaMaior(PNodoABP T, int X)
{
  if(T == NULL)
    return 0;
  if(T->Elemento.numAluno <= X)
    return contaMaior(T->Direita, X);
  else
    return 1 + contaMaior(T->Esquerda, X) + contaMaior(T->Direita, X);

//ex 13
int menorNivFolha(PNodoABP T, int N)
{
  if(T->Esquerda == NULL && T->Direita == NULL)
    return N;
  if(T->Esquerda == NULL)
    return menorNivFolha(T->Direita, N+1);
  if(T->Direita == NULL)
    return menorNivFolha(T->Esquerda, N+1);
  int Esq = menorNivFolha(T->Esquerda, N+1);
  int Dir = menorNivFolha(T->Direita, N+1);
  if(Esq < Dir)
    return Esq;
  else
    return Dir;

}
}
