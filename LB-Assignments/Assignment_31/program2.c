/*
Write a program which accepts string from user 
and count number of small characters
*/
#include<stdio.h>

int CountSmall(char *str)
{
    int iCount = 0;
    while(*str != '\0')
    {
        if(*str >= 'a' && *str <= 'z')
        {
            iCount++;
        }
        str++;
    }
    return iCount;

}
int main()
{
    char arr[20] ={'\0'};
    int iRet = 0;

    printf("Enter String : ");
    scanf("%[^'\n']s",arr);

    iRet = CountSmall(arr);

    printf("Small Characters are : %d",iRet);

    return 0;
}