
class Student
{
public:
	int age;
	float percentage;
	
public:
	char *name;
	Student();
	~Student();
	Student(int,float,const char *);
	void display();
	void accept();

};
