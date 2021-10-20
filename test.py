import math
radius = (input("What is the radius of the base: "))
height = (input("What is the height: "))
print("Your selected values were: " + radius + " " + height +  "." )
checkValues = input("Is that correct? (Y/N)")
if checkValues.upper() == "Y":
    volume = int(radius)**2 * int(height) * int(math.pi)
    print("The Volume of the Shape is: " + str(volume))
else:
    print("fail")