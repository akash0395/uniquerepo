
/*
fstream
w,w+,a+,a   ios::in, ios::out, ios::app, ios::trunk

ifstream  (ios::in)
ofstream  (ios::out)
ifstream  (ios::in | ios::out)
*/

#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main()
{
	
	ostream  cout;
	cout.open("STDOUT",ios::out);
	
	
	ofstream  fout,cout;
	
	fout.open("abc.txt",ios::out);
	
	
	fout<<"hi.."<<endl;
	fout<<"bye.."<<endl;
	fout<<"HI..";
	
	fout.close();	
	
	/////////////////////////////
	ifstream fin;
	fin.open("abc.txt",ios::in);
		
	string line;
	while(fin)
	{
		//fin>>line;		
		getline(fin,line);
		cout<<line<<endl;
		line.clear();
	}
	fin.close();
	return 0;
}





