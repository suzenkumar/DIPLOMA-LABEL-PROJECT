//Write a program in C to accept row wise and column wise element in a two dimensional array and print them//EXP:-06//COURSE-DIPLOMA//2021-2024 BATCH.
#include <stdio.h>

int main() {
    int rows, columns;

    // Accept the number of rows and columns
    printf("Enter the number of rows: ");
    scanf("%d", &rows);
    printf("Enter the number of columns: ");
    scanf("%d", &columns);

    int array[rows][columns];

    // Accept elements of the array
    printf("Enter the elements of the array:\n");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            printf("Element at [%d][%d]: ", i, j);
            scanf("%d", &array[i][j]);
        }
    }

    // Print the elements of the array
    printf("The elements of the array are:\n");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            printf("%d ", array[i][j]);
        }
        printf("\n");
    }

    return 0;
}

