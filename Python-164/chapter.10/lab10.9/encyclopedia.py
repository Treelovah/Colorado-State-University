from book import Book
class Encyclopedia(Book):
    
    def __init__(self):
        self.edition = ""
        self.numVolumes = 0

    # no need to override parent, python does that automatically.
    def printInfo(self):
        super().printInfo()
        print(f"   Edition: {self.edition}")
        print(f"   Number of Volumes: {self.numVolumes}")