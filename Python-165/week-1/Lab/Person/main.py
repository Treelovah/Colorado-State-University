from Person import Person
from Employee import Employee
from Manager import Manager

p = Person("Bob", 29)
e = Employee("Shmo", 25, 46000, "")
m = Manager(p.name, p.age, 65000, "Joe's Bar & Grill")

arr = [p, e, m]

for i in arr:
    print(i.to_string())
