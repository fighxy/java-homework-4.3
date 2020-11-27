public class CreditPaymentService {
    public int calculate(int amount, int creditTerm) {
        double interestRate = 9.99;
        double monthlyRate = interestRate / 12 /100;
        double coefficient = (monthlyRate * Math.pow(1 + monthlyRate, creditTerm))
                / ((Math.pow(1 + monthlyRate, creditTerm)-1));
        return (int) (amount * coefficient);
    }
}
