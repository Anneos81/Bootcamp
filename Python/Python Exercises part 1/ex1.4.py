import math
a = float(input("Give me the first number:"))
b = float(input("Give me the second number:"))
c = float(input("Give me the third number:"))
d = b**2 - (4*a*c)
if d == 0:
    x1 = (-b -math.sqrt(d))/(2*a)
    x2 = (-b +(math.sqrt(d)))/(2*a)
    print("Diakrinousa mideniki, ara exei Monadiki lusi thn dipli riza: x = ", -b/(2*a))
elif d > 0:
     x1 = (-b -math.sqrt(d))/(2*a)
     x2 = (-b +(math.sqrt(d)))/(2*a)
     print("Diakrinousa thetiki, ara exei 2 luseis tis: x1 = ", x1, "x2 =",x2)
else:
    print("Diakrinousa arnitiki, ara exei migadikes luseis pou den tis uposthrizei to sugkekrimeno programma.'\n' Krima, alla den peirazei kai polu!!!")
