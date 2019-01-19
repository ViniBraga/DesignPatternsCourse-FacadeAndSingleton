
public class CompanyFacadeSingleton {

	private static CompanyFacade companyFacade;
	
	public CompanyFacade getInstance() {
		if (companyFacade == null) {
			companyFacade = new CompanyFacade();
		}
		return companyFacade;
	}
	
}
