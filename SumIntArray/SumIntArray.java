import java.util.Arrays;

public class SumIntArray {
    
    public static boolean testSum(int[] values){
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
        int l = 0;
        int r = values.length -1;
        while(l< r){
            int m = l +(r-l)/2;

            if(values[m] > 42){
                r = m-1;
            }

            if(values[l]+values[r] == 42){
                System.out.println("sum values: "+values[l]+ " + " + values[r]);
                return true;
            }

            if(values[l]+values[r] < 42){
                l++;
            }
            else{
                r--;
            }

        }
        return false;
    }
}
