a = input('Please enter a number: ')
v = 0
h = 0
for g in range(0,int(a)):
    if v == int(a):
        break
    v = v + 1 
    h = h + v
print('the sum of 1 to '+str(a)+' is: '+str(h))
b = 0
c = 0
for x in range(0,int(a)):
    if b == int(a):
        break
    b = b + 1 
    c = c + b
    print(str(b)+'+', end="", flush=True)
    