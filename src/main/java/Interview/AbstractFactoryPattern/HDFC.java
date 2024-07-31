package Interview.AbstractFactoryPattern;

public class HDFC implements Bank{

    private final String BName;

    public HDFC() {
        BName = "HDFC";
    }

    @Override
    public String getBankName() {
        return BName;
    }
}
