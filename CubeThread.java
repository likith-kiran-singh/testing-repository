public class CubeThread extends Thread{
    int n;
    CubeThread(int num){
        n=num;
    }
    public void run(){
        System.out.println("Cube of ("+n+")^3 is " +(n*n*n));
    } 
}
