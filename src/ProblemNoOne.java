import java.util.Arrays;
import java.util.Scanner;

public class ProblemNoOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[5];

        for (int i=0;i<array.length;i++){
            System.out.println("Enter Array Elements :: " + array[i] +" ");
            array[i]=sc.nextInt();

        }

        int n=array.length;
        System.out.println("Length of array is ::"+ array.length);
        System.out.println(array[n-2]);

        System.out.println("*********Array Elements after sorting*********");
        Arrays.sort(array);
        System.out.println("Sorted array[] : " + Arrays.toString(array));


    }


}
       //System.out.println(Arrays.asList().get(n-2));

        //System.out.println("Enter the element which you wanted to search ::");
       //Integer number=sc.nextInt();

       // System.out.println(Arrays.asList().indexOf(n-2));










