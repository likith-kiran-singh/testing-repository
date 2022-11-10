import java.util.Random;
public class RandomNumberThread extends Thread {
    int n;
    RandomNumberThread(int i){
        n=i;
    }
    public void run(){
        Random random=new Random();
        for (int i=0;i<n;i++){
            int randint=random.nextInt(100);
            System.out.println("The Number is : "+randint);
            if((randint%2) == 0) {
                SquareThread sThread = new SquareThread(randint);
                sThread.start();
            }
            else{
                CubeThread cThread=new CubeThread(randint);
                cThread.start();
            }
            try {
                Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                System.out.println(e);
                }
    }
}
}
