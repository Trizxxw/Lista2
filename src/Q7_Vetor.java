import java.util.Scanner;
public class Q7_Vetor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int []a = new int[20];
        int []b = new int[20];

        for (int i = 0; i < 20; i++){
            a[i] = sc.nextInt();
        }
        for (int i= 0; i < 20; i++){
            b[i]= sc.nextInt();
        }


        int []c = vetorC(a,b);

        for (int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }

    }
    public static int []vetorC (int []a, int []b){
        int []v= new int[40];
        for (int i = 0; i < 40; i++) {
            if (i % 2 != 0) {
                v[i] = b[i/2];
            } else {
                v[i] = a[i/2];
            }
        }
        return v;
    }
}
