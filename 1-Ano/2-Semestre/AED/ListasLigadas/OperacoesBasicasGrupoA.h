
/* ------------------------------------------------------- */
/* ---------- Biblioteca OperacoesBasicasGrupoA ---------- */
/* ------------------------------------------------------- */


typedef struct{
  int   numAluno;	  // n�mero de aluno (chave): { 70000, �, 75000 }
  float notasMTP[2];  // notas dos mini-testes pr�ticos: [0.0, 2.0]
  float notasTE[2];	  // notas dos testes escritos: [0.0, 8.0]
  int   notaFinal;	  // nota final (valor arredondado da soma das 4 notas): { 0, �, 20 }
}DadosLista;


// Prot�tipos/headers das fun��es

void mostrarElementoLista (DadosLista);

DadosLista criarElementoLista ();

// compara��o de 2 elementos do tipo DadosLista, pelo campo numAluno (chave)
// devolve -1 se primeiro < segundo, 0 se iguais, 1 se primeiro > segundo
int compararElementosLista (DadosLista, DadosLista);



// Implementa��o das fun��es

void mostrarElementoLista (DadosLista X)
{
  printf("%d - ", X.numAluno);
  printf("%.2f - %.2f - ", X.notasMTP[0], X.notasMTP[1]);
  printf("%.2f - %.2f - ", X.notasTE[0], X.notasTE[1]);
  printf("%2d\n",  X.notaFinal);
}

DadosLista criarElementoLista ()
{
  DadosLista X;
  float soma;
  X.numAluno = gerarNumeroInteiro(70000, 75000);
  X.notasMTP[0] = gerarNumeroReal(0.0, 2.0);
  X.notasMTP[1] = gerarNumeroReal(0.0, 2.0);
  X.notasTE[0] = gerarNumeroReal(0.0, 8.0);
  X.notasTE[1] = gerarNumeroReal(0.0, 8.0);
  soma = X.notasMTP[0] + X.notasMTP[1] + X.notasTE[0] + X.notasTE[1];
  X.notaFinal = (int)(soma + 0.5);
  return X;
}

// compara��o de 2 elementos do tipo DadosLista, segundo o campo numAluno (chave)
//   devolve -1 se X < Y, 0 se X = Y, 1 se X > Y
int compararElementosLista (DadosLista X, DadosLista Y)
{
  if (X.numAluno > Y.numAluno)
    return 1;
  if (X.numAluno < Y.numAluno)
    return -1;
  return 0;
}


int numerosLista (PNodoLista L){
    int cont = 0;
    while(L!=NULL){
        cont++;
        L=L->Prox;
    }
    return cont;
}

int notafinaligualrecursiva(PNodoLista L, int nota){
    if(L == NULL)
        return 0;
    if(L->Elemento.notaFinal == nota)
        return 1 + notafinaligualrecursiva(L->Prox, nota);
    else
        return notafinaligualrecursiva(L->Prox, nota);
}

int notafinalmaiorigual (PNodoLista L, int nota){
    int cont = 0;
    while(L!=NULL){
        if(L->Elemento.notaFinal >= nota){
            cont++;
        }
        L=L->Prox;
    }
    return cont;
}

int maiorNotafinalrecursiva (PNodoLista L){
    if (L == NULL)
        return 0;
    int maior = maiorNotafinalrecursiva(L->Prox);
    if (L->Elemento.notaFinal > maior)
        return L->Elemento.notaFinal;
    else
        return maior;
}

int maiorNotasTErecursiva (PNodoLista L){
    if (L == NULL)
        return 0;
    int maior = maiorNotasTErecursiva(L->Prox);
    if ((L->Elemento.notasTE[0] + L->Elemento.notasTE[1]) > maior)
        return L->Elemento.notasTE[0] + L->Elemento.notasTE[1];
    else
        return maior;
}


int alunoPiorNotaMTP (PNodoLista L){
    if (L == NULL)
        return 0;
    DadosLista pior = L->Elemento;
    while (L != NULL){
        if ((L->Elemento.notasMTP[0] + L->Elemento.notasMTP[1]) < (pior.notasMTP[0] + pior.notasMTP[1])){
            pior = L->Elemento;
        }
        L = L->Prox;
    }
    return pior.numAluno;
}


