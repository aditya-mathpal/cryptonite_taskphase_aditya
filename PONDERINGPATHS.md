# The Root
Run the `pwm` program by entering its path, `/pwm`.

# Program and absolute paths
Run the `run` program by entering its path, `/challenge/run`.

# Position thy self
Try running the `run` program the same way. It detects you're running the `run` program from a different directory which returns
```
Incorrect...
You are not currently in the /tmp directory.
Please use the `cd` utility to change directory appropriately.
```

So now run `cd /tmp` to go to the right directory, then run `/challenge/run`.

# Position elsewhere
Same steps as previous.

# Position yet elsewhere
Same steps yet again.

# implicit relative paths, from /
Since the relative path starts with c, it must be `challenge/run`. This can be verified by trying to run `/challenge/run`. `cd` into `/`, run `challenge/run`.

#explicit relative paths, from /
Try the same steps as previous challenge, it returns
```
Incorrect...
This challenge must be called with a relative path that explicitly starts with a `.`!
```
So change the command to `./challenge/run`.

# implicit relative path
Try running `/challenge/run`, get told to `cd` to `/challenge`, do that then run `./run`.

#home sweet home
The flag will be copied to a file I specify, as long as the conditions are satisfied. First thing I came up with was `~/.` but it doesn't work. Had to use SENSAI for help, realised `.` should be a filename and how the copy command works; ultimately ran `/challenge/run ~/c`.
