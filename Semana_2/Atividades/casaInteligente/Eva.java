package casaInteligente;

import java.util.Scanner;
import java.util.Random;

public class Eva implements Controle {
    Scanner leia = new Scanner(System.in);
    Random gerador = new Random();

    private boolean lampadaONOFF, cortinaONOFF, musicaONOFF, portaONOFF;
    private String[] musicas = new String[]{"Given Up - Linkin Park",
                                            "Esquiva da Esgrima - Criolo",
                                            "Wake up - Rage Against The Machine",
                                            "Reminder - Mumford & Sons",
                                            "Phi - Scanele",
                                            "Drugs - UPSAHL",
                                            "Poor Man's Son - Bastard Sons of Johnny Cash"};
    
    //getters e setters

    public String getMusicas(int rand){
        return musicas[rand];
    }

    public boolean getPortaONOFF() {
        return this.portaONOFF;
    }

    public void setPortaONOFF(boolean portaONOFF) {
        this.portaONOFF = portaONOFF;
    }

    public boolean getLampadaONOFF() {
        return this.lampadaONOFF;
    }

    public void setLampadaONOFF(boolean lampadaONOFF) {
        this.lampadaONOFF = lampadaONOFF;
    }

    public boolean getCortinaONOFF() {
        return this.cortinaONOFF;
    }

    public void setCortinaONOFF(boolean cortinaONOFF) {
        this.cortinaONOFF = cortinaONOFF;
    }

    public boolean getMusicaONOFF() {
        return this.musicaONOFF;
    }

    public void setMusicaONOFF(boolean musicaONOFF) {
        this.musicaONOFF = musicaONOFF;
    }
    
    //construtor genérico
    public Eva() {
    }
    
	@Override
	public void ligarLampadas() {
		if(!getLampadaONOFF())
            setLampadaONOFF(true);

        System.out.println("Lampadas ligadas!");
	}
    
	@Override
	public void desligarLampadas() {
		if(getLampadaONOFF())
            setLampadaONOFF(false);

        System.out.println("Lampadas desligadas!");
	}

	@Override
	public void abrirCortinas() {
        if(!getCortinaONOFF()){
            setCortinaONOFF(true);
            System.out.println("Abrindo as cortinas...");
        }else
            System.out.println("As cortinas já estão abertas!");
	}
    
	@Override
	public void fecharCortinas() {
		if(getCortinaONOFF()){
            System.out.println("Fechando cortinas...");
            setCortinaONOFF(false);
        }else
            System.out.println("As cortinas já estão fechadas!");
	}

	@Override
	public void destrancarPortaDeEntrada() {
		if(getPortaONOFF()){
            System.out.println("Destrancando porta de entrada...");
            setPortaONOFF(false);
        }else{
            System.out.println("A porta já está destrancada!");
        }
	}
    
	@Override
	public void trancarPortaDeEntrada() {
		if(!getPortaONOFF()){
            System.out.println("Trancando porta de entrada...");
            setPortaONOFF(true);
        }else{
            System.out.println("A porta já está trancada!");
        }
	}

    @Override
    public void iniciarMusica(){
        if(!getMusicaONOFF()){
            setMusicaONOFF(true);
            System.out.println("Tocando:\n"+getMusicas(gerador.nextInt(6))+"\n"+
            "  ---   ----   ---   ---\n"+
            " |<<-| | || | | > | |->>|\n"+
            "  ---   ----   ---   ---");
        }else{
            System.out.println("Musica já está tocando!");
        }
    } 

    @Override
    public void fecharMusica(){
        if(getMusicaONOFF()){
            setMusicaONOFF(false);
            System.out.println("Musica parada...");
        }else{
            System.out.println("Não está tocando músicas!");
        }
        
    }

    @Override
    public void clima(){
        System.out.println("O céu está limpo e com poucas nuvens.\nAtualmente: 16°C");
    }

    @Override
    public void rotinaBomDia(){
        System.out.println("Bom dia, hoje é 02 de setembro");
        this.clima();
        this.abrirCortinas();
        this.ligarLampadas();
        System.out.println("Aqui vai uma piada para alegrar seu dia!");
        this.conteUmaPiada();
        System.out.println("Iniciando música matinal...");
        this.iniciarMusica();
    }

    @Override
    public void rotinaHoraDeDormir(){
        this.clima();
        this.desligarLampadas();
        this.fecharCortinas();
        this.fecharMusica();
        this.trancarPortaDeEntrada();
    }

	@Override
	public void conteUmaPiada() {
        
        switch (gerador.nextInt(10)) {
            case 1:{
                System.out.println("O que o pagodeiro foi fazer na igreja?\n-Cantar pá God\n");
                break;
            }
            case 2:{
                System.out.println("Você sabe qual é o rei dos queijos?\n-O reiqueijão\n");
                break;
            }
            case 3:{
                System.out.println("Um caipira chega a casa de um amigo que está vendo TV e pergunta:\n"+
                                    "- E aí, firme?\n"+
                                    "- Não, futebor\n");
                break;
            }
            case 4:{
                System.out.println("– O que o pato falou para a pata?\n"+
                "– Vem quá\n");
                break;
            }
            case 5:{
                System.out.println("– Por que a velhinha não usa relógio?\n"+
                "– Porque ela é uma sen hora\n");
                break;
            }
            case 6:{
                System.out.println("– Quando os americanos comeram carne pela primeira vez?\n"+
                "– Quando chegou Cristóvão Com Lombo\n");
                break;
            }
            case 7:{
                System.out.println("– O que estará escrito na lápide do Papai Noel?\n"+
                "– Ele não está mais em trenós.\n");
                break;
            }
            case 8:{
                System.out.println("– O que um tijolo falou para o outro?\n"+
                "– Há um cimento entre nós.\n");
                break;
            }
            case 9:{
                System.out.println("– Sou paraguaio e estou aqui para matá-lo.\n"+
                "– Para o quê?!\n– Paraguaio.\n");
                break;
            }
            case 10:{
                System.out.println("-O que uma banana disse para o cachorro?\n"+
                "-Nada. Bananas não falam.\n");
                break;
            }
            default:
                break;
        }
		
	}

