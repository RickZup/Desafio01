import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EntregaMaxima {
    public static void main(String[] args) {

        Random gerador = new Random();
        Scanner entrada = new Scanner(System.in);
        int numeroAleatorio = 0;
        int numeroDigitado = 0;
        int pontuaçao = 0;
        int dificuldade = 0;
        int quantidadeDeNumeros = 0;
        String resposta = null;

        List<Integer> numerosComputador = new ArrayList<>();
        List<Integer> numerosUsuario = new ArrayList<>();

        System.out.println("Que os jogos comecem!");
        System.out.println("Vamos nos divertir? Quero ver se você consegue advinhar o número no qual estou pensando...");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Primeiro vamos definir o nível de dificuldade!");
        System.out.println("Digite o número referente a dificuldade: \n 1- Fáfcil \n 2- Médio \n 3- Difícil \n 4- Catalisa");
        dificuldade = entrada.nextInt();

        switch (dificuldade){
            case 1:
                quantidadeDeNumeros = 10;
                break;
            case 2:
                quantidadeDeNumeros = 50;
                break;
            case 3:
                quantidadeDeNumeros = 100;
                break;
            case 4:
                quantidadeDeNumeros = 500;
                break;
            default:
                System.out.println("Opção inválida!");
        }

        for (int i = 0; i < 1; i++){
            numeroAleatorio = gerador.nextInt(quantidadeDeNumeros);
            numerosComputador.add(numeroAleatorio);
        }

        System.out.println("-------------------");
        System.out.println("Digite seu palpite:");
        numeroDigitado = entrada.nextInt();
        numerosUsuario.add(numeroDigitado);

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

        //ToDo Tratar acentuação
        if (resposta.equalsIgnoreCase("Não")){
            System.out.println("-----------------------------------------------------");
            System.out.println("Entendo, agradeço por jogar comigo, volte outra hora!");
            System.out.println("Vou te mostrar todos os números que o computador pensou: " + numerosComputador);
            System.out.println("E aqui estão os que você escolheu em suas jogadas: " + numerosUsuario);
        }

        while (resposta.equalsIgnoreCase("Sim")){
            for (int i = 0; i < 1; i++){
                numeroAleatorio = gerador.nextInt(quantidadeDeNumeros);
                numerosComputador.add(numeroAleatorio);
            }

            System.out.println("-------------------------");
            System.out.println("Digite seu palpite:");
            numeroDigitado = entrada.nextInt();
            numerosUsuario.add(numeroDigitado);

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
                System.out.println("Vou te mostrar todos os números que o computador pensou: " + numerosComputador);
                System.out.println("E aqui estão os que você escolheu em suas jogadas: " + numerosUsuario);
            }
        }
    }
}
