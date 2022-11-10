import java.util.Scanner;
public class MultiTread13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Numbers Do You Want to print : ");
        int i=sc.nextInt();
        RandomNumberThread rmThread=new RandomNumberThread(i);
        rmThread.start();
        sc.close(); 
    }
}
/*Write a java program that implements a multi-threaded application that has three 
threads. First thread generates a random integer every 1 second and if the value
 is even, second thread computes the square of the number and prints. If the
value is odd, the third thread will print the value of cube of the number. */