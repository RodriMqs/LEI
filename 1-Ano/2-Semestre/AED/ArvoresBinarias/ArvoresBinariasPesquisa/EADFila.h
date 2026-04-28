// tipos de dados

struct NodoFila {
  DadosFila Elemento;
  struct NodoFila *Prox;
};

typedef struct NodoFila *PNodoFila;


/* ------------------------------------------------------- */
/* ---- protótipos/headers das funções da biblioteca ----- */
/* ------------------------------------------------------- */

// Operações sobre um nodo (NodoFila)

PNodoFila criarNodoFila (DadosFila);

PNodoFila libertarNodoFila (PNodoFila);

// Operações sobre uma EAD Fila (DadosFila)

PNodoFila criarFila ();

int filaVazia (PNodoFila);

PNodoFila juntar (DadosFila, PNodoFila);

PNodoFila remover (PNodoFila);

DadosFila frente (PNodoFila);


/* ------------------------------------------------------- */
/* -------------- implementação das funções -------------- */
/* ------------------------------------------------------- */

// Operações sobre um nodo (PNodoFila)

PNodoFila criarNodoFila (DadosFila X)
{
  PNodoFila P;
  P = (PNodoFila) malloc(sizeof(struct NodoFila));
  if (P == NULL)
    return NULL;
  P->Elemento = X;
  P->Prox = NULL;
  return P;
}

PNodoFila libertarNodoFila (PNodoFila P)
{ 
  P->Prox = NULL;
  free(P);
  P = NULL;
  return P;
}

// Operações sobre uma EAD Fila (PNodoF)

PNodoFila criarFila ()
{
  PNodoFila Q;
  Q = NULL;
  return Q;
}

int filaVazia (PNodoFila Q)
{
  if(Q == NULL)
    return 1;
  else
    return 0;
}

PNodoFila juntar (DadosFila X, PNodoFila Q)
{
  PNodoFila fim, P;
  P = criarNodoFila(X);
  if(P == NULL)
    return Q;
  if(filaVazia(Q))
    return P;
  fim = Q;
  while(fim->Prox != NULL)
    fim = fim->Prox;
  fim->Prox = P;
  return Q;
}

PNodoFila remover (PNodoFila Q)
{
  PNodoFila P;
  P = Q;
  Q = Q->Prox;
  P = libertarNodoFila(P);
  return Q;
}

DadosFila frente (PNodoFila Q)
{
  return Q->Elemento;
}


