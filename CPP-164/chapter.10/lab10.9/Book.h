#include <iostream>
#include <stdio.h>

using namespace std;

class Book 
{
    private:
        string title, author, publisher, publication_date;
    public:
        void set_title(string user_title) { title = user_title; }

        void set_author(string user_author) { author = user_author; }

        void set_publisher(string user_publisher) { publisher = user_publisher; }

        void set_publication_date(string user_publication_date) { publication_date = user_publication_date; }
        
        void print_info()
        {
            printf("Book Information:\n");
            std::cout << "   Book Title: " << title << '\n';
            std::cout << "   Author: " << author << '\n';
            std::cout << "   Publisher: " << publisher << '\n';
            std::cout << "   Publication Date: " << publication_date << std::endl;
        }
        string get_title() { return title; }

        string get_author() { return author; }

        string get_publisher() { return publisher; }

        string get_publication_date() { return publication_date; }
};