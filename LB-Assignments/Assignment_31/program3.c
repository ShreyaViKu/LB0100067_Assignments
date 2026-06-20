/*
Write a program which accepts string from user 
and return difference between count of small and capital characters
*/
#include<stdio.h>

int Difference(char *str)
{
    int iCountSmall = 0, iCountCapital = 0;
    while(*str != '\0')
    {
        if(*str >= 'a' && *str <= 'z')
        {
            iCountSmall++;
        }
        else if(*str >= 'A' && *str <= 'Z')
        {
            iCountCapital++;
        }
        str++;
    }
    return iCountSmall-iCountCapital;

}
int main()
{
    char arr[20] ={'\0'};
    int iRet = 0;

    printf("Enter String : ");
    scanf("%[^'\n']s",arr);

    iRet = Difference(arr);

    printf("Difference is : %d",iRet);

    return 0;
}