a = ''
num = int( input ("Enter the number of triangle numbers:"))
for n in range(1,num+1):
    b = str(int((n/2)*(n+1)))
    if n == 1:
        a = b
    else:
      a = a + ' ' + b
print(a)
