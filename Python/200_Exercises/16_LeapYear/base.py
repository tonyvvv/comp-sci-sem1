a = input('choose a year: ')
b = 0
for x in range(99999):
   b = b + 4
   
   if int(a) == b:
       print('it is a leap year')
       break
   elif b > 99999:
       print('it is not a loop year')
       break