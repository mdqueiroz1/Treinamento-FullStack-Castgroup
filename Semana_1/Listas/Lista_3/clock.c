#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

#define TAM 1000000

int main(){
    
    int a, x = 2;

    clock_t t1,t2;

    t2 = clock();
    for(int i = 0 ; i < TAM ; i++){
        a = pow(x,x);
    }
    t2 = clock() - t2; 

    t1 = clock();
    for(int i = 0 ; i < TAM ; i++){
        a = x*x;
    }
    t1 = clock() - t1;


    printf("Tempo de execucao de x*x: %lf em milissegundos\n", ((double)t1)/((CLOCKS_PER_SEC/1000)));
    printf("Tempo de execucao de pow(x,2): %lf em milissegundos\n", ((double)t2)/((CLOCKS_PER_SEC/1000)));


    return 0;
}


