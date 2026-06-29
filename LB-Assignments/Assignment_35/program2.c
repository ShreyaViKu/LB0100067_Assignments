/*
accept number from user and check whether 
5th and 18th bit is on or off
*/
#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;
typedef unsigned int UINT;

BOOL ChkBit(UINT iNo)
{
    UINT iMask = 0x20010, iAns = 0x0;
    BOOL bResult = FALSE;

    iAns = iMask & iNo;

    if(iAns == iMask)
    {
        bResult = TRUE;
    }
    return bResult;

}
int main()
{
    UINT iValue = 0;
    BOOL bRet = FALSE;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    bRet = ChkBit(iValue);

    if(bRet)
    {
        printf("Bit is on\n");
    }
    else
    {
        printf("Bit is off\n");
    }
    return 0;
}