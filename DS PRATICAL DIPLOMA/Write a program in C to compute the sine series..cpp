// Write a program in C to compute the sine series. //EXP:-05//COURSE-DIPLOMA//2021-2024 BATCH
#include <stdio.h>  
#include <math.h>  
#define TERMS 10   
// Number of terms in the Taylor series.  
// Factorial computation function for a given number.  
unsigned long long factorial(int num)  
{  
    unsigned long long factorial = 1;  
    for (int i = 1; i <= num; i++)  
    {  
        factorial *= i;  
    }  
    return factorial;  
}  
//Function to use the Taylor series to compute sine  
double sine_calculation(double x)  
{  
    double sin_value = 0.0;  
    int sign = 1;  
    // Angle normalization should be between -2p and 2p.  
    x = fmod(x, 2 * M_PI);  
    // Use the Taylor series expansion to calculate sine.  
    for (int num = 0; num < TERMS; num++)  
    {  
        int exponent = 2 * num + 1;  
        double term = pow(x, exponent) / factorial(exponent);  
        sin_value += sign * term;  
        sign *= -1;  
        // Alternate signs for the series  
    }  
    return sin_value;  
}  
int main()   
{  
    double angle_degrees;  
    char choice;  
    do   
    {  
        printf("Please enter angle in degrees: ");  
        if (scanf("%lf", &angle_degrees) != 1)  
        {  
            printf("Invalid input. Please enter a numerical value.\n");  
            // Clearing the input buffer.  
            while (getchar() != '\n');  
            continue;  
        }  
        // Converting degrees to radians.  
        double angle_radians = angle_degrees * M_PI / 180.0;  
        // Computing sine value.  
        double result = sine_calculation(angle_radians);  
        printf("The value of sin(%lf degrees) = %lf\n", angle_degrees, result);  
        // Ask the user if they want to continue to know the degree values.  
        printf("Do you want to calculate another sine value? press (y/n): ");  
        scanf(" %c", &choice);  
        // Clearing the input buffer  
        while (getchar() != '\n');  
    } while (choice == 'y' || choice == 'Y');  
    printf("Exiting the program.\n");  
    return 0;  
}     
