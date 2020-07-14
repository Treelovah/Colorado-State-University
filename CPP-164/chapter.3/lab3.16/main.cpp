// ## Instructions are imported from java 164 class.
// ## The syntax && logic flow might not follow exact instructions. 
/*
/  The following equations estimate the calories burned when exercising (source):
/
/  Women: Calories = ( (Age x 0.074) — (Weight x 0.05741) + (Heart Rate x 0.4472) — 20.4022 ) x Time / 4.184
/
/  Men: Calories = ( (Age x 0.2017) + (Weight x 0.09036) + (Heart Rate x 0.6309) — 55.0969 ) x Time / 4.184
/
/  Write a program using inputs age (years), weight (pounds), heart rate (beats per minute), and time (minutes), respectively. Output calories burned for women and men.
/
/  Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
/  System.out.printf("%.2f", yourValue);
/
/  Ex: If the input is:
/
/    49 155 148 60

/  The output is:
/
/    Women: 580.94 calories
/    Men: 891.47 calories
*/
#include <iostream>
#include <string>

void get_input() {
    double age;
    double weight;
    double heart_rate;
    double time;
    std::cin >> age;
    std::cin >> weight;
    std::cin >> heart_rate;
    std::cin >> time;
    void calculate(double age, double weight, double heart_rate, double time);
    calculate((double)age, (double)weight, (double)heart_rate, (double)time);
}

void calculate(double age, double weight, double heart_rate, double time) {
    double men_calories = ((age * 0.2017) + (weight * 0.09036) + (heart_rate * 0.6309) - 55.0969) * time / 4.184;
    double women_calories = ((age * 0.074) - (weight * 0.05741) + (heart_rate * 0.4472) - 20.4022) * time / 4.184;
    printf("Women: %.2f calories\n",women_calories);
    printf("Men: %.2f calories\n",men_calories);
}

int main(int argc, char const *argv[])
{
    get_input();
    return 0;
}
