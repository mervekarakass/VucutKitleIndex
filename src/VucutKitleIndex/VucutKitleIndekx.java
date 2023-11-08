package VucutKitleIndex;
import java.util.Scanner;
public class VucutKitleIndekx {

	public static void main(String[] args) {
		double kilo, boy, kitleindex;

		
		Scanner input = new Scanner(System.in);
		System.out.print("Lutfen kilonuzu yaziniz: ");
		kilo = input.nextDouble();
		
		System.out.print("lutfen boyunuzu giriniz: ");
		boy = input.nextDouble();
		
		kitleindex = kilo / (boy * boy);
		
		System.out.println("vucut kitle indexiniz: " +kitleindex);
		

	}

}
