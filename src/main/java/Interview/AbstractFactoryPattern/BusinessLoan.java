package Interview.AbstractFactoryPattern;

public class BusinessLoan extends LoanType{
    @Override
    void getInterestRate(double ra) {
        rate = ra;
    }
}
