#include <iostream>
#include <fstream>
using namespace std;

int main()
{/*
	int i=0;
	ofstream fout("a.txt");
	while(i<5)
	{
		char ptr[100];
		cin>>ptr;
		fout<<ptr<<endl;

		++i;
	}fout.close();

//----------------------

    	int i=0; 
	ifstream fin("a.txt");
	char temp[100];
	while(fin>>temp)
	{
		cout<<temp<<","<<endl;	
	}	
	fin.close();
*/

	int i=0;
	fstream newf;
	newf.open("a.txt");
	char name[100];
	while(i<2)
	{
		cin>>name;
		newf<<name<<endl;		
		i++;
	}
	newf.seekg(0);
	
	while(newf>>name)
		cout<<name<<endl;

return 0;
}
