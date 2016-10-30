import math
a = float(input("Give me the first side:"))
b = float(input("Give me the second side:"))
c = float(input("Give me the third side:"))
A = 0.25*math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c))
print("The triangle area is:", A)
