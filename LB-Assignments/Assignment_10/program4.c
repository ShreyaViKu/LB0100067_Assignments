#include<stdio.h>

double FhtoCs(float fTemp)
{
    double dRet = 0;

    dRet = ((fTemp - 32) * (5.0f / 9.0f));

    return dRet;
}

int main()
{
    float fValue = 0.0f;
    double dRet = 0.0;

    printf("Enter temp in Fh : ");
    scanf("%f",&fValue);

    dRet = FhtoCs(fValue);

    printf(" Temp in CS is %lf",dRet);

    return 0;
}
