/*
Write a program which accepts string from user 
and display it in reverse order
*/
#include<stdio.h>
#include<string.h>

void Reverse(char *str)
{
    int start = 0;
    int end = strlen(str)-1;

    char temp = '\0';

    while(start < end)
    {
        temp = str[start];
        str[start] = str[end];
        str[end] = temp;

        start++;
        end--;
    }
    /*
    int i = strlen(str);
    char brr[i+1];

    int iCnt = i - 1;

    while(*str != '\0')
    {
        brr[iCnt] = *str;
        str++;
        iCnt--;
    }
    brr[i] = '\0';

    printf("%s",brr);
    */

}
int main()
{
    char arr[30] = {'\0'};

    printf("enter string : ");
    scanf("%[^'\n']s",arr);

    Reverse(arr);

    printf("reversed string is : %s",arr);

    return 0;
}