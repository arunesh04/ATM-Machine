package Threads.TokenGeneration;

public class Main {
    public static void main(String[] args) {
        Generator generator1 = new Generator();
        Generator generator2 = new Generator();
        Generator generator3 = new Generator();
        generator1.start();
        generator2.start();
        generator3.start();
    }
}
