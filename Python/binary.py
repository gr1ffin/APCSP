while True:

    choose = input("Choose one of the convert options: \n Binary to Decimal  (A) \n Decimal to Binary  (B) \n String to Binary   (C)")
    # Input to select from A, B, C, or D
    binary_choice = "A"
    decimal_choice = "B"
    words_choice = "C"
    info = "D" # Hidden from input selection because it's unnecessary 
    
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
# The End. - gr1ffin