# ans = n (distance) / 5
# ans to its ceil value

dist = int(input("Enter distance - "))

if(dist % 5 == 0):
    print(int(dist / 5))
else:
    print(int(dist / 5) + 1)