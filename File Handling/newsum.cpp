#include<iostream>
#include<fstream>
using namespace std;

int main()
{
int result=0,i,j;

cout<<"Enter two num:"<<endl;
ofstream fout;
fout.open("b.txt");


cin>>i;
fout<<i<<endl;
cin>>j;
fout<<j<<endl;

result=i+j;
fout.close();
fout.open("c.txt");
fout<<result<<endl;

ifstream fin;
fin.open("b.txt");
int temp;
fin>>temp;


	cout<<temp<<endl;
												
return 0;
}
