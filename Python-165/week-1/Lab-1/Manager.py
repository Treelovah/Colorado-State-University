from Employee import Employee


class Manager(Employee):
    def __init__(self, name, age, salary, emp):
        super().__init__(name, age, salary, emp)

    def to_string(self):
        return f"{super().get_name()} is a manager at {super().get_employer()}" \
               f" whom receives {super().get_salary()} per year."