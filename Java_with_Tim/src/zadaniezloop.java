public class zadaniezloop {

    public static void main(String[] args) {

for(int i=0;i<7;i++){
    double rate = i+2;
    System.out.println(" 10,000 at "+ rate + "% intrest =" + String.format("%.2f",calculatorIntrest(10000,rate)));
}

    }

    public static double calculatorIntrest(double amount, double intrestRate){
        return(amount *(intrestRate/100));
    }
}
