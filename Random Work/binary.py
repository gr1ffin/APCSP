import math

choose = input("Choose one of the convert options: \n Binary to Decimal (A) \n Decimal to Binary (B) \n String to Binary  (C)")

binary_choice = "A"
decimal_choice = "B"
words_choice = "C"
secret = "D"
        

if choose == binary_choice:
    inp_bin = input("Input Binary Number: ")  
    decimal = 0 
    for digit in inp_bin: 
        decimal = decimal*2 + int(digit)
    print(decimal)

elif choose == decimal_choice:
    inp_dec = input("Input Decimal Number: ")
    decimal_value = int(inp_dec)
    binary_output = bin(decimal_value)
    print(binary_output)

elif choose == words_choice:
    inp_word = input("Input String: ")
    inp_array = bytearray(inp_word, "utf8")
    byte_list = []
    for byte in inp_array: 
        binary_representation = bin(byte)
        byte_list.append(binary_representation)
    print(byte_list)

elif choose == secret: # Secret Mode 
    secret_number = int(input("Input:"))
    absolute = math.fabs(secret_number)
    binary = bin(secret_number)
    octal = oct(secret_number)
    hexadecimal = hex(secret_number)
    if secret_number >= 0: 
        factorial = math.factorial(secret_number)
        print(secret_number)
        print(factorial)
        print(absolute)
        print('Binary: ' + binary)
        print('Octal: ' + octal)
        print('Hexadecimal: ' + hexadecimal)
    else: 
        print(secret_number)
        print(absolute)
        print('Binary: ' + binary)
        print('Octal: ' + octal)
        print('Hexadecimal: ' + hexadecimal)

else: 
    print("Invalid Input. Please choose a valid response.")
