/*
Write program which Accepts character from user.
if character is small it displays all character in reverse order till a.
if character is capital it displays all character from that till Z.
in other cases print as it is
*/

#include<stdio.h>

void Display(char ch)
{

    if(ch >= 'A' && ch <= 'Z')
    {
        for(ch; ch <= 'Z'; ch++)
        {
            printf("%c\t",ch);
        }
    }
    else if(ch >= 'a' && ch <= 'z')
    {
        for(ch; ch >= 'a'; ch--)
        {
            printf("%c\t",ch);
        }
    }
    else
    {
        printf("%c",ch);
    }


}

int main()
{
    char cValue = '\0';

    printf("Enter character : ");
    scanf("%c",&cValue);
    
    Display(cValue);

    return 0;
}