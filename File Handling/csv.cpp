#include<iostream>
#include<cstring>
#include<fstream>
using namespace std;




int main()
{
	/*const char *a="abc";
	int g=10;
	atoi(a,g,10);
	cout<<a;*/
	int ch;	char prn[20],temp[30];
	ofstream fout("demo.csv",ios::app|ios::out);ifstream fin;
	for(int i=0;i<2;i++)
	{
		cout<<"Enter file name";
		cin>>prn;
		fin.open(prn);
		while(fin.eof()==0)
		{
			fin>>temp;
			fout<<temp<<",";
		}
	fout<<endl;
	fin.close();
	}
	fout.close();


return 0;


}

