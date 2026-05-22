#include<stdio.h>

void TableRev(int iNo)
{
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    int iCnt = 0;
    
    for(iCnt = 10; iCnt > 0; iCnt--)
    {
        printf("%d ",(iCnt * iNo));
    }
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    TableRev(iValue);

    return 0;
}

// TC : O(1)