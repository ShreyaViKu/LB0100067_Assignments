#include<stdio.h>

int CountRange(int iNo)
{
    int iCnt = 0;
    int iRem = 0;

    while(iNo != 0)
    {
        iRem = iNo % 10;

        if(iRem > 3 && iRem < 7)
        {
            iCnt++;
        }

        iNo = iNo/ 10;
    }

    return iCnt;

}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    iRet = CountRange(iValue);

    printf("%d",iRet);
    
    return 0;
}