package sidComponent;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import guiPlayer.Book;

public class ShoeMaker {

	private ArrayList<Shoe> shoelist = new ArrayList<Shoe>();
	private Scanner in = new Scanner(System.in);
	private String tempBrand = "";
	private String tempName = "";
	private String tempColor = "";
	private int tempSz;
	private boolean tempDs;
	
	public static void main(String[] args) {
		ShoeMaker maker = new ShoeMaker();
		System.out.println(maker.getCSVContent());

	}
	
	public ShoeMaker() {
		//tempBrand = in.nextLine();
	//	tempName = in.nextLine();
	//	tempColor = in.nextLine();
	//	tempSz = in.nextInt();
	//	tempDs = in.nextBoolean();
		//shoelist.add(new Shoe(tempBrand, tempName, tempColor, tempSz, tempDs));
	}

	public String getCSVContent() {
		String data = "";
		for (Shoe s:shoelist) {
			data += s+"\n";
		}
		return data;
	}
	
	private void save() {
		try{    
			FileWriter fw=new FileWriter("ShoeCatalog.csv");
			for(Shoe b: shoelist){
				fw.write(b+"\n");    	
			}

			fw.close();    
			System.out.println("Success! File \"ShoeCatalog.csv\" saved!");
		}catch(IOException e){
			System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");
		}
	}

	public void addShoe(Shoe s) {
		shoelist.add(s);		
	}
}
