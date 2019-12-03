#include<iostream>

#include<fstream>
using namespace std;


int main()
{
	ifstream in("number.txt");
	int arr[10];
	int i=0;
	int number[30];

	
	while(i<5)
	{
		in>>arr[i];
		i++;
	}
	i=0;
	cout<<"Enter the Number :"<<endl;
	while(i<3)
	{

	cin>>number[i];
	i++;

	}
	int a=0;
	int x=0;
	for(a=0;a<5;a++)
	{
		for(x=0;x<3;x++)
		{
			arr[a]=arr[a]+number[x];
		}
	}

	i=0;
	while(i<5)
	{
		cout<<arr[i]<<endl;
		i++;

	}



	i=0;
	ofstream out("number.txt",ios::ate);
	
	while(i<5)
	{
		out<<arr[i]<<endl;
		i++;	
	}
	





}
