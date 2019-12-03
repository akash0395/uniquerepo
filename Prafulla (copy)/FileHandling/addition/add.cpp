#include<iostream>
#include<fstream>
#include<istream>
using namespace std;



int main()
{

	int no1,no2;
	ofstream out("abc.txt");
	int arr1[10];
	int j=0;
	cout<<"Enter the Numbers :"<<endl;	
	while(j<2)
	{	
	cout<<"Number are :"<<endl;	
	cout<<"Number are :"<<endl;
		cin>>arr1[j];
		out<<arr1[j]<<endl;
		j++;
	}
	out.close();
	

	ifstream in("abc.txt");
	
	cout<<"Number are :"<<endl;
	int arr[10];
	int i=0;
	
	cout<<"Number are :"<<endl;
	while(i<2)
	{
		in>>arr[i];
		cout<<arr[i]<<endl;
		i++;

	}

	ofstream outSum("out.txt");
	int k=0;
	int sum=0;
	while(k<2)
	{	
	cout<<"Number are :"<<endl;
		sum=sum+arr[k];
		k++;
	}
	
	cout<<"Addition is :"<<sum;
	outSum<<sum<<endl;
	
	
	

	outSum.close();
	in.close();


	




}
