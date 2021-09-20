import random

while True:

    pop = ["Stay", "Montero", "Good as Hell", "Dynamite"]
    hip = ["I Miss the Rage", "Wants and Needs", "Rap Star", "Sorry Not Sorry"]
    reg = ["EL BARCO", "Tiempo", "Agua de Jamica"]
    rock = ["Seratonin", "Making a Fire", "All my favorite", "Waiting on War"]

    choice = input("What genre would you like to choose from? \n Pop (A) \n Hip Hop (B) \n Reggaeton (C) \n Rock (D) \n")
    if choice == "A":
        print(random.choice(pop));
        break
    elif choice == "B":
        print(random.choice(hip))
        break
    elif choice == "C":
        age = int(input("How old are you?\n"));
        if age < 12:
            print("Please try another genre.")
            continue
        else:
            print(random.choice(reg));
            break
    elif choice == "D":
        print(random.choice(rock));
        break
    else:
        print("Invalid Choice. Please try again.")
        continue