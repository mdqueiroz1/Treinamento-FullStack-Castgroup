function atividade1(){
    var num;
    num = prompt("Informe um numero:");
    alert("Antecessor: "+(parseInt(num)-1)+"\nSucessor: "+(parseInt(num)+1));
}

function atividade2(){
    var conta, qntClientes;
    conta = prompt("Informe o valor da conta: ");
    qntClientes = prompt("Quantos clientes vão pagar a conta?");
    alert("O valor dividido será "+(parseFloat(conta)/parseFloat(qntClientes)).toFixed(2));
}

function atividade3(){
    var conta;
    conta = prompt("Preço R$: ");
    conta = parseFloat(conta);

    alert("A vista R$: "+(conta - (conta*0.1)).toFixed(2)+
          "\nOu 3x de R$: "+(conta/3).toFixed(2));
}

function atividade4(){
    var n1, n2;
    
    n1 = prompt("1ª nota: ");
    n1 = parseFloat(n1);
    
    n2 = prompt("2ª nota: ");
    n2 = parseFloat(n2);

    alert("Media: "+((n1+n2)/2).toFixed(1));    
}