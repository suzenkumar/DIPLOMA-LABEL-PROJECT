//Write a Program in C to find the average of n numbers by using for loop.//EXP:-02//COURSE-DIPLOMA//2021-2024 BATCH
#include <stdio.h>

int main() {
    int n, i;
    float num, sum = 0.0, average;

    printf("Enter the number of elements: ");
    scanf("%d", &n);

    printf("Enter %d numbers:\n", n);
    for (i = 0; i < n; ++i) {
        scanf("%f", &num);
        sum += num;
    }

    average = sum / n;
    printf("The average of the entered numbers is: %.2f\n", average);

    return 0;
}


