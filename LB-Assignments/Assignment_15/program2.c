/* Accept N numbers and no from user and
return index of first occurance of that no
*/

#include<stdio.h>
#include<stdlib.h>

int FirstOcc(int Arr[],int iLength, int iNo)
{
    int iCnt = 0;
    int iIndex = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            iIndex = iCnt;
            break;
        }
        else
        {
            iIndex = -1;
        }
    }
    return iIndex;
}
int main()
{
    int iSize = 0, iCnt = 0, iValue = 0;
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

    printf("Enter element to check : ");
    scanf("%d",&iValue);

    iRet= FirstOcc(p, iSize, iValue);

    if(iRet == -1)
    {
        printf("There is no such element");
    }
    else
    {
        printf("First occurance of number is %d",iRet);
    }

    free(p);
    
    return 0;
}