package utilities;

import pages.googleHomePage;
import pages.googleResultPage;

public class PageInitializer extends BaseClass {
	
	
	public static googleHomePage ghp;
	public static googleResultPage grp;
	
	public static void initialize() {
		ghp = new googleHomePage();
		grp = new googleResultPage();
		
	}

}
