# Redirecting output
Straightforward, `echo PWN > COLLEGE`.

# Redirecting more output
Straightforward, `/challenge/run > myflag` and `cat myflag`.

# Appending output
Straightforward yet again, `/challenge/run >> /home/hacker/the-flag` and `cat /home/hacker/the-flag`.

# Redirecting errors
`/challenge/run > myflag 2> instructions`, then `cat myflag`.

# Redirecting input
First write to PWN by redirecting `stdout`, then pass an argument to `/challenge/run` by redirecting `stdin`, like so:  
```
echo COLLEGE > PWN
/challenge/run < PWN
```

# Grepping stored results
First run `/challenge/run > /tmp/data.txt`. Then `grep pwn /tmp/data.txt`.

# Grepping live output
Pipe the output of `/challenge/run` into the input of `grep pwn` with `/challenge/run | grep pwn`.

# Grepping errors
Redirect stderr of `/challenge/run` to stdout and then pipe it to the stdin of `grep pwn`.  
`/challenge/run 2>& 1 | grep pwn`

# Duplicating piped data with tee
Use tee to debug `/challenge/pwn` as it goes to `/challenge/college`.
```
/challenge/pwn | tee output | /challenge/college
```
This returns
```
Usage: /challenge/pwn --secret [SECRET_ARG]

SECRET_ARG should be "UBKLWosk"
```
Now run
```
/challenge/pwn --secret UBKLWosk | /challenge/college
```

# writing to multiple programs
Need to run `/challenge/hack` and push the output to the `stdin` of `/challenge/the` and `/challenge/planet`.
```
/challenge/hack | tee >(/challenge/the) >(/challenge/planet)
```
This returns the flag.

# Split-piping stderr and stdout
Struggled initially, but turned out to be surprisingly straightforward.
```
/challenge/hack 2> >(/challenge/the) > >(/challenge/planet)
```