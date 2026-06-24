/*
accept string from user and count white spaces not after string
*/

#include<iostream>
using namespace std;

int iCount = 0;

int CountWhite(char *str)
{
    char *start = NULL;
    char *end = NULL;

    int iCount = 0;

    end = str;
    start = str;
    while(*end != '\0')
    {
        end++;
    }
    end--;

    while(*start == ' ')
    {
        start++;
    }
    while((end > start) && *end == ' ')
    {
        end--;
    }

    while(start <= end)
    {
        if(*start == ' ')
        {
            iCount++;
        }
        start++;
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