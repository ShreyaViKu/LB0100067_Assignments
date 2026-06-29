/*
Accept number from user and on its 4th bit
*/
#include<iostream>
using namespace std;

typedef unsigned int UINT;

UINT OnBits(UINT iNo)
{
    UINT iMask = 0xf;
    UINT iAns = 0;

    iAns = iNo | iMask;

    return iAns;
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    cout<<"ENter number : \n";
    cin>>iValue;

    iRet = OnBits(iValue);

    cout<<"Modified number is : "<<iRet<<"\n";
    
    return 0;
}