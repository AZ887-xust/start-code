#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
//输入3个数字比大小
//int main(){
//	int num1 = 0;
//	int num2 = 0;
//	int num3 = 0;
//	printf("请输入3个数字：");
//	scanf("%d", &num1);
//	scanf("%d", &num2);
//	scanf("%d", &num3);
//
//	if (num1 > num2)
//	{
//		if (num3 > num1)
//		{
//			printf("%d>%d>%d", num3, num1, num2);
//		}
//		else if (num3 == num1)
//		{
//			printf("%d=%d>%d", num1, num3, num2);
//		}
//		else if (num3 < num1 && num3 > num2)
//		{
//			printf("%d>%d>%d", num1, num3, num2);
//		}
//		else if (num3 == num2)
//		{
//			printf("%d>%d=%d", num1, num2, num3);
//		}
//		else
//			printf("%d>%d>%d", num1, num2, num3);
//	}
//	else if (num2 > num1)
//	{
//		if (num3 > num2)
//		{
//			printf("%d>%d>%d", num3, num2, num1);
//		}
//		else if (num3 == num2)
//		{
//			printf("%d=%d>%d", num3, num2, num1);
//		}
//		else if (num3 < num2 && num3 > num1)
//		{
//			printf("%d>%d>%d", num2, num3, num1);
//		}
//		else if (num3 == num1)
//		{
//			printf("%d>%d=%d", num2, num1, num3);
//		}
//		else
//			printf("%d>%d>%d", num2, num1, num3);
//	}
//
//	else if (num1 == num2 && num3 != num1)
//	{
//		if (num3 > num1)
//		{
//			printf("%d>%d=%d", num3, num1, num2);
//		}
//		else
//		{
//			printf("%d=%d>%d", num1, num2, num3);
//		}
//	}
//	else
//	{
//		printf("%d=%d=%d", num1, num2, num3);
//	}
//	return 0;
//}