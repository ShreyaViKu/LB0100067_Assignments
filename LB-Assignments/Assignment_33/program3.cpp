/*
accept string from user and a character and return index of first occurance of that character
*/
#include<iostream>
using namespace std;

class StringX
{
    char *str = NULL;
    char ch = '\0';

    public :
        StringX(char *str, char ch)
        {
            this->str = str;
            this->ch = ch;
        }

        int FirstChar()
        {
            int index = 0;

            while(*str != '\0')
            {
                if(*str == ch)
                {
                    return index;
                }

                index++;
                str++;
            }

            return -1;
        }
};
int main()
{
    char Arr[50] = {'\0'};
    char cValue = '\0';
    int iRet = 0;

    cout<<"Enter the string : \n";
    cin.getline(Arr,50);
    
    cout<<"Enter character to check : \n";
    cin>>cValue;

    StringX sobj = StringX(Arr,cValue);

    iRet = sobj.FirstChar();

    cout<<"First index of char is : "<<iRet;

    return 0;
}