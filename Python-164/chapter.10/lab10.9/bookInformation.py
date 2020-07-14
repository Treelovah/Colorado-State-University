from book import Book
from encyclopedia import Encyclopedia
# Book
myBook = Book()

myBook.title = input()
myBook.author = input()
myBook.publisher = input()
myBook.publicationDate = input()
myBook.printInfo()

# Encyclopeida
myEncyclopedia = Encyclopedia()

myEncyclopedia.title = input()
myEncyclopedia.author = input()
myEncyclopedia.publisher = input()
myEncyclopedia.publicationDate = input()
myEncyclopedia.edition = input()
myEncyclopedia.numVolumes = input()
myEncyclopedia.printInfo()

