#include<stdio.h>

int WhiteSpaces(char str[])
{
    static int iCount = 0;

    if(*str != '\0')
    {
        if(*str == ' ')
        {
            iCount++;
        }
        WhiteSpaces(str+1);
    }
    return iCount;
}

int MaxDigit(int iNo)
{
    static int iMax = 0;

    if(iNo != 0)
    {
        if(iNo%10 > iMax)
        {
            iMax = iNo%10;
        }
        MaxDigit(iNo/10);
    }
    return iMax;
}

int SamllChar(char str[])
{
    static int iCount = 0;

    if(*str != '\0')
    {
        if(*str >'a' && *str <'z')
        {
            iCount++;
        }
        SamllChar(str+1);
    }
    return iCount;
}

int MinDigit(int iNo)
{
    static int iMin = 9;

    if(iNo != 0)
    {
        if(iNo%10 < iMin)
        {
            iMin = iNo%10;
        }
        MinDigit(iNo/10);
    }
    return iMin;
}

int Reverse(int iNo)
{
    static int iReverse = 0;

    if(iNo != 0)
    {
        iReverse = (iReverse*10) + (iNo%10);
        Reverse(iNo/10);
    }
    return iReverse;
}

int main()
{
    int iValue = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    printf("Reverse number is : %d\n",Reverse(iValue));

    return 0;
}