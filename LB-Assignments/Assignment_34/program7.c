#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

typedef struct Node NODE;
typedef struct Node * PNODE;
typedef struct Node ** PPNODE;

void InsertFirst(PPNODE Head, int iNo)
{
    PNODE newn = NULL;
    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;

    if(*Head == NULL)
    {
        *Head = newn;
    }
    else
    {
        newn->next = *Head;
        *Head = newn;
    }
}

void InsertLast(PPNODE Head, int iNo)
{
    PNODE newn = NULL;
    PNODE temp = *Head;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;

    if(*Head == NULL)
    {
        *Head = newn;
    }
    else
    {
        while(temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newn;
    }
}

void Display(PNODE Head)
{
    while(Head != NULL)
    {
        printf("%d\t",Head->data);
        Head = Head->next;
    }
}

int SumData(PNODE Head)
{
    int iSum = 0;

    while(Head != NULL)
    {
        iSum = iSum+(Head->data);
        Head = Head->next;
    }
    return iSum;
}

int Search(PNODE Head, int iNo)
{
    int iVal = 0;

    while(Head != NULL)
    {
        if(Head->data == iNo)
        {
            iVal = 1;
            break;
        }
        Head = Head->next;
    }
    return iVal;
}

int main()
{
    PNODE first = NULL;
    int iValue = 0, iRet = 0;

    InsertFirst(&first, 2);
    InsertFirst(&first, 1);

    Display(first);
    printf("\n");

    InsertLast(&first, 3);
    InsertLast(&first, 4);
    InsertLast(&first, 5);

    Display(first);
    printf("\n");

    printf("sum of data is : %d\n",SumData(first));

    printf("Enter number to be searched : \n");
    scanf("%d",&iValue);

    iRet = Search(first, iValue);

    if(iRet == 1)
    {
        printf("Found number ");
    }
    else
    {
        printf("Not found number ");
    }

    return 0;
}