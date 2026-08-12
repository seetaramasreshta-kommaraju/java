import random
a = "abcdefghijklmnopqrstuvwxyz"
b = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
c = "0123456789"
d = "!@#$%^&*.-_=+':;><,?/|~"
res = a+b+c+d
password = "".join(random.sample(res, 8))
print("Your password is: ", password)