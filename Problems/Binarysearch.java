package Problems;

import java.util.Arrays;

public class Binarysearch {
    public static void main(String[] args) {
        int array[]={45,334,4,334,24,4,6,2,87,5};
        Arrays.sort(array);
        int f=0,l=array.length-1;
        int t=87;
int m=(f+l)/2;
        for (int i = 0; i < array.length; i++) {
if(array[m]>t){
    l=m-1;
}
else if(array[m]<t){
    f=m+1;
}
else{
    System.out.println(args[m]);
    System.out.println(m);
    break;
}
m=(l+f)/2;
        }
       int z= Arrays.binarySearch(array,87);
        System.out.println(z);
    }
}
