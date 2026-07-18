/*
Generic programs :
1. Multiply 2 numbers
2. Largest number from 3 numbers
*/

#include<iostream>
using namespace std;

template <class T>
T Multiply(T No1, T No2)
{
    T ans;

    ans = No1 * No2;

    return ans;
}

template <class T>
T Max(T No1, T No2, T No3)
{
    if(No1 > No2 && No1 > No3)
    {
        return No1;
    }
    else if(No2 > No1 && No2 > No3)
    {
        return No2;
    }
    else
    {
        return No3;
    }
}

int main()
{
    int iRet = Multiply(10,20);
    cout<<"Multiplication is : "<<iRet<<endl;

    float fRet = Multiply(10.2f,20.2f);
    cout<<"Multiplication is : "<<fRet<<endl;

    int mRet = Max(10,20,11);
    cout<<"Maximum number is : "<<mRet<<endl;
    
    return 0;
}