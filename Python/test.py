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
            volume = int(length) * int(width) * int(height)
            print("The Volume of the Shape is: " + volume)
        else:
            continue
elif shape.upper() == "TRIANGLE":
    while True: 
        length = (input("What is the length: "))
        width = (input("What is the width: "))
        height = (input("What is the height: "))
        print("Your selected values were: " + length + "  " + width +  "  " + height + "." )
        checkValues = input("Is that correct? (Y/N)")
        if checkValues.upper() == "Y":
            volume = 0.5 * int(length) * int(width) * int(height)
            print("The Volume of the Shape is: " + str(volume))
        else:
            continue
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