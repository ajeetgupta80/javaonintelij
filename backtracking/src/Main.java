public class Main {
    public static void main(String[] args) {
//  way to reach to target in maze you can go right and down
        System.out.println(count(3,3));
    }
    static int count(int row , int col)
    {
//        after it come on either row 1 or col 1 there only remain one way to go on target
        if(row ==1 || col ==1)
        {
            return 1;
        }
        int left = count(row, col-1);
        int right = count(row -1, col);

        return left +right;
    }
}