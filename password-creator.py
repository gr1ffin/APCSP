# gen_random_password inspired by https://geekflare.com/password-generator-python-code/
# - gr1ffin

import string
import random
import sys

choose = input("Would you like to generate a School Password (A) or a Random Password (B) \n")
input_A = "A"
input_B = "B"

while True:
    if choose == input_A:

        first_name = input("What is your first name? \n") # PASSWORD
        last_name = input("What is your last name? \n")
        birthday = input ("What is your birthday? (MM/DD/YY) \n")
        month = birthday[0:2]
        day = birthday[3:5]
        year = birthday[6:8]
        first_ini = first_name[0]
        second_ini = last_name[0]
        password = month + day + year + first_ini + second_ini

        characters = list(string.digits) #ID NUMBER
        random.shuffle(characters)
        student_ID = []
        length = int(7)
        for i in range(length):
            student_ID.append(random.choice(characters))
        random.shuffle(student_ID)
        newID = ''.join(student_ID)
        print('Student ID: ' + newID) # Printing Values to Console
        print('Student Password: ' + password)
        f= open("C:\Apps\passwords.txt", "w+") # Printing Values to Text
        f.write('Student ID: ' + newID )
        f.write('\nStudent Password: ' + password)
        path = r'C:\Apps\passwords.txt'
        sys.path.append(path)

        import subprocess
        subprocess.Popen('explorer "C:\Apps\passwords.txt"')

        break
    elif choose == input_B:
        characters = list(string.ascii_letters + string.digits + "!@#$%^&*()")
        length = int(input("How long do you want the password to be? \n"))
        random.shuffle(characters)
        password = []
        for i in range(length):
            password.append(random.choice(characters))
        random.shuffle(password)
        new_password = ''.join(password)
        print(new_password)
        f= open("C:\Program Files\passwords.txt", "w+")
        f.write('Your new password is ' + new_password)

        path = r'C:\Apps\passwords.txt'
        sys.path.append(path)

        import subprocess
        subprocess.Popen('explorer "C:\Apps\passwords.txt"')

        break
    else:
        print("Invalid Input. Please choose a valid response.")
        continue

