/*
ip : 5
op : 5  *  4  *  3  *  2  *  1  *
*/

#include<iostream>
using namespace std;

void Display(int iNo)
{
    if(iNo > 0)
    {
        printf("%d\t*\t",iNo);
        Display(iNo-1);
    }
}
int main()
{
    Display(5);

    return 0;
}