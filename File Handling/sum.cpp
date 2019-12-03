#include<iostream>
#include<fstream>
using namespace std;

int main()
{
	int i,j;
	int res=0;
	cout<<"Enter 2 numbers :"<<endl;
	ofstream fout;
	fout.open("in.txt");
	
	cin>>i;
	fout<<i<<endl;	
	cin>>j;
	fout<<j<<endl;
	
	res=i+j;

	fout.close();
	fout.open("out.txt");

	fout<<res<<endl;
	
	
	ifstream fin;
	fin.open("in.txt");
	int temp;


	fin>>temp;


	cout<<temp<<endl;
												
return 0;
}

