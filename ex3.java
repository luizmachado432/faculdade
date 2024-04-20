import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int repeticoes = -999999999;
        while(repeticoes<999999999){System.out.printf("escolha a operaçao desejada: \n * para multiplicaçao\n + para adicao\n - subtraçao \n / divisao\n:");

        String sinal = numeros.next();

        System.out.printf("agoro escolha dois numeros: ");

        double num1 = numeros.nextdouble();
        double num2 = numeros.nextdouble();
        double resultado = 0;

        switch (sinal){
                case "*":
                resultado = num1 * num2;
            break;
                case "+":
                resultado = num1 + num2;
            break;
                case "-":
                resultado= num1 - num2;
            break;
                case "/":
                resultado = num1 / num2;
            break;
            default:
                System.out.printf("escreva uma operaçao valida");
        }
        System.out.println("Seu resultado é " + resultado);
        repeticoes++;
        }
    }
}
