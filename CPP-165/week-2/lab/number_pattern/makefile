main: src/main.o src/number_pattern.o
	g++ src/main.o src/number_pattern.o -o main

main.o: src/main.cpp src/number_pattern.cpp
	g++ -c src/main.cpp src/number_pattern.cpp

clean:
	rm src/*.o main
