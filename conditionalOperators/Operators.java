package conditionalOperators;

public class Operators {
    static  int oddNumber(int array[]){
        int oddSum=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0 && array[i]>5){
                oddSum+=array[i];
            }
        }
        return oddSum;
    }
    static int whileLoop(int ten){
        int sum=0;
        while (ten>0){
            sum+=ten;
            ten--;
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={5,7,5,4,33,2};
        int sum=oddNumber(arr);
        System.out.println(sum);
        int ten=whileLoop(10);
        System.out.println(ten);
    }
}
