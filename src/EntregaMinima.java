import java.util.Random;
import java.util.Scanner;

public class EntregaMinima {
    public static void main(String[] args) {

        Random gerador = new Random();
        Scanner entrada = new Scanner(System.in);
        int numeroAleatorio = 0;
        int numeroDigitado = 0;

        for (int i = 0; i < 1; i++){
            numeroAleatorio = gerador.nextInt(10);
        }

        System.out.println("Que os jgos comecem!");
        System.out.println("Vamos nos divertir? Quero ver se você consegue advinhar o número no qual estou pensando...");
        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("Digite um número inteiro:");
        numeroDigitado = entrada.nextInt();

        if (numeroDigitado == numeroAleatorio){
            System.out.println("Uau! Parabéms!!! Você acertou e ganhou 10 pontos!");
        } else if (numeroDigitado == (numeroAleatorio + 1) || numeroDigitado == (numeroAleatorio - 1) ) {
            System.out.println("Nossa, quase lá! Você passou bem perto e por isso ganhou 5 pontos!");
        } else {
            System.out.println("Poxa... Não foi dessa vez! Infelizmente você perdeu.");
        }
    }
}
