
// tipos de dados

struct NodoLista{
  DadosLista  Elemento;
  struct NodoLista *Prox;
};

typedef struct NodoLista *PNodoLista;


/* ------------------------------------------------------- */
/* ---- protótipos/headers das funções da biblioteca ----- */
/* ------------------------------------------------------- */

// operações sobre um nodo (NodoLista)

PNodoLista criarNodoLista (DadosLista);

PNodoLista libertarNodoLista (PNodoLista);

// Operações sobre uma EAD Lista (PNodoLista)

PNodoLista criarLista ();

PNodoLista libertarLista (PNodoLista);

int listaVazia (PNodoLista);

void mostrarListaCabeca (PNodoLista);
void mostrarListaCauda (PNodoLista);

PNodoLista pesquisarLista (DadosLista, PNodoLista);

void consultarLista (DadosLista, PNodoLista);

void atualizarLista (DadosLista, PNodoLista);

PNodoLista inserirListaCabeca (DadosLista, PNodoLista);
PNodoLista inserirListaCauda (DadosLista, PNodoLista);
void inserirListaMeio (DadosLista, DadosLista, PNodoLista);
// lista ordenada por ordem crescente
PNodoLista inserirListaOrdem (DadosLista, PNodoLista);

// remover elemento da lista (o elemento está na lista)
PNodoLista removerLista (DadosLista, PNodoLista);


/* ------------------------------------------------------- */
/* -------------- implementação das funções -------------- */
/* ------------------------------------------------------- */

// operações sobre um nodo (NodoLista)

PNodoLista criarNodoLista (DadosLista X)
{
  PNodoLista P;
  P = (PNodoLista) malloc(sizeof(struct NodoLista));
  if(P == NULL)
    return NULL;
  P->Elemento = X;
  P->Prox = NULL;
  return P;
}

PNodoLista libertarNodoLista (PNodoLista P)
{
  P->Prox = NULL;
  free(P);
  P = NULL;
  return P;
}

// Operações sobre uma EAD Lista (PNodoLista)

PNodoLista criarLista ()
{
  PNodoLista L;
  L = NULL;
  return L;
}

// liberta todos os nodos da lista, devolvendo-a vazia
PNodoLista libertarLista (PNodoLista L)
{
  PNodoLista P;
  while(L != NULL){
    P = L;
    L = L->Prox;
    P = libertarNodoLista(P);
  }
  return  L;
}

int listaVazia (PNodoLista L)
{
  if(L == NULL)
    return 1;
  else
    return 0;
}

void mostrarListaCabeca (PNodoLista L)
{
  PNodoLista P = L;
  while(P != NULL){
    mostrarElementoLista(P->Elemento);
    P = P->Prox;
  }
}

void mostrarListaCauda (PNodoLista L)
{
  if(L != NULL){
    mostrarListaCauda(L->Prox);
    mostrarElementoLista(L->Elemento);
  }
}

PNodoLista pesquisarLista (DadosLista X, PNodoLista L)
{
  // casos base/terminais
  if(L == NULL)
    return NULL;  // X não existe na lista
  if(compararElementosLista(L->Elemento, X) == 0)
    return L;  // X existe na lista
  // caso geral
  return pesquisarLista(X, L->Prox);
}

void consultarLista (DadosLista X, PNodoLista L)
{
  PNodoLista P;
  P = pesquisarLista(X, L);
  if(P != NULL)
    mostrarElementoLista(P->Elemento);
  else
    printf("Elemento a consultar não existe na Lista!\n");
}

// atualiza os dados do elemento da lista com a chave X, se existe
void atualizarLista (DadosLista X, PNodoLista L)
{
  if(L != NULL){
  	if(compararElementosLista(L->Elemento, X) == 0)
  	  // caso base/terminal
  	  L->Elemento = X;
  	else
  	  // caso geral
  	  atualizarLista(X, L->Prox);
  }
}

PNodoLista inserirListaCabeca (DadosLista X, PNodoLista L)
{
  PNodoLista P;
  P = criarNodoLista(X);
  if(P == NULL)
    return L;
  P->Prox = L;
  L = P;
  return L;
}

PNodoLista inserirListaCauda(DadosLista X, PNodoLista L)
{ 
  PNodoLista fim, P;
  P = criarNodoLista(X);  // P aponta para o novo nodo (com X)
  if(P == NULL) 
    return L; 
  if(L == NULL) // lista vazia, logo X é o único elemento da lista
    return P;
  fim = L; 
  while(fim->Prox != NULL)  // marcar o elemento do fim de L
    fim = fim->Prox;
  fim->Prox = P; // ligar último nodo da lista L ao novo nodo (com o X)
  return L;
}

// inserir o elemento X como sucessor do elemento Y
//   numa Lista com pelo menos dois elementos
void inserirListaMeio (DadosLista X, DadosLista Y, PNodoLista L)
{
  PNodoLista PA, P;
  P = criarNodoLista(X);     // P aponta para o nodo com o elemento X (novo elemento)
  if(P != NULL){
    PA = pesquisarLista(Y, L);  // PA aponta para o nodo com o elemento Y
    if(PA != NULL){
      P->Prox = PA->Prox;
      PA->Prox = P;
    }
  }
}


// assume-se que a lista está ordenada por ordem crescente

PNodoLista inserirListaOrdem (DadosLista X, PNodoLista L)
{
  PNodoLista PA, P, Aux;
  P = criarNodoLista(X);
  if(P == NULL)
    return L; 
  if(L == NULL)  // o novo nodo é o único da lista
    return P;	 // ou: L = P; return L;
  // procurar pelo nodo que será antecessor do novo nodo (com X)
  PA = NULL;
  Aux = L;
  while(Aux != NULL && compararElementosLista(Aux->Elemento, X) < 0){
    PA = Aux;
    Aux = Aux->Prox;
  }
  if(PA == NULL){   // inserir o novo nodo no início de L
    P->Prox = L; 
    L = P;
    return L;
  }
  // inserir o novo nodo depois do início
  P->Prox = PA->Prox;
  PA->Prox = P;
  return L;
}


// remover X da lista L, em que X está na lista
PNodoLista removerLista (DadosLista X, PNodoLista L)
{ 
  PNodoLista P, PA;
  // verificar se o elemento a remover está na cabeça da lista
  if(compararElementosLista(L->Elemento, X) == 0){
    P = L;
    L = L->Prox;
    P = libertarNodoLista(P);
    return L;
  }
  // procurar o antecessor do elemento a remover (que não está na cabeça)
  PA = L;
  while(compararElementosLista(PA->Prox->Elemento, X) != 0)
    PA = PA->Prox;
  P = PA->Prox;
  PA->Prox = P->Prox; // ou (= PA->Prox)->Prox
  P = libertarNodoLista(P);
  return L;
  
}

