package ch06;

public class VariableTest {

	public static void main(String[] args) {

		byte bnum = 127;
		
		System.out.println(bnum);
		
		//int num = 123456789;
		long lnum = 12345678900L;
		System.out.println(lnum);

	}

}

/*
# 06. �ڷ���(data type) - ������ ��� ǥ���ϳ���?

## ������ �޸�
    
    ������ �����ϸ� �ش�Ǵ� �ڷ����� ũ�� ��ŭ �޸𸮰� �Ҵ�
    ������ �Ҵ�� �޸𸮸� ����Ű�� �̸�

    int level = 10; // 4����Ʈ ������ �޸𸮰� level �̶�� �̸����� �Ҵ� ��
    

## �⺻ �ڷ���(primitive data type)�� ����
![datatype](./img/intdatatype.png)

## ���� �ڷ����� ������ ũ��
![datatype2](./img/intdatatype2.png)

## byte�� short
+ byte : 1����Ʈ ������ �ڷ��� 
         ������, ���� ����, ���� ������ �ڷḦ ó���� �� ���

+ short: 2����Ʈ ������ �ڷ��� 
         C/C++ ���� ȣȯ �� ���

## int 

+ �ڹٿ��� ����ϴ� ������ ���� �⺻ �ڷ� ��

+ 4����Ʈ ������ �ڷ���

+ ���α׷����� ����ϴ� ��� ����(���ͷ�)�� int �� �����

+ 32 ��Ʈ�� �ʰ��ϴ� ���ڴ� long �ڷ������� ó��

## long

+ 8����Ʈ �ڷ���

+ ������ �ڿ� ���ĺ� L �Ǵ� l �� �Ἥ long ������ ǥ�� ��

+ ��) int num = 12345678900; // ���� <br>
      long lnum = 12345678900; //���� <br>
      long lnumber = 12345678900L; // ok

## ���� ���� 
[07. �ڷ���(data type)- �Ǽ��� ��� ǥ���ϳ���?](https://gitlab.com/easyspubjava/javacoursework/-/tree/master/Chapter1/01-07/README.md)
*/