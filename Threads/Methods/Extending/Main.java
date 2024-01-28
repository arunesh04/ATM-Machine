package Threads.Methods.Extending;

public class Main {
    public static void main(String args[]){
        Student student = new Student();
        student.start();
        for(int i=0;i<10;i++){
            System.out.println("In main() :"+i);
        }
        
    }
}
