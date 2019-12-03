#include <stdio.h>

#define STACK_SIZE 20
int arr[STACK_SIZE];
int top=-1;

void push(int x)
{
	if(top!=STACK_SIZE-1)
	{
		++top;
		arr[top]=x;
	}
	else
		printf("stack overflow...\n");
}

int pop()
{
	if(top!=-1)
	{
		int r=arr[top];
		--top;
		return r;
	}
	else
		printf("stack underflow...\n");
	return -1;
}

void display()
{
	if(top!=-1)
	{
		int i=top;
		for(;i!=-1;i--)
			printf("%d-->", arr[i]);

		printf("\n");
	}
	else
		printf("stack is empty...\n");
}




int main()
{
	display();
	pop();


}
#include <stdio.h>

#define STACK_SIZE 20
int arr[STACK_SIZE];
int top=-1;

void push(int x)
{
	if(top!=STACK_SIZE-1)
	{
		++top;
		arr[top]=x;
	}
	else
		printf("stack overflow...\n");
}

int pop()
{
	if(top!=-1)
	{
		int r=arr[top];
		--top;
		return r;
	}



#include <stdio.h>

#define STACK_SIZE 20
int arr[STACK_SIZE];
int top=-1;

void push(int x)
{
	if(top!=STACK_SIZE-1)
	{
		++top;
		arr[top]=x;
	}
	else
		printf("stack overflow...\n");
}

int pop()
{
	if(top!=-1)
	{
		int r=arr[top];
		--top;
		return r;
	}
	else
		printf("stack underflow...\n");
	return -1;
}

void display()
{
	if(top!=-1)
	{
		int i=top;
		for(;i!=-1;i--)
	else
		printf("stack underflow...\n");
	return -1;
}




void display()
{
	if(top!=-1)
	{
		int i=top;
		for(;i!=-1;i--)
	push(10);
	push(20);
	push(30);
	
	push(10);
	push(20);
	push(30);

	push(10);
	push(20);
	push(30);

	push(10);
	push(20);
	push(30);

	display();

	int ret=pop();
	printf("Pop value is:%d\n", ret);

	display();

	ret=pop();
	printf("Pop value is:%d\n", ret);
	display();
}


