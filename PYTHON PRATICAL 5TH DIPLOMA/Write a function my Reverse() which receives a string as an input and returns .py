#Write a function my Reverse() which receives a string as an input and returns||EXP:- 06||
the reverse of the string.
# Define the function myReverse()
def myReverse(input_string):
    # Return the reversed string using slicing [::-1]
    return input_string[::-1]

# Example of how to use the function
input_str = input("Enter a string: ")
reversed_str = myReverse(input_str)
print("Reversed string:", reversed_str)
