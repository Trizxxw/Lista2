import java.util.Scanner;
public class Q8 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int []A = new int[10];
        int []B = new int[10];

        for (int i = 0; i < 10; i++){
            A[i]= sc.nextInt();
        }
        for (int i = 0; i < 10; i++){
            B[i]= sc.nextInt();
        }

        int []C= imparPar(B,A);;

        for (int i = 0; i < 20; i++){
            System.out.print(C[i] + " ");
        }
    }
    public static int []imparPar(int []b, int []a){
        int []c= new int[20];
        for (int i = 0; i < 20; i++){
            if (i % 2 == 0)
                c[i] = a[i/2];
            else
                c[i] = b[i/2];
        }
        return c;
    }
}
