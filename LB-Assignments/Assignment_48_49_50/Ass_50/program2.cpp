/*
Scholarship Committee
Marks >= 80%
Attendance >= 75%
Family income <= 300000
*/

#include<iostream>
using namespace std;

int main()
{
    int Marks;
    int Attendance;
    long int Income;

    cout<<"Enter marks : ";
    cin>>Marks;

    cout<<"Enter attendance : ";
    cin>>Attendance;

    cout<<"Enter family income : ";
    cin>>Income;

    if(Marks < 0 || Marks > 100)
    {
        cout<<"Scholarship Rejected : Marks not valid\n";
    }
    else if(Attendance < 0 || Attendance > 100)
    {
        cout<<"Scholarship Rejected : Attendance not valid\n";
    }
    else if(Income < 0)
    {
        cout<<"Scholarship Rejected : Income not valid\n";
    }
    
    else if(Marks < 80)
    {
        cout<<"Scholarship Rejected : Marks less than 80%\n";
    }
    else if(Attendance < 75)
    {
        cout<<"Scholarship Rejected : Attendance less than 75%\n";
    }
    else if(Income > 300000)
    {
        cout<<"Scholarship Rejected : Income greater than 3,00,000 rs\n";
    }
    else
    {
        cout<<"Scholarship Approved\n";
    }

    return 0;
}