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
//	//int4�ֽ�-32bit
//	//00000000000000000000000000001010
//	//11111111111111111111111111110101
//	int b = ~a; //�����ư�λȡ��
//	return 0;
//}
//
//int main(){
//	int a = 10;
//	int b = a--; //����--����ʹ��a��ֵ����b��a��--
//	printf("b=%d a=%d\n", b,a);
//	int c = --a;//ǰ��--��a��ֵ��--���ٰ�a��ֵ����c,
//	printf("c=%d a=%d\n", c, a);
//
//	return 0;
//}                
//
//int main(){
//	int a = 0; //0�٣���0��
//	int b = 5;
//	if (a||b) //&&�߼��� ||�߼���
//		printf("hehe\n");
//	return 0;
//}
//
//int main(){
//	int a = 10;
//	int b = 20;
//	int max = 0;
//	max = (a > b) ? (a) : (b); //exp1 ? exp2 : exp3 ����ʽ1���ж��������ʽ2��3
//	printf("%d\n", max);
//	return 0;
//}
//
//
//int main(){
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	printf("%d\n", arr[4]); //[]�±����ò�����
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
//	int sum = Add(a, b);//()�������ò�����
//	printf("%d\n", sum);
//	return 0;
//}
//
//typedef unsigned int  u_int;//typedef ���������� ��unsigned int�����
//int main(){
//	unsigned int age;
//	u_int age2;
//	return 0;
//}
//
//int main(){
//	register int a = 0; //����aδ���ᱻ����ʹ�ã�register���ǽ����a����Ĵ�����
//	return 0;
//}
//
//void test(){
//	int a = 1;//�ֲ����� printf��a����ʧ������´ε���test a���´�������1��++����2
//	a++;
//	printf("%d ", a);
//}
//int main(){    //static ���ξֲ�����������ȫ�ֱ��������κ���
//	int i = 0;
//	while (i < 10){
//		test();
//		i++;
//	}
//	return 0;
//}
//void test(){
//	static int a = 1;//��̬�ֲ����� aû����ʧ��������һ�ε�ֵ��static�ı��˱������������ڣ��䳤�������˾ֲ���ΧҲ������
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
//extern int g_val; //extern�����ⲿ����
//int main(){   //static����ȫ�ֱ��������������򣨱�С�������������̱��Add.c���ļ�
//	printf("%d\n", g_val);
//	return 0;
//}
//
//
//static���κ������ı��˺�����������,�����εĺ���ֻ�����Լ���Դ�ļ�ʹ��
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
////��ķ�ʽ
//#define MAX(X,Y) ((X)>(Y)?(X):(Y)) 
////�����ķ�ʽ
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
//	//Ҫ�洢10
//	//Ҫ���ڴ����
//	//a�ڴ���ʱ�����ڴ��������ĸ��ֽڵĿռ�
//	//printf("%p\n",&a); //&ȡ��ַ������,%p�Ե�ַ��ʽ��ӡ��ʮ������
//	int* p = &a;//p��ָ���������ŵ�ַ, p�����;���ָ�����a������
//	printf("%p\n", &a);
//	printf("%p\n",p);
//	return 0;
//}

//int main(){
//	int a = 10;
//	int* pa = &a;
//	*pa=20;//�����ò����� *pa����a *��&���෴�Ĳ�����*pa�͵���a����*pa��ֵ20�͵��ڸ�a��ֵ��
//	printf("%d\n", *pa);
//	return 0;
//}

int main(){
	char ch = 'a';
	int a = 10;
	char* pc = &ch;
	int* pa = &a;
	//ָ���С��32λƽ̨��4���ֽڣ���64λϵͳ��8��ƽ̨���������޹ء�
	printf("%d\n", sizeof(char*));//4
	printf("%c\n", sizeof(pa));//4
	return 0;
}