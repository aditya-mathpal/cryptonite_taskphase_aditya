# Printing Variables
Just need to `echo` the `FLAG` variable:
```
echo $FLAG
```

# Setting Variables
```
PWN=COLLEGE
```

# Multi-word Variables
```
PWN="COLLEGE YEAH"
```

# Exporting Variables
Run these commands:
```
export PWN=COLLEGE
COLLEGE=PWN
/challenge/run
```

# Printing Exported Variables
Run `env`.

# Storing Command Output
Send the output of `/challenge/run` to variable `PWN` with `PWN=$(/challenge/run)`, then `echo $PWN`.

# Reading Input
Read user input with `read PWN`, then input `COLLEGE`.

# Reading Files
Straightforward
```
read PWN < /challenge/read_me
```