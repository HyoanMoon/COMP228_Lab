package exercise1;

public abstract class Insurance
{
    private String insuranceType;
    protected double monthlyCost;

    public Insurance(String type)
    {
        insuranceType = type;
    }

    public String getInsuranceType()
    {
        return insuranceType;
    }


    public abstract void setCost(double cost);
    public abstract void display();




}


