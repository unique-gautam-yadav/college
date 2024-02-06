# condition m * n should be greater than or equal to 2 ;;
# (m * n) / 2 = (int)//

m = int(input("Enter value of m - "))
n = int(input("Enter value of n - "))

if(int(m * n  / 2) < 2):
    print("0")
else:
    print(int(m * n / 2))