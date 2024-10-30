# Becoming root with su
Run `su`, enter the password `hack-the-planet`, then run `cat /flag` in the `root` shell.

# Other users with su
Same as previous, just add the argument `zardus` to `su`.

# Cracking passwords
Run `john /challenge/shadow-leak` to crack the password hash. `aardvark` is revealed to be the password for `zardus`. Rest is same as the previous challenge.

# Using sudo
```
sudo cat /flag
```