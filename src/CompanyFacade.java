
public class CompanyFacade {

	protected CompanyFacade() {}
	
	public Customer findClient(String id) {
		return CustomerDao.find(id);
	}
	
	public Invoice createInvoice(Customer customer, double value) {
		Invoice in = new Invoice(customer, value);
		return in;
	}
	
	// ...
	// ...OTHER METHODS AVAILABLE OF MY SYSTEM
	
}
