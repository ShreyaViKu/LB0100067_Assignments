/*
accept string and no. of characters from user and copy the content to another string (strncpy() method implementation)
*/

#include<stdio.h>

void strncpyX(char *str1, char *str2, int iNo)
{
    int iCnt = 0;
    iCnt = 1;

    while(*str1 != '\0' && iCnt <= iNo)
    {
        *str2 = *str1;
        str1++;
        str2++;
        iCnt++;
    }
    *str2 = '\0';
}

int main()
{
    char Arr[50] = {'\0'};
    char Brr[50] = {'\0'};
    int iValue = 0;

    printf("Enter String : \n");
    scanf("%[^'\n']s",Arr);

    printf("Enter number of charaacters to copy : \n");
    scanf("%d",&iValue);

    strncpyX(Arr, Brr,iValue);

    printf("copied string is : %s",Brr);

    return 0;

}