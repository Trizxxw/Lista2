import java.util.Scanner;
public class Q2_Vetor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int []v = new int [6];
        for (int i = 0; i < 6; i++){
            v[i] = sc.nextInt();
        }
        for (int i = 0; i < 6; i++){
            System.out.print(v[i] + " ");
        }
    }
}
