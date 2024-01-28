package Threads.ProfitLoss;

import java.util.List;

public class Sum extends Thread {
    private List<Integer> sales;
    private List<Integer> investments;
    private int totalSales;
    private int totalInvestment;

    public Sum(List<Integer> sales, List<Integer> investments) {
        this.sales = sales;
        this.investments = investments;
    }

    @Override
    public void run() {
        totalSales = sales.stream().mapToInt(Integer::intValue).sum();
        totalInvestment = investments.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total sales: " + totalSales);
    }

    public int getTotalSales() {
        return totalSales;
    }

    public int getTotalInvestment() {
        return totalInvestment;
    }
}
