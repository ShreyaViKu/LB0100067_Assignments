/* Accept N numbers and Range from user and
display all elements from that range 
*/

#include<stdio.h>
#include<stdlib.h>

void Range(int Arr[],int iLength, int iStart, int iEnd)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] > iStart && Arr[iCnt] < iEnd)
       {
        printf("%d  ",Arr[iCnt]);
       }
    }
}
int main()
{
    int iSize = 0, iCnt = 0, iValue1 = 0, iValue2 =0;
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

    printf("Enter Starting point : ");
    scanf("%d",&iValue1);

    printf("Enter Ending point : ");
    scanf("%d",&iValue2);

    Range(p, iSize, iValue1, iValue2);

    free(p);
    
    return 0;
}