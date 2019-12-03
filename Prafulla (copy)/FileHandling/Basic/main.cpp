#include<iostream>
#include<fstream>
using namespace std;


int main()
{

	ofstream sample("abc.txt",ios::out | ios :: ate);

	sample<<"prafulla"<<endl;
	sample<<"abijit"<<endl;
	sample<<"harish"<<endl;
	sample<<"shilpa"<<endl;
	sample<<"Mumbai"<<endl;



	ifstream sample2("abc.txt");
		
	char arr[100];
	
	
	while(sample2>>arr)
	{
	cout<<arr<<endl;
	
	}
	ifstream sample3("abc.txt");
		
	char aarr[100];
	
	
	while(sample3>>aarr)
	{
	cout<<aarr<<endl;
	
	}



	sample.close();
	sample2.close();
	sample3.close();



	ofstream sample4("abc.txt",ios::out | ios :: ate);

	sample<<"prafulla"<<endl;
	sample4.close();



}
