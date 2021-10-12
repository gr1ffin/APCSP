import string
import random
import sys

def convertFunction():    
    choose = input("Choose one of the convert options: \n Binary to Decimal  (A) \n Decimal to Binary  (B) \n String to Binary   (C)")
    # Input to select from A, B, C, or D
    binary_choice = "A"
    decimal_choice = "B"
    words_choice = "C"
    info = "D" # Hidden from input selection because it's unnecessary 
    while True:
        if choose.upper() == binary_choice: # Converts Binary > Decimal
            inp_bin = input("Input Binary Number: ")  
            decimal = 0 
            for digit in inp_bin: 
                decimal = decimal*2 + int(digit)
            print(decimal)
            break

        elif choose.upper() == decimal_choice: # Converts Decimal to Binary
            inp_dec = input("Input Decimal Number: ")
            decimal_value = int(inp_dec)
            binary_output = bin(decimal_value)
            print(binary_output)
            break

        elif choose.upper() == words_choice: # Converts String Text to Binary
            inp_word = input("Input String: ")
            inp_array = bytearray(inp_word, "utf8")
            byte_list = []
            for byte in inp_array: 
                binary_representation = bin(byte)
                byte_list.append(binary_representation)
            print(byte_list)
            break

        elif choose.upper() == info: # Lists all conversions for a number
            info_number = int(input("Input:"))
            binary = bin(info_number)
            octal = oct(info_number)
            hexadecimal = hex(info_number)
            print(info_number)
            print('Binary: ' + binary)
            print('Octal: ' + octal)
            print('Hexadecimal: ' + hexadecimal)
            break

        else:
            print("Invalid Input. Please choose a valid response.")
            continue

def passwordGen():
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
            print('Student Password: ' + password)
            f= open("C:\Apps\passwords.txt", "w+") # Printing Values to Text
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
            f= open("C:\Apps\passwords.txt", "w+")
            f.write('Your new password is ' + new_password)

            path = r'C:\Apps\passwords.txt'
            sys.path.append(path)

            import subprocess
            subprocess.Popen('explorer "C:\Apps\passwords.txt"')

            break
        else:
            print("Invalid Input. Please choose a valid response.")
            continue

print("Welcome to the all around command prompt tool. \n What would you like to do today?\n ")
firstChoice = input("Convert Decimal and Binary Numbers (A) \nGenerate a Password (B)\n")

firstA = "A"
firstB = "B"

if firstA.upper() == firstChoice:
    convertFunction()
elif firstB.upper() == firstChoice:
    passwordGen()
else:
    print("Invalid Input. Please Try again. ")