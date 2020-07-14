from course import Course
from offeredCourse import OfferedCourse

myCourse = Course()
myOfferedCourse = OfferedCourse()

# Course
myCourse.courseNumber = input()
myCourse.courseTitle = input()
myCourse.printInfo()

# Offered Course
myOfferedCourse.courseNumber = input()
myOfferedCourse.courseTitle = input()
myOfferedCourse.instructorName = input()
myOfferedCourse.term = input()
myOfferedCourse.classTime = input()
myOfferedCourse.printInfo()