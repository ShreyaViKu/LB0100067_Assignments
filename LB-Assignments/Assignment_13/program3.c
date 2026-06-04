/* Accept N numbers from user and display all elements divisible by 5 and are even
*/

#include<stdio.h>
#include<stdlib.h>

void Display(int Arr[],int iLength)
{
    int iCnt = 0;

    printf("Even Elements divisible by 5 are :\n");

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] % 5 == 0 && Arr[iCnt] % 2 == 0)
        {
            printf("%d  ",Arr[iCnt]);
        }
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

    Display(p, iSize);

    free(p);
    
    return 0;
}