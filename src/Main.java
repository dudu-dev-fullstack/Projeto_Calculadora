import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem-vindo a calculadora do DUDU!");
        System.out.println("Digite o primeiro numero: ");
        int x = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int y = sc.nextInt();

        int sct = 0;

        while(true){
            System.out.println("Digite qual opcao deseja: ");
            System.out.println("Opcao 1: Adicao");
            System.out.println("Opcao 2: Subtracao");
            System.out.println("Opcao 3: Multiplicacao");
            System.out.println("Opcao 4: Divisao");
            int opc  = sc.nextInt();
            if (opc == 1){
                System.out.println("Voce escolheu adicao");
                int resultado = x + y;
                System.out.printf("O resultado da operacao foi: %d\n", resultado);
                System.out.println("Deseja continuar?");
                System.out.println("1- Sim 2- Nao");
                sct = sc.nextInt();
                if (sct == 1){
                    System.out.println("Digite o primeiro numero: ");
                    x = sc.nextInt();
                    System.out.println("Digite o segundo numero: ");
                    y = sc.nextInt();
                }
                else if (sct == 2){
                    break;
                }
            }
            else if (opc == 2){
                System.out.println("Voce escolheu subtracao");
                int resultado = x - y;
                System.out.printf("O resultado da operacao foi: %d\n", resultado);
                System.out.println("Deseja continuar?");
                System.out.println("1- Sim 2- Nao");
                sct = sc.nextInt();
                if (sct == 1){
                    System.out.println("Digite o primeiro numero: ");
                    x = sc.nextInt();
                    System.out.println("Digite o segundo numero: ");
                    y = sc.nextInt();
                }
                else if (sct == 2){
                    break;
                }
            }
            else if (opc == 3){
                System.out.println("Voce escolheu multiplicacao");
                int resultado = x * y;
                System.out.printf("O resultado da operacao foi: %d\n", resultado);
                System.out.println("Deseja continuar?");
                System.out.println("1- Sim 2- Nao");
                sct = sc.nextInt();
                if (sct == 1){
                    System.out.println("Digite o primeiro numero: ");
                    x = sc.nextInt();
                    System.out.println("Digite o segundo numero: ");
                    y = sc.nextInt();
                }
                else if (sct == 2){
                    break;
                }
            }
            else if (opc == 4){
                System.out.println("Voce escolheu divisao");
                int resultado = x / y;
                System.out.printf("O resultado da operacao foi: %d\n", resultado);
                System.out.println("Deseja continuar?");
                System.out.println("1- Sim 2- Nao");
                sct = sc.nextInt();
                if (sct == 1){
                    System.out.println("Digite o primeiro numero: ");
                    x = sc.nextInt();
                    System.out.println("Digite o segundo numero: ");
                    y = sc.nextInt();
                }
                else if (sct == 2){
                    break;
                }
            }
        }
    }
}