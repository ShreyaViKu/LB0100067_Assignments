/*
accept string from user and display only digits
*/

#include<iostream>
using namespace std;

void DisplayDigit(char *str)
{
    while(*str != '\0')
    {
        if(*str >= '0' && *str <= '9')
        {
            cout<<*str<<"\t";
        }
        str++;
    }
}
int main()
{
    char arr[30] = {'\0'};

    cout<<"Enter string : ";
    cin.getline(arr, 30);

    DisplayDigit(arr);

    return 0;
}