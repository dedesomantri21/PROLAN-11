import java.util.Scanner;

public class CalculatorMain {
	public static void main (String[] args) {
	double  operan1, operan2;
	Calculator cal = new Subcalculator ();
	
	Scanner input = new  Scanner (System.in);
	operan1 = input.nextDouble();
	operan2 = input.nextDouble();
	
	System.out.println("Hasil Pertambahan adalah :" + cal.hasilTambah(operan1,operan2));
	System.out.println("Hasil Perkurangan adalah :" + cal.hasilKurang(operan1,operan2));
	System.out.println("Hasil Perkalian adalah :" + cal.hasilKali(operan1,operan2));
	System.out.println("Hasil Perbagian adalah :" + cal.hasilBagi(operan1,operan2));
	
	
}
}