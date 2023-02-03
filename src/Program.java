import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Locale.setDefault(Locale.US);
Scanner input = new Scanner(System.in);

System.out.println("How many numbers will be typed? ");

int n = input.nextInt();

int[] vet = new int[n];

for (int i = 0; i < n; i++) {
	System.out.println("type a number: ");
	vet[i] = input.nextInt();
	
}

System.out.println("Negative numbers: ");
for (int i = 0; i < n; i++) {
	if (vet[i] < 0) {
		System.out.println(vet[i]);
	}
  }
 }
}



	
