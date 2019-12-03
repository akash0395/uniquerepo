#include<iostream>
#include<fstream>
#include<cstring>

using namespace std;



int main()
{
	
	int ch,i;
	cout<<"Enter number of students :"<<endl;
	cin>>ch;

	ofstream fout1("Sample.csv",ios::app);
	for(i=1;i<=ch;i++)
	{
		long int phn;
		char temp[30],prn[20],fname[50],lname[50],dob[10],eml[30];

		cout<<"Enter PRN :"<<endl;		
		cin>>prn;		
		ofstream fout(prn);
		cout<<"Enter First name"<<endl;
		cin>>fname;
		fout<<fname<<endl;
		cout<<"Enter Last name"<<endl;
		cin>>lname;
		fout<<lname<<endl;
		cout<<"Enter DOB"<<endl;
		cin>>dob;
		fout<<dob<<endl;
		cout<<"Enter Phone number"<<endl;
		cin>>phn;
		fout<<phn<<endl;
		cout<<"Enter Email"<<endl;
		cin>>eml;
		fout<<eml<<endl;
		ifstream fin(prn);
		fout1<<prn<<","<<fname<<","<<lname<<","<<dob<<","<<phn<<","<<eml<<endl;

	}	

	//int ik=2;
	//char c=ik+'\0';
	//cout<<c;
	//fname.append((const char*)(ik));
	//cout<<fname;


/*

int prn=30;
char fname[]="name";
itoa(prn,fname,10);
cout<<fname;
*/


return 0;

}
