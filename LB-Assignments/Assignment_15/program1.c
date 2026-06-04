/* Accept N numbers and no from user and check 
whether it contains no in it or not
*/

#include<stdio.h>
#include<stdlib.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL Check(int Arr[],int iLength, int iNo)
{
    int iCnt = 0;
    BOOL bRet = FALSE;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            bRet = TRUE;
            break;
        }

    }
    return bRet;
}
int main()
{
    int iSize = 0, iCnt = 0, iValue = 0;
    int * p = NULL;
    BOOL bRet = FALSE;

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

    printf("Enter element to check : ");
    scanf("%d",&iValue);

    bRet= Check(p, iSize, iValue);

    if(bRet == TRUE)
    {
        printf("%d is present \n",iValue);
    }
    else
    {
        printf("%d is absent\n",iValue);
    }

    free(p);
    
    return 0;
}