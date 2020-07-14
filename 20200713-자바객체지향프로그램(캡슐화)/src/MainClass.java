/*
 * 	<ĸ��ȭ>
 * 	private���� + getter,setter
 * 
 *   ȸ������ , �Խ���, ��ȭ����
 *   
 *   ��ɺ��и� => ��豸��
 *   	ȸ������ 
 *   	 = id
 *    	 = password
 *   	 = �̸�,����,��ȭ,�ּ�
 *  	 �Խ��� 
 *  	  = ����,����,��й�ȣ,��ȣ
 *  	 ��ȭ����
 *   	 = ��ȣ,��ȭ��, �⿬,����,���,�帣
 *    
 *   
 */
class Member {
	// �ν��Ͻ� ���� ==> ���� ==> new 
	private String name; // ���� �Ұ��� => ����ȭ
	public int age; // ���� ����
	protected String addr; // ���� ����
	String tel; // ���� ����
	
	// private => �ʿ��ϸ� ������ ��� �����ϰ� ����� ( getter, setter)
	public void setName(String n) { //�޸𸮿� ���� => �ڵ����� : lombok ���
		name=n;
	}
	
	public String getName() { //�޸𸮿��� ������ �б�
		return name;
	}
		// lombok : buildpath���� => @Getter,  @Setter
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Member�� ����Ǿ� �ִ� ������ ����
		// Member ����
		Member m=new Member();
		// ������ ����
		//m.name="ȫ�浿"; // Ŭ������ �ٸ��Ƿ� ����x => Member class �ȿ����� ���
		m.setName("ȫ�浿");
		m.age=30;
		m.addr="����";
		m.tel="010-1111-1111";

		// ���
		System.out.println("�̸�:"+m.getName());
		System.out.println("����:"+m.age);
		System.out.println("�ּ�:"+m.addr);
		System.out.println("��ȭ:"+m.tel);
	}

}
