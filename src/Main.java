import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        for(int i=2;i<=1000;i++)
        {
            if(isPrime(i))
                System.out.println(i);
        }
    }

    public static boolean isPrime(int x){

        for(int i=2;i*i<=x;i++)
        {
            if(x%i==0)
                return false;
        }
        return true;

    }


}
