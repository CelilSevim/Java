package gun18;

import gun2.Main;

public class Array2D_2 {
    public static void main(String[] args) {
        int [][] nums = {{25,34},{22,11},{4,6}};
        int [][] nums2 = {{2},{23,45},{34,22,56}};
        for (int satir = 0; satir <nums2.length ; satir++) {
            for (int sütun = 0; sütun < nums2[satir].length ; sütun++) {
                System.out.print(nums2[satir][sütun]+" ");
            }
            System.out.println();

        }
    }
}
