/*
accept string from user and copy the content to another string (strcpy() method implementation)
*/

#include<stdio.h>

void strcpyX(char *str1, char *str2)
{
    while(*str1 != '\0')
    {
        *str2 = *str1;
        str1++;
        str2++;
    }
    *str2 = '\0';
}

int main()
{
    char Arr[50] = {'\0'};
    char Brr[50] = {'\0'};

    printf("Enter String : \n");
    scanf("%[^'\n']s",Arr);

    strcpyX(Arr, Brr);

    printf("copied string is : %s",Brr);

    return 0;

}