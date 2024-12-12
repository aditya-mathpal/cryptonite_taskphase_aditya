# spelling-quiz
We are given a folder with the encryption code, bunch of example encrypted strings, and the encrypted flag.  
Upon analysis of the code, it is a simple monoalphabetic substitution cipher that is used, with the substitution alphabet having been randomly generated. We can use any brute-force tool to crack the substitution alphabet using as many strings as feasible from the example encrypted strings. Then once we have the substitution alphabet, use that to decode the flag.

