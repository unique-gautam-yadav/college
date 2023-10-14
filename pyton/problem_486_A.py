# if n is even n / 2 else ((n / 2 ) to int) - n

n = int(input("enter value of n - "))

if(n % 2 == 0):
    print(int(n / 2))
else :
    print(int(n / 2) - n )