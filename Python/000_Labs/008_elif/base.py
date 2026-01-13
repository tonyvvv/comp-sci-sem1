a=input('please enter a number: ')
b=input('please enter a operation: ')
c=input('please enter another number: ')
if b == '-':
    a = int(a)
    c = int(c)
    f=a-c
    f = str(f)
    a = str(a)
    c = str(c)
    print(a+b+c+'='+f)
elif b == '+':
    a = int(a)
    c = int(c)
    f=a+c
    f = str(f)
    a = str(a)
    c = str(c)
    print(a+b+c+'='+f)
elif b == '*':
    a = int(a)
    c = int(c)
    f=a*c
    f = str(f)
    a = str(a)
    c = str(c)
    print(a+b+c+'='+f)
elif b == '/':
    a = int(a)
    c = int(c)
    f=a/c
    f = str(f)
    a = str(a)
    c = str(c)
    print(a+b+c+'='+f)