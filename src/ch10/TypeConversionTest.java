 package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
/*
		byte bNum = 125;
		int iNum = bNum;
		
		System.out.println(iNum);
		*/ //-> ����
		
		/*
		int iNum = 255;
		byte bNum = (byte) iNum;
		
		System.out.println(bNum);//ū ���� �������� ���� ���� �̻���
		
		double dNum = 3.14;
		int inum = (int) dNum;
		
		System.out.println(inum); // ���������� int ������� �Ҽ����� ������� 3�� ���
		 */
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum; //int���� ��ȯ�� �Ǿ� 1
		int iNum2 = (int)(dNum + fNum); //���ڸ��� ����� int�� ����ȯ �Ǿ� 2
		
		System.out.println(iNum1);
		System.out.println(iNum2);	
		
		
	}

}

/*
# 10. ������ �ʴ� ����� ���ͷ�, ������ �� ��ȯ

## ���(constant) �����ϱ�

- ����� ������ �ʴ� ��

- ���ַ� 3.14, 1�� 12���� ��

- final ���� ����Ͽ� ����

- ����� ����ϸ� ������ �ʴ� ���� �ݺ��Ͽ� ����� �� �ǹ��ִ� ���ڷ� �ν��ϱ� ����<br> 
  Ȥ, ���ϴ��� ������ �κи� �����ϸ� �ǹǷ� �����κ��� ������ �ʿ䰡 ����

```
package ch10;

public class ConstantTest {

	public static void main(String[] args) {

		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 1000;
	}
}
```

## ���ͷ�(literal)

- ���α׷����� ����ϴ� ����, ����, ������ ����

- ���ͷ��� ��� Ǯ(constant pool)�� ���� 

- ���� ���ͷ��� int �� �Ǽ� ���ͷ��� double �� �����<br>
  ������ ������ �Ѿ�� ���� L,l�� float�� ����Ϸ��� ���� F,f �ĺ��ڸ� ����� ��


## �� ��ȯ (type conversion)

- ���� �ٸ� �ڷ��� ���� ������� ������ ���� �ϳ��� �ڷ������� �����ϴ� ��

- ������ �� ��ȯ(explicit type conversion, �ڵ� �� ��ȯ)�� ����� �� ��ȯ(implicit type conversion, ���� �� ��ȯ)�� ����

- ����Ʈ ũ�Ⱑ ���� �ڷ������� ū �ڷ������� �� ��ȯ�� �ڵ����� �̷�� ��

- �� ������ �ڷ������� �� ������ �ڷ��������� �� ��ȯ�� �ڵ����� �̷�� ��

![conversion.png](./img/conversion.PNG)

```
byte bNum = 10;
int iNum = bNum;  

int iNum1 = 20;
float fNum = iNum2;

int iNum = 10;
byte bNum = (byte)iNum;

double dNum = 3.14;
int iNum2 = (int)dNum;

```

## ���� �� �� ��ȯ ����

```
package ch10;

public class TypeConversion {

	public static void main(String[] args) {

		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
	}

}
```

## ���� ����
[11.�ڹ��� �����ڵ� -1 (����, ��ȣ, ���, ���մ���, ����������)](https://gitlab.com/easyspubjava/javacoursework/-/blob/master/Chapter1/01-11/README.md)
*/