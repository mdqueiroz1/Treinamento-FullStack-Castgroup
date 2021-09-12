package Lista4.Atividade4;

import java.util.Scanner;

public class Calculadora {

    Scanner leia = new Scanner(System.in);
    
    private double num1, num2;
    private char operador;
    
    public void engine(){
        System.out.println("Calculadora simples\n"+
                            "\n+ para soma"+
                            "\n- para subtração"+
                            "\n/ para divisão"+
                            "\n* para multiplicação");
        System.out.println("Informe a operação:");
        
        setNum1(leia.nextDouble()); 
        do {
            setOperador(leia.next().charAt(0));
            if(getOperador() == '=') break;

            setNum2(leia.nextDouble());
            switch (operador) {
                case '+':{
                    setNum1(getNum1()+getNum2());
                    break;
                }
                case '-':{
                    setNum1(getNum1()-getNum2());
                    break;
                }
                case '*':{
                    setNum1(getNum1()*getNum2());
                    break;
                }
                case '/':{
                    if(num2 == 0){
                        System.out.println("numero nao pode ser dividido por 0");
                    }else{
                        setNum1(getNum1()/getNum2());
                    }
                    break;
                }
                default:
                    break;
            }
            System.out.println(getNum1());
            
            if (leia.hasNextLine()) {
                leia.nextLine();
            }
            
        } while (getOperador() != '=');

        leia.close();
    }

    protected void setOperador(char operador){
        this.operador = operador;
    }

    protected char getOperador(){
        return this.operador;
    }

    protected double getNum1() {
        return this.num1;
    }

    protected void setNum1(double num1) {
        this.num1 = num1;
    }

    protected double getNum2() {
        return this.num2;
    }

    protected void setNum2(double num2) {
        this.num2 = num2;
    }
}
