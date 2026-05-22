#include<stdio.h>

void Display(int iNo, int iFrequency)
{
    int Cnt =0;

    for(Cnt; Cnt<iFrequency; Cnt++)
    {
        printf("%d  ", iNo);
    }
}

int main()
{
    int iValue =0;
    int iCount =0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    printf("Enter frequency : ");
    scanf("%d",&iCount);

    Display(iValue, iCount);

    return 0;
}