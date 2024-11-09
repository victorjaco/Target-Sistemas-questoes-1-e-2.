import java.util.Scanner;

public class thereIsA {

    public void searchA(){

        System.out.println("\nDigite uma frase para verificar se tem a letra A nela e quantas vezes aparece: ");

        int j = 0;
        Scanner scanner = new Scanner(System.in);
        String existA = scanner.nextLine();

        for (int i = 0; i < existA.length(); i++) {
            char searchA = existA.charAt(i);
            if(searchA == 'a' || searchA == 'A'){
                j++;
            }
        }

        if(j > 0) {
            System.out.println("O texto que você digitou tem a letra A. Ela aparece " + j + " vezes no seu texto.");
        } else {
            System.out.println("A frase que você digitou não possui a letra A.");
        }
    }
}
