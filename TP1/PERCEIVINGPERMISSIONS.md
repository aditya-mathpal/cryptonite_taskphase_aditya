# Changing File Ownership
Running `cat /flag` shows that `hacker` doesn't have permission to view it. Fix this by running `chown hacker /flag`.

# Groups and Files
```
chgrp hacker /flag
cat /flag
```

# Fun With Groups Names
`id` reveals `uid=1000(hacker) gid=1000(grp27014) groups=1000(grp27014)`.
```
chgrp grp27014 /flag
cat /flag
```

# Changing Permissions
Give everybody read, write, and execute permissions for all files by running `chmod ugo+rwx *` (later realised only `u` was needed). Then run `cat /flag` to get the flag.

# Executable Files
Give the user execute permission with `chmod u+x /challenge/run`. Then run `/challenge/run`.

# Permission Tweaking Practice
The following commands have to be used per task:
```
chmod o-r /challenge/pwn
chmod go+x /challenge/pwn
chmod u-rw /challenge/pwn
chmod ugo+rw /challenge/pwn
chmod g-r /challenge/pwn
chmod o-r /challenge/pwn
chmod o+r /challenge/pwn
chmod g-wx /challenge/pwn
```
Now the ownership of /flag is updated, use `chmod u+r /flag` to make it readable to the `hacker` user, then read it with `cat /flag`.

# Permissions Setting Practice
The following commands have to be used per task:
```
chmod g=-,o=x /challenge/pwn
chmod u=x,g=rwx,o=- /challenge/pwn
chmod u=-,g=x,o=r /challenge/pwn
chmod u=r,g=rx,o=w /challenge/pwn
chmod u=rwx,g=rw /challenge/pwn
chmod u=wx,g=-,o=x /challenge/pwn
chmod u=r,g=rw,o=rw /challenge/pwn
chmod g=r,o=r /challenge/pwn
```
Now the ownership of /flag is updated, use `chmod u=r /flag` to make it readable to `hacker`, then read it with `cat /flag`.

# The SUID Bit
Run `chmod u+s /challenge/getroot` to add the necessary SUID bit. Then run `/challenge/getroot` to open up a `root` shell and run `cat /flag` to get the flag.