package Threads.Methods.Extending;
public class Student extends Thread {
    @Override
    public void run(){
            for(int i=0;i<10;i++){
                System.out.println("In student()"+i);
            }
        }
}

