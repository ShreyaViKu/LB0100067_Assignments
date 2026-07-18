/*
generic program for accept one value and number 
display value that number of times
*/

#include<iostream>
using namespace std;

template <class T>
void Display(T value, int iSize)
{
    int i = 0;
    for(i = 1; i<= iSize; i++)
    {
        cout<<value<<"\t";
    }
    cout<<endl;
}

int main()
{
    Display('M',7);
    Display(2,5);

    return 0;
}