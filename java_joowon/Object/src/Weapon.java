
public class Weapon {
	
// �ɹ����� (���������ڸ� ĸ��ȭ)
	private String bow;
	private String sword;
	private String spear;
	private String tow_handed_sword;
	
//	������
	public Weapon() {}
	
//	�����ε�
	public Weapon(String bow, String sword, String spear, String tow_handed_sword) {
		this.bow = bow;
		this.sword = sword;
		this.spear = spear;
		this.tow_handed_sword = tow_handed_sword;
	}
	
//	getter (ĸ��ȭ�� �ɹ������� ����)
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
	w1.setBow("���");
	w1.setSpear("�ձ�罺");
	w1.setSword("�ٸ���Ŀ��");
	w1.setTow_handed_sword("���");
		System.out.println(w1.bow); 
		System.out.println(w1.sword);
		System.out.println(w1.spear);
		System.out.println(w1.tow_handed_sword);
	}

}
