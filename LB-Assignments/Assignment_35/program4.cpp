/*
Accept number from user and check whether 
7th 8th and 9th bit is on or off
*/
#include<iostream>
using namespace std;

typedef unsigned int UINT;

bool ChkBits(UINT iNo)
{
    UINT iMask = 0x1c0;
    bool bResult = false;
    UINT iAns = 0;

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

    cout<<"Enter number :\n";
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