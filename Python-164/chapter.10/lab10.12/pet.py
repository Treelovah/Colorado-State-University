class Pet:
    def __init__(self):
        self.petName = ""
        self.petAge = 0
    
    def printInfo(self):
        print("Pet Information:")
        print(f"   Name: {self.petName}\n   Age: {self.petAge}")