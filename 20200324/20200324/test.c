#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <string.h>
#include <math.h>
//库函数

//strcpy 字符串拷贝
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


//memset  memory-内存 set-设置
//void * memset(void * ptr, int value, size_t num);

//int main()
//{
//	char arr[] = "hello bit";//***** bit
//	memset(arr,'*',5);
//	printf("%s\n", arr);
//
//	return 0;
//}


////自定义函数
//get_max(int x, int y)//形参在调用时才分配内存空间，使用完销毁，使用范围仅在函数内部。形参实例化后相当于实参的一份临时拷贝
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

//void表示无返回值
//void Swap1(int x, int y) //传值调用
//{
//	//形参
//	int tmp = 0;
//	tmp = x;
//	x = y;
//	y = tmp;
//}
//void Swap2(int *pa, int *pb)  //传址调用
//{
//	int tmp = 0;
//	tmp = *pa; //等价于tmp =a
//	*pa = *pb;
//	*pb = tmp;
//}
//int main()
//{
//	int a = 10;//实参
//	int b= 20;
//
//	int tmp = 0;
//	printf("a=%d b=%d\n", a, b);
//	//Swap1(a, b); //调试进入函数按F11
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
//	//判断n是否为素数 2~n-1
//	int i = 0;
//	for (i = 2; i <=sqrt(n); i++)
//	{
//		if (n%i == 0)
//			return 0;
//	}
//	//不满足条件
//	return 1;
//}
//int main()
//{
//	int i = 0;
//	int count = 0;
//	for (i = 100; i <= 200; i++)
//	{
//		//判断是否为素数
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
//	//闰年
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

               //本质上传过来的是指针int* arr
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
//	//二分查找
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int k = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	scanf("%d", &k);
//	//数组传参的时候，传过去一个数组名，本质上传过去的是数组的首元素的地址 &arr[0]
//	int* pa = arr[0];
//	int ret = binary_search(arr,k,sz);//找到返回下标，找不到返回-1
//	//数组传参发生降级-变成首元素地址
//	if (ret == -1)
//	{
//		printf("找不到");
//	}
//	else
//	{
//		printf("找到了，下标是=%d", ret);
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
//	printf("%d", printf("%d", printf("%d", 43))); //返回值为字符的长度 43 2 1
//}


#include "add.h" //调用自定义的头文件用""
#include "sub.h" 
//分模块编写代码
int main()
{
	int a = 10;
	int b = 20;
	int c = Sub(a, b);
	int sum = Add(a, b);//函数调用
	printf("sum=%d\n", sum);
	printf("c=%d\n", c);
	return 0;
}


