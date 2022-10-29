package exercise2;

public class FullTime extends GameTester{


    public FullTime(String name )
    {
        super(name, true);
    }


    @Override
    public int setSalary(int hour)
    {
        return 3000;
    }




}
