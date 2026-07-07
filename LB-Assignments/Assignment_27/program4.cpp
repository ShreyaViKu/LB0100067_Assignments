/*
iRow = 6   iCol = 6
*  *  *  *  *  *
*  *           *
*     *        *
*        *     *
*           *  *
*  *  *  *  *  *

*/

#include<iostream>
using namespace std;

class PatternPrint
{
    public: 
        int iRow ;
        int iCol ;

        PatternPrint(int a, int b)
        {
            this->iRow = a;
            this->iCol = b;
        }

        void Pattern()
        {
            if(iRow != iCol)
            {
                cout<<"Invalid input \nNumber of rows and column must be same\n";
                return;
            }
            int i = 0, j = 0;

            for(i = 1; i <= iRow; i++)
            {
                for(j = 1; j <= iCol; j++)
                {
                    if((i == j) || (i == 1) || (i == iRow) || (j == 1) || (j == iCol))
                    {
                        cout<<"*\t";
                    }
                    else
                    {
                        cout<<"\t";
                    }
                }
                cout<<"\n";
            }
        }

};

int main()
{
    int iValue1 = 0, iValue2 = 0;

    cout<<"Enter number of rows : \n";
    cin>>iValue1;

    cout<<"Enter number of columns : \n";
    cin>>iValue2;

    PatternPrint pobj = PatternPrint(iValue1, iValue2);

    pobj.Pattern();

    return 0;
}