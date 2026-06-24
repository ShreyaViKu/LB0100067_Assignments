/*
accept string from user and reverse the string in place
*/
#include<iostream>
using namespace std;

class StringX
{
    char *str = NULL;

    public :
        StringX(char *str)
        {
            this->str = str;
        }

        void Reverse()
        {
            char *start = NULL;
            char *end = NULL;

            char temp = '\0';

            start = str;
            end = str;

            while(*end != '\0')
            {
                end++;
            }
            end--;

            while(start < end)
            {
                temp = *start;
                *start = *end;
                *end = temp;

                start++;
                end--;
            }
        }
};
int main()
{
    char Arr[50] = {'\0'};

    cout<<"Enter the string : \n";
    cin.getline(Arr,50);

    StringX sobj = StringX(Arr);

    sobj.Reverse();

    cout<<"reverse string is : "<<Arr;

    return 0;
}