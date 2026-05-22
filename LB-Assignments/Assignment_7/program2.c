#include<stdio.h>

int DollerToINR(int iNo)
{
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    
    return (iNo * 70);
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    iRet = DollerToINR(iValue);

    printf("Value in INR is : %d ",iRet);

    return 0;
}
