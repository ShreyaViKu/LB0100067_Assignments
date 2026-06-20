/*
Input : iRow = 4  iCol = 4
1  2  3  4
-1 -2 -3 -4
1  2  3  4
-1 -2 -3 -4 

*/

#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0, j = 0;
    int iNo = 0;

    for(i =1; i <= iRow; i++)
    {
        for(j = 1, iNo = i; j <= iCol; j++,iNo++)
        {
            printf("%d\t",iNo);
        }
        printf("\n");
    }
}

int main()
{
    int iValue1= 0, iValue2 = 0;

    printf("Enter number of Rows : \n");
    scanf("%d",&iValue1);

    printf("Enter number of columns : \n");
    scanf("%d",&iValue2);

    Pattern(iValue1,iValue2);

    return 0;
}