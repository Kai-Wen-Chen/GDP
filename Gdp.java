package GDP;

import java.util.Scanner;

public class Gdp {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int population = sc.nextInt(); //2300w
		long GDP = sc.nextLong(); //335e
		double GDPperCapita = (double) GDP / population;
		System.out.printf("%.2f", GDPperCapita);
	}
}
