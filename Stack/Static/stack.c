#include<stdio.h>
#define stack_size 10
int top=-1;
void push(int);
int pop();
void display();
int arr[stack_size];

int main()
{
	push(10);
	push(20);
	push(30);
	pop();
//	pop();
	display();
	printf("pop\n\n");
	int ret=pop();
	display();
	printf("pop value is :%d",ret);
	
return 0;	
}


void push(int x)
{
	if(top<=stack_size-1)
	{
		++top;
		arr[top]=x;
	}
	else
		printf("stack overflow\n");	
}


int pop()
{
	if(top>=-1)
	{
	 	int x=arr[top];
		--top;
		return x;
	}
	else
		printf("stack underflow\n");
}

void display()
{
	int i;
	for(i=top;i>=0;i--)
	{
		printf("%d\n", arr[i]);
	}
	
}






