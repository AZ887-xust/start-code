#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <string.h>
#include <math.h>
//�⺯��

//strcpy �ַ�������
//char * strcpy ( char * destination, const char * source );

//int main()
//{
//	char arr1[20] ="#########";\
//	//bit\0
//	char arr2[] = "bit";
//	strcpy(arr1, arr2);
//	printf("%s\n", arr1);
//	
//	
//	return 0;
//}


//memset  memory-�ڴ� set-����
//void * memset(void * ptr, int value, size_t num);

//int main()
//{
//	char arr[] = "hello bit";//***** bit
//	memset(arr,'*',5);
//	printf("%s\n", arr);
//
//	return 0;
//}


////�Զ��庯��
//get_max(int x, int y)//�β��ڵ���ʱ�ŷ����ڴ�ռ䣬ʹ�������٣�ʹ�÷�Χ���ں����ڲ����β�ʵ�������൱��ʵ�ε�һ����ʱ����
//{
//	return((x > y )?( x) :( y));
//}
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int max = 0;
//	get_max(a,b);
//	max = get_max(a, b);
//	printf("%d\n", max);
//	return 0;
//}

//void��ʾ�޷���ֵ
//void Swap1(int x, int y) //��ֵ����
//{
//	//�β�
//	int tmp = 0;
//	tmp = x;
//	x = y;
//	y = tmp;
//}
//void Swap2(int *pa, int *pb)  //��ַ����
//{
//	int tmp = 0;
//	tmp = *pa; //�ȼ���tmp =a
//	*pa = *pb;
//	*pb = tmp;
//}
//int main()
//{
//	int a = 10;//ʵ��
//	int b= 20;
//
//	int tmp = 0;
//	printf("a=%d b=%d\n", a, b);
//	//Swap1(a, b); //���Խ��뺯����F11
//	/*tmp = a;
//	a = b;
//	b = tmp;*/
//	Swap2(&a, &b);
//	printf("a=%d b=%d\n", a, b);
//
//	return 0;
//}

//int main()
//{
//	int a = 10;
//	int* pa = &a;
//	*pa = 20; //*pa=a
//	printf("a=%d\n", a);
//	return 0;
//}


//int is_prime(int n)
//{
//	//�ж�n�Ƿ�Ϊ���� 2~n-1
//	int i = 0;
//	for (i = 2; i <=sqrt(n); i++)
//	{
//		if (n%i == 0)
//			return 0;
//	}
//	//����������
//	return 1;
//}
//int main()
//{
//	int i = 0;
//	int count = 0;
//	for (i = 100; i <= 200; i++)
//	{
//		//�ж��Ƿ�Ϊ����
//		if (is_prime(i) == 1)
//		{
//			count++;
//			printf("%d ", i);
//		}
//	}
//	printf("count=%d\n", count);
//	return 0;
//}

//int is_leap_year(int y)
//{
//	//����
//	return((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0));
//	
//}
//int main()
//{
//	int year = 0;
//	int count = 0;
//	for (year = 1000; year <= 2000; year++)
//	{
//		if (is_leap_year(year) == 1)
//		{
//			count++;
//			printf("%d ",year);
//		}
//	}
//	printf("count=%d\n", count);
//	return 0;
//}

               //�����ϴ���������ָ��int* arr
//int binary_search(int arr[],int k,int sz)
//{
//	int left = 0;
//	int right = sz - 1;
//
//	while (left <= right)
//	{
//		int mid = (left + right) / 2;
//		if (arr[mid] < k)
//		{
//			left = mid + 1;
//		}
//		else if (arr[mid]>k)
//		{
//			right = mid - 1;
//		}
//		else
//		{
//			return mid;
//		}
//	}
//		return -1;
//}
//int main()
//{
//	//���ֲ���
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int k = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	scanf("%d", &k);
//	//���鴫�ε�ʱ�򣬴���ȥһ���������������ϴ���ȥ�����������Ԫ�صĵ�ַ &arr[0]
//	int* pa = arr[0];
//	int ret = binary_search(arr,k,sz);//�ҵ������±꣬�Ҳ�������-1
//	//���鴫�η�������-�����Ԫ�ص�ַ
//	if (ret == -1)
//	{
//		printf("�Ҳ���");
//	}
//	else
//	{
//		printf("�ҵ��ˣ��±���=%d", ret);
//	}
//	return 0;
//}


//void Add(int *p)
//{
//	(*p)++;
//}
//int main()
//{
//	int num = 0;
//	Add(&num);
//	printf("%d\n", num);
//	Add(&num);
//	printf("%d\n", num);
//	return 0;
//}


//int main()
//{
//	int len = strlen("bit");
//	printf("len = %d\n", len);
//
//	printf("len = %d\n", strlen("bit"));
//}

//int main()
//{
//	printf("%d", printf("%d", printf("%d", 43))); //����ֵΪ�ַ��ĳ��� 43 2 1
//}


#include "add.h" //�����Զ����ͷ�ļ���""
#include "sub.h" 
//��ģ���д����
int main()
{
	int a = 10;
	int b = 20;
	int c = Sub(a, b);
	int sum = Add(a, b);//��������
	printf("sum=%d\n", sum);
	printf("c=%d\n", c);
	return 0;
}


