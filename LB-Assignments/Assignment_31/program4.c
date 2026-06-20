/*
Write a program which accepts string from user 
and check whether it contains vowels in it or not
*/
#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkVowel(char *str)
{
    BOOL bRet = FALSE;

    while(*str != '\0')
    {
        if(*str == 'a' || *str == 'e' || *str == 'i' || *str == 'o' || *str == 'u' ||
           *str == 'A' || *str == 'E' || *str == 'I' || *str == 'O' || *str == 'U' )
        {
            bRet = TRUE;
            break;
        }
        str++;
    }
    return bRet;
}
int main()
{
    char arr[20] ={'\0'};
    BOOL bRet = FALSE;

    printf("Enter String : ");
    scanf("%[^'\n']s",arr);

    bRet = ChkVowel(arr);

    if(bRet)
    {
        printf("Contains vowel");
    }
    else
    {
        printf("There is no vowel");
    }

    return 0;
}