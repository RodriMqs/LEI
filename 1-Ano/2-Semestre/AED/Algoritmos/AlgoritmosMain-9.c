#include <stdio.h>
#include <stdlib.h>
#include "Aleatorio.h"
#include "Algoritmos.h" 
int main(){
    int *A, N = 40;
    A = lerArray(N, 10, 50);
    mostrarArray(A, N);
    ordenarQuicksort(A, 0, N-1);
    mostrarArray(A, N);
    int maior = A[N-1];
    for (int i=0 ; i<N ; i++){
        if(A[i] == A[N-1])
            maior = A[i];
    }
    mostrarArray(A, N);
}
