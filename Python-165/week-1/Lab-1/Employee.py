from Person import Person

class Employee(Person):
    def __init__(self, name, age, salary, emp):
        super().__init__(name, age)
        self.employer = emp
        self.salary = salary

    def set_salary(self, salary):
        self.salary = salary

    def set_employer(self, emp):
        self.employer = emp
    
    def get_salary(self):
        return self.salary

    def get_employer(self):
        return self.employer

    def to_string(self):
        return f"{super().to_string()} They make {self.get_salary()} a year at {self.get_employer()}"