w = int(input("value of w - "))
k = int(input("value of k - "))

n = int(input("value of n - "))

amt = ( k * ( w  * ( w + 1 ))) / 2

if(amt > n):
    print(amt - n)
else :
    print(0)