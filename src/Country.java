public class Country {


        private String continent;
        private int pop;
        private double gdp;
        private String name;

        public Country() {
            continent = "Australia";
            pop =200000;
            gdp = 20.3;
            name = "Japan";


        }
        public void printInfo(){
            System.out.println("continent " +continent );
            System.out.println(pop);
            System.out.println(gdp);
            System.out.println(name);

    }
}
