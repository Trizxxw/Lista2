import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int []numero = new int[20];
        for (int i = 0; i < 20; i++){
            numero[i]= sc.nextInt();
        }
        impar(numero);
        System.out.println();
        par(numero);
    }

    public static void impar (int []n1){
        for (int i = 0; i < 20; i++){
            if (n1[i] % 2 != 0)
                System.out.print(n1[i] + " ");
        }
    }

    public static void par (int []n2){
        for (int i = 0; i < 20; i++){
            if (i % 2 == 0)
                System.out.print(n2[i] + " ");
        }
    }
}
