#include "Book.h"

class Encyclopedia : public Book
{
    private:
        string edition = "";
        int num_volumes = 0;

    public:
        void set_edition(string edition) { this->edition = edition; }
        
        void set_num_volumes(int num_volumes) { this->num_volumes = num_volumes; }
 
        string get_edition() { return this->edition; }

        int get_num_volumes() { return this->num_volumes; }
        
        void print_info()
        {
            // why override, when you can just do this :)
            Book::print_info();
            std::cout << "   Edition: " << get_edition() << '\n';
            std::cout << "   Number of Volumes: " << get_num_volumes() << std::endl;
        }
};