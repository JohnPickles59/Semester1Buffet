str = input("Enter a word")

# A String variable can be made upper or lower case given the following methods
str = str.lower()
str = str.upper()
capital = True
# These commands turn the entire String to upper or lower case and stores it back in str
# The following loop goes through each letter in str one by one. 
# char becomes each letter for each loop!
for char in str:
    if capital == True:
        char = char.upper()
        capital = False
        print(char, end="")
    else:
        char = char.lower()
        capital = True
        print(char, end="")