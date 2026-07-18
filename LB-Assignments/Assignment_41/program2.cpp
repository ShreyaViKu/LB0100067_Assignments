/*
Generic programs :
1. Accept N numbers from user and return addition
2. Accept N numbers from user and return largest value
*/

#include<iostream>
using namespace std;

template <class T>
T AddN(T * arr, int iSize)
{
    T sum = T();

    for(int i = 0; i <iSize; i++)
    {
        sum = sum + arr[i];
    }
    return sum;
}

template <class T>
T Max(T * arr, int iSize)
{
    T Max = arr[0];

    for(int i = 1; i <iSize; i++)
    {
        if(arr[i] > Max)
        {
            Max = arr[i];
        }
    }
    return Max;
}

template <class T>
T Min(T * arr, int iSize)
{
    T Min = arr[0];

    for(int i = 1; i <iSize; i++)
    {
        if(arr[i] < Min)
        {
            Min = arr[i];
        }
    }
    return Min;
}

int main()
{
    int arr[] = {10,20,30,40,50};
    int iRet = AddN(arr,5);
    cout<<"Addition is : "<<iRet<<endl;

    float brr[] = {10.2f,30.2f,20.3f};
    float fRet = AddN(brr,3);
    cout<<"Addition is : "<<fRet<<endl;

    iRet = Max(arr,5);
    cout<<"Maximum is : "<<iRet<<endl;

    fRet = Max(brr,3);
    cout<<"maximum is : "<<fRet<<endl;

    iRet = Min(arr,5);
    cout<<"Minimum is : "<<iRet<<endl;

    fRet = Min(brr,3);
    cout<<"minimum is : "<<fRet<<endl;
    
    return 0;
}