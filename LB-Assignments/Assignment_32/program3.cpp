/*
accept string from user and toggle lower and upper case
*/

#include<iostream>
using namespace std;

void strToggle(char *str)
{
    while(*str != '\0')
    {
        if(*str >= 'a' && *str<= 'z')
        {
            *str = *str - 32;
        }
        else if(*str >= 'A' && *str<= 'Z')
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
    cin.getline(arr, 30);

    strToggle(arr);

    cout<<"Output String is : "<<arr;

    return 0;
}