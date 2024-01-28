package Threads.Methods.Implementing;
public class Student implements Runnable{
    public void run(){
            for(int i=0;i<10;i++){
                System.out.println("In student()"+i);
            }
        }
}

