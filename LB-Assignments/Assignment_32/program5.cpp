/*
accept string from user and count white spaces
*/

#include<iostream>
using namespace std;

int CountWhite(char *str)
{
    int iCount = 0;
    while(*str != '\0')
    {
        if(*str == ' ')
        {
            iCount++;
        }
        str++;
    }
    return iCount;
}
int main()
{
    char arr[30] = {'\0'};
    int iRet = 0;

    cout<<"Enter string : ";
    cin.getline(arr, 30);

    iRet = CountWhite(arr);

    cout<<"White spaces count is : "<<iRet;

    return 0;
}