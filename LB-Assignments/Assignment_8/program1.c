#include<stdio.h>

double CircleArea(float fRadius)
{
    if(fRadius < 0)
    {
        fRadius = -fRadius;
    }
    
    const float PI = 3.14;
    double dArea = 0;

    dArea = PI * fRadius * fRadius;

    return dArea;
}

int main()
{
    float fValue = 0;
    double dRet = 0;

    printf("Enter Number : ");
    scanf("%f",&fValue);

    dRet = CircleArea(fValue);

    printf("Area of Circle is : %lf ",dRet);

    return 0;
}

// O(N)