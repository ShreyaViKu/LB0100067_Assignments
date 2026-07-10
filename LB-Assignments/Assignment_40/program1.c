/*
Singly Linear LinkedList functions
1. Display only odd elements 
2. First Occurance position
3. Last Occurance position
4. count numbers greater than x
5. count numbers less than x
*/

#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node * next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

void Display(PNODE first)
{
    while(first != NULL)
    {
        printf("| %d | -> ",first->data);
        first = first->next;
    }
    printf("NULL\n");
}

void InsertFirst(PPNODE first, int iNo)
{
    PNODE newn = NULL;
    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;

    if(NULL == *first)
    {
        *first = newn;
    }
    else
    {
        newn->next = *first;
        *first = newn;
    }
}

void DisplayOdd(PNODE first)
{
    printf("Odd elements are : \n");

    while(first != NULL)
    {
        if(first->data %2 != 0)
        {
            printf("%d\t",first->data);
        }
        first = first->next;
    }
    printf("\n");
}

int FirstOccur(PNODE first, int iNo)
{
    int iCnt = 0;

    iCnt = 1;
    while(first != NULL)
    {
        if(first->data == iNo)
        {
            return iCnt;
        }

        iCnt++;
        first= first->next;
    }
    return -1;
}
int LastOccur(PNODE first, int iNo)
{
    int iCnt = 0, iRet = 0;

    iCnt = 1;
    while(first != NULL)
    {
        if(first->data == iNo)
        {
            iRet = iCnt;
        }

        iCnt++;
        first= first->next;
    }
    return iRet;
}

int CountGreater(PNODE first, int iNo)
{
    int iCnt = 0;

    while(first != NULL)
    {
        if(first->data > iNo)
        {
            iCnt++;
        }

        first= first->next;
    }
    return iCnt;
}

int CountLess(PNODE first, int iNo)
{
    int iCnt = 0;

    while(first != NULL)
    {
        if(first->data < iNo)
        {
            iCnt++;
        }

        first= first->next;
    }
    return iCnt;
}
int main()
{
    PNODE head = NULL;
    int iRet = 0, iValue = 0;

    InsertFirst(&head, 111);
    InsertFirst(&head, 22);
    InsertFirst(&head, 53);
    InsertFirst(&head, 88);
    InsertFirst(&head, 53);
    InsertFirst(&head, 11);

    Display(head);

    DisplayOdd(head);

    Display(head);

    printf("Enter element for finding first occurance : \n");
    scanf("%d",&iValue);

    iRet = FirstOccur(head, iValue);

    printf("First occurance of %d is at position %d\n",iValue, iRet);

    printf("Enter element for finding Last occurance : \n");
    scanf("%d",&iValue);

    iRet = LastOccur(head, iValue);

    printf("Last occurance of %d is at position %d\n",iValue, iRet);

    printf("Enter Number for finding greater numbers than it : \n");
    scanf("%d",&iValue);

    iRet = CountGreater(head, iValue);

    printf("Numbers greater than %d are : %d\n",iValue, iRet);

    printf("Enter Number for finding smaller numbers than it : \n");
    scanf("%d",&iValue);

    iRet = CountLess(head, iValue);

    printf("Numbers Smaller than %d are : %d\n",iValue, iRet);

    return 0;
}