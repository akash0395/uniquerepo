#include<iostream>
#include<fstream>
using namespace std;


int main()
{
	char prn[20];
	char name[50];
	char lname[50];
	char dob[50];
	int mobno;
	char emailid[50];
/*
	ifstream in("abc.txt");
	
	if(in.fail())
	{
		cout<<"hashdsai";
	}

*/	
	
	

	cout<<"Enter the PRN number:"<<endl;
	cin>>prn;
	cout<<"Enter the Name:"<<endl;
	cin>>name;
	cout<<"Enter the Last Name"<<endl;
	cin>>lname;
	cout<<"Enter the dob"<<endl;
	cin>>dob;
	
	cout<<"ENter the Mob Number"<<endl;
	cin>>mobno;
	cout<<"Enter the Email id"<<endl;
	cin>>emailid;

	
	ofstream out(prn);
	out<<prn<<endl<<name<<endl<<lname<<endl<<dob<<endl<<mobno<<endl<<emailid<<endl;
	out.close();



}

