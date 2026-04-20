// função recursiva para determinar quantos alunos tiveram notafinal maior que a media da turma

int contarRecursivo(PNodoLista L, float media) {
    // Caso Base
    if (L == NULL) return 0;

    int contaresto = contarRecursivo(L->Prox, media);

    if (L->Elemento.notaFinal > media) {
        return 1 + contaresto;
    } else {
        return contaresto;
    }
}

//mover  o ulitmo para segundo
PNodoLista moverUltimoParaSegundo(PNodoLista L){
	if(L == NULL || L->Prox == NULL || L->Prox->Prox == NULL) return L;
	PNodoLista P = L;
	PNodoLista Pant = NULL;
	PNodoLista Ult;
	while(Ult->Prox != NULL){
		Pant = Ult;
		Ult = Ult ->Prox;
	}
	Pant ->Prox = NULL;
	Ult->Prox = L->Prox;
	L->Prox = Ult;
	return L;
}

//mover aluno com melhor nota para primerio
PNodoLista melhorNotaPrimeiro (PNodoLista L){
	PNodoLista P = L;
	PNodoLista Pant = NULL;
	PNodoLista Melhor = L;
	PNodoLista AntMelhor = NULL;
	int nota = L->Elemento.notaFinal;
	if (L = NULL || L->Prox == NULL) return L;
	while(P!=NULL){
		if(P->Elemento.notaFinal > nota){
			nota = P->Elemento.notaFinal;
			Melhor = P;
			AntMelhor = Pant;
		}
		Pant = P;
		P = P->Prox;
	}
	if(AntMelhor != NULL){
		AntMelhor->Prox = Melhor ->Prox;
		Melhor->Prox = L;
		L = Melhor;
	}
	return L;
}

//mover aluno com pior nota para ultimo
PNodoLista moverPiorFim(PNodoLista L){
	if (L == NULL || L->Prox == NULL) return L;
	DadosLista
	PNodoLista P=L;
	PNodoLista Pant = NULL;
	PNodoLista Pior = L;
	PNodoLista APior = NULL;
	while(P!=NULL){
		if(P->Elemento.notaFinal < Pior->Elemento.notaFinal){
			Pior = P;
			APior = Pant;
		}
		Pant = P;
		P = P->Prox;
	}
	if(Pior->Prox != NULL){
		if(APior == NULL){
			L = Pior->Prox
		}
		else{
			APior->Prox = Pior->Prox;
		}
		PNodoLista Ult = L;
		while(Ult->Prox != NULL){
			Ult = Ult -> Prox;
		}
		Ult ->Prox = Pior;
		Pior ->Prox = NULL;
	}
	return L;
}

//mover pior nota para inicio da lista
PNodo moverMinimoParaInicio (PNodoLista L){
	if ( L ==NULL || L->Prox == NULL) return L;
	PNodoLista P=L;
	PNodoLista Pant = NULL;
	PNodoLista Pior = L;
	PNodoLista APior= NULL;
	while(P!=NULL){
		if(P->Elemento.notaFinal < Pior->Elemento.notaFinal){
			Pior = P;
			APior = Pant;
		}
		Pant = P;
		P = P->Prox;
	}
	if(APior != NULL){
		APior ->Prox = Pior ->Prox;
		Pior->Prox = L;
		L = Pior;
	}
	return L;
}

//calcular media e remover o primeiro que esteja abaixo
PNodo removerAbaixoDaMedia (PNodoLista L){
	if(L == NULL ) return L;
	PNodoLista P = L;
	PNodoLista Pant = NULL;
	float soma=0;
	int contador = 0;
	while(P!=NULL){
		media += P->Elemento.notaFinal;
		contador ++;
		Pant = P;
		P = P->Prox;
	}
	float media = soma / contador;
	P = L;
	while (P!=NULL){
		if(P->Elemento.notaFinal < media){
			PNodoLista AUX = P;
			if(Pant == NULL){
				L=P->Prox;
			}else{
				Pant ->Prox = P->Prox;
				P = Pant->Prox;
			}
		}
		Pant = P;
		P = P->Prox;
	}
	return L;
}
