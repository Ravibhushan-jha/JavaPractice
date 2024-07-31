package Interview.FactoryPattern;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

    public static void main(String[] args) throws IOException {

        GetPlanFactory getPlanFactory = new GetPlanFactory();

        System.out.println("Enter the Plan name");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planName = br.readLine();

        System.out.println("Enter the No of unit");
        BufferedReader bre = new BufferedReader(new InputStreamReader(System.in));

        int units = Integer.parseInt(bre.readLine());

        Plan plan = getPlanFactory.plan(planName);
        plan.getRate();
        plan.caculate(units);

    }
}
