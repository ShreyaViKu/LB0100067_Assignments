/*
Accept number from user and off the 7th and 10th bit
of that number and return modified number 
*/
#include<stdio.h>

typedef unsigned int UINT;

UINT OffBits(UINT iNo)
{
    UINT iMask = 0x240;
    UINT iAns = 0;

    iAns = iNo & (~iMask);

    return iAns;
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = OffBits(iValue);

    printf("Modified number is : %d",iRet);

    return 0;
}