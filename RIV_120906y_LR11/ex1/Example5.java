package lr11.RIV_120906y_LR11.ex1;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(fact(8));
    }

    public static int fact(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        else return fact(n-2) + fact(n-1);
    }
}
