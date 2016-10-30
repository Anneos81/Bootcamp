num = input("Give me a 8-bit number and I'll tell you if Parity Check is ok:")
number=[]
number=num[:7]
sum=0
for i in number:
    if i=='1':
        sum += 1
print("Number of ones :",sum, "and last number is",num[-1], "so:")
if (sum%2==0 and num[-1]=='0') or (sum%2!=0 and num[-1]=='1'):
    print("Parity check OK")
else:
    print("Parity check NOT OK")
