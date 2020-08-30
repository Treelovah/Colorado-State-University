movies: main.o movie.o movie_analysis.o
	g++ main.o movie.o movie_analysis.o -o movies

main.o: main.cpp
	g++ -c main.cpp

movie.o: movie.cpp
	g++ -c movie.cpp

movie_analysis.o: movie_analysis.cpp
	g++ -c movie_analysis.cpp

clean:
	rm *.o movies