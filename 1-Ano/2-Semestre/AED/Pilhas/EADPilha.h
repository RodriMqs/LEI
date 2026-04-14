
// tipos de dados

struct NodoPilha {
  DadosPilha  Elemento;
  struct NodoPilha *Ant;
};

typedef struct NodoPilha *PNodoPilha;

/* ------------------------------------------------------- */
/* ---- protótipos/headers das funções da biblioteca ----- */
/* ------------------------------------------------------- */

// Operações sobre um nodo (NodoPilha)

PNodoPilha criarNodoPilha (DadosPilha);

PNodoPilha libertarNodoPilha (PNodoPilha);

// Operações sobre uma Pilha (PNodoP)

PNodoPilha criarPilha ();

int pilhaVazia (PNodoPilha);

PNodoPilha push (DadosPilha, PNodoPilha);

PNodoPilha pop (PNodoPilha);

DadosPilha topo (PNodoPilha);


/* ------------------------------------------------------- */
/* -------------- implementação das funções -------------- */
/* ------------------------------------------------------- */

// Operações sobre um nodo (NodoP)

PNodoPilha criarNodoPilha (DadosPilha X)
{
  PNodoPilha P;
  P = (PNodoPilha) malloc(sizeof(struct NodoPilha));
  if (P == NULL)
    return NULL;
  P->Elemento = X;
  P->Ant = NULL;
  return P;
}

PNodoPilha libertarNodoPilha (PNodoPilha P)
{
  P->Ant = NULL;
  free(P);
  P = NULL;
  return P;
}

// Operações sobre uma EAD Pilha (PNodoP)

PNodoPilha criarPilha ()
{
  PNodoPilha S;
  S = NULL;
  return S;
}

int pilhaVazia (PNodoPilha S)
{
  if (S == NULL)
    return 1;
  else
    return 0;
}

PNodoPilha push (DadosPilha X, PNodoPilha S)
{
  PNodoPilha P;
  P = criarNodoPilha(X);
  if (P == NULL)
    return S;
  P->Ant = S;
  S = P;
  return S;
}

PNodoPilha pop (PNodoPilha S)
{
  PNodoPilha P;
  P = S;
  S = S->Ant;
  P = libertarNodoPilha(P);
  return S;
}

DadosPilha topo (PNodoPilha S)
{
  return S->Elemento;
}


