package Threads.Methods.Implementing;

public class Main {
    public static void main(String args[]){
        Student student = new Student();
        Thread t = new Thread(student);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("In main() :"+i);
        }
        
    }
}
