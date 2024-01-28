package Threads.Execution;

public class Chrome extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("In chrome run : " +i);
        }
        // try{
        //     Thread.sleep(2000);
        // }
        // catch(InterruptedException e){
        //     e.printStackTrace();
        // }
    }
}
