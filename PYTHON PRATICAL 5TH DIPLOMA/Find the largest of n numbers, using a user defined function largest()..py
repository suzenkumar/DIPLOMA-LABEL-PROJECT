#Find the largest of n numbers, using a user defined function largest().||EXP-05||
# Step 1: Define the largest() function
def largest(numbers):
    # Return the largest number using the max() function
    return max(numbers)

# Step 2: Accept n numbers from the user
n = int(input("Enter the number of elements: "))
numbers = []

for i in range(n):
    num = float(input(f"Enter number {i+1}: "))
    numbers.append(num)

# Step 3: Call the largest() function to find the largest number
largest_number = largest(numbers)

# Step 4: Print the largest number
print("The largest number is:", largest_number)
