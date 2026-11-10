max = int(input("Please enter a num:"))
sum = 0
for count in range(1, max):
    print(count, end="+")
    sum = sum + count 
print(max)
sum = sum + max

print("The sum is " + str (sum))    
