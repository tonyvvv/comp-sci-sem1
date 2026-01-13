import random

a = input('how mnay numbers would you like to generate? ')
for x in range(0,int(a)):
    print(random.randrange(0,10), end=", ", flush=True)