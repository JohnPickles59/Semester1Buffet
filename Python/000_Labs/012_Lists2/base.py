import random
numbers = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10"]
amount = int(input("How many numbers would you like?"))

for x in range(0,amount):
    print(numbers[random.randrange(9)])