import java.util.Scanner;

 public class Q10_Vetor {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int[] y = new int[5];

       for (int i = 0; i < 5;){
           int n;
           n = sc.nextInt();
           boolean igual = false;
           for (int j =0; j < i; j++){
               if (n == x[j]){
                   igual = true;
                   break;
               }
           }
           if (!igual){
               x[i] = n;
               i++;
           }else {
               System.out.println("Nâo adicione números iguais no vetor.");
           }
       }

        for (int i = 0; i < 5;){
            int n;
            n = sc.nextInt();
            boolean igual = false;
            for (int j =0; j < i; j++){
                if (n == y[j]){
                    igual = true;
                    break;
                }
            }
            if (!igual){
                y[i] = n;
                i++;
            }else {
                System.out.println("Nâo adicione números iguais no vetor.");
            }
        }

        int[] resultadoA = soma(x,y);
        System.out.print("Soma: ");
        for (int i = 0; i < 5; i++){
            System.out.print(resultadoA[i] + " ");
        }

        System.out.println();

        int[] resultadoB = produto(x,y);
        System.out.print("Multiplicação: ");
        for (int i = 0; i < 5; i++){
            System.out.print(resultadoB[i] + " ");
        }

        System.out.println();

        System.out.print("Diferença:");
        diferenca(x,y);

        System.out.println();

        System.out.print("Interseção:");
        intersecao(x,y);

        System.out.println();

        System.out.print("União:");
        uniao(x,y);
    }
    public static int[] soma(int[] x, int[] y){
        int[] resultadoSoma = new int[5];

        for (int i = 0; i < 5; i++){
            resultadoSoma[i] = x[i]+ y[i];
        }
        return resultadoSoma;
    }

    public static  int[] produto(int[] x, int[] y){
        int[] multi = new int[5];
        for (int i = 0; i< 5; i++){
            multi[i]= x[i] * y[i];
        }
        return multi;
    }

    public static void diferenca(int[] x, int[] y){
        int[] dif = new int[5];
        int cont = 0;
        for (int i = 0; i < 5; i++){
            boolean achou=false;
            for (int j=0; j < 5; j++){
                if (x[i] == y[j]) {
                    achou = true;
                    break;
                }
            }
            if (!achou){
                dif[cont]= x[i];
                cont++;
            }
        }
        for (int i = 0; i < cont; i++){
            System.out.print(dif[i] + " ");
        }
    }

    public static void intersecao(int[] x, int[] y){
        int[] inters = new int[5];
        int cont = 0;
        for (int i = 0; i < 5; i++){
            boolean igual = false;
            for (int j = 0; j < 5; j++){
                if (x[i] == y[j]) {
                    igual = true;
                    break;
                }
            }
            if (igual){
                inters[cont] = x[i];
                cont++;
            }
        }
        for (int i = 0; i < cont; i++){
            System.out.print(inters[i] + " ");
        }
    }

    public static void uniao(int[] x, int[] y){
        int[] uni = new int[10];
        int cont = 0;
        for (int i = 0; i < 5; i++){
            uni[i]= x[i];
            cont++;
        }
        for (int i = 0; i < 5; i++){
            boolean igual = false;
            for (int j = 0; j < 5; j++){
                if (y[i] == x[j]){
                    igual = true;
                    break;
                }
            }
            if (!igual){
                uni[cont] = y[i];
                cont++;
            }
        }
        for (int i= 0; i < cont; i++){
            System.out.print(uni[i] + " ");
        }

    }
}
