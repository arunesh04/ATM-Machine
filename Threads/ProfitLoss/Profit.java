package Threads.ProfitLoss;

public class Profit extends Thread {
    private int totalSales;
    private int totalInvestment;
    private int result;

    public Profit(int totalSales, int totalInvestment) {
        this.totalSales = totalSales;
        this.totalInvestment = totalInvestment;
    }

    @Override
    public void run() {
        result = totalSales - totalInvestment;
        String outcome = result >= 0 ? "Profit" : "Loss";
        System.out.println(outcome + ": " + Math.abs(result));
    }

    public int getResult() {
        return result;
    }
}
