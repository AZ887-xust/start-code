#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <string.h>

//�����ݹ�-�Լ������Լ�
//��������������ֹ���޵ݹ�
//ÿ�εݹ�֮��Խ��Խ�ӽ�������

//void Print(unsigned int n)
//{
//     //����һ������ֵ���޷��ţ�������˳���ӡ����ÿһλ�� ���磺 ���룺1234����� 1 2 3 4.
//	if (n > 9)
//	{
//		Print(n/10);//123/10=12
//	}
//	printf("%d ", n % 10);//��ӡ3
//}
//int main()
//{
//	unsigned int num = 0;
//	scanf("%%d\n", &num);//123
//	Print(num);
//	return 0;
//}


//my_strlen(char* str)
//{
//	int count = 0;
//	while(*str != '\0')
//	{
//		count++;
//		str++;
//	}
//	return count;
//}

//int my_strlen(char* str)
//{
//	//��д��������������ʱ���������ַ����ĳ��ȡ�
//	if (*str != '\0')
//		return 1 + my_strlen(str + 1);
//	else
//		return 0;
//	//���������ݹ飬����������
//}
//int main()
//{
//	char arr[] = "bit";//����������Ԫ�صĵ�ַ
//	int len = my_strlen(arr);
//	printf("%d\n", len);
//
//	/*my_strlen("bit");
//	1 + my_strlen("it");
//	1 + 1 + my_strlen("t");
//	1 + 1 + 1 + my_strlen("");
//	1 + 1 + 1 + 0;
//	3;*/
//	return 0;
//}


//��n�Ľ׳ˡ��������������
//int Fac(int n)
//{
//	if (n <= 1)
//		return 1;
//	else
//		return n*Fac(n - 1);
//}
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);//5
//	int ret = Fac(n);
//	/*int i = 0;
//	int ret = 1;
//	for (i = 1; i <= n; i++)
//	{
//		ret *= i;
//	}*/
//	printf("%d\n", ret);
//}

//���n��쳲��������������������)
//쳲���������1 1 2 3 5 8 13...
//int Fib(int n)
//{
//	////�ݹ鷽ʽ -- Ч��̫��
//	//if (n <= 2)
//	//	return 1;
//	//else
//	//	return Fib(n - 1) + Fib(n - 2);
//
//	//(����)ѭ����ʽ ����>=ѭ��
//	int a = 1;
//	int b = 1;
//	int c = 1;
//	while (n > 2)
//	{
//		c = a + b;
//		a = b;
//		b = c;
//		n--;
//	}
//	return c;
//}
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	int ret = Fib(n);
//	printf("%d", ret);
//
//	return 0;
//}

//����

//int main()
//{
//	//���飺Ԫ������ ������[�����С-����]
//	int arr[10] = { 1, 2, 3 };//���鲻��ȫ��ʼ��
//	int arr2[] = { 1, 2, 3 };//��ָ����С��Ԫ�ظ�������
//	char arr3[] = { 'a', 'b', 'c' };
//	char arr4[] = { 'a', 98, 'c' };//b��ASCII��Ϊ98
//	char arr5[] = "abc";//�����ĸ�Ԫ�أ�a,b,c,\0
//	printf("%d\n", sizeof(arr2));//12
//	printf("%d\n", sizeof(arr4));//3
//	printf("%d\n", sizeof(arr5));//4
//	printf("%d\n", strlen(arr4));//�˴����ֵ��strlen��\0ֹͣ
//	printf("%d\n", strlen(arr5));//3
//
//
//	return 0;
//}

//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
//	              //0, 1, 2, 3, 4, 5, 6, 7, 8, 9
//	//[]�±����ò�����
//	int i = 0;
//	int*p = arr;
//	for (i = 0; i < sizeof(arr) / sizeof(arr[0]); i++)
//	{
//		//printf("&arr[%d] = %p\n", i, &arr[i]);//%p--��ӡ��ַ  �������ڴ�����������ŵ�
//		
//		printf("%d ", *p);
//		p++;
//
//	}
//	return 0;
//}

//��ά����
int main()
{
	//��ά�������ʡ���У�����ʡ���У�����涨һ���ж��ٸ�Ԫ��
	int arr[3][4] = { { 1, 2 }, { 3, 4 }, { 5 } };//�������еĶ�ά����
	/*char ch[3][5];*/
	return 0;
}