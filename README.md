
# What is Caesar Cipher ?
In cryptography, a Caesar cipher, also known as Caesar's cipher, the shift cipher, Caesar's code or Caesar shift, is one of the simplest and most widely known encryption techniques. It is a type of substitution cipher in which each letter in the plaintext is replaced by a letter some fixed number of positions down the alphabet. [[More]](https://en.wikipedia.org/wiki/Caesar_cipher "More")

# Encryption
#### Exemples
##### LEFT SHIFT OF 3
![](https://upload.wikimedia.org/wikipedia/commons/4/4a/Caesar_cipher_left_shift_of_3.svg)

The action of a Caesar cipher is to replace each plaintext letter with a different one a fixed number of places down the alphabet. The cipher illustrated here uses a left shift of three, so that (for example) each occurrence of E in the plaintext becomes B in the ciphertext

` Left Shift Of 3`

`plaintext :      ABCDEFGHIJKLMNOPQRSTUVWXYZ`

`ciphertext :    XYZABCDEFGHIJKLMNOPQRSTUVW`

#####  RIGHT SHIFT OF 3

![Right shift of 3](https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/Caesar3.svg/1200px-Caesar3.svg.png "Right shift of 3")

The cipher illustrated here uses a right shift of three, so each occurrence of B in the plaintext becomes E in the ciphertext.

` Right Shift Of 3`

`plaintext :      ABCDEFGHIJKLMNOPQRSTUVWXYZ`

`ciphertext :    DEFGHIJKLMNOPQRSTUVWXYZABC`

     Plaintext : is the input message to be encrypted .
     Ciphertext :  is the encrypted output message. 

### How it work ?
**Input:**

 1.  String plaintext.
 2. An Integer between 0-25 representing the shift  .
 
# Decryption
Caesar code decryption replaces a letter another with an inverse alphabet shift: a previous letter in the alphabet.
#### Exemple

` Right Shift Of 3`

`plaintext :      DEFGHIJKLMNOPQRSTUVWXYZABC`

`ciphertext :    ABCDEFGHIJKLMNOPQRSTUVWXYZ`
