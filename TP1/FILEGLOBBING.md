# Matching with *
Run `cd /ch*` to `cd` into `/challenge`. Then run `./run`.

# Matching with ?
Run `cd /?ha??enge`, then `./run`.

# Matching with []
`cd` into `/challenge/file`, then use `file_[bash]` as the argument.

# Matching paths with []
Same as previous but include the entire file path; `/challenge/run /challenge/files/file_[bash]`.

# Mixing globs
`cd` into `/challenge/files`. The glob presumably has at least one `*` and one pair of `[]`. Those account for 3 characters. The other 3 characters might be letters.  
Upon further consideration, there must be two `*`, since both ends of all the words are unique. So it can be assumed there are 2 letters.  
The highest probability is that both letters are inside the `[]`.  
A few trials reveal that `pwning` is the only word with `p` in it (this assessment turned out to be incorrect). Now some more trial-and-error to find the unique character in the other two words.  
It's clear there's no unique character in `challenging` and `educational` to set them apart from the rest of the words. My approach must be modified.  
Consider the cases where only one `*` is used. `*[gl]` does not work, but `[cep]*` does.

# Exclusionary globbing
Straightforward, `cd` into `/challenge/files`, then run `/challenge/run [!pwn]`.
