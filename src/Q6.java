import java.util.Scanner;
public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String []nome = new String[20];
        int []idade = new int[20];

        for (int i = 0; i < 20; i++){
            nome[i] = sc.nextLine();

            idade[i]= sc.nextInt();
            sc.nextLine();
        }
        double media= media(idade);
        System.out.println("Média: " + media);

        System.out.println("Pessoas com idade acima da média:");
        acima(nome, idade);

    }
    public static double media (int v[]){
        double soma = 0;
        for (int i = 0; i < v.length; i++){
            soma = soma + v[i];
        }
        return soma/20;
    }
    public static void acima (String nome[], int v[]){
        double media=media(v);
        for (int i = 0; i < 20; i++){
            if (v[i] > media){
                System.out.println(nome[i]);
            }
        }
    }

}
