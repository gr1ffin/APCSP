import math

print("gr1ffin's calculator.")
print("What type of math are we working with?")
# List
initialInput = input("Geometry \nAlgebra \nCalculus \n:  ")

def geometryChoice():
    def volume():
        print("What type of shape are we working with?")
        shape = input("Cube \nTrianglular Prism\nCylinder\n:  ")
        if shape.upper() == "CUBE":
            while True:
                length = (input("What is the length: "))
                width = (input("What is the width: "))
                height = (input("What is the height: "))
                print("Your selected values were: " + length + "  " + width +  "  " + height + "." )
                checkValues = input("Is that correct? (Y/N)")
                if checkValues.upper() == "Y":
                    print("The Volume of the Shape is: " + int(length) * int(width) * int(height))
                else:
                    continue
        elif shape.upper() == "TRIANGLE":
            print()
        elif shape.upper() == "CYLINDER":
            while True:
                radius = (input("What is the radius of the base: "))
                height = (input("What is the height: "))
                print("Your selected values were: " + radius + " " + height +  "." )
                checkValues = input("Is that correct? (Y/N)")
                if checkValues.upper() == "Y":
                    volume = int(radius)**2 * int(height) * int(math.pi)
                    print("The Volume of the Shape is: " + str(volume))
                else:
                    continue




    print("\n What would you like to calculate?")
    secondChoice = input("Volume \nArea \nSurface Area \nPerimeter\n:  ")
    if secondChoice.upper() == "VOLUME":
        volume()
    else:
        print(2**2)


if initialInput.upper() == "GEOMETRY":
    geometryChoice()
else: 
    print("Invalid")