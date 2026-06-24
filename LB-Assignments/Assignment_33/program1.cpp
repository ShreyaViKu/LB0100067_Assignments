/*
accept string from user and a character and check if character is present in string or not
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

        bool ChkChar()
        {
            bool bRet = false;

            while(*str != '\0')
            {
                if(*str == ch)
                {
                    bRet = true;
                    break;
                }
                str++;
            }
            return bRet;

        }
};
int main()
{
    char Arr[50] = {'\0'};
    char cValue = '\0';
    bool bRet = false;

    cout<<"Enter the string : \n";
    cin.getline(Arr,50);
    
    cout<<"Enter character to check : \n";
    cin>>cValue;

    StringX sobj = StringX(Arr,cValue);

    bRet = sobj.ChkChar();

    if(bRet)
    {
        cout<<"Character is present in string";
    }
    else
    {
        cout<<"Character is not present in string";
    }

    return 0;
}