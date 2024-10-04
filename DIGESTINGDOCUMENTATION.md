# Learning From Documentation
Straightforward, run `/challenge/challenge --giveflag`.

# Learning Complex Usage
The problem description does not specify where the flag is located, after a lot of trial and error, found the `flag` file in `/`. After that the command is straightforward, `/challenge/challenge --printfile /flag`.

# Reading Manuals
Start off by reading manual for `challenge`.  
It states
```
--xwjdeq NUM
              print the flag if NUM is 919
```
in the description.
Run `/challenge/challenge --xwjdeq 919`.

# Searching Manuals
Search for `flag` in the `challenge` manual, will find argument `--xkfohsd` that returns the flag.

# Searching for Manuals
It was not clear whatsoever what had to be done after running `man man`. After a long while of going back and forth with SENSAI, it suggested to search for options like `-k`. Running `man -k challenge` returned `eslkpxxrom (1)       - print the flag!`.
Now read the manual for `eslkpxxrom`, it reveals:
```
--eslkpx NUM
              print the flag if NUM is 435
```
Run `/challenge/challenge --eslkpx 435`

# Helpful Programs
Run `/challenge/challenge --help`. It reveals
```
-g GIVE_THE_FLAG, --give-the-flag GIVE_THE_FLAG
                        get the flag, if given the correct
                        value
  -p, --print-value     print the value that will cause
                        the -g option to give you the flag
```
So run the command with the argument `-p`, it returns
```
The secret value is: 633
```
Now run `/challenge/challenge -g 633`.

# Help for Builtins
Run `help challenge`, it returns
```
--secret VALUE    prints the flag, if VALUE is correct

    You must be sure to provide the right value to --secret. That value
    is "8EDexigC".
```
Now run `challenge --secret 8EDexigC`.
