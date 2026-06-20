/*
Accept character from user and check whether it is alphabate or not
*/

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkAlpha(char ch)
{
    if((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z'))
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter the character : ");
    scanf("%c",&cValue);

    bRet = ChkAlpha(cValue);

    if(bRet)
    {
        printf("%c is a alphabate",cValue);
    }
    else
    {
        printf("%c is not a alphabate",cValue);
    }

    return 0;
}