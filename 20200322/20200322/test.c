#define _CRT_SECURE_NO_WARNINGS 1
#include <windows.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>


//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	
//	int k = 7;//要找的数字
//	int sz = sizeof(arr) / sizeof(arr[0]); //计算元素个数
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		if (arr[i] == k)
//		{
//			printf("找到了，下标是:%d\n", i);
//			break;
//		}
//	}
//	if (i == sz)
//	{
//		printf("找不到\n");
//	}
//	return 0;
//}

//int main()
//{
//	// 在一个有序数组中查找具体的某个数字n。 编写int binsearch(int x, int v[], int n); 功能：在v[0] <=v[1]<=v[2]<= ….<=v[n-1]的数组中查找x.
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int k = 7;//要找的数字
//	int sz = sizeof(arr) / sizeof(arr[0]); //计算元素个数
//	
//	int left = 0;
//	int right = sz-1;
//	while (left<=right) //<=
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
//			printf("找到了，下标是:%d\n", mid);
//			break;
//		}
//	}
//	if (left > right)
//	{
//		printf("找不到");
//	}
//	return 0;
//}

//int main()
//{
//	//编写代码，演示多个字符从两端移动，向中间汇聚
//	char arr1[] = "welcome to bit!!!!!!!!";
//	char arr2[] = "######################";
//	
//	int len = strlen(arr1);
//	//int sz = sizeof(arr)/sizeof(arr[0]);
//	
//	int left = 0;
//	int right = len - 1;
//	//int right = sz-2; //字符串包含/0，故-2.整形-1
//	while (left<=right)
//	{
//		arr2[left] = arr1[left];
//		arr2[right] = arr1[right];
//		printf("%s\n", arr2);
//		Sleep(1000);//睡眠函数 1秒
//		system("cls");//执行系统命令-cls-清理屏幕
//		left++;
//		right--;
//	}
//	printf("%s\n", arr2);
//
//	return 0;
//}

//int main()
//{
//	// 编写代码实现，模拟用户登录情景，并且只能登录三次。（只允许输入三次密码，如果密码正确则 提示登录成，如果三次均输入错误，则退出程序。
//	int i = 0;
//	char password[20] = { 0 };
//	for (i = 1; i < 3; i++)
//	{
//		printf("请输入密码:>");
//		scanf("%s", password);//正确密码为123456
//		
//		//两个字符串比较不能直接用==，应该使用strcmp（），string compare
//		if (0 == strcmp(password, "123456"))
//		{
//			printf("登陆成功\n");
//			break;
//		}
//		else
//		{
//			printf("密码错误\n");
//		}
//	}
//	if (i == 3)
//	{
//		printf("三次密码错误，退出系统\n");
//
//	}
//
//	return 0;
//}


//void menu()
//{
//	printf("####################\n");
//	printf("### 1.play 0.exit ##\n");
//	printf("####################\n");
//}
//void game()
//{	
//	int guess = 0;
//	//1.电脑生成一个随机数
//	int ret = rand()%100+1; //rand返回0~32767之间的随机整数 %100-1 生成100以内的随机数
//	/*printf("%d\n", ret);*/
//	//2.猜数字
//	while (1)
//	{
//		printf("请猜数字:>");
//		scanf("%d", &guess);
//		if (ret > guess)
//		{
//			printf("猜小了\n");
//		}
//		else if (ret < guess)
//		{
//			printf("猜大了\n");
//
//		}
//		else
//		{
//			printf("猜对了\n");
//			break;
//		}
//	}
//}
//int main()
//{
//	//猜数字游戏实现 
//	int input = 0;
//	//生成随机数,只需调用一次
//	srand((unsigned int)time(NULL));//// time 返回一个时间戳
//	do
//	{
//		menu();
//		printf("请选择:>");
//		scanf("%d", &input);
//		switch (input)
//		{
//		case 1:
//			game();
//			break;
//		case 0:
//			printf("退出游戏\n");
//			break;
//		default:
//			printf("选择错误\n");
//			break;
//		}
//	} while (input);
//	return 0;
//}

//int main()
//{
//again:
//	printf("hehe\n");
//	goto again;
//	return 0;
//}

//int main()
//{
//	//关机
//	char input[100] = { 0 };
//	system("shutdown -s -t 60");//shutdown -s -t 60 60秒之后关机
//again:
//	printf("你的电脑在1分钟内关机，如果输入：我，就取消关机\n");
//	printf("请输入:");
//	scanf("%s", input); //数组名就是地址，故不需要&取地址符
//	if (strcmp(input, "我"))
//	{
//		system("shutdown -a");//取消关机
//	}
//	else
//		goto again;
//
//	return 0;
//}

int main()
{
	int len = strlen("abc");
	printf("%d\n", len);
	return 0;
}