main: src/main.o src/Coffee.o src/Business.o
	g++ src/main.o src/Coffee.o src/Business.o -o main

main.o: src/main.cpp
	g++ -c src/main.cpp

Coffee.o: src/Coffee.cpp
	g++ -c src/Coffee.cpp

Business.o: src/Business.cpp
	g++ -c src/Business.cpp

clean:
	rm src/*.o main
