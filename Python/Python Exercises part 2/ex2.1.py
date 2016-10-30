num = input("Give me a 9-digit number and I'll tell you if it is a valid TIN number:")
number=[]
number=num[::-1]
sum=0
for i in range(1,9):
    sum += int(number[i])*(2**i)
print(sum)
rem=sum%11
b=rem%10
if b == int(num[-1]):
    print("TIN:", rem%10 ,"is valid!!")
else:
    print("TIN:", rem%10, "doesn't match with ", num[-1] , " so it's NOT valid!!")
