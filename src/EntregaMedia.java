import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class EntregaMedia {
    public static void main(String[] args) {

        Random gerador = new Random();
        Scanner entrada = new Scanner(System.in);
        int numeroAleatorio = 0;
        int numeroDigitado = 0;
        int pontuaçao = 0;
        String resposta = null;

        for (int i = 0; i < 1; i++){
            numeroAleatorio = gerador.nextInt(10);
        }

        System.out.println("Que os jgos comecem!");
        System.out.println("Vamos nos divertir? Quero ver se você consegue advinhar o número no qual estou pensando...");
        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("Digite seu palpite:");
        numeroDigitado = entrada.nextInt();

        if (numeroDigitado == numeroAleatorio){
            System.out.println("Muito bem! O número escolhido pelo computador foi " + numeroAleatorio);
            System.out.println("Você acertou e ganhou 10 pontos!");
            pontuaçao += 10;
        } else if (numeroDigitado == (numeroAleatorio + 1) || numeroDigitado == (numeroAleatorio - 1) ) {
            System.out.println("Nossa, quase lá! O número do computador foi " + numeroAleatorio);
            System.out.println("Você passou bem perto e por isso ganhou 5 pontos!");
            pontuaçao += 5;
        } else {
            System.out.println("Poxa... Não foi dessa vez! Infelizmente você perdeu.");
            System.out.println("O número escolhido pelo computador foi " + numeroAleatorio);
        }

        System.out.println("----------------------");
        System.out.println("Vamos mais uma vez?");
        System.out.println("Digite 'Sim' ou 'Não'!");
        resposta = entrada.next();

        if (resposta.equalsIgnoreCase("Não")){
            System.out.println("-----------------------------------------------------");
            System.out.println("Entendo, agradeço por jogar comigo, volte outra hora!");
        }

        while (resposta.equalsIgnoreCase("Sim")){

            //Teste para gerar um novo número aleatório a cada nova jogada
            for (int i = 0; i < 1; i++){
                numeroAleatorio = gerador.nextInt(10);
            }

            System.out.println("-------------------------");
            System.out.println("Digite seu palpite:");
            numeroDigitado = entrada.nextInt();

            if (numeroDigitado == numeroAleatorio){
                System.out.println("Muito bem! O número escolhido pelo computador foi " + numeroAleatorio);
                System.out.println("Você acertou e ganhou 10 pontos!");
                pontuaçao += 10;
            } else if (numeroDigitado == (numeroAleatorio + 1) || numeroDigitado == (numeroAleatorio - 1) ) {
                System.out.println("Nossa, quase lá! O número do computador foi " + numeroAleatorio);
                System.out.println("Você passou bem perto e por isso ganhou 5 pontos!");
                pontuaçao += 5;
            } else {
                System.out.println("Poxa... Não foi dessa vez! Infelizmente você perdeu.");
                System.out.println("O número escolhido pelo computador foi " + numeroAleatorio);
            }

            System.out.println("----------------------");
            System.out.println("Vamos mais uma vez?");
            System.out.println("Digite 'Sim' ou 'Não'!");
            resposta = entrada.next();

            if (resposta.equalsIgnoreCase("Não")){
                System.out.println("-----------------------------------------------------");
                System.out.println("Entendo, agradeço por jogar comigo, volte outra hora!");
                System.out.println("Sua pontuação total foi: " + pontuaçao);
            }
        }
    }
}
