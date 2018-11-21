public class Foothill
{
 public static void main(String[] args)
 {
 int[] numbers = new int[100];
 
 for(int i = 0; i < numbers.length; i++)
 {
 numbers[i] = i + 1;
 }
 
 reverse(numbers);
 
 for (int k = 0; k < numbers.length; k++)
 System.out.println(numbers[k]);
 }
 
 public static void reverse(int[] arr)
 {
 for (int i = 0; i < (arr.length / 2); i++)
 {
 int temp = arr[i];
 arr[i] = arr[arr.length - i - 1];
 arr[arr.length - i - 1] = temp;
 }
 }
}