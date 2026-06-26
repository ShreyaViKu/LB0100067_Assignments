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

void InsertFirst(PPNODE Head, int no)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));
    newn->data = no;
    newn->next = NULL;

    if(*Head == NULL) // linkedlist is empty
    {
        *Head = newn;
    }
    else
    {
        newn->next = *Head;
        *Head = newn;
    }
}
void InsertLast(PPNODE Head, int no)
{
    PNODE newn = NULL;
    PNODE temp = *Head;
    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = no;
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

int CountNode(PNODE Head)
{
    int iCount = 0;
    while(Head != NULL)
    {
        iCount++;
        Head = Head->next;
    }
    return iCount;

}

int main()
{
    int iRet = 0;

    PNODE first = NULL;

    InsertFirst(&first,51);
    InsertFirst(&first,61);

    Display(first);

    printf("\n");

    printf("count is : %d\n",CountNode(first));

    InsertLast(&first,71);
    InsertFirst(&first,81);

    printf("\n");

    printf("count is : %d\n",CountNode(first));

    Display(first);
    return 0;
}