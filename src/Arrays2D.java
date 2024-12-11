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
    }

    public void printArray() {
        for (int r = 0; r < nums.length; r++) {
            for (int c = 0; c < nums[r].length; c++) {
                System.out.print(nums[r][c]+ " ");
            }
            System.out.println();
        }
    }
}
