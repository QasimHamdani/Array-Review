public class Array1DObjects {
    Country[] countries = new Country[10];
    public static void main(String[] args) {
Array1DObjects obj = new Array1DObjects();

    }
    public Array1DObjects(){
       Country us = new Country();
        us.printInfo();

        for (double i =0; i< countries.length; i++ ){
            countries[(int) i]= new Country();
            countries[(int) i].setPop((int)(Math.random()*1001));

        }
        printArray();
        System.out.println(addPops());
        System.out.println("The average Population: "+ avePop());
    }

    public void printArray(){
        for(int w=0;w< countries.length; w++){
            System.out.println(countries[w].getPop());
        }
    }
    public int addPops(){
        int sum =0;
        for(int g=0; g< countries.length; g++) {

            sum += countries[g].getPop();

        }
        return sum;


    }
    public double avePop(){
        int sum = 0;
        for(int i =0; i< countries.length; i++){
            sum += countries[i].getPop();
        }
        return (double) sum / countries.length;

    }
}
