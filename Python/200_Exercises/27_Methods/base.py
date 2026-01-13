def add (x,y):
    sum = x + y
    return sum
def mult (x,y):
    sum = x * y
    return sum
def printlist (lst):
    i = 1
    for item in lst:
        print(str(i) + "." + item)
        i = i + 1
a = mult(5, 3)
print(a)

christmasList = ["ps5", ]
printlist(christmasList)

numlist = [3, 4, 7, 4, 6, 4]

def printintlist (lst):
    sum = 0
    for item in lst:
        sum = sum + item
    return sum
printintlist(numlist)