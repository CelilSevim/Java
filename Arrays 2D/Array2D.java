package gun18;

public class Array2D {
    public static void main(String[] args) {

        int [][] nums = new int[3][2];   // 1.  [] satir uzunluğunu verir
        nums[0][0]=25;                   // 2.  [] sütun uzunluğunu verir
        nums[0][1]=34;
        nums[1][0]=22;
        nums[1][1]=11;
        nums[2][0]=4;
        nums[2][1]=6;
        // nums.lenght  => satır uzunluğunu verir
        // nums[i].lenght => sütun uzunluğunu verir
        for (int satir = 0; satir < nums.length; satir++) {
            for (int sütun = 0; sütun <nums[satir].length ; sütun++) {
                System.out.print(nums[satir][sütun]+" ");

            }
            System.out.println();


        }
    }
}
