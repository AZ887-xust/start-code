#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <string.h>

//函数递归-自己调用自己
//存在限制条件防止无限递归
//每次递归之后越来越接近该条件

//void Print(unsigned int n)
//{
//     //接受一个整型值（无符号），按照顺序打印它的每一位。 例如： 输入：1234，输出 1 2 3 4.
//	if (n > 9)
//	{
//		Print(n/10);//123/10=12
//	}
//	printf("%d ", n % 10);//打印3
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
//	//编写函数不允许创建临时变量，求字符串的长度。
//	if (*str != '\0')
//		return 1 + my_strlen(str + 1);
//	else
//		return 0;
//	//满足条件递归，不满足跳出
//}
//int main()
//{
//	char arr[] = "bit";//数组名是首元素的地址
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


//求n的阶乘。（不考虑溢出）
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

//求第n个斐波那契数。（不考虑溢出)
//斐波那契数列1 1 2 3 5 8 13...
//int Fib(int n)
//{
//	////递归方式 -- 效率太低
//	//if (n <= 2)
//	//	return 1;
//	//else
//	//	return Fib(n - 1) + Fib(n - 2);
//
//	//(迭代)循环方式 迭代>=循环
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

//数组

//int main()
//{
//	//数组：元素类型 数组名[数组大小-常量]
//	int arr[10] = { 1, 2, 3 };//数组不完全初始化
//	int arr2[] = { 1, 2, 3 };//不指定大小由元素个数决定
//	char arr3[] = { 'a', 'b', 'c' };
//	char arr4[] = { 'a', 98, 'c' };//b的ASCII码为98
//	char arr5[] = "abc";//包含四个元素，a,b,c,\0
//	printf("%d\n", sizeof(arr2));//12
//	printf("%d\n", sizeof(arr4));//3
//	printf("%d\n", sizeof(arr5));//4
//	printf("%d\n", strlen(arr4));//此处随机值，strlen到\0停止
//	printf("%d\n", strlen(arr5));//3
//
//
//	return 0;
//}

//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
//	              //0, 1, 2, 3, 4, 5, 6, 7, 8, 9
//	//[]下标引用操作符
//	int i = 0;
//	int*p = arr;
//	for (i = 0; i < sizeof(arr) / sizeof(arr[0]); i++)
//	{
//		//printf("&arr[%d] = %p\n", i, &arr[i]);//%p--打印地址  数组在内存中是连续存放的
//		
//		printf("%d ", *p);
//		p++;
//
//	}
//	return 0;
//}

//二维数组
int main()
{
	//二维数组可以省略行，不能省略列，必须规定一行有多少个元素
	int arr[3][4] = { { 1, 2 }, { 3, 4 }, { 5 } };//三行四列的二维数组
	/*char ch[3][5];*/
	return 0;
}