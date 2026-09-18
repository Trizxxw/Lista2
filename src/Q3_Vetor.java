import java.util.Scanner;
public class Q3_Vetor {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int []v = new int[10];

        for (int i = 0; i < 10; i++){
            v[i] = sc.nextInt();
        }

        pares(v);
    }

    public static void pares (int []v){

        for (int i = 0; i < v.length; i++){
            if (v[i] % 2 == 0)
                System.out.println(v[i]);
        }
    }
}
