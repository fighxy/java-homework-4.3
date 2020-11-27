public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int monthlyPayment1 = service.calculate(1_000_000, 12);
        int monthlyPayment2 = service.calculate(1_000_000, 24);
        int monthlyPayment3 = service.calculate(1_000_000, 36);
        System.out.println("Ежемесячный платёж: " + monthlyPayment1 + " руб.");
        System.out.println("Ежемесячный платёж: " + monthlyPayment2 + " руб.");
        System.out.println("Ежемесячный платёж: " + monthlyPayment3 + " руб.");
    }
}
