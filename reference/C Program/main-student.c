#include <stdio.h>

#include <stddef.h>
struct student 
{
	char name[20];
	int roll no;
	int age;
	float per;
	
};



int main()
{
	int i,n,noOfStudents;
	printf("#if student:");
	scanf("%d", &noOfStudents);
	
	
	Student *students = populateStudents(noOfStudents);
	
	printAllStudents(students);

	Student *younger = getYoungerStudent(students);
	printStudentDetails(younger);

	Student *elder = getElderStudent(students);
	printStudentDetails(elder);

	free(students);
	
	return 0;
}
  