    @Override
	public void iniciarTicTacToe() {
        Scanner leia = new Scanner(System.in);
        int p1Rand,p2Rand, p1Jogador,p2Jogador,jogada=0; 
        char vencedor = ' ';
        char[][] matriz = new char[3][3];
        
        //Inicializando a matriz com espaços vazios para que não haja problemas na verificação.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = ' ';
            }
        }

        System.out.println(
        "     _                         _                   _ _            \n"+
        "    (_)                       | |                 | | |          \n"+
        "     _  ___   __ _  ___     __| | __ _  __   _____| | |__   __ _ \n"+
        "    | |/ _ \\ / _` |/ _ \\   / _` |/ _` | \\ \\ / / _ \\ | '_ \\ / _` |\n"+
        "    | | (_) | (_| | (_) | | (_| | (_| |  \\ V /  __/ | | | | (_| |\n"+
        "    | |\\___/ \\__, |\\___/   \\__,_|\\__,_|   \\_/ \\___|_|_| |_|\\__,_|\n"+
        "   _/ |       __/ |                                              \n"+
        "  |__/       |___/                                               \n");

        System.out.println("Instruções:\n"+
        "Para jogar, basta informar a posição que deseja colocar sua peça\n"+
        "Exemplo:\n"+
        "Linha: 1\nColuna: 1");
        System.out.println(
            "-------------------\n"+
            "|  X  |     |     |\n"+
            "-------------------\n"+
            "|     |     |     |\n"+
            "-------------------\n"+
            "|     |     |     |\n"+
            "-------------------\n");
        System.out.println("Preparado? Vamos lá!\n");

        do {
            do{
                p1Rand = gerador.nextInt(3);
                p2Rand = gerador.nextInt(3);
            }while(matriz[p1Rand][p2Rand] != ' ');
            
            matriz[p1Rand][p2Rand] = 'O';

            System.out.println("     1     2    3");
            System.out.printf("  -------------------\n");
            System.out.printf("1 |  %c  |  %c  |  %c  |\n",matriz[0][0],matriz[0][1],matriz[0][2]);
            System.out.printf("  -------------------\n");
            System.out.printf("2 |  %c  |  %c  |  %c  |\n",matriz[1][0],matriz[1][1],matriz[1][2]);
            System.out.printf("  -------------------\n");
            System.out.printf("3 |  %c  |  %c  |  %c  |\n",matriz[2][0],matriz[2][1],matriz[2][2]);
            System.out.printf("  -------------------\n");
            System.out.println("Sua peça é o X");
            do{
                System.out.println("Em qual linha você quer colocar sua peça?");
                p1Jogador = leia.nextInt();
                p1Jogador--;
                System.out.println("Em qual coluna você quer colocar sua peça?");
                p2Jogador = leia.nextInt();
                p2Jogador--;
            }while(matriz[p1Jogador][p2Jogador] != ' ');
            matriz[p1Jogador][p2Jogador] = 'X';
            
            for (int i = 0; i < 3; i++) {
                if((matriz[i][0] == matriz[i][1]) && matriz[i][1] == matriz[i][2]){
                    if(matriz[i][0] == 'X'){
                        vencedor = 'J';
                        jogada = 4;
                    }else{
                        if(matriz[i][0] == 'O'){
                            vencedor = 'C';
                            jogada = 4;
                        }
                    }
                }
            }
                
            
            //teste diagonal principal
            if((matriz[0][0] == matriz[1][1]) && matriz[1][1] == matriz[2][2]){
                if(matriz[0][0] == 'X'){
                    vencedor = 'J';
                    jogada = 4;
                }else{
                    if(matriz[0][0] == 'O'){
                        vencedor = 'C';
                        jogada = 4;
                    }
                }
            }
            
            //teste diagonal secundaria
            if((matriz[0][2] == matriz[1][1]) && matriz[1][1] == matriz[2][0]){
                if(matriz[1][1] == 'X'){
                    vencedor = 'J';
                    jogada = 4;
                }else{
                    if(matriz[1][1] == 'O'){
                        vencedor = 'C';
                        jogada = 4;
                    }
                }
            }
            
            jogada++;
            if(jogada == 4 && vencedor == ' '){
                vencedor = 'E';
            }
        }while(jogada != 4);
        

        if(vencedor == 'J'){
            System.out.println("Você me venceu! Meus parabéns!");
        }else{
            if(vencedor == 'C'){
                System.out.println("Eu venci você!!");
            }else{
                if(vencedor == 'E'){
                    System.out.println("Empatou desta vez!");
                }
            }
        }

        leia.close();
    }
}
