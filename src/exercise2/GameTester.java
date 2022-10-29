package exercise2;

public abstract class  GameTester
{

        protected String name;
        protected  static boolean fullTime;

        public GameTester (String name, boolean fullTime)
        {
                this.name = name;
                this.fullTime =fullTime;

        }

        public String getName() {return name;}
        public static boolean getStatus(){ return fullTime;}

        public abstract int setSalary(int hour);

}
