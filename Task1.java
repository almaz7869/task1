import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random scan = new Random();int cnt=0;
        for ( ; ; ) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Guess any number between 1 to 100 ");
                int no = sc.nextInt();
                int ng = scan.nextInt(100) + 1;
                System.out.println("Number you gussed " + no);
                System.out.println("Number gussed by computer " + ng);
                if (no == ng) {
                    System.out.println("You gussed corret");
                    cnt++;
                } else if (no > ng && no<=ng+5 || no < ng && no>=ng-5) {
                    System.out.println("you almost got it");
                } else if (no > ng+5 && no<=ng+10|| no < ng -5 && no >=ng-10) {
                    System.out.println("you are close");
                } else if (no > ng + 10) {
                    System.out.println("Gussed too high");
                } else {
                    System.out.println("Gussed too low");
                }
            }
            System.out.println("your score out of 5 is " + cnt);
            System.out.println("Enter your choice");
            System.out.println("1.Play again " + "\t" + "2.exist");
            int ch = sc.nextInt();
            if (ch == 2) {
                break;
            }
        }
    }
}