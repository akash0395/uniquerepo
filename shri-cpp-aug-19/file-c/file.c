
#include <stdio.h>
/*
int main()
{
	
	FILE *fp = fopen("abc.txt", "r");
	
	if(fp==NULL)
	{
		printf("ERROR: file not found...");
		return -1;
	}
	
	char arr[100];
	
	fread(arr, 2, 3, fp);
	
	printf("DATA:%s", arr);
	
	fclose(fp);
	
}
*/



/*
int main()
{
	
	FILE *writefp = fopen("D:\\abc.txt", "a");
	FILE *readfp = fopen("D:\\input", "r");
	int i=0;
	//scanf("%d",&i);
	
	fscanf(readfp,"%d",&i);
	printf("i=%d", i);
	
	//fwrite("PUNE", 1, 4, fp);	
	
	//printf("we are in pune...");
	//fprintf(fp,"we are in pune...");
		
	fclose(readfp);
	fclose(writefp);
}
*/

int main()
{
	
	char str[100];
	int i;
	scanf("%d", &i);
		
	//printf("%d", i);
	//fprintf(fp,"%s", str);
	sprintf(str,"I=%d", i);	
	
	printf("%s", str);
}


