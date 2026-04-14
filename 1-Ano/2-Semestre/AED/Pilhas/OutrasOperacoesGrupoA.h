
/* ------------------------------------------------------- */
/* ---- protótipos/headers das funções da biblioteca ----- */
/* ------------------------------------------------------- */

// operação apenas para controlo
//   - não faz parte da EAD Pilha
//   - mostra a Pilha do topo para o fundo
void mostrarPilha (PNodoPilha);




/* ------------------------------------------------------- */
/* -------------- implementação das funções -------------- */
/* ------------------------------------------------------- */

// operação apenas para controlo
//   - não faz parte da EAD Pilha
//   - mostra a Pilha do topo para o fundo
void mostrarPilha (PNodoPilha S)
{
  PNodoPilha P = S;
  while (P != NULL){
    mostrarElementoPilha(P->Elemento);
    P = P->Ant;
  }
}


