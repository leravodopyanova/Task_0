package model;

public class Procent {
    private double sum;
    private int pr;

    public Procent(double sum, int pr){
        this.sum = sum;
        this.pr = pr;
    }

    public double getSum(){
        return sum;
    }

    public int getPr(){
        return pr;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void setPr(int pr) {
        this.pr = pr;
    }

    private double countPr(double sum, int pr){
        return sum * (pr / 100.0);
    }
    private double countSum(double sum, int pr){
        return sum  + countPr(sum, pr);
    }
    public int countSumTrunc(double sum, int pr){
        double db = countSum(sum, pr);
        float f1 = (float) db;
        return Math.round(f1);
    }
}
