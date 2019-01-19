
public class App {

	public static void main(String[] args) {

		System.out.println("The Facade goal is to create an unique interface "
				+ "for the other systems to access all the available resources...");
	
		CompanyFacade facade = new CompanyFacadeSingleton().getInstance();

	}

}
