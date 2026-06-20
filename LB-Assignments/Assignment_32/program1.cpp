/*
accept string from user and convert it into lower case
*/

#include<iostream>
using namespace std;

void strToLower(char *str)
{
    while(*str != '\0')
    {
        if(*str >= 'A' && *str<= 'Z')
        {
            *str = *str + 32;
        }
        str++;
    }
}
int main()
{
    char arr[30] = {'\0'};

    cout<<"Enter string : ";
    cin>>arr;

    strToLower(arr);

    cout<<"Output String is : "<<arr;

    return 0;
}