/*
Accept one number from user and off 7th and 10th bit of that number if it is on 
return modified number
*/
#include<stdio.h>

typedef unsigned int UINT;

UINT OffBit(UINT iNo)
{
    UINT iMask = 0x1;

    iMask = iMask << 6;

    iNo = iNo & (~iMask);

    return iNo;

}
int main()
{
    UINT iValue = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    printf("modified number is : %d\n",OffBit(iValue));

    return 0;
}