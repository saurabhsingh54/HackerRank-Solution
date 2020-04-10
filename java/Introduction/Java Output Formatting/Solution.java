import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15.15s",s1);
                String s = String.format("%03d",x);
                System.out.println(s);
            }
            System.out.println("================================");

    }
}


