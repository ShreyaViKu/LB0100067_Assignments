/*
Accept number from user and toggle 7th bit of number
*/
#include<iostream>
using namespace std;

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
{
    UINT iMask = 0x40;
    UINT iAns = 0;

    iAns = iNo ^ iMask;

    return iAns;
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    cout<<"ENter number : \n";
    cin>>iValue;

    iRet = ToggleBit(iValue);

    cout<<"Modified number is : "<<iRet<<"\n";
    
    return 0;
}