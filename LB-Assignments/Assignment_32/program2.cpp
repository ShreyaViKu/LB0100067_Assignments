/*
accept string from user and convert it into upper case
*/

#include<iostream>
using namespace std;

void strToUpper(char *str)
{
    while(*str != '\0')
    {
        if(*str >= 'a' && *str<= 'z')
        {
            *str = *str - 32;
        }
        str++;
    }
}
int main()
{
    char arr[30] = {'\0'};

    cout<<"Enter string : ";
    cin>>arr;

    strToUpper(arr);

    cout<<"Output String is : "<<arr;

    return 0;
}