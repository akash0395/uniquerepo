

#include <iostream>
#include <fstream>
using namespace std;


int main()
{

	//Writing into file...
	/*	
	int i=0;
	ofstream fout("a.txt", ios::out);
	
	while(i++ < 5)
	{
		char tmp[1000];
		cin>>tmp;
		fout<<tmp<<endl;
	}
	fout.close();
	*/


	//Reading from file...

	/*int i=0;
	ifstream fin("a.txt", ios::in);

	char tmp[1000];	
	while(fin>>tmp)
	{
		cout<<tmp<<endl;
	}
	fin.close();*/



	//using fstream
	fstream ff;
	ff.open("a.txt");

	char tmp[1000];
	int i=0;
	while(i++ < 5)
	{
		cin>>tmp;
		ff<<tmp<<endl;
	}
	
	ff.seekg(0);

	while(ff>>tmp)
	{
		cout<<tmp<<endl;
	}
}



