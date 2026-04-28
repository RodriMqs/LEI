
struct NodoABP {
	DadosABP  Elemento;
	struct NodoABP *Esquerda;
	struct NodoABP *Direita;
};

typedef struct NodoABP *PNodoABP;

/* ------------------------------------------------------- */
/* ---- protótipos/headers das funções da biblioteca ----- */
/* ------------------------------------------------------- */

// Operações sobre o Nodo

PNodoABP criarNodoABP (DadosABP);

PNodoABP libertarNodoABP (PNodoABP);

// Operações sobre a EAD Árvore Binária de Pesquisa

PNodoABP criarABP ();

PNodoABP destruirABP (PNodoABP);

int ABPVazia(PNodoABP);

void mostrarEmOrdemABP (PNodoABP);
void mostrarPreOrdemABP (PNodoABP);
void mostrarPosOrdemABP (PNodoABP);

int alturaABP (PNodoABP);

PNodoABP pesquisarABP (DadosABP, PNodoABP);

void consultarAB (DadosABP, PNodoABP);

void atualizarABP (DadosABP, DadosABP, PNodoABP);

PNodoABP inserirABP (DadosABP, PNodoABP);

// remover um elemento de uma ABP: X está na ABP
PNodoABP removerABP (DadosABP, PNodoABP);

/* ------------------------------------------------------- */
/* -------------- implementação das funções -------------- */
/* ------------------------------------------------------- */

// Operações sobre o Nodo

PNodoABP criarNodoABP (DadosABP X)
{
  PNodoABP P;
  P = (PNodoABP) malloc(sizeof(struct NodoABP));
  if (P == NULL)
    return  NULL;
  P->Elemento = X;
  P->Esquerda = NULL;
  P->Direita = NULL;
  return P;
}

PNodoABP libertarNodoABP (PNodoABP P)
{
  P->Esquerda = NULL;
  P->Direita = NULL;
  free(P);
  P = NULL;
  return P;
}

// Operações sobre a EAD Árvore Binária de Pesquisa

PNodoABP criarABP ()
{
  PNodoABP T;
  T = NULL;
  return T;
}

PNodoABP destruirABP (PNodoABP T)
{
  if (T == NULL) 
    return NULL;
  T->Esquerda = destruirABP(T->Esquerda);
  T->Direita = destruirABP(T->Direita);
  T = libertarNodoABP(T);
  return T;
}

int ABPVazia (PNodoABP T)
{
  if (T == NULL)
    return 1;
  else
    return 0;
}

void mostrarEmOrdemABP (PNodoABP T)
{
  if (T != NULL){
    mostrarEmOrdemABP(T->Esquerda);
    mostrarElementoABP(T->Elemento);
    mostrarEmOrdemABP(T->Direita);
  }
}

void mostrarPreOrdemABP (PNodoABP T)
{
  if (T != NULL){
    mostrarElementoABP(T->Elemento);
    mostrarPreOrdemABP(T->Esquerda);
    mostrarPreOrdemABP(T->Direita);
  }
}

void mostrarPosOrdemABP (PNodoABP T)
{
  if (T != NULL){
    mostrarPosOrdemABP(T->Esquerda);
    mostrarPosOrdemABP(T->Direita);
    mostrarElementoABP(T->Elemento);
  }
}

int alturaABP (PNodoABP T)
{
  int altEsq, altDir;
  if (T == NULL)
    return -1;
  altEsq = alturaABP(T->Esquerda);
  altDir = alturaABP(T->Direita);
  if (altEsq > altDir)
    return altEsq + 1;	// altura da esquerda + raiz
  else
    return altDir + 1;	// altura da direita + raiz
}

// Operações sobre a EAD Árvore Binária de Pesquisa

PNodoABP pesquisarABP (DadosABP X, PNodoABP T)
{
  if (T == NULL)
    return NULL;
  if (compararElementosABP(X, T->Elemento) == 0)  // X == T->Elemento
    return T;
  if (compararElementosABP(X, T->Elemento) == -1)   // X < T->Elemento
    return pesquisarABP(X, T->Esquerda);
  else
    return pesquisarABP(X, T->Direita);
}

void consultarABP (DadosABP X, PNodoABP T)
{
  PNodoABP P;
  P = pesquisarABP(X, T);
  if (P != NULL)
    mostrarElementoABP(T->Elemento);
  else
    printf("Elemento inexistente na ABP.\n");
}

void atualizarABP (DadosABP X, DadosABP Y, PNodoABP T)
{
  PNodoABP P;
  P = pesquisarABP(X, T);
  if (P != NULL)
    P->Elemento = Y;
}

// inserir de forma que fique o mais possível equilibrada

PNodoABP inserirABP (DadosABP X, PNodoABP T)
{
  if (T == NULL){
    T = criarNodoABP(X);
    return T;
  }
  if (compararElementosABP(X, T->Elemento) == -1)   // X < T->Elemento
    T->Esquerda = inserirABP(X, T->Esquerda);
  else
    T->Direita = inserirABP(X, T->Direita);
  return T;
}
 
// operações associadas à operação removerABP

PNodoABP substituirNodoDireita (PNodoABP T, DadosABP *Y)
{
  PNodoABP P;
  if (T->Esquerda == NULL){
    *Y = T->Elemento;
    P = T;
    T = T->Direita;
    P = libertarNodoABP(P);
    return T;
  }
  T->Esquerda = substituirNodoDireita(T->Esquerda, Y);
  return T;
}

PNodoABP substituirNodoEsquerda (PNodoABP T, DadosABP *Y)
{
  PNodoABP P;
  if (T->Direita == NULL){
    *Y = T->Elemento;
    P = T;
    T = T->Esquerda;
    P = libertarNodoABP(P);
    return T;
  }
  T->Direita = substituirNodoEsquerda(T->Direita, Y);
  return T;
}

PNodoABP removerNodoABP (PNodoABP T)
{
  PNodoABP P;
  DadosABP Y;
  if (T->Esquerda == NULL && T->Direita == NULL){   // T é uma folha
    T = libertarNodoABP(T);
    return T;
  }
  if (T->Esquerda == NULL){   //  só um filho, o direito 
    P = T;
    T = T->Direita;
    P = libertarNodoABP(P);
    return T;
  }
  if (T->Direita == NULL){     // só um filho, o esquerdo
    P = T;
    T = T->Esquerda;
    P = libertarNodoABP(P);
    return T;
  }
  // 2 filhos (1º caso): remover o nodo sucessor (nodo mais à esquerda da subárvore direita) e copiar a sua informação
   // 2 filhos (2º caso): remover o nodo antecessor (nodo mais à direita da subárvore esquerda) e copiar a sua informação
  if(alturaABP(T->Esquerda) < alturaABP(T->Direita))
    T->Direita = substituirNodoDireita(T->Direita, &Y);     // 1º caso
  else
    T->Esquerda = substituirNodoEsquerda(T->Esquerda, &Y);  // 2º caso
  T->Elemento = Y;
  return T;
}

PNodoABP removerABP (DadosABP X, PNodoABP T) 
{
  if (compararElementosABP(X, T->Elemento) == 0){
    T = removerNodoABP(T);
    return T;
  }    
  if (compararElementosABP(X, T->Elemento) == -1)
    T->Esquerda = removerABP(X, T->Esquerda);
  else
    T->Direita = removerABP(X, T->Direita);
  return T;
}

