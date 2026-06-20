/*
Write program which Accepts character from user.
to check whether character is special symbol or not
*/

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkSpecial(char ch)
{
    BOOL bRet = FALSE;

    if(ch >= '!' && ch <= '/')
    {
        bRet = TRUE;
    }

    return bRet;
}

int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter character : ");
    scanf("%c",&cValue);
    
    bRet = ChkSpecial(cValue);

    if(bRet)
    {
        printf("It is Special character");
    }
    else
    {
        printf("It is not a special character");
    }

    return 0;
}