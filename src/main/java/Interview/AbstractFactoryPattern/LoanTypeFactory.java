package Interview.AbstractFactoryPattern;

public class LoanTypeFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public LoanType getloanType(String loanType) {

        if (loanType == null)
            return null;

        if (loanType.equalsIgnoreCase("Home")) {
            return new HomeLoan();
        } else if (loanType.equalsIgnoreCase("Business")) {

            return new BusinessLoan();
        }
        return null;

    }
}
