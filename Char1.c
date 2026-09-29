#include<stdio.h>

void Display(char *ptr)
{
    printf("Your name is : %s",ptr);
}
int main()
{
    char Arr[50];

    printf("Enter your name\n");

    scanf("%[^\n]",&Arr);

    Display(Arr);
    return 0;

}