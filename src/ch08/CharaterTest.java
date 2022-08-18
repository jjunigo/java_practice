package ch08;

public class CharaterTest {

	public static void main(String[] args) {

		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char han = '��';
		char ch = '\uD55C';
		System.out.println(han);
		System.out.println(ch);
		
	}

}

/*
# 08. �ڷ���(data type) - ���ڴ� ���α׷����� ��� ǥ���Ͽ� ����ϳ���?

## - ���ڵ� ������ ǥ���մϴ�.
+ � ���ڸ� ��ǻ�� ���ο��� ǥ���ϱ� ���� Ư�� ���� ���� ����
+ A �� 65

![encode.PNG](./img/encode.PNG)

+ ���ڼ�Ʈ : �� ���ڸ� �󸶷� ǥ���� ������ �ڵ� ���� ��Ƶ� ���� ���ڼ�Ʈ(charater set)�� �� <br>
            (ex. ASKII, euc-kr, utf-8, utf-16)

## - �ڹٿ����� ���ڰ� ��� ǥ���ǳ���?

+ �ڹٴ� ���ڸ�  ��Ÿ���� ���� ������ ǥ���� UNICODE�� ���

+ utf-16 ���ڵ��� ��� (��� ���ڸ� 2����Ʈ�� ǥ��)


## - ������ ���� ����� ����ϱ�
+ ���ڸ� ���� ������ Ÿ��
  **char** ch = 'A';

+ ���������� ���ڷ� ǥ���ǹǷ� ���ڸ� �־ ���ڰ� ��µ� �� ����

  char ch2 = 66;

```
package ch08;

public class CharacterTest {

	public static void main(String[] args) {

		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		//char ch4 = -66;  ������ ���� �� �� ����

    		char ch5 = '��';
		char ch6 = '\uD55C';
		
		System.out.println(ch5);
		System.out.println(ch6);
	}
}
```
## �����ϼ���

    character set: ���ڸ� ���ڷ� ��ȯ�� ���� ��Ʈ

    encoding: ���ڰ� ���ڷ� ��ȯ�Ǵ� ��
    decoding: ���ڿ��� �ٽ� ���ڷ� ��ȯ�Ǵ� ��

    ASKII code: ���ĺ��� ���� Ư�� ���ڵ��� 1����Ʈ�� ǥ���ϴµ� ����ϴ� ���ڼ�Ʈ

    UNICODE: �� ���� ǥ������ ���� ���� ��Ʈ

    UTF-8: 1����Ʈ���� 4����Ʈ���� �پ��ϰ� ���ڸ� ǥ���� �� ����

    UTF-16: 2����Ʈ�� ���ڸ� ǥ��

 [�ѱ� �����ڵ� ǥ](http://www.unicode.org/charts/PDF/UAC00.pdf)

## ���� ����
[09. �ڷ���(data type)- ������ �ڷ��� ���� ���� ����ϱ�](https://gitlab.com/easyspubjava/javacoursework/-/blob/master/Chapter1/01-09/README.md)
*/