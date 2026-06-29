/*
Accept number from user and check whether
15th bit is on or off
*/
#include<stdio.h>

typedef unsigned int UNIT;
typedef int BOOL;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UNIT iNo)
{
    BOOL bRet = FALSE;

    UNIT iMask = 0x1;

    iMask = iMask << 14;

    if(iMask == (iNo & iMask))
    {
        bRet = TRUE;
    }
    return bRet;
}

int main()
{
    UNIT iValue = 0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    if(ChkBit(iValue))
    {
        printf("Bit is on\n");
    }
    else
    {
        printf("Bit is off\n");
    }

    return 0;
}