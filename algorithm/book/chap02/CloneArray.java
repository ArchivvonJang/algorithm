package chap02;
// �迭�� ����(Ŭ��)
// --> �迭�̸�.clone() 
public class CloneArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = a.clone();  //b�� a�� ������ ����
		
		b[3] = 0; // �� ��ҿ��� 0 ����
		
		System.out.print("a = ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}//a�� �迭 ������
		
		System.out.print("\nb = ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(" "+b[i]);
		}//b�� �迭 ������
	}
}