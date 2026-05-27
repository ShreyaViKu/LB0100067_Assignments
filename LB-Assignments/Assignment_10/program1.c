#include<stdio.h>

double CircleArea(float fRadius)
{
    const float PI = 3.14;

    double dArea = 0.0;

    dArea = PI * fRadius * fRadius;

    return dArea;

}
int main()
{
    float fValue = 0.0f;
    double dRet = 0.0;

    printf("Enter radius : ");
    scanf("%f",&fValue);

    dRet = CircleArea(fValue);

    printf("%lf is Area of circle",dRet);

    return 0;
}