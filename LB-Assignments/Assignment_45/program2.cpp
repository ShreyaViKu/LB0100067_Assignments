/*
ip : a number 
op : Summation of the digits
*/

#include<iostream>
using namespace std;

int DigitsSum(int iNo)
{
    static int iSum = 0;

    if(iNo > 0)
    {
        iSum = iSum + iNo % 10;
        DigitsSum(iNo / 10);
    }
    return iSum;
}
int main()
{
    int iRet = 0;

    iRet = DigitsSum(4321);
    cout<<"Digit sum is : "<<iRet<<endl;

    return 0;
}