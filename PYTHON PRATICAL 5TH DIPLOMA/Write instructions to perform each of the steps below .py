#Write instructions to perform each of the steps below 
(a) Create a string containing at least five words and store it in a variable.
(b) Print out the string.
(c) Convert the string to a list of words using the string split method.
22
(d) Sort the list into reverse alphabetical order using some of the list 
methods (you might need to use dir(list) or help(list) to find appropriate 
methods).
(e) Print out the sorted, reversed list of words

# Step (a) Create a string with at least five words
my_string = "apple banana cherry dog elephant"

# Step (b) Print out the string
print(my_string)

# Step (c) Convert the string to a list of words
word_list = my_string.split()

# Step (d) Sort the list in reverse alphabetical order
word_list.sort(reverse=True)

# Step (e) Print out the sorted, reversed list of words
print(word_list)
