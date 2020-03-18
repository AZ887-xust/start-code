//#define _CRT_SECURE_NO_WARNINGS 1
//#include <stdio.h>
//
//int main(){
//
//	return 0;
//}
//
//int main(){
//	char arr1[] = "abc";
//	char arr2[] = { 'a', 'b', 'c' };
//	printf("%d\n%d\n", strlen(arr1),strlen(arr2));
//
//	return 0;
//}
//
//int main(){
//	int a = 10;  
//	//int4字节-32bit
//	//00000000000000000000000000001010
//	//11111111111111111111111111110101
//	int b = ~a; //二进制按位取反
//	return 0;
//}
//
//int main(){
//	int a = 10;
//	int b = a--; //后置--，先使用a的值赋给b，a再--
//	printf("b=%d a=%d\n", b,a);
//	int c = --a;//前置--，a的值先--，再把a的值赋给c,
//	printf("c=%d a=%d\n", c, a);
//
//	return 0;
//}                
//
//int main(){
//	int a = 0; //0假，非0真
//	int b = 5;
//	if (a||b) //&&逻辑与 ||逻辑或
//		printf("hehe\n");
//	return 0;
//}
//
//int main(){
//	int a = 10;
//	int b = 20;
//	int max = 0;
//	max = (a > b) ? (a) : (b); //exp1 ? exp2 : exp3 条件式1做判断输出条件式2或3
//	printf("%d\n", max);
//	return 0;
//}
//
//
//int main(){
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	printf("%d\n", arr[4]); //[]下标引用操作符
//	return 0;
//}
//
//int Add(int x, int y){
//	int z = x + y;
//	return z;
//}
//int main(){
//	int a = 10;
//	int b = 20;
//	int sum = Add(a, b);//()函数调用操作符
//	printf("%d\n", sum);
//	return 0;
//}
//
//typedef unsigned int  u_int;//typedef 类型重命名 给unsigned int起别名
//int main(){
//	unsigned int age;
//	u_int age2;
//	return 0;
//}
//
//int main(){
//	register int a = 0; //假设a未来会被大量使用，register就是建议把a放入寄存器中
//	return 0;
//}
//
//void test(){
//	int a = 1;//局部变量 printf后a就消失，因此下次调用test a重新创建还是1，++后变成2
//	a++;
//	printf("%d ", a);
//}
//int main(){    //static 修饰局部变量，修饰全局变量，修饰函数
//	int i = 0;
//	while (i < 10){
//		test();
//		i++;
//	}
//	return 0;
//}
//void test(){
//	static int a = 1;//静态局部变量 a没有消失，保留上一次的值，static改变了变量的生命周期（变长），出了局部范围也不销毁
//	a++;
//	printf("%d ", a);
//}
//int main(){    
//	int i = 0;
//	while (i < 10){
//		test();
//		i++;
//	}
//	return 0;
//}
//
//extern int g_val; //extern声明外部符号
//int main(){   //static修饰全局变量，限制作用域（变小），从整个工程变成Add.c该文件
//	printf("%d\n", g_val);
//	return 0;
//}
//
//
//static修饰函数，改变了函数的作用域,被修饰的函数只能在自己的源文件使用
//extern int Add(int x,int y);  
//int main(){
//	int a = 10;
//	int b = 20;
//	int c = Add(a, b);
//	printf("%d\n", c);
//
//	return 0;
//}
//
//
////宏的方式
//#define MAX(X,Y) ((X)>(Y)?(X):(Y)) 
////函数的方式
//Max(int x, int y){
//	return (x > y? x : y);
//}
//
//int main(){
//	int a = 10;
//	int b = 20;
//	int max=Max(a, b);
//	printf("max=%d\N", max);
//	max = Max(a, b);
//	printf("max=%d", max);
//	return 0;
//}

//int main()
//{
//	int a = 10;
//	//要存储10
//	//要有内存符号
//	//a在创建时，向内存申请了四个字节的空间
//	//printf("%p\n",&a); //&取地址操作符,%p以地址形式打印，十六进制
//	int* p = &a;//p是指针变量，存放地址, p的类型就是指向变量a的类型
//	printf("%p\n", &a);
//	printf("%p\n",p);
//	return 0;
//}

//int main(){
//	int a = 10;
//	int* pa = &a;
//	*pa=20;//解引用操作符 *pa就是a *与&是相反的操作，*pa就等于a，给*pa赋值20就等于给a赋值。
//	printf("%d\n", *pa);
//	return 0;
//}

int main(){
	char ch = 'a';
	int a = 10;
	char* pc = &ch;
	int* pa = &a;
	//指针大小在32位平台是4个字节，在64位系统是8个平台，与类型无关。
	printf("%d\n", sizeof(char*));//4
	printf("%c\n", sizeof(pa));//4
	return 0;
}