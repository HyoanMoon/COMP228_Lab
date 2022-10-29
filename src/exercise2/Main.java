package exercise2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        GameTester  gametester = new FullTime("name") ;
        GameTester gameTester2 = new PartTime("name");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String userName = scanner.nextLine();

        System.out.println("What is your status?\nIf you are full timer enter F \nIf you are part timer enter P ");
        String userType= scanner.nextLine();

        if (userType.equals("F"))
        {
            gametester= new FullTime("name");
        }
        else
        {
            gameTester2 = new PartTime("name");
        }
        System.out.println("Please enter your hour: ");
        int userHour = Integer.parseInt(scanner.nextLine());

       if(GameTester.getStatus())
       {
           System.out.println( "Your salary:"+  gametester.setSalary(userHour));
       }
       else{
           System.out.println( "Your salary:" + gameTester2.setSalary(userHour));
       }





















    }
}
