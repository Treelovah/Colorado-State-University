class Course:
    def __init__(self):
        self.courseNumber = ""
        self.courseTitle = ""

    def printInfo(self):
        print("Course Information:")
        print(f"   Course Number: {self.courseNumber}\n   Course Title: {self.courseTitle}")
