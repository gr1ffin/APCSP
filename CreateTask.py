import string
import random
import sys
import subprocess
import json
import datetime
import os
import socket
import platform
import urllib.request

def convertFunction():  

    def saveToJson():
        time = datetime.datetime.now()
        data = {}
        data['Conversions'] = []
        data['Conversions'].append({
            'Conversion Type': str(conversionType),
            'Input Value': str(inp),
            'Output Value': str(out),
        })
        with open('conversions.txt', 'a') as outfile:
            json.dump(data, outfile, indent=2)

    choose = input("Choose one of the convert options: \n Binary to Decimal  (A) \n Decimal to Binary  (B) \n String to Binary   (C)\n Other conversions (D)")
    # Input to select from A, B, C, or D
    binary_choice = "A"
    decimal_choice = "B"
    words_choice = "C"
    info = "D" 
    while True:
        if choose.upper() == binary_choice: # Converts Binary > Decimal
            conversionType = "Binary to Decimal"
            inp = input("Input Binary Number: ")  
            out = 0 
            for digit in inp: 
                out = out*2 + int(digit)
            print(out)
            saveToJson()
            break

        elif choose.upper() == decimal_choice: # Converts Decimal to Binary
            conversionType = "Decimal to Binary"
            inp = input("Input Decimal Number: ")
            decimal_value = int(inp)
            out = bin(decimal_value)
            print(out)
            saveToJson()
            break

        elif choose.upper() == words_choice: # Converts String Text to Binary
            conversionType = "String to Binary"
            inp = input("Input String: ")
            inp_array = bytearray(inp, "utf8")
            out = []
            for byte in inp_array: 
                binary_representation = bin(byte)
                out.append(binary_representation)
            print(out)
            saveToJson()
            break

        elif choose.upper() == info: # Lists all conversions for a number
            conversionType = "Decimal to Binary, Octal, and Hexadecimal"
            inp = int(input("Decimal Input:"))
            binary = bin(inp)
            octal = oct(inp)
            hexadecimal = hex(inp)
            print(inp)
            print('Binary: ' + binary)
            print('Octal: ' + octal)
            print('Hexadecimal: ' + hexadecimal)
            time = datetime.datetime.now()
            data = {}
            data['Conversions'] = []
            data['Conversions'].append({
                'Conversion Type': str(conversionType),
                'Input Value': str(inp),
                'Binary': str(binary),
                'Octal': str(octal),
                'Hexadecimal': str(hexadecimal),
                })
            with open('conversions.txt', 'a') as outfile:
                json.dump(data, outfile, indent=2)
            break
        
        else:
            print("Invalid Input. Please choose a valid response.")
            continue

def passwordGen():
    choose = input("Would you like to generate a School Password (A) or a Random Password (B) \n")
    input_A = "A"
    input_B = "B"

    def saveToJsonPassword():
        time = datetime.datetime.now()
        data = {}
        data['passwords'] = []
        data['passwords'].append({
            'Password Type': str(passwordType),
            'Password': str(new_password),
            'Date Generated': str(time),
        })
        with open('passwords.txt', 'a') as outfile:
            json.dump(data, outfile, indent=2)

    while True:
        if choose == input_A.upper():
            passwordType = "School Password"
            first_name = input("What is your first name? \n") # PASSWORD
            last_name = input("What is your last name? \n")
            birthday = input ("What is your birthday? (MM/DD/YY) \n")
            month = birthday[0:2]
            day = birthday[3:5]
            year = birthday[6:8]
            first_ini = first_name[0]
            second_ini = last_name[0]
            new_password = month + day + year + first_ini + second_ini
            print(new_password)
            saveToJsonPassword()
            break
        elif choose == input_B.upper():
            passwordType = "Randomly Generated Password"
            characters = list(string.ascii_letters + string.digits + "!@#$%^&*()")
            length = int(input("How long do you want the password to be? \n"))
            random.shuffle(characters)
            password = []
            for i in range(length):
                password.append(random.choice(characters))
            random.shuffle(password)
            new_password = ''.join(password)
            print(new_password)
            saveToJson()
            break
        else:
            print("Invalid Input. Please choose a valid response.")
            continue

def computerInfo():
    hostname = socket.gethostname()
    privateIP = socket.gethostbyname(hostname)
    publicIP = urllib.request.urlopen('http://ident.me').read().decode('utf8')
    print('Computer Hostname: ' + hostname)
    print('Public IP: ' + publicIP)
    print('Private IP ' + privateIP)
    questionA = "Y"
    questionB = "N"
    doPing = input("Would you like to ping a website? (Y/N) \n")
    while True:
        if questionA == doPing.upper():
            pingServer = input("What website would you like to ping? \n")
            response = os.system("ping -n 1 " + pingServer)
            if response == 0:
                print(pingServer + ' has responded!')
            else:  
                print('Could not connect to ' + pingServer)
            break
        elif questionB == doPing.upper():
            break
        else:
            print("Invalid input, please try again.")
            break



print("What do you want to do?")
firstChoice = input("Convert Decimal and Binary Numbers (A) \nGenerate a Password (B) \nSee Network Information (C)\n")

firstA = "A"
firstB = "B"
firstC = "C"

if firstA == firstChoice.upper():
    convertFunction()
elif firstB == firstChoice.upper():
    passwordGen()
elif firstC == firstChoice.upper():
    computerInfo()
else:
    print("Invalid Input. Please Try again. ")