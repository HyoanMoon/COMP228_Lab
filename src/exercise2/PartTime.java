package exercise2;

public class PartTime extends GameTester
{

    public PartTime(String name) {
        super(name, false);
    }

    public int setSalary(int hour)
    {
        return (hour*20);
    }
}
