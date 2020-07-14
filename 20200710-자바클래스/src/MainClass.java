/*
 *   Ŭ����
 *     1) ���� => ���� ���� ������ �� �ݵ�� �������� ���� ������
 *                           -------------------------> �߻�ȭ
 *         ������ ����
 *          - �������(�ν��Ͻ�����) => new�� ����� ������ ���� ����Ǵ� ����
 *         		** �޸� ��������� ���� : new �̿��� ��
 *         		** heap : �ν��Ͻ������� �����Ǵ� ����
 *         				    ���α׷��Ӱ� �����ϴ� ���� (�ڵ�ó���� �ȵȴ�)
 *         				    �޸𸮸� ������� ���� ��� (����ó��, GC)
 *          - ��������(static����) => �޸� 1�� => �������� ���Ǵ� ����
 *          	** �����Ϸ��� �������� ��  �ڵ����� ����
 *              ** �޼ҵ念��(static, �޼ҵ�)
 *          ======================================================
 *          - �������� => �������� , �Ű�����
 *              ** �޸� ���� ���� : �޼ҵ� ȣ�� ��
 *              ** �޸𸮰� ��ü���� {} ����� �ڵ� ȸ�� ==> stack(LIFO)
 *         
 *         �������� : �ʱⰪ
 *          - ����� ���ÿ� �� ����
 *          - ������
 *          - �ʱ�ȭ���
 *             �ν��Ͻ� �ʱ�ȭ
 *             static �ʱ�ȭ
 *           
 *           ������
 *           class A
 *           {
 *              int a=10;    ����� �ʱ�ȭ �� 
 *              
 *              {
 *              	a=100;   �ʱ�ȭ�� ��
 *              }
 *              
 *              A(){
 *              	a=1000;   ������ ��
 *              }
 *           }
 *           => �ʱ�ȭ���� �����ڴ� ���� ����ϴ� �󵵰� ���� ����
 *           
 *     2) ������
 *         - ��������� �ʱⰪ �ο�
 *         - ��� �̿�, ���� �б�, �����ϰ� �����Ͱ� ������ �� ��, ����
 *         - ���� ���� => �ڵ����� �����Ϸ��� �߰�  ==> default������ (�Ű������� ���� ������)   
 *         - �޸𸮿� ����(Ŭ����) ==> ȣ��Ǵ� �޼ҵ�
 *           ----------
 *           new ������() ==> �� ���� ȣ�� => this(�ڽ�)
 *           
 *           �غ����� �浹�Ұ�� => this���
 *           class A
 *           {
 *           	int a;
 *           	A(int a)
 *              {
 *              	this.a=a;   => AŬ������ �������ִ� ���� a�� a�� ����
 *              }
 *           }   
 *     3) �޼ҵ�
 *         - �����, ������
 *         - ���� :   ������ �޼ҵ��(�޼ҵ��..)  ==> �����
 *         			{
 *         				==> ������
 *         			} 
 *                  �����+������ = ����
 *                  - �ν��Ͻ��޼ҵ� : Ŭ�������� ���� ����ϴ� �޼ҵ�
 *                  - �����޼ҵ� (static) : ��� Ŭ���� �������� ���Ǵ� �޼ҵ�
 *                  - �߻�޼ҵ� : ����θ� ����(����x) -> ���α׷��Ӱ� ���� �������� (implements) 377page 
 */
class Student{
	// �л� 1�� ���� ���� ==> �޸� ���� ������ ���� �� ���� (new)
	String name;
	String subject;
	int year;
	static String school; //�޸𸮿� ����  
	/*
	Student(){  	==> default������
	}
	*/
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static ���� ���
		Student.school="SIST";
		Student s=new Student(); // name,year,subject => ����(s��� �ּҿ� ����)
		System.out.println(s);
		//Student@15db9742
		
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);
		
		s.name="ȫ�浿";
		s.subject="���߰�";
		s.year=3;
		// �޼ҵ嵵 ������ ���
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);
		System.out.println(Student.school);
		
		
		Student s1=new Student();
		System.out.println(s1);
		//Student@6d06d69c => ������� ����
		
		System.out.println(s1.name);
		System.out.println(s1.subject);
		System.out.println(s1.year);
		
		s1.name="��û��";
		s1.subject="�����";
		s1.year=2;
		System.out.println(s1.name);
		System.out.println(s1.subject);
		System.out.println(s1.year);
		System.out.println(Student.school);
		
		String ss="Hello Java";
		String ss1="1234567890";
		ss.replace('H', 'K'); //�ν��Ͻ��޼ҵ�
		String.valueOf(10); // static �޼ҵ� ==> Ŭ�����̸�.~
		Math.random(); // static�޼ҵ� 
		
	}

}
