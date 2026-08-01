/*
ip : number 
op : factorial
*/

#include<iostream>
using namespace std;

int Factorial(int iNo)
{
    static int fact = 1;
}
int main()
{
    int iRet = 0;

    iRet = Factorial(4321);
    cout<<"Digit sum is : "<<iRet<<endl;

    return 0;
}