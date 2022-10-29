package exercise1;

import javax.swing.*;

public class Life extends Insurance
{

    public Life()
    {
        super("Life");

    }

    @Override
    public void setCost(double cost)
    {
        monthlyCost = (cost *0.3)+ cost;
    }


    @Override
    public void display()
    {
        System.out.println("Insurance type: " + getInsuranceType() + "\nMonthly Cost: $" + monthlyCost);

    }
}
