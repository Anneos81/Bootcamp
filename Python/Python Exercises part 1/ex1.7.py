num = int(input("Give number of pronic numbers that you want printed : "))
a = ''
for i in range (1,num+1):
    b = str(i*(i+1))
    if i ==1:
        a = b
    else:
       a = a + ' ' + b
print(a)

