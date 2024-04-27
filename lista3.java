import java.util.Scanner;

public class lista3 {
    public static void main(String[] args) {
        System.out.printf("Digite um numero para verificar se ele esta na lista: ");
        Scanner n = new Scanner(System.in);
        int selecao = n.nextInt();
        int[] numeros = {1,3,4,5,7,4,6,87,9,0};
        String simNao = "nao" ;
        
        
        
        for (int i = 0; i< numeros.length; i++){

            if (selecao == numeros[i]){
                simNao = "sim";
            }
           

        }System.out.println(simNao);



    }
}
