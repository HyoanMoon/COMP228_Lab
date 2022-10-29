package exercise1;


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {   Insurance insurance = new Health();
        Insurance insurance1 = new Life();
        Scanner scanner = new Scanner(System.in);
        int selection;

        System.out.println( "What is your insurance type?\n 1. Health \n 2. Life ");
        String typeInput = scanner.nextLine();
        selection = Integer.parseInt(typeInput);

        if(selection== 1 )
        {
            insurance = new Health();

        } else
        {
            insurance1 = new Life();


        }

        System.out.println("What is your monthly fee?");
        double costInput = scanner.nextDouble();

        if(selection== 1 )
        {
            insurance.setCost(costInput);
            insurance.display();
        }

        else
        {
            insurance1.setCost(costInput);
            insurance1.display();

        }










    }
}