/*
Write program which Accepts character from user.
Display its ASCII value in decimal, octal, hexadecimal format
*/

#include<stdio.h>

void Display(char ch)
{
    printf("Decimal : %d\n",ch);
    printf("Octal : %o\n",ch);
    printf("Hexadecimal : %X\n",ch);
}

int main()
{
    char cValue = '\0';

    printf("Enter character : ");
    scanf("%c",&cValue);
    
    Display(cValue);

    return 0;
}