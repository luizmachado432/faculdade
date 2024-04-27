public class lista2 {
    public static void main(String[] args) {
        int[] numeros = {1,1,4,4,5,7,8,8,9,0,1};
        int quantidade = 0;
        int numeroTeste= 1;
        for (int i=0; i< numeros.length; i ++){
            if(numeros[i] == numeroTeste){
                quantidade++;
            }
        }
        System.out.println(quantidade);




    }
}
