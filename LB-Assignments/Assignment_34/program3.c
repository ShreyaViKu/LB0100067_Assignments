/*
accept string and no. of characters from user and copy the capital letters to another string 
*/

#include<stdio.h>

void strcpyCap(char *str1, char *str2)
{
    while(*str1 != '\0')
    {
        if(*str1 >= 'A' && *str1 <= 'Z')
        {
            *str2 = *str1;
            str2++;
        }
        str1++;
    }
    *str2 = '\0';
}

int main()
{
    char Arr[50] = {'\0'};
    char Brr[50] = {'\0'};

    printf("Enter String : \n");
    scanf("%[^'\n']s",Arr);

    strcpyCap(Arr,Brr);

    printf("copied Capital string is : %s",Brr);

    return 0;

}