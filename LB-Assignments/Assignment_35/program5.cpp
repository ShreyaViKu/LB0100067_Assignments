/*
Accpet number from user and check whether 
1st and last 32 bit are on or off
*/
#include<iostream>
using namespace std;

typedef unsigned int UINT;

bool ChkBits(UINT iNo)
{
    UINT iMask = 0x80000001;
    UINT iAns = 0;
    bool bResult = false;

    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        bResult = true;
    }
    return bResult;
}

int main()
{
    UINT iValue = 0;
    bool bRet = false;

    cout<<"Enter number : \n";
    cin>>iValue;

    bRet = ChkBits(iValue);

    if(bRet)
    {
        cout<<"Bits are on\n";
    }
    else
    {
        cout<<"Bits are off\n";
    }

    return 0;
}