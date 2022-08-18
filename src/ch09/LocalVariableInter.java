package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {

		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;
		System.out.println(str2);
		
		str = "hello";
		//str = 3; // ������ ������ �ڹٿ����� �Ұ��� ��ũ��Ʈ? ������ ����
		System.out.println(str);
	}

}

/*
# 09. �ڷ���(data type)- ������ �ڷ��� ���� ���� ����ϱ�

##  ����
 - true(��), false(����) �� ������ ��Ÿ��

 - 1����Ʈ�� ��� ��

 - ���� �����ϴ���, �迭�� �������, ����� ������ ������������ ǥ��


```
package ch09;

public class BooleanTest {

	public static void main(String[] args) {
		
		boolean isMarried = true;
		System.out.println(isMarried);
	}
}
```

## ���� ���� �ڷ��� ���� ����ϱ� (  �ڹ� 10 ���� �� ) 

 - Local variable type inference

 - �߷� ������ ������ ���� �ڷ����� �������� ����
 
 - �ѹ� �����Ͽ� �߷� �� ������ �ٸ� Ÿ���� ���� ���� �� �� ����

 - ���� ������ ��� ����

```
 package ch09;

public class LocalVariableType {

	public static void main(String[] args) {

		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str = 3; 
	}
}
```

## ���� ���� 
[# 10. ������ �ʴ� ����� ���ͷ�, ������ �� ��ȯ](https://gitlab.com/easyspubjava/javacoursework/-/blob/master/Chapter1/01-10/README.md)
*/