/* Accept N numbers from user and return difference between summation
of even elements and sum of odd elements
*/

#include<stdio.h>
#include<stdlib.h>

int Difference(int Arr[],int iLength)
{
    int iDiff = 0;
    int iCnt = 0;
    int iSumEven =0, iSumOdd = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] % 2 == 0)
        {
            iSumEven += Arr[iCnt];
        }
        else
        {
            iSumOdd += Arr[iCnt];
        }

    }
    return iSumEven - iSumOdd;
}
int main()
{
    int iSize = 0, iCnt = 0, iRet = 0;
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
    iRet= Difference(p, iSize);

    printf("Result is %d ",iRet);

    return 0;
}