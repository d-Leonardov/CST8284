
public class SalesChief extends SalesSupervisor{
	
	public String department;
	
	public SalesChief(String n, int a, String l, String d) {
		super(n, a, l);
		this.department = d;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sales Chief [super=" + super.toString() + ",department=" + department +"]";
	}
	


	

}
