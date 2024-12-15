public class Arrays2D {
    int[][] nums = new int[5][4];

    public static void main(String[] args) {
        Arrays2D a2D = new Arrays2D();
    }

    public Arrays2D() {
        for (int r = 0; r < nums.length; r++) {
            for (int c = 0; c < nums[r].length; c++) {
                nums[r][c] = (int) (Math.random() * 101);
            }


        }
        printArray();
        System.out.println(Sum2D());
        System.out.println(ave2D());
    }

    public void printArray() {
        for (int r = 0; r < nums.length; r++) {
            for (int c = 0; c < nums[r].length; c++) {
                System.out.print(nums[r][c] + " ");
            }
            System.out.println();
        }
    }

    public int Sum2D() {
        int sum = 0;
        for (int y = 0; y < nums.length; y++) {
            for (int x = 0; x < nums[y].length; x++) {
                sum += nums[y][x];
            }
        }
        return sum;
    }
    public double ave2D() {
        int sum = 0;
        for (int y = 0; y < nums.length; y++) {
            for (int x = 0; x < nums[y].length; x++) {
                sum += nums[y][x];
            }
        }
        return (double) sum / nums.length;
    }
}