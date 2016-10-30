num = input("Give me a binary number:")
sumiden = 0
sumena = 0
sumax = [0,0]
for x in num:
    if x == '1':
        sumena += 1
        if sumena > sumax[0]:
            sumax[0] = sumena
        sumiden = 0
    else:
        sumiden += 1
        if sumiden > sumax[1]:
            sumax[1] = sumiden
        sumena = 0
if sumax[1]>sumax[0]:
    print("sum of zeros:", sumax[1])
elif sumax[1]<sumax[0]:
    print("sum of ones:", sumax[0])
else:
    print("sum of zeros=ones:", sumax[0])
