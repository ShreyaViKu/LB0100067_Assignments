/*
Write program which displays ASCII table. 
table contains symbol, Decimal, Hexadecimal and Octal Representation
of every member from 0 to 255
*/

#include<stdio.h>

void DisplayASCII()
{
    int iCnt = 0;

    printf("Symbol\tDecimal\tHexadecimal\tOctal\n");

    for(iCnt = 0; iCnt <= 255; iCnt++)
    {
        printf("%c\t%d\t%X\t%o\n",iCnt,iCnt,iCnt,iCnt);
    }
}

int main()
{
    DisplayASCII();

    return 0;
}