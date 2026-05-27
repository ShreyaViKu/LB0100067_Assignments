#include<stdio.h>

int CountDiff(int iNo)
{
    int iOddSum = 0;
    int iEvenSum = 0;
    int iRem = 0;

    while(iNo != 0)
    {
        iRem = iNo % 10;

        if(iRem %2 == 0)
        {
            iEvenSum += iRem;
        }
        else
        {
            iOddSum += iRem;
        }

        iNo = iNo/ 10;
    }

    return (iEvenSum - iOddSum);

}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    iRet = CountDiff(iValue);

    printf("%d",iRet);
    
    return 0;
}

// Time complexity : O(N)