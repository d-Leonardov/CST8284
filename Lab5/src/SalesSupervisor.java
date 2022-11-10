
public class SalesSupervisor extends SalesAgent {
	
	String location;

	public SalesSupervisor(String n, int a, String l) {
		super(n, a);
		this.location = l;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sales supervisor [super=" + super.toString() + ",location=" + location +"]";
	}
}
