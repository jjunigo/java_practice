package ch07;

public class DoubleTest {

	public static void main(String[] args) {

		double dnum = 3.14;
		float fnum = 3.14f;
		
		System.out.println(dnum);
		System.out.println(fnum);
	}

}

/*
# 07. �ڷ���(data type) - �Ǽ��� ��� ǥ���ϳ���?

## - �ε� �Ҽ��� ���
   -  �Ǽ��� ���� ���� �����ϱ� ������ �����ʹ� �ٸ� ������� ǥ���ؾ� ��
   
   -  �ε� �Ҽ��� ������� �Ǽ� �� 0.1 ǥ�� 

      ![realnum](./img/realnum.png)

   -  �����ο� �����η� ǥ�� ��

   - ��ǻ�Ϳ����� �ؼ��� 2�� ���

   - ����ȭ : ������ �ؼ����� ���� �� �ڸ����� ������ ǥ�� �Ǵ� ��

   - ��ǻ�Ϳ����� �ؼ��� 2 �̹Ƿ� ����ȭ�� �ϰ� �Ǹ� �����κ��� ù ��° �ڸ� ���ڴ� �׻� 1�� <br>
     ��) 0.2 ǥ�� 0.4 X 2<sup>-1</sup>  ����ȭ �ϸ� 1.6 X 2<sup>-3</sup> 

## - float���� double�� 
   ![float.png](./img/float.png)

   �ڹٿ����� �Ǽ��� �⺻ Ÿ���� dobule�� ��� ��


## - float �� double ����
```
   package ch07;

   public class DoubleTest {

	   public static void main(String[] args) {
		   double dnum = 3.14;
		   float fnum = 3.14F;
		
		   System.out.println(dnum);
		   System.out.println(fnum);
	   }
   }
```


## - �ε� �Ҽ��� ����� ����
   ������ ������ ��Ÿ���� �ε� �Ҽ��� ��Ŀ����� �����ΰ� 0�� ǥ���� �� ���� ������ �ణ�� ������ �߻��� �� �ִ�

```
   public class DoubleTest2 {

	public static void main(String[] args) {

		double dnum = 1;
		
		for(int i = 0; i<10000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
	}
}
```

   ��� ��� 

   ![output.png](./img/output.PNG)

## ���� ����
[08. �ڷ���(data type) - ���ڴ� ���α׷����� ��� ǥ���Ͽ� ����ϳ���?](https://gitlab.com/easyspubjava/javacoursework/-/blob/master/Chapter1/01-08/README.md)
*/