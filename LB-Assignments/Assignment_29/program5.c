/*
Accept character from user and Display timming of Exam
According to Division Case sensitive
*/

#include<stdio.h>

char* DisplaySchedule(char ch)
{
    switch (ch)
    {
    case 'A':
        return "7 AM";
    
    case 'B' :
        return "8.30 AM";

    case 'C' :
        return "9.20 AM";
    
    case 'D' :
        return "10.30 AM";

    default:
        return "Invalid Division";
    }
    
}

int main()
{
    char cValue = '\0';

    printf("Enter the character : ");
    scanf("%c",&cValue);

    if(cValue >= 'A' && cValue <= 'Z')
    {

        printf("your exam time is : %s",DisplaySchedule(cValue));

    }
    else
    {
        printf("Enter valid Character in Capital");
    }

    return 0;
}