public class Q1{
    public static void main(String[] args){

        int []v = {1, 0, 5, -2, -5, 7};

        v = quest1(v);
        for (int i = 0; i < v.length; i++){
            System.out.println(v[i]);
        }
        System.out.println("Soma = " + somaa(v));

    }
    public static int[] quest1 (int []v){

        for(int i = 0; i < v.length; i++){
            if (i == 4)
                v[i]= 100;
        }
        return v;
    }

    public static int somaa (int [] v){
        int s=0;
        for (int i = 0; i < v.length; i++){
            if (i == 0 || i == 1 || i == 5)
                s = v[i] + s;
        }
        return s;
    }
}