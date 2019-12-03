#include<iostream>
using namespace std;
#include<cstring>
#include "Bank.h"
Bank::Bank()
{

	int len1=strlen("Prafulla");
	this->name=new char(len1);
	strcpy(this->name,"Prafulla");
	
	this->bal=10000;

	int len2=strlen("saving");
	this->acc_type=new char(len2);
	strcpy(this->acc_type,"saving");
	
	this->acc_no=12345;
}

void Bank:: credit(int amount)
{
	int amt=amount;
	this->bal=this->bal+amt;
	cout<<"Amount credit Successful";
	
}

void Bank:: display()
{
	cout<<endl<<"Name: "<<this->name;
	cout<<endl<<"Bal: "<<this->bal;
	cout<<endl<<"account type : "<<this->acc_type;
	cout<<endl<<"acc_no: "<<this->acc_no;	
}

void Bank :: debit(int amt)
{
	if(this->bal<amt)
	{
		cout<<"can not withdraw amoount";

	}
	else
	{
		this->bal=this->bal-amt;
		cout<<"amount debited "<<this->bal;
		
	}


}

Bank :: ~Bank()
{
cout<<"~Bank"<<endl;
delete name;
delete acc_type;	


}

