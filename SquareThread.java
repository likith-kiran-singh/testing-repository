public class SquareThread extends Thread{
    int n;
    SquareThread(int num){
        n=num;
    }
    public void run(){
        System.out.println("Square of ("+n+")^2 is " +(n*n));
    }        
}
