'''
/*
(1) Prompt the user to enter five numbers, being five people's weights. Store the numbers in an array of doubles. 

Output the array's numbers on one line, each number followed by one space. (2 pts)

Ex:

Enter weight 1:
236.0
Enter weight 2:
89.5
Enter weight 3:
142.0
Enter weight 4:
166.3
Enter weight 5:
93.0
You entered: 236.0 89.5 142.0 166.3 93.0

(2) Also output the total weight, by summing the array's elements. (1 pt)

(3) Also output the average of the array's elements. (1 pt)

(4) Also output the max array element. (2 pts)

Ex:

Enter weight 1:
236.0
Enter weight 2:
89.5
Enter weight 3:
142.0
Enter weight 4:
166.3
Enter weight 5:
93.0
You entered: 236.0 89.5 142.0 166.3 93.0

Total weight: 726.8
Average weight: 145.35999999999999
Max weight: 236

*/
'''
def totalWeight(arr):
    totalWeight = 0.0
    for i in arr:
        totalWeight = totalWeight + i
    return totalWeight

def averageWeight(arr):
    averageWeight = totalWeight(arr) / len(arr)
    return averageWeight

def getMax(arr):
    num = 0
    for i in arr:
        if i > num:
            num = i
    return int(num)
arr = []

for i in range(1,6):
    arr.append(float(input(f"Enter weight {i}:\n")))

print("You entered:", end=" ")
for i in arr:
    print(i, end=" ")
print("\n")

print(f"Total weight: {totalWeight(arr)}") # get total weight
print(f"Average weight: {averageWeight(arr)}") # get average weight
print(f"Max weight: {getMax(arr)}") # get max weight