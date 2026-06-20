/*
Accept character from user and check whether it is Capital or not
*/

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkCapital(char ch)
{
    if(ch >= 'A' && ch <= 'Z')
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

    bRet = ChkCapital(cValue);

    if(bRet)
    {
        printf("%c is a Capital alphabate",cValue);
    }
    else
    {
        printf("%c is not a Capital alphabate",cValue);
    }

    return 0;
}