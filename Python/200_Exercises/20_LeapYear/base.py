year = input("What year would you like to check?  ")
year = (int)(year)
if year % 4 != 0:
    print(str(year)+ " is not a leap year")
elif year % 400 != 0 and year % 4 ==0:
    print(str(year)+ " is not a leap year")
else:
    print(str(year)+ " is aleap year")
