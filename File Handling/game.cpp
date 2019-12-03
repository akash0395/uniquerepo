#include <iostream>
#include <fstream>
using namespace std;

int main()
{
	int i=0,temp[20],temp2[20],num[3];
	ofstream fout("a.txt");
	while(i<5)
	{
		cin>>temp[i];
		fout<<temp[i]<<endl;
		++i;
	}

	cout<<"Enter the number :"<<endl;
	int j=0;	
	while(j<3)	
	{
		cin>>num[j];
	j++;
	}

	ifstream fin("a.txt");
	i=0;
	while(i<5)
	{
		fin>>temp2[i];
		i++;
	}
	cout<<"------"<<endl;
	fout<<"------"<<endl;
	j=0;
	for(j=0;j<3;j++)
	{
		for(i=0;i<5;i++)
		{	temp2[i]=temp2[i]+num[j];
			fout<<temp2[i]<<endl;	
			cout<<temp2[i]<<endl;
		}cout<<"-----------"<<endl;
	fout<<"-----------"<<endl;

	}

	fout.close();



return 0;
}
