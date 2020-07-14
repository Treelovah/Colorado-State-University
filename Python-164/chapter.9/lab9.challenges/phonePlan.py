class PhonePlan:
    freeMinutes = 0
    freeMessages = 0

    def __init__(self, numMinutes, numMessages):
        self.freeMinutes = numMinutes
        self.freeMessages = numMessages

    def print(self):
        print(f"Minutes: {self.freeMinutes}, Messages: {self.freeMessages}")