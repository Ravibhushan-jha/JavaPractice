package Interview.AbstractFactoryPattern;

abstract class AbstractFactory {

    public abstract Bank getBank(String bank);
    public abstract LoanType getloanType(String loanType);

}
