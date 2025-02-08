#Swap two integer numbers using a temporary variable. Repeat the exercise 
using the code format: a, b = b, a. Verify your results in both the cases.
# Step 1: Initialize two integer numbers
a = 5
b = 10

# Method 1: Using a temporary variable
# Swap using a temporary variable
temp = a
a = b
b = temp

# Verify the swap
print("After swapping using temporary variable:")
print("a =", a)  # Should print 10
print("b =", b)  # Should print 5

# Reinitialize the values
a = 5
b = 10

# Method 2: Using tuple assignment (Pythonic way)
# Swap using tuple assignment
a, b = b, a

# Verify the swap
print("\nAfter swapping using tuple assignment:")
print("a =", a)  # Should print 10
print("b =", b)  # Should print 5
