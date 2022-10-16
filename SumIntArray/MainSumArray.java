public class MainSumArray {
    public static void main(String[] args){
        int[] test1 = {1,6,34,129,36}; //true 6+36
        int[] test2 = {4,9,13,55,24,32}; // false
        int[] test3 = {21,21,4,70,42,100}; //true 21+21
        int[] test4 = {2,21,42}; //false
        int[] test5 = {1,2,3,4,5,42,100,50,79}; //false
        int[] test6 = {29,100,34,69,13,17,22,70}; // true 13+29
        System.out.println(SumIntArray.testSum(test1)+"\n");
        System.out.println(SumIntArray.testSum(test2)+"\n");
        System.out.println(SumIntArray.testSum(test3)+"\n");
        System.out.println(SumIntArray.testSum(test4)+"\n");
        System.out.println(SumIntArray.testSum(test5)+"\n");
        System.out.println(SumIntArray.testSum(test6)+"\n");
    }
}
