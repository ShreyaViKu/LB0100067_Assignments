/*
ip : string
op : number of characters
*/

#include<iostream>
using namespace std;

int CountChar(char str[])
{
    if(str[0] == '\0')
    {
        return 0;
    }

    if((str[0] >= 'a' && str[0] <= 'z') || (str[0] >= 'A' && str[0] <= 'Z'))
    {
        return 1 + CountChar(str + 1);
    }
    return CountChar(str + 1);
}

int CountAlphabate(char str[])
{
    if(str[0] == '\0')
    {
        return 0;
    }

    return 1 + CountChar(str + 1);
}
int main()
{
    int iRet = 0;

    char arr[] = "Shreya* Hello Girl";

    iRet = CountChar(arr);
    cout<<"Total character are : "<<iRet<<endl;

    iRet = CountAlphabate(arr);
    cout<<"Total alphabates are : "<<iRet<<endl;

    return 0;
}