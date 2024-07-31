package Interview.AbstractFactoryPattern;

public class HomeLoan extends LoanType{
    @Override
    void getInterestRate(double ra) {
        rate = ra;
    }
}
