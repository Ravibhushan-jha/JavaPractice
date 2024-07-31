package Interview.AbstractFactoryPattern;

public class SBI implements Bank{

    private final String BName;

    public SBI() {
        BName = "SBI";
    }

    @Override
    public String getBankName() {
        return BName;
    }
}
