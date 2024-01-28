package Threads.Execution;

public class Windows {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.start();
        Chrome chrome = new Chrome();
        chrome.start();
        try{
           notepad.join();
           chrome.join();                                                                                                                                                                             
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
        for(int i=0;i<10;i++){
            System.out.println("In Windows main process : " +i);
        }

    }
}
