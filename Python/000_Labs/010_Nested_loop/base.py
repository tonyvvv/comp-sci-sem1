a = input('What symbol would you like to use?')
b = input('What’s the width of your box? ')
c = input('What’s the height of your box? ')
zi = 0
s = 0
d = 0
for vi in range(0,100):
    if s < int(b):
        s = s + 1
        print(a, end="", flush=True)
    if s == int(b):
        s = 0
        d = d + 1
        print('')
    if d == int(c):
         break
        