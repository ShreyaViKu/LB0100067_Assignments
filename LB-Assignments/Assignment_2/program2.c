#include<stdio.h>

void Display(int iNo)
{
    int iCnt = iNo;
    //Write updator

    while(iCnt > 0)
    {
        printf("*  ");
        iCnt--;
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}