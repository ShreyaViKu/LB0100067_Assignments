#include<stdio.h>

void Display(int n)
{
    int i = 0, j = 0, k = 0, l = 0;
    for(i = 0;i < n; i++)
    {
        for(j =0; j <= (i); j++)
        {
            printf("%d",j+1);
        }
        for(k = 0; k < (2*n - 2*i - 2); k++)
        {
            printf(" ");
        }
        for(l = i+1; l > 0; l-- )
        {
            printf("%d",l);
        }
        printf("\n");
    }

}
int main()
{
    int n =0;

    printf("Enter num: ");
    scanf("%d",&n);

    Display(n);

    return 0;
}

/*
patteren op
1    1
12  21
123321
*/