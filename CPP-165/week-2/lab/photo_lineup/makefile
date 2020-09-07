main: src/main.o
	g++ -std=c++11 src/main.o -o main

main.o: src/main.cpp
	g++ -std=c++11 -c src/main.cpp

clean:
	rm src/*.o main
