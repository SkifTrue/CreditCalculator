public class CreditPaymentService {
    public int calculate(int loanAmount, double interestRate, int loanTerm){
        double monthlyRate = (interestRate / 12) / 100;
        double monthlyPayment = loanAmount * monthlyRate * (Math.pow(1 + monthlyRate, loanTerm)) / (Math.pow(1 + monthlyRate, loanTerm) - 1);
        return (int) monthlyPayment;
    }
}
