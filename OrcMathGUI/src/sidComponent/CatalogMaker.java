package sidComponent;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogMaker {

	private ArrayList<Shoe> shoelist = new ArrayList<Shoe>();
	private Scanner in = new Scanner(System.in);
	private String tempBrand = "";
	private String tempName = "";
	private String tempColor = "";
	private double tempSz;
	private boolean tempDs;
	
	public static void main(String[] args) {
		CatalogMaker maker = new CatalogMaker();
		System.out.println(maker.getCSVContent());

	}
	
	public CatalogMaker() {
		tempBrand = in.nextLine();
		tempName = in.nextLine();
		tempColor = in.nextLine();
		tempSz = in.nextDouble();
		tempDs = in.nextBoolean();
		shoelist.add(new Shoe(tempBrand, tempName, tempColor, tempSz, tempDs));
	}

	public String getCSVContent() {
		String data = "";
		for (Shoe s:shoelist) {
			data += s+"\n";
		}
		return data;
	}
}
