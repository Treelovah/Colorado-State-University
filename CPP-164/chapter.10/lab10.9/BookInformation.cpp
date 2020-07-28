#include <iostream>
#include "Encyclopedia.h"

int main(int argc, char const *argv[])
{
    Book my_book;
    Encyclopedia my_encyclopedia;

    std::string title, author, publisher, publication_date, e_title, e_author, e_publisher, e_publication_date, edition;
    int num_volumes;

    getline(std::cin, title);
    getline(std::cin, author);
    getline(std::cin, publisher);
    getline(std::cin, publication_date);

    getline(std::cin, e_title);
    getline(std::cin, e_author);
    getline(std::cin, e_publisher);
    getline(std::cin, e_publication_date);
    getline(std::cin, edition);
    std::cin >> num_volumes;

    my_book.set_title(title);
    my_book.set_author(author);
    my_book.set_publisher(publisher);
    my_book.set_publication_date(publication_date);
    my_book.print_info();

    my_encyclopedia.set_title(e_title);
    my_encyclopedia.set_author(e_author);
    my_encyclopedia.set_publisher(e_publisher);
    my_encyclopedia.set_publication_date(e_publication_date);
    my_encyclopedia.set_edition(edition);
    my_encyclopedia.set_num_volumes(num_volumes);
    my_encyclopedia.print_info();
    return 0;
}
