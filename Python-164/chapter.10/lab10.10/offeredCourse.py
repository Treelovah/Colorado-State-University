from course import Course

class OfferedCourse(Course):

    def __init__(self):
        self.instructorName = ""
        self.term = ""
        self.classTime = ""

    def printInfo(self):
        super().printInfo()
        print(f"   Instructor Name: {self.instructorName}\n   Term: {self.term}\n   Class Time: {self.classTime}")