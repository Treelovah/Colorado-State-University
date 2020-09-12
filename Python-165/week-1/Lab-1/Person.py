class Person():
    def __init__(self, name, age):
        self.name = name
        self.age = age
    
    def set_name(self, name):
        self.name = name

    def set_age(self, age):
        self.age = age

    def get_name(self):
        return self.name

    def get_age(self):
        return self.age

    def to_string(self):
        return f"{self.name} is {self.age} years old."