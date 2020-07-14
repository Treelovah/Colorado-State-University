from pet import Pet
from dog import Dog

# Pet
myPet = Pet()

myPet.petName = input()
myPet.petAge = int(input())
myPet.printInfo()
# Dog
myDog = Dog()

myDog.petName = input()
myDog.petAge = input()
myDog.dogBreed = input()
myDog.printInfo()