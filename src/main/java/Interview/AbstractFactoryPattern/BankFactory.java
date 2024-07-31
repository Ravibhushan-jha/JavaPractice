package Interview.AbstractFactoryPattern;

public class BankFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bank) {

        if (bank == null)
            return null;

        if(bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        } else if(bank.equalsIgnoreCase("SBI")){
            return new SBI();
        }

        return null;
    }

    @Override
    public LoanType getloanType(String loanType) {
        return null;
    }
}
