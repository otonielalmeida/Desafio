package desafio;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = 0;
        System.out.print("Numero de elementos desejado: ");
        n = read.nextInt();
        int a[] = new int[n];
        System.out.println("Digite cada elemento:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = read.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
}
