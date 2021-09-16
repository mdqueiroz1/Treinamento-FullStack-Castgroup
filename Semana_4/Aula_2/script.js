/*
*conversor de temperatura
var c = 0 , f;

while(c != 's'){
    c = prompt("Informe o valor em Celsius a ser convertido, utilize 's' para sair","");
    if(c != 's'){
        f = 1.8 * c + 32;
        alert("A temperatura "+c+"°C "+" é igual a "+ f+"°F");
    }
}
*/

/*
*imc 
var imc, peso, altura;

peso = prompt("Informe o peso em KG","");
altura = prompt("Informe a altura em metros","");

imc = peso / (altura*altura);

imc = imc.toFixed(1);

alert("O IMC é "+imc );
*/


/*
* fatorial 
var valor, fatorial=1;

valor = prompt("Informe o valor para calcular seu fatorial","");

while(valor != 0){
    if(valor >= 0){
        break;
    }
    fatorial *= valor;
    valor--;
}

alert("Valor fatorial: "+fatorial);
*/