# vault-door-training
The flag is directly given in the source code.

# vault-door-1
The code uses the `charAt()` method in Java to compare the characters at specific indices to what they should be in the correct string.  
Manually build the string by looking for each index and the corresponding character.

# vault-door-3
The program builds a new string from the entered one and then compares it with `"jU5t_a_sna_3lpm18gb41_u_4_mfr340"`.  
To reverse engineer the password we must treat this string as the output and reverse the steps the program takes to build it.  
Blank string: "-------------------------------" (32 blanks)  
Filling in indices 17, 19, ..., 31: "-----------------g-4-_-_-_-f-3-0"  
Now filling in 16, 18, ..., 30: ":  "----------------4gr4m_4_u_1fb380"
Now filling in 8 to 15:             "--------1mpl3_an4gr4m_4_u_1fb380"  
Now filling in 0 to 7:              "jU5t_a_s1mpl3_an4gr4m_4_u_1fb380"

# vault-door-4
Convert all rows to an ASCII string; first row is decimal, second is hexadecimal, second is octal (normalise each number to three digits to convert), and the last row is already ASCII.

# vault-door-5
The comments basically give it away, the strings are encoded in base 64, which itself is an encoded URL (or URL characters). So using a base64 decoder and then a URL decoder returns the flag.

# vault-door-6
It can be worked out that the result of the bitwise XOR operator on a variable and a constant can be used to determine the variable if we have the constant.  
I've written Java code which is attached in the same folder that decrypts the hexadecimal values that the entered string is being compared to (after the conversion process). Note that Java outputs decimal values by default so to get a readable string we need to convert it from decimal to ASCII.

# vault-door-7
Each set of four characters of the password is encoded into one integer by using the ASCII binary value. To reverse engineer the password, convert the given array of integers into an array of binary strings, pad each one to 32 characters (bits), then convert every set of 8 bits into an ASCII character. The Java code to do this is attached.

# vault-door-8
Format the code with correct line spacing and indentation to make it readable.  
