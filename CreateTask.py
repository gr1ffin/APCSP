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

def saveToJsonConversion():
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

def binaryConvert():
    conversionType = "Binary to Decimal"
    inp = input("Input Binary Number: ")  
    out = 0 
    for digit in inp: 
        out = out*2 + int(digit)
    print(out)
    saveToJsonConversion()

def decimalConvert():
    conversionType = "Decimal to Binary"
    inp = input("Input Decimal Number: ")
    decimal_value = int(inp)
    out = bin(decimal_value)
    print(out)
    saveToJsonConversion()

def stringConvert():
    conversionType = "String to Binary"
    inp = input("Input String: ")
    inp_array = bytearray(inp, "utf8")
    out = []
    for byte in inp_array: 
        binary_representation = bin(byte)
        out.append(binary_representation)
    print(out)
    saveToJsonConversion()

def multiConvert():
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

def schoolPassword():
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

def randomPassword():
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
            response = os.system("ping -n 1 " + hostname)
            if response == 0:
                print(pingServer + ' has responded!')
            else:  
                print('Could not connect to ' + hostname)
            break
        elif questionB == doPing.upper():
            break
        else:
            print("Invalid input, please try again.")
            break

print("What do you want to do?")
firstChoice = input("Convert Decimal and Binary Numbers (A) \nGenerate a Password (B)\n Display Information about your comptuer (C) \n")

firstA = "A"
firstB = "B"
firstC = "C"

if firstA == firstChoice.upper():
    choose = input("Choose one of the convert options: \n Binary to Decimal  (A) \n Decimal to Binary  (B) \n String to Binary   (C)\n Other conversions (D)")
    binary_choice = "A"
    decimal_choice = "B"
    string_choice = "C"
    info = "D"
    while True:
        if choose.upper() == binary_choice:
            binaryConvert()
            break
        elif choose.upper() == decimal_choice:
            decimalConvert()
            break
        elif choose.upper() == string_choice:
            stringConvert()
            break
        elif choose.upper() == info:
            multiConvert()
            break
        else:
            print("Invalid Input. Please choose a valid response.")
            continue

elif firstB == firstChoice.upper():
    choose = input("Would you like to generate a School Password (A) or a Random Password (B) \n")
    inputA = "A"
    inputB = "B"
    while True:
        if choose == inputA.upper():
            schoolPassword()
            break
        elif choose == inputB.upper():
            randomPassword()
            break
        else: 
            print("Invalid input. Please choose a valid response.")
            continue
elif firstC == firstChoice.upper():
    computerInfo()
else:
    print("Invalid Input. Please Try again. ")