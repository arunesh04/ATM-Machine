package Threads.ProfitLoss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of products: ");
        int n = scanner.nextInt();

        List<Integer> sales = new ArrayList<>();
        List<Integer> investments = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter sales amount for product " + (i + 1) + ": ");
            sales.add(scanner.nextInt());
            System.out.print("Enter investment amount for product " + (i + 1) + ": ");
            investments.add(scanner.nextInt());
        }

        Sum sumThread = new Sum(sales, investments);
        sumThread.start();
        sumThread.join();  // Wait for Sum thread to complete

        Profit profitThread = new Profit(sumThread.getTotalSales(), sumThread.getTotalInvestment());
        profitThread.start();
        profitThread.join();  // Wait for Profit thread to complete

        System.out.println("Total profit: " + profitThread.getResult());

        scanner.close();
    }
}
