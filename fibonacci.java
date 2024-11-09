import java.util.Scanner;

public class fibonacci {

    boolean isIn = false;

    public void calcFibo() {

        int num1 = 0;
        int num2 = 1;
        int ax;

        System.out.println("Digite um número para verificar se ele está na sequencia de Fibonacci: ");

        Scanner scanner = new Scanner(System.in);
        int resp = scanner.nextInt();

        System.out.println("\tA sequencia de Fibonacci é: ");

        for (int i = 0; i < 36; i++) {
            System.out.println(" " + num1);

            if(num1 == resp){
                isIn = true;
                break;
            }

            ax = num2;
            num2 = num2 + num1;
            num1 = ax;
        }

        if(isIn) {
            System.out.println("\nO número que você digitou faz parte da sequência.");
        } else {
            System.out.println("\nO número que você digitou não faz parte da sequência.");
        }

    }
}
