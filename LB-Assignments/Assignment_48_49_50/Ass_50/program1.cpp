/*
Ride-Hailing App
Base fare -> 50rs
first 10 km -> 12rs per km 
beyond 10 km -> 15rs per km
Peak hours -> 20% extra on total fair
*/

#include<iostream>
using namespace std;

int main()
{
    int Distance;
    int Fare;
    char ch;

    cout<<"Enter Distance in km :\n";
    cin>>Distance;

    cout<<"Peak hour ? y/n : \n";
    cin>>ch;

    Fare = 50;

    if(Distance <= 10)
    {
        Fare = Fare + Distance * 12;

    }
    else
    {
        Fare = Fare + (10*12) + (Distance-10) * 15;
    }

    if(ch == 'y' || ch == 'Y')
    {
        Fare = Fare + ((Fare * 20)/100);
    }

    cout<<"Distance : "<<Distance<<endl;
    cout<<"Peak Hour : "<<ch<<endl;
    cout<<"Total fare : "<<Fare<<endl;

    return 0;
}