#include"Watch.h"
#include"TitanWatch.h"
#include"Fastrack.h"
#include<iostream>
#include<ostream>
using namespace std;

int main()
{
	//Watch * ed= new Watch();
	//cout<<*ed<<endl;

	Watch *titanWatch=new TitanWatch("Titan",8000);
	cout<<*titanWatch<<endl;
	
	titanWatch->setmode(0);
	
	Watch *fastTrackWatch=new FastTrackWatch("Fastrack",9000);
	cout<<*fastTrackWatch<<endl;

	fastTrackWatch->setmode(1);

	titanWatch->PlayAlarm();
	//delete titanWatch;
	//delete fastTrackWatch;

	TitanWatch s1("Titan-Sangam",8500);
	TitanWatch s2("Titan-pancham",8100);
	cout<<s1<<s2<<endl;
	if(s1>s2)
	cout<<"sangam is > pancham"<<endl;
	FastTrackWatch s3("FastTrack-World",12000);
	cout<<s3;



}
