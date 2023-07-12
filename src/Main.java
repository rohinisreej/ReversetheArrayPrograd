import java.util.Scanner;
class Reverse{
    public void reversearray(int[] array)
    {
        int size=array.length;
        int i=0,temp=0;
        int j=size-1;

        while(i<j)
        {
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
        for(int k:array)
        {
            System.out.println(k+" ");
        }

    }

}
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size=scanner.nextInt();
        System.out.println("Enter the array values: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        Reverse rev=new Reverse();
        rev.reversearray(arr);


    }
}