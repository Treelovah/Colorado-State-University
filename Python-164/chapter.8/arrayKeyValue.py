'''
/*
 Find the maximum value and minimum value in milesTracker. 
 Assign the maximum value to maxMiles, and the minimum value to minMiles. 
 Sample output for the given program:

Min miles: -10
Max miles: 40
*/
'''
# writing this in OOP for python OOP demonstration during tutoring
milesTracker = []
for i in range(4):
    a = int(input("Enter number: "))
    milesTracker.append(a)

mini = milesTracker[0]
maxi = milesTracker[0]
for i in range(len(milesTracker)):
    if milesTracker[i] > maxi:
        maxi = milesTracker[i]
    if milesTracker[i] < mini:
        mini = milesTracker[i]

print(f"\nMin miles: {mini}\nMax miles: {maxi}")