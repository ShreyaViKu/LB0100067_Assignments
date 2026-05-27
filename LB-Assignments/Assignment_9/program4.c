#include<stdio.h>

int MultDigits(int iNo)
{
    int iMult = 1;
    int iRem = 0;

    while(iNo != 0)
    {
        iRem = iNo % 10;

        if(iRem != 0)
        {
            iMult = iMult * iRem;
        }

        iNo = iNo/ 10;
    }

    return iMult;

}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    iRet = MultDigits(iValue);

    printf("%d",iRet);
    
    return 0;
}
// Time Complexity : O(N)