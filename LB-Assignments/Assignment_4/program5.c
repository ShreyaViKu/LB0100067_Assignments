#include<stdio.h>

int FactDiff(int iNo)
{
    int iCnt = 0;
    int iSumFact = 0;
    int iSumNonFact = 0;
    
    for(iCnt = 1; iCnt < iNo; iCnt++)
    {
        if(iNo % iCnt != 0)
        {
            iSumNonFact += iCnt;
        }
    }
    for(iCnt = 1; iCnt < iNo; iCnt++)
    {
        if(iNo % iCnt == 0)
        {
            iSumFact += iCnt;
        }
    }
    return (iSumFact - iSumNonFact);
}

int main()
{
    int iValue =0;
    int iRet =0;

    printf("enter number : ");
    scanf("%d",&iValue);

    iRet =FactDiff(iValue);

    printf("%d",iRet);

    return 0;
}