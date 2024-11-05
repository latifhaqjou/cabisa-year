package cabisapkg;

import java.util.Scanner;

public class Cabisa2 {
    public static void main(String[] args) {
        Scanner taq=new Scanner(System.in);
        int cab=taq.nextInt();
        boolean cab1=(cab%4==0 || cab%400==0 &&cab%100!=0);
        System.out.println(cab1);
    }

}
