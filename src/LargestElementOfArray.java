import java.util.Scanner;

public class LargestElementOfArray {
    public static void main(String[] args) {
        System.out.println("enter number of elements you want to enter in array-->");
        Scanner scanner=new Scanner(System.in);
        int count = scanner.nextInt();
        int array[],large;//=new int(count);
        array=new int[count];
        System.out.println("Enter "+count+" integer numbers in array-->");
        for(int i=0;i<count;i++)
            array[i]=scanner.nextInt();
        System.out.println("Entered array elements are-->");
        large=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>large)
                large=array[i];
            System.out.println(array[i]);
            }
        System.out.println("The largest number of an array is --> "+large);
    }
}
