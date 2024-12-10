public class Array1D {
    int[] numbers = new int [10];
    public static void main(String[] args) {
        System.out.println("Hello World");
        Array1D a1d = new Array1D();
    }
    public Array1D(){
        numbers[0] = 54;
        for(int i =0; i< numbers.length; i++){
            int tim= (int)(Math.random() * 101);
            numbers[i]=tim;
        }
        printArray();
        System.out.println("Sum of Array: "+ sumArray());
        System.out.println("Average of Array: "+ aveArray());
    }
    public void printArray(){
        for(int w=0;w< numbers.length; w++){
            System.out.println(numbers[w]);
        }

    }
    public int sumArray(){
        int sum =0;
        for(int g=0; g< numbers.length; g++) {

        sum+= numbers[g];

        }
        return sum;

    }
    public double aveArray(){
        int sum = 0;
        for(int i =0; i< numbers.length; i++){
            sum += numbers[i];
        }
        return (double) sum / numbers.length;

    }

}
