/* Accept N numbers from user and another no
and return frequency of no from it
*/

#include<stdio.h>
#include<stdlib.h>

int Frequency(int Arr[],int iLength, int iNo)
{
    int iCnt = 0;
    int iFre = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            iFre++;
        }

    }
    return iFre;
}
int main()
{
    int iSize = 0,iValue = 0, iCnt = 0;
    int * p = NULL;
    int iRet = 0;

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
    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet= Frequency(p, iSize, iValue);

    printf("%d is frequency of 11",iRet);

    free(p);
    
    return 0;
}