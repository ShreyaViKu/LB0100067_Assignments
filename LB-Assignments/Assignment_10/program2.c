#include<stdio.h>

double RectArea(float fWidth, float fHeight)
{
    double dArea = 0.0;
    
    if(fWidth < 0)
    {
        fWidth = -fWidth;
    }
    if(fHeight < 0)
    {
        fHeight = -fHeight;
    }

    dArea = fWidth * fHeight;

    return dArea;

}
int main()
{
    float fValue1 = 0.0f;
    float fValue2 = 0.0f;
    double dRet = 0.0;

    printf("Enter Width : \n");
    scanf("%f",&fValue1);

    printf("Enter Height : \n");
    scanf("%f",&fValue2);


    dRet = RectArea(fValue1, fValue2);

    printf("%lf is Area of Rectangle",dRet);

    return 0;
}