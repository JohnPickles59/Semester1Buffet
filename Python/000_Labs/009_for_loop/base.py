line = input("What kind of line would you like?")
length = int(input("How long?"))
x = 1

if(line == "vertical"):
    for x in range(0,length):
        print("*")
        
elif(line == "horizontal"):
    for x in range(0,length):
        print("*", end="")

else:
    print("That is not an option. Please try again.")