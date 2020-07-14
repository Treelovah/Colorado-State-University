class Book:

    def __init__(self):
        self.title = ""
        self.author = ""
        self.publisher = ""
        self.publicationDate = ""
    def printInfo(self):
        print("Book Information: ")
        print(f"   Book Title: {self.title}")
        print(f"   Author: {self.author}")
        print(f"   Publisher: {self.publisher}")
        print(f"   Publication Date: {self.publicationDate}")
