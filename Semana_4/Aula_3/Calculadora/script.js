function calculadora(form) {

    var a = parseFloat(form.fNumero1.value);
    var b = parseFloat(form.fNumero2.value);
    var op = form.fSelect.value;


    switch (op) {
        case '1':{
            form.fResultado.value = a+b;
            break;
        }
        case '2':{
            form.fResultado.value = a-b;
            break;
        }
        case '3':{
            form.fResultado.value = a*b;
            break;
        }
        case '4':{
            if(b == 0){
                form.fResultado.value = "Erro";
            }else{
                form.fResultado.value = a/b;
            }
            break;
        }
    
        default:
            break;
    }
}