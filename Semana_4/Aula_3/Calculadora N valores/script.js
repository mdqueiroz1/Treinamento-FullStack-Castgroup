function somatorio() {

    var soma = 0, valor;

    valor = prompt("Digite o valor, para receber o resultado digite =", "");

    if(valor == '='){
        alert("O resultado é 0");
    }else{

        do {
            soma = soma+ parseFloat(valor);
            valor = prompt("Digite o valor, para receber o resultado digite =", "");
        } while (valor != '=');
        
        alert("O resultado é "+soma);
    }
}

function operadores() {
    var resultado = 0, valor, op;
    valor = prompt("Digite o valor, para receber o resultado digite =", "");
    if(valor == '='){
        alert("O resultado é 0");
    }else{
        do {
            op = prompt("Digite o operador, para receber o resultado digite =", "");
            if(op == '=') break;

            switch (op) {
                case '+':{
                    resultado += parseFloat(valor);
                    alert(resultado);
                    break;
                }
                case '-':{
                    resultado -= parseFloat(valor);
                    break;
                }
                case '*':{
                    resultado *= parseFloat(valor);
                    break;
                }
                case '/':{
                    if(valor != 0){
                        resultado /= parseFloat(valor);
                    }
                    break;
                }
                default:
                    break;
                }   
            valor = prompt("Digite o valor, para receber o resultado digite =", "");
        } while (op != '=' || valor != '=');
        alert("O resultado é "+resultado);
    }
}