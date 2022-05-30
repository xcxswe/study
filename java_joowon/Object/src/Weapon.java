
public class Weapon {
	
// 맴버변수 (전급제어자를 캡슐화)
	private String bow;
	private String sword;
	private String spear;
	private String tow_handed_sword;
	
//	생성자
	public Weapon() {}
	
//	오버로딩
	public Weapon(String bow, String sword, String spear, String tow_handed_sword) {
		this.bow = bow;
		this.sword = sword;
		this.spear = spear;
		this.tow_handed_sword = tow_handed_sword;
	}
	
//	getter (캡슐화된 맴버변수에 접근)
	public String getBow() {
		return this.bow;
	}
	
	public String getSword() {
		return this.sword;
	}
	
	public String getSpear() {
		return this.spear;
	}
	
	public String getTow_handed_sword() {
		return this.tow_handed_sword;
	}
	
//	setter 
	public void setBow(String bow) {
		this.bow = bow;	
	}
	
	public void setSword(String sword) {
		this.sword = sword;
	}
	
	public void setSpear(String spear) {
		this.spear = spear;
	}
	
	public void setTow_handed_sword(String tow_handed_sword) {
		this.tow_handed_sword = tow_handed_sword;
	}
	
	public static void main(String[] args) {
		
	Weapon w1 = new Weapon();
	w1.setBow("장궁");
	w1.setSpear("롱기루스");
	w1.setSword("다마스커스");
	w1.setTow_handed_sword("대검");
		System.out.println(w1.bow); 
		System.out.println(w1.sword);
		System.out.println(w1.spear);
		System.out.println(w1.tow_handed_sword);
	}

}
