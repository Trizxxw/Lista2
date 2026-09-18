public class Q9_Vetor {
    public static void main(String[] args){
        int[] v= new int[100];
        int posicao = 0;
        int numero = 1;
        do {
            if (numero % 7 != 0 && numero % 10 != 7){
                v[posicao]= numero;
                posicao++;
            }
            numero++;
        }while (posicao != v.length);

        for (int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
    }
}
