#Find all numbers which are multiple of 17, but not the multiple of 5, between 
2000 and 2500? ||EXP:-03||
# Initialize the range boundaries
start = 2000
end = 2500

# Create an empty list to store the results
result = []

# Loop through all numbers between start and end
for num in range(start, end + 1):
    if num % 17 == 0 and num % 5 != 0:
        result.append(num)

# Print the result
print(result)
