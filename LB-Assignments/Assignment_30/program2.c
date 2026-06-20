/*
Write program which Accepts character from user.
if character is small it displays its corresponding capital character
and vice versa
if not alphabate then as it is diplay case sensitive
*/

#include<stdio.h>

char Display(char ch)
{
    if(ch >= 'A' && ch <= 'Z')
    {
        ch = ch + 32;
    }
    else if(ch >= 'a' && ch <= 'z')
    {
        ch = ch - 32;
    }

    return ch;

}

int main()
{
    char cValue = '\0';
    char cRet = '\0';

    printf("Enter character : ");
    scanf("%c",&cValue);

    cRet = Display(cValue);

    printf("Oputput is : %c",cRet);

    return 0;
}