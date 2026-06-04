/* Accept N numbers and return largest of all elments
*/

#include<stdio.h>
#include<stdlib.h>

int Maximum(int Arr[],int iLength)
{
    int iCnt = 0;
    int iMax = Arr[0];

    for(iCnt = 1; iCnt < iLength; iCnt++)
    {
        if(iMax < Arr[iCnt] )
        {
            iMax = Arr[iCnt];
        }  
    }
    return iMax;
}
int main()
{
    int iSize = 0, iCnt = 0;
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

    iRet= Maximum(p, iSize);

    printf("Largest number : %d",iRet);

    free(p);
    
    return 0;
}