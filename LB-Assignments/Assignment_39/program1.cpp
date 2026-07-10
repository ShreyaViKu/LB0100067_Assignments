/*
Singly Linear LinkedList functions
1. Search the element 
2. Count Even Numbers
3. Count Odd Numbers
4. Count frequency of give number
5. Display even elements
*/
#include<iostream>
using namespace std;

struct node 
{
    int data;
    struct node * next;
};

typedef struct node NODE;
typedef struct node * PNODE;

class SinglyLL
{
    private:
         PNODE first;
         int iCount;
    
    public:
        SinglyLL();
        void InsertFirst(int iNo);
        void Display();
        bool Search(int iNo);
        int CountEven();
        int CountOdd();
        int Frequency(int iNo);
        void DisplayEven();

};

SinglyLL :: SinglyLL()
{
    this->first = NULL;
    this->iCount = 0;
}

void SinglyLL :: InsertFirst(int iNo)
{
    PNODE newn = NULL;
    newn = new NODE;

    newn->data = iNo;
    newn->next = NULL;

    if(this->first == NULL)
    {
        this->first = newn;
    }
    else
    {
        newn->next = this->first;
        this->first = newn;
    }
    this->iCount++;
}

void SinglyLL :: Display()
{
    PNODE temp = NULL;

    int i = 0;
    for(i = 1,temp = this->first; i <= iCount; i++,temp = temp->next)
    {
        cout<<"| "<<temp->data<<" | -> ";
    }
    cout<<"NULL\n";
}

bool SinglyLL :: Search(int iNo)
{
    PNODE temp = NULL;
    temp = this->first;

    bool bRet = false;

    while(temp != NULL)
    {
        if(temp->data == iNo)
        {
            bRet = true;
            break;
        }
        temp = temp->next;
    }
    return bRet;
}

int SinglyLL :: CountEven()
{
    PNODE temp = NULL;
    temp = this->first;

    int iCount = 0;

    while(temp != NULL)
    {
        if(temp->data % 2 == 0)
        {
            iCount++;
        }
        temp = temp->next;
    }
    return iCount;
}

int SinglyLL :: CountOdd()
{
    PNODE temp = NULL;
    temp = this->first;

    int iCount = 0;

    while(temp != NULL)
    {
        if(temp->data % 2 != 0)
        {
            iCount++;
        }
        temp = temp->next;
    }
    return iCount;
}

int SinglyLL :: Frequency(int iNo)
{
    PNODE temp = NULL;
    temp = this->first;

    int iCount = 0;

    while(temp != NULL)
    {
        if(temp->data == iNo)
        {
            iCount++;
        }
        temp = temp->next;
    }
    return iCount;
}

void SinglyLL :: DisplayEven()
{
    PNODE temp = NULL;
    temp = this->first;

    while(temp != NULL)
    {
        if(temp->data % 2 == 0)
        {
            cout<<temp->data<<"\t";
        }
        temp = temp->next;
    }
    cout<<"\n";
}

int main()
{
    SinglyLL sobj;

    sobj.InsertFirst(68);
    sobj.InsertFirst(51);
    sobj.InsertFirst(11);
    sobj.InsertFirst(44);
    sobj.InsertFirst(22);
    sobj.InsertFirst(11);

    sobj.Display();

    if(sobj.Search(100))
    {
        cout<<"TRUE\n";
    }
    else
    {
        cout<<"FALSE\n";
    }

    cout<<"Even number count is : "<<sobj.CountEven()<<endl;

    cout<<"Odd number count is : "<<sobj.CountOdd()<<endl;

    cout<<"Frequency of Given number is : "<<sobj.Frequency(11)<<endl;

    sobj.DisplayEven();

    return 0;
}