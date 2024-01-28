package Threads.Execution;

public class Notepad extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("In notepad run : " + i);
        }
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}