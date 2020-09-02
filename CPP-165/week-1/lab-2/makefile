movies: src/main.o src/movie.o src/movie_analysis.o
	g++ src/main.o src/movie.o src/movie_analysis.o -o movies

main.o: src/main.cpp
	g++ -c src/main.cpp

movie.o: src/movie.cpp
	g++ -c src/movie.cpp

movie_analysis.o: src/movie_analysis.cpp
	g++ -c src/movie_analysis.cpp

clean:
	rm src/*.o movies