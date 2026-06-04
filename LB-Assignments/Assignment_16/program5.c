/* Accept N numbers and 
Display all numbers containing 3 digits in it
*/

#include<stdio.h>
#include<stdlib.h>

void DigitsSum(int Arr[],int iLength)
{
    int iCnt = 0;
    int iDigiSum = 0, iNo = 0;

    printf("Summation of digits of numbers are :\n");

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        iDigiSum = 0;
        iNo = Arr[iCnt];
        while(iNo != 0)
        {
            iDigiSum += (iNo % 10);

            iNo = iNo / 10;
        }
        printf("%d  ",iDigiSum);
    }
}
int main()
{
    int iSize = 0, iCnt = 0;
    int * p = NULL;

    printf("Enter Size of Array : \n");
    scanf("%d",&iSize);

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory \n");
        return -1;
    }

    printf("Enter %d numbers :\n",iSize);

    for(iCnt = 0; iCnt< iSize; iCnt++)
    {
        printf("Enter %d element : ",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    DigitsSum(p,iSize);

    free(p);
    
    return 0;
}