package Threads.TokenGeneration;

public class Generator extends Thread{
    private static int token =0;
    public void run(){
        generate();
    }
    public void generate(){
        synchronized(this){
            token++;
        }
        System.out.println(token + "is generated");
    }
}
