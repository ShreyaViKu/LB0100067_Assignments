/*
accept 2 string from user and concat second string to first string (strcat())
*/

#include<stdio.h>

void strcatX(char *str1, char *str2)
{
    while(*str1 != '\0')
    {
        str1++;
    }

    while(*str2 != '\0')
    {
        *str1 = *str2;
        str2++;
        str1++;
    }
    *str1 = '\0';
}

int main()
{
    char Arr[50] = {'\0'};
    char Brr[50] = {'\0'};

    printf("Enter first String : \n");
    scanf("%[^'\n']",Arr);

    getchar();

    printf("Enter second String : \n");
    scanf("%[^'\n']",Brr);

    strcatX(Arr,Brr);

    printf("concated string is : %s",Arr);

    return 0;

}