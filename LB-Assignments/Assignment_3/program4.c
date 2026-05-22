#include<stdio.h>
#include<ctype.h>

void DisplayConvert(char cValue)
{
    if(isupper(cValue))
    {
        printf("%c",tolower(cValue));
    }
    else
    {
        printf("%c",toupper(cValue));
    }
}

int main()
{
    char cValue = '\0';

    printf("Enter character : \n");
    scanf("%c",&cValue);

    DisplayConvert(cValue);
    
    return 0;
}