#include<iostream>
#include<fstream>
using namespace std;
/*
int main()
{
	int i=0;
	ofstream fout("a.txt");
	while(i<5)
	{
		char ptr[100];
		cin>>ptr;
		fout<<ptr<<endl;
		++i;
	}fout.close();
	
	
	ifstream fin("a.txt");
	char temp[100];
	while(fin>>temp)
	{
		cout<<temp<<endl;
	}fin.close();
	

}*/
int main()
{
	int i=0;
	fstream fnew;
	fnew.open("a.txt");
	char name[100];
	while(i<2)
	{
	cin>>name;
	fnew<<name<<endl;
	i++;	
	}
	fnew.seekg(0);
	while(fnew>>name)
		cout<<name<<endl;
return 0;
}
