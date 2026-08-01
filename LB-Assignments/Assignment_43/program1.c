/*
Recursive function to print
1) *  *  *  *  *
2) 1  2  3  4  5
3) 5  4  3  2  1
4) A  B  C  D  E
5) a  b  c  d  e
6) E  D  C  B  A
*/

#include<stdio.h>

void Display1(int iNo)
{
    if(iNo > 0)
    {
        printf("*\t");
        Display1(iNo-1);
    }
}

void Display2(int iNo)
{
    if(iNo > 0)
    {
        Display2(iNo-1);
        printf("%d\t",iNo);
    }
}

void Display3(int iNo)
{
    if(iNo > 0)
    {
        printf("%d\t",iNo);
        Display3(iNo-1);
    }
}

void Display4(int iNo)
{
    static char ch = 'A';

    if(iNo > 0)
    {
        
        Display4(iNo-1);
        printf("%c\t",ch);
        ch++;
    }
}

void Display5(int iNo)
{
    static char ch = 'a';

    if(iNo > 0)
    {
        
        Display5(iNo-1);
        printf("%c\t",ch);
        ch++;
    }
}

void Display6(int iNo)
{
    static char ch = 'A';

    if(iNo > 0)
    {
        printf("%c\t",ch+(iNo-1));
        Display6(iNo-1);

    }
}

int main()
{
    printf("Display pattern : \n");
    Display1(5);

    printf("\nDisplay numbers in normal order :\n");
    Display2(5);

    printf("\nDisplay numbers in reverse order :\n");
    Display3(9);

    printf("\nDisplay Capital in normal order :\n");
    Display4(6);

    printf("\nDisplay Small in normal order :\n");
    Display5(5);

    printf("\nDisplay Capital in reverse order :\n");
    Display6(5);

    return 0;
}