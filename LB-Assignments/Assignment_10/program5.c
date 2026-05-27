#include<stdio.h>

double SquareMeter(int ivalue)
{
    double dRet = 0;

    dRet = ivalue * 0.0929f;

    return dRet;
}

int main()
{
    int iValue = 0;
    double dRet = 0.0;

    printf("Enter area in sq. feet : ");
    scanf("%d",&iValue);

    dRet = SquareMeter(iValue);

    printf(" Area in sq. meter is %lf",dRet);

    return 0;
}
