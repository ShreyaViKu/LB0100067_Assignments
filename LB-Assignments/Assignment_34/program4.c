/*
accept string and no. of characters from user and copy the small letters to another string 
*/

#include<stdio.h>

void strcpySmall(char *str1, char *str2)
{
    while(*str1 != '\0')
    {
        if(*str1 >= 'a' && *str1 <= 'z')
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

    strcpySmall(Arr,Brr);

    printf("copied Small string is : %s",Brr);

    return 0;

}