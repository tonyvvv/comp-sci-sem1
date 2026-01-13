a = input('please enter a line length: ')
b = input('Do you want a horizontal or vertical line? ')

for vi in range(0,int(a)):
    if b == 'vertical':
        print("*", end="", flush=True)
    elif b == 'horizontal':
        print("*")