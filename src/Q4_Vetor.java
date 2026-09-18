import java.util.Scanner;
public class Q4_Vetor {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String []nomes = new String[15];
        for (int i = 0; i < 15; i++){
            nomes[i] = sc.nextLine();
        }
        imprime(nomes);

    }
    public static void imprime (String []nome){
        for (int i = 14; i >= 0; i--){
            System.out.println(nome[i]);
        }
    }
}
