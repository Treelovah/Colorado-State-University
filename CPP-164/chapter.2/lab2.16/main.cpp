// ## Instructions are imported from java 164 class.
// ## The syntax && logic flow might not follow exact instructions. 

/*
Sites like Zillow get input about house prices from a database and provide nice summaries for readers. 
Write a program with two inputs, current price and last month's price (both integers). 
Then, output a summary listing the price, the change since last month, and the estimated monthly mortgage computed as (currentPrice * 0.051) / 12 (Note: Output directly. 
Do not store in a variable.).

Ex: If the input is:

    200000 210000

the output is: 

    This house is $200000. The change is $-10000 since last month.
    The estimated monthly mortgage is $850.0.

Note: Getting the precise spacing, punctuation, and newlines exactly right is a key point of this assignment. Such precision is an important part of programming.
*/
#include <iostream>

using namespace std;

namespace Zillow
{
    struct House
    {
        double current_price, last_month_price;
        void get_prices_of_houses(double &current_price, double &last_month_price)
        {
            cout << "This house is $" << this->current_price << ". The change is $" <<  this->current_price - this->last_month_price << " since last month.\n";
            cout << "The estimated monthly mortgage is $" << (this->current_price * 0.051) / 12 << endl;
        }
    };
}

int main(int argc, char const *argv[])
{   
    Zillow::House client;
    cin >> client.current_price;
    cin >> client.last_month_price;

    client.get_prices_of_houses(client.current_price, client.last_month_price);
    return 0;
}