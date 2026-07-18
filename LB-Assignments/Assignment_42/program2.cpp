/*
generic program 
1. for accept N values from user and count frequency of any num
2. search first occurance of num from array
3. search last occurance of num from array
4. reverse the array
*/

#include<iostream>
using namespace std;

template <class T>
int Frequency(T * arr, int isize, T value)
{
    int i = 0;
    int freq = 0;
    for(i = 0; i< isize; i++)
    {
        if(arr[i] == value)
        {
            freq++;
        }
    }
    return freq;
}

template <class T>
int SearchFirst(T * arr, int iSize, T value)
{
    int i = 0;
    for(i = 0; i< iSize; i++)
    {
        if(arr[i] == value)
        {
            return i+1;
        }
    }
    return -1;

}

template <class T>
int SearchLast(T * arr, int iSize, T value)
{
    int i = 0;
    int LOccur = 0;
    for(i = 0; i< iSize; i++)
    {
        if(arr[i] == value)
        {
            LOccur = i+1;
        }
    }
    return LOccur;

}

template <class T>
void Reverse(T * arr, int iSize)
{
  int last = iSize-1;
  int first = 0;
  
  T temp;

  while(last > first)
  {
    temp = arr[last];
    arr[last] = arr[first];
    arr[first] = temp;

    last--;
    first++;
  }

}

int main()
{
    int arr[] = {10,20,30,10,40,50,10,60,10};

    int iRet = Frequency(arr,9,10);
    cout<<"Frequency is : "<<iRet<<endl;

    iRet = SearchFirst(arr,9,40);
    cout<<"First occurance of 40 is : "<<iRet<<endl;

    iRet = SearchLast(arr,9,10);
    cout<<"last occurance of 10 is : "<<iRet<<endl;

    for(int i = 0; i < 9; i++)
    {
        cout<<arr[i]<<"\t";
    }
    cout<<endl;

    Reverse(arr,9);

    for(int i = 0; i < 9; i++)
    {
        cout<<arr[i]<<"\t";
    }
    cout<<endl;

    return 0;
}