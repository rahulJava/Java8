
public class Contact 
{
	private long MobileNo;
	private String name;

	public Contact()
	{
		
	}

	public long getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contact(long mobileNo, String name) {
		//super();
		MobileNo = mobileNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Contact [MobileNo=" + MobileNo + ", name=" + name + "]";
	}
	
}
