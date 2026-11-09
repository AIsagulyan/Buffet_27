num1 = int(input("Please enter a number:"))
op = input("Please enter an operation:")
num2 = int(input("Please enter another number: "))
if op == "+":
    result = num1 + num2
elif op == "-":
    result = num1 - num2
elif op == "*":
    result = num1 * num2
elif op == "/":
    result = num1 / num2
else:
    result = "Invalid operation"
print(f"{num1}{op}{num2}={result}")    