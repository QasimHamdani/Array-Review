public class Array2DObjects {
 Country[][] countries = new Country[4][5];

    public static void main(String[] args) {
        Array2DObjects obj2D = new Array2DObjects();
    }

    public Array2DObjects() {
        for (int r = 0; r < countries.length; r++) {
            for (int c = 0; c < countries[r].length; c++) {
                countries[r][c]= new Country();
                countries[r][c].setPop( (int) (Math.random() * 1001));
            }

        }
        printArray();
        System.out.println(sum2d());
    }
    public void printArray(){
        for(int r = 0; r < countries.length; r++) {
            for (int c = 0; c < countries[r].length; c++) {
                System.out.println(countries[r][c].getPop()+ " ");

            }
            System.out.println();
         }
    }
    public int sum2d(){
        int sum = 0;
        for (int y = 0; y < countries.length; y++) {
            for (int x = 0; x < countries[y].length; x++) {
                sum += countries[y][x].getPop();
            }
        }
        return sum;
    }
}


