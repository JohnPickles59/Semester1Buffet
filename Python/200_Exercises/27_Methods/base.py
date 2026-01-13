def add(x, y):
    sum = x + y
    return sum
    
def mult(x, y):
    prod = x * y
    return prod
    
#--------------------------------------------
ans = add(8, 3)
print(ans)

christmasList = ["Chrih Mah Twee", "Puh Pee", "Ecth Bohcth", "Come Pootah", "Jeh Lee Beens", "Guh Meh Beaws", "Loh Leh Pompsh", "Mac Doh Nuwds", "Wego Shet"]
listFavNum = [67, 41, 21, 33, 22, 123, 32, 68, 51, 61]

def printList(lst):
    i = 1
    for item in lst:
        print(str(i) + ". " + item)
        i = i + 1

def addList(lst):
    e = 1
    finalNum = 0
    for item in lst:
        print(str(e) + ". " + str(item))
        e = e + 1
        finalNum = finalNum + item
    print("Final Number:" + str(finalNum))
printList(christmasList)
addList(listFavNum)