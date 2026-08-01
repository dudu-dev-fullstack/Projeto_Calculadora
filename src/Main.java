import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double x = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double y = sc.nextDouble();

        System.out.println("Digite qual opcao deseja: ");
        int opc  = sc.nextInt();


        while(true){
            if (opc == 1){
                System.out.println("Voce escolheu adicao");
                double resultado = x + y;
                System.out.println(resultado);
                System.out.println("Deseja continuar? (S/N)");
                if(sc.next().charAt(0) == 'S'){
                }
            }
            else if (opc == 2){
                System.out.println("Voce escolheu subtracao");
                double resultado = x - y;
                System.out.println(resultado);
            }
            else if (opc == 3){
                System.out.println("Voce escolheu multiplicacao");
                double resultado = x * y;
                System.out.println(resultado);
            }
            else if (opc == 4){
                System.out.println("Voce escolheu divisao");
                double resultado = x / y;
                System.out.println(resultado);
            }
        }
    }
}