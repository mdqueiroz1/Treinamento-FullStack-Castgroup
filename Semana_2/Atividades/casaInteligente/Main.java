package casaInteligente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //Pra não colocar o nome de Alexa e ficar igual, coloquei o nome
        // da  minha assistente como Eva por causa da Eva do filme Wall-e
        Eva eva = new Eva();
        String menu;

        do {
            System.out.println("Para começar digite Ola Eva ou o comando desejado\n"+
                                "Para a lista de comandos, digite Ajuda.\n");
            
            //Utilizei o tratamendo da string para que ela fique menos sensitive case, 
            //pra mesmo que digite sem os "upper cases" entre no programa.
            menu = leia.nextLine();
            menu = menu.toUpperCase();
            
            switch (menu) {
                case "OLA EVA":{
                    System.out.println("Eva: Olá! Como posso ser útil hoje?");
                    break;
                }
    
                case "EVA, ACENDA AS LUZES":{
                    eva.ligarLampadas();
                    break;
                }

                case "EVA, DESLIGUE AS LUZES":{
                    eva.desligarLampadas();
                    break;
                }
                
                case "EVA, ABRA AS CORTINAS":{
                    eva.abrirCortinas();
                    break;
                }
                
                case "EVA, FECHE AS CORTINAS":{
                    eva.fecharCortinas();
                    break;
                }

                case "EVA, ME CONTE UMA PIADA":{
                    eva.conteUmaPiada();
                    break;
                }

                case "EVA, TOQUE MUSICA":{
                    eva.iniciarMusica();
                    break;
                }

                case "EVA, PARE A MUSICA":{
                    eva.fecharMusica();
                    break;
                }
                
                case "EVA, TRANQUE A PORTA":{
                    eva.trancarPortaDeEntrada();
                    break;
                }
                case "EVA, DESTRANQUE A PORTA":{
                    eva.destrancarPortaDeEntrada();
                    break;
                }
                case "EVA, QUAL O CLIMA DE HOJE":{
                    eva.clima();
                    break;
                }

                case "EVA, BOM DIA":{
                    eva.rotinaBomDia();
                    break;
                }

                case "EVA, HORA DE DORMIR":{
                    eva.rotinaHoraDeDormir();
                    break;
                }

                case "EVA, INICIE O JOGO DA VELHA":{
                    eva.iniciarTicTacToe();
                    break;
                }

                case "AJUDA":{
                    System.out.println("Você pode utilizar os seguintes comandos:\n"+
                                        "Eva, acenda as luzes\n"+
                                        "Eva, desligue as luzes\n"+
                                        "Eva, abra as cortinas\n"+
                                        "Eva, feche as cortinas\n"+
                                        "Eva, toque musica\n"+
                                        "Eva, pare a musica\n"+
                                        "Eva, bom dia\n"+
                                        "Eva, hora de dormir\n"+
                                        "Eva, inicie o jogo da velha\n"+
                                        "Eva, me conte uma piada\n");
                    break;
                }
            }
            System.out.println("\n\n");
        } while (!menu.equals("TERMINAR PROGRAMA"));

        System.out.println("Programa Finalizado.");
        leia.close();
    }
}
