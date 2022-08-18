package ch04;

public class BinaryTest {

	public static void main(String[] args) {

		int num = 10;
		int bNum = 0B1010;
		int oNum = 012;
		int xNum = 0XA;
				
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}

}

/*
 # 04. ��ǻ�Ϳ��� �ڷ� ǥ���ϱ�

## 2������ ǥ��
    
    0�� 1�θ� �����͸� ������
    bit(1��Ʈ) : ��ǻ�Ͱ� ǥ���ϴ� �������� �ּ� ������ 2���� �ϳ��� ���� ������ �� �ִ� �޸��� ũ��
    byte(����Ʈ) : 1byte = 8bit

## 2������ 10����
  ![binary.png](./img/binary.png)


## 2������ 8���� 16����
  ![binary2.png](./img/binary2.png)


# 8��Ʈ�� 5�� ǥ���� ����...
  
  ![8bit.png](./img/8bit.PNG)


## ��Ʈ�� ��Ÿ�� �� �ִ� ���� ������?
    �� ���� ��Ʈ�� ��Ÿ�� �� �ִ� �� : 0. 1 (2��)
    �� ���� ��Ʈ�� ��Ÿ�� �� �ִ� �� : 00, 01, 10, 11 (4��)
    �� ���� ��Ʈ�� ��Ÿ�� �� �ִ� �� : 000, 001, 010, 011, 100, 101, 110, 111 (8��)

## 2����, 8����, 16������ ���α׷����� ����ϴ� ����
```
package ch04;

public class BinaryTest {

	public static void main(String[] args) {
		int num = 10;
		int bNum = 0B1010;
		int oNum = 012;
		int xNum = 0XA;
		
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}
}
```

## ���� ���� 
[05. ������ ���ϴ� ���Դϴ�](https://gitlab.com/easyspubjava/javacoursework/-/tree/master/Chapter1/01-05/README.md)
*/
