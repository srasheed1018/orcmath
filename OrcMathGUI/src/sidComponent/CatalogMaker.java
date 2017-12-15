package sidComponent;

import java.util.ArrayList;

public class CatalogMaker {

	private ArrayList<Shoe> shoelist;
	
	
	public static void main(String[] args) {
		CatalogMaker maker = new CatalogMaker();
		System.out.println(maker.getCSVContent());

	}
	
	public CatalogMaker() {
		shoelist.add(new Shoe("Air Jordan", "1","Lance Mountain",11,false));
		shoelist.add(new Shoe("Adidas", "Ultraboost 1.0","3M Reflective",10,true));
	}

	public String getCSVContent() {
		String data = "";
		for (Shoe s:shoelist) {
			data += s+"\n";
		}
		return data;
	}
}
