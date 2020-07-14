headers = []
dataPointString = []
dataPoint = []

def getTitle():
    return input("Enter a title for the data:\n")

def getHeaders():
    for i in range(1,3):
        headers.append(input(f"Enter the column {i} header:\n"))
        print(f"You entered: {headers[i-1]}")

def getDataPoints():
    check = True

    while check:
        userInput = input("Enter a data point (-1 to stop input):\n")
        if userInput == "-1":
            check = False
            break
        if ',' in userInput:
            if userInput.count(",") > 1:
                print("Too many commas in input.\n")
                getDataPoints()
                break
            else:
                try:
                    parts = userInput.split(",")
                    parts[1] = parts[1].replace(" ", "")
                    dataPointString.append(parts[0])
                    dataPoint.append(int(parts[1]))
                except TypeError:
                    getDataPoints()
                for i in range(len(dataPointString)):
                    print(f"\nData string: {dataPointString[i]}\nData integer: {dataPoint[i]}\n")
        else:
            print("Error: No comma in string\n")


def printTable(title):
    print(f'{title:>33}')
    print(f'{headers[0]: <20}|{headers[1]: >23}')
    print("--------------------------------------------")
    for i in range(len(dataPointString)):
        print(f'{dataPointString[i]: <20}|{dataPoint[i]: >23}')
    
def getHistogram():
    print()
    for i in range(len(dataPointString)):
        asterisk = ""
        for j in range(int(dataPoint[i])):
            asterisk = asterisk + "*"
        print(f'{dataPointString[i]: <20} {asterisk: <20}')    

title = getTitle()
getHeaders()
getDataPoints()
printTable(title)
getHistogram()