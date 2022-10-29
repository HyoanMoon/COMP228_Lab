package exercise1;


public class Health extends Insurance
{
    public Health()
    {
        super("Health");

    }


    @Override
    public void setCost(double cost)
    {

        monthlyCost = (cost * 0.15) + cost;

    }

    @Override
    public void display() {

        System.out.println("Insurance type: " + getInsuranceType() + "\nMonthly Cost: $" + monthlyCost );

    }
}
