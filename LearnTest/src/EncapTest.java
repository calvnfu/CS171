
public class EncapTest {
	
	private String name;
	private String idNum;
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getIDNum() {
		return idNum;
	}
	
	public void setName(String newname) {
		this.name = newname;
	}
	
	public void setIdNum(String newidNum) {
		this.idNum = newidNum;
	}
	
	public void setAge(int newage) {
		this.age = newage;
	}

	public static void main(String[] args) {
		EncapTest encap = new EncapTest();
			
		encap.setAge(10);
		encap.setName("hello");
		encap.setIdNum("hi");
		
		System.out.println(encap.getAge()+encap.getName()+encap.getIDNum());

	}

}
