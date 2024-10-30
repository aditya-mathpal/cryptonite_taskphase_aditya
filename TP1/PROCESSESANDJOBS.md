# Listing Processes
Run `ps -ef`, which reveals:
```
root          68       1  0 07:02 ?        00:00:00 /challenge/5581-run-27395
```
Now run `cat 5581-run-27395`.

# Killing Processes
I tried `ps -e | grep dont_run` to find the PID of `/challenge/dont_run`, found out later it's because I had to use `ps -ef`.  
Regardless, I ran `ps -ef`, found the PID of `/challenge/dont_run`, killed it, and then ran `/challenge/run`.

# Interrupting Processes
Run `/challenge/run` and it'll say
```
I could give you the flag... but I won't, until this process exits. Remember, 
you can force me to exit with Ctrl-C. Try it now!
```
Force it to exit with Ctrl-C, and it returns the flag.

# Suspending Processes
Run `/challenge/run`, suspend it with Ctrl-Z, then run another instance of it.

# Resuming Processes
Run `/challenge/run`, suspend it with Ctrl-Z, then resume it with `fg`.

# Backgrounding Processes
Run `/challenge/run`, suspend it with Ctrl-Z, then resume it with `bg`, then run another instance of `/challenge/run`.

# Foregrounding Processes
Run `/challenge/run`, suspend it by hitting Ctrl-Z, have it run in the background with `bg`, then foreground it with `fg`, then it'll ask to hit enter to get the flag, do that.

# Starting Backgrounded Processes
Run `/challenge/run &`.

# Process Exit Codes
Run `/challenge/get-code`, print its exit code to the terminal with `echo $?`. It's 139, so pass it as an argument to `/challenge/submit-code` by running `/challenge/submit-code 139`.