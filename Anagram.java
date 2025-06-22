import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static  boolean isAnagarm(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String s=sc.nextLine();

        System.out.println("Enter second string: ");
        String t=sc.nextLine();

        System.out.println("Output: " + isAnagarm(s, t));
    }
}
