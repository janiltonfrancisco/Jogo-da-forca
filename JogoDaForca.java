import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author janil
 */
public class JogoDaForca {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // definir a palavra a ser adivinhada

        String palavraSecreta = "ABACATE";

        char[] palavraOculta = new char[palavraSecreta.length()];

        for (int i = 0; i < palavraSecreta.length(); i++) {
            palavraOculta[i] = '_';
        }

        System.out.println("Bem-vindo ao Jogo da Forca!");
        System.out.println("Adivinhe a palavra secreta:");
        System.out.println("A palavra é o nome de uma fruta");

        System.out.println(Arrays.toString(palavraOculta));

        // número máximo de tentativas
        int tentativas = 6;
        boolean venceu = false;

        // Loop que solicita as letras para o usuário

        while (tentativas > 0) {
            System.out.println("Palavra: " + String.valueOf(palavraOculta));
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.println("Digite uma letra: ");

            char letra = scanner.next().toUpperCase().charAt(0);

            System.out.println(letra);

            boolean acertou = false;

            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    palavraOculta[i] = letra;
                    acertou = true;
                }
            }

            // dedução de tentativas
            if (!acertou) {
                tentativas--;
                System.out.println("Letra incorreta");
            } else {
                System.out.println("Letra correta");
            }

            if (String.valueOf(palavraOculta).equals(palavraSecreta)) {
                venceu = true;
                break;
            }

        }

        // a condição de vitória
        if (venceu) {
            System.out.println("Parabens! vc venceu ! Ainda restavam  " + tentativas + "Tentativas");

        } else {
            System.out.println("Voce perdeu!");
        }

        System.out.println("A palavra era: " + palavraSecreta);
        scanner.close();
    }

}
