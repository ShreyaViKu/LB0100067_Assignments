/*
Hotel Management
3000/day rs
if stay > 7 days -> 5% discount on total
*/

#include<stdio.h>

int main()
{
    int Days, Bill;

    printf("Enter number od days stayed : \n");
    scanf("%d",&Days);

    Bill = Days * 3000;

    if(Days > 7)
    {
        Bill = Bill - ((Bill * 5) / 100);
    }

    printf("Total Stay Duration : %d\n",Days);
    printf("Final Bill Amount : %d\n",Bill);

    return 0;
}