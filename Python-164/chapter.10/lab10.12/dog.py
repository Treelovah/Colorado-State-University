from pet import Pet
class Dog(Pet):

    def __init__(self):
        self.dogBreed = ""
    
    def printInfo(self):
        super().printInfo()
        print(f"   Breed: {self.dogBreed}")