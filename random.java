import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
 class random {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        //int rand = random.nextInt();
        int rand = 0;
        while(true) {
            rand = random.nextInt(3);
            if(rand != 0) {
                break;
            }
        }
        System.out.println(rand);      
    }
}