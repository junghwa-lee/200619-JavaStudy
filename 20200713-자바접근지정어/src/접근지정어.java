import lombok.Getter;
import lombok.Setter;

// ���� => �б�, ����(�޸𸮿� ����)
/*
 *       ========= �޼ҵ� ==========
 *       �б� : getter() => ����� ������ �� �ϱ�
 *       ���� : setter() => �������� ����
 *       
 *       private String name;
 *       ĸ��ȭ ��� => �����͸� ��ȣ�ϴ� ����
 *       => setter
 *          public void setName(String name)
 *          {
 *          	this.name=name;
 *          }
 *       => getter
 *       	public void getName()
 *          {
 *          	return name;
 *          }
 *       
 */
/*
 *  lombok �̿�
 *  
 */
@Getter
@Setter
class Student{
	private int hakbun;
	private String name;
	private String sex;
	
	/*
	��Ŭ���� => �޴�-source-getter/setter
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	*/
}
public class ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
