# cat: not the pet, but the command!
Run `cat flag`.

# catting absolute paths
Run `cat /flag`.

# more catting practice
Run `cat /lib/R/etc/flag`.

# grepping for a needle in a haystack
Run `grep pwn.college /challenge/data.txt`.

# listing files
List all files in `/challenge` with `ls /challenge`, one of the files is named `17290-renamed-run-12529`, clearly a renamed `run` file. Finally run `/challenge/17290-renamed-run-12529`.

# touching files
Create the required files with `touch pwn college`, then run `/challenge/run`.

# removing files
`cd` into `~`, `rm` `delete_me`, then run `/challenge/check`.

# hidden files
`cd` into `/`, run `ls -a`, a file named `.flag-63231196024962` shows up. Wasted a lot of time trying to run it, eventually figured out (with the help of SENSAI) that it can be read with `cat`.

# An Epic Filesystem Quest
`cd` into `/` since that's step 0.
Use `ls -a`, no hidden files but one named `DISPATCH` which contains a directory (`/usr/share/racket/pkgs/srfi-lib/srfi/64`) to the next clue.  
`cd` over to that directory, `ls -a` reveals a file named `GIST`, it contains the directory (`/opt/angr-management/_internal/pypcode/processors/MC6800/data/languages`) to the next clue.  
Over there exists a file named `POINTER`, contains a directory (`/opt/pwndbg/.venv/lib/python3.8/site-packages/rpyc-6.0.0.dist-info`) where the clue will not be readable until I enter the directory with `cd`.  
So that's what I do, find a few files, `NUGGET` contained the next directory (`/usr/local/lib/python3.8/dist-packages/platformdirs-4.3.3.dist-info/licenses`) to the clue (found it first try, then wasted time checking the other files). This directory contains a hidden file.  
`ls -a` reveals `.EVIDENCE`, contains directory `/opt/pwndbg/.venv/lib/python3.8/site-packages/pip/_vendor/resolvelib/compat`, which I cannot `cd` into, else the clue will self-destruct.  
Use `ls /opt/pwndbg/.venv/lib/python3.8/site-packages/pip/_vendor/resolvelib/compat` to find the file `ALERT-TRAPPED`, then `cat /opt/pwndbg/.venv/lib/python3.8/site-packages/pip/_vendor/resolvelib/compat/ALERT-TRAPPED` to get the next directory, `/opt/linux/linux-5.4/drivers/target/iscsi/cxgbit` which I again cannot `cd` into.
Same process, `ls /opt/linux/linux-5.4/drivers/target/iscsi/cxgbit` reveals `MEMO-TRAPPED`, `cat /opt/linux/linux-5.4/drivers/target/iscsi/cxgbit/MEMO-TRAPPED` reveals directory `/opt/linux/linux-5.4/arch/sh/include/cpu-sh2a/cpu`.  
Repeat same steps, find directory `/usr/local/share/afl/testcases/multimedia`, where the clue only becomes readable once the directory is `cd`ed into.  
The directory contains a file `LEAD`, which contains the flag.

# making directories
Straightforward:
```
mkdir /tmp/pwn
touch /tmp/pwn/college
/challenge/run
```

# finding files
Run `find / -name flag` to find all files named flag in the system. 
Possible locations:
```
1: /usr/local/lib/python3.8/dist-packages/pwnlib/flag
2: /usr/local/share/radare2/5.9.5/flag
3: /usr/share/racket/pkgs/gui-lib/mrlib/hierlist/flag
4: /opt/pwndbg/.venv/lib/python3.8/site-packages/pwnlib/flag
5: /opt/radare2/libr/flag
6: /nix/store/1yagn5s8sf7kcs2hkccgf8d0wxlrv5sz-radare2-5.9.0/share/radare2/5.9.0/flag
7: /nix/store/pmvk2bk4p550w182rjfm529kfqddnvh3-python3.11-pwntools-4.12.0/lib/python3.11/site-packages/pwnlib/flag
```
1 contains `flag.py`, not permitted to run it.  
2 contains `tags.r2`, not permitted to run it.  
3: not permitted to run.  
4 contains `flag.py`, not permitted to run it.  
5 contains multiple files, not permitted to run any.  
6, 7 contain `tags.r2`, not permitted to run it.  

Retry 3 with `cat`, file contains the flag.

# linking files
Tried running `/challenge/catflag`, turns out `/home/hacker/not-the-flag` does not exist. So it can be created as a symbolic link to `/flag`. Hence run `ln -s /flag /home/hacker/not-the-flag`, then run `/challenge/catflag`, which returns the flag.
