import java.util.Scanner;
public class WeightConverter {
	public static void main(String [ ] args) {
		Scanner scanner = new Scanner (System.in);
		int weight;
		double kilo, lbs;	
		System.out.println("\t\t****************");
		System.out.println("\t\tWeight Converter");
		System.out.println("\t\t****************");
		System.out.println("\t\tEnter the weight: ");
		weight = scanner.nextInt();
		kilo = weight * 0.453592;
		lbs = kilo * 2.20462;
		scanner.nextLine();
		//System.out.println("\t\tChoose weight type (Kg or Lbs)");
		System.out.println("\t\tChoose weight type: Press 1 for Kg, Press 2 for lbs");
		int type = scanner.nextInt();
		
		switch(type) {
		case 1 :
			kilo = weight * 0.453592;
			System.out.println("\t\tWeight in Kg :");
			System.out.printf("\t\t%.2f", kilo);
			System.out.println();
			System.out.println();
			break;
		case 2 :
			lbs = weight * 2.20462;
			System.out.println("\t\tWeight in Lbs :");
			System.out.printf("\t\t%.2f", lbs);
			System.out.println();
			System.out.println();
			break;
		default:
			System.out.println("\t\tPlease press 1 for Kg, press 2 for lbs");
		}
		
		System.out.println("\t\tThank you for using our weight converter!");
	
		
	}
		
}
