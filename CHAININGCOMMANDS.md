# Chaining with Semicolons
Chain the two commands like so:
```
/challenge/pwn;/challenge/college
```

# Your First Shell Script
```
touch x.sh
echo "/challenge/pwn;/challenge/college" > x.sh
bash x.sh
```

# Redirecting Script Output
```
touch x.sh;echo "/challenge/pwn;/challenge/college" > x.sh
bash x.sh | /challenge/solve
```

# Executable Shell Scripts
Use the same steps as before to create the `.sh` file, but then use `chmod` to give the `hacker` user execute permission.
```
touch x.sh;echo "/challenge/solve" > x.sh
chmod u=rwx x.sh
./x.sh
```