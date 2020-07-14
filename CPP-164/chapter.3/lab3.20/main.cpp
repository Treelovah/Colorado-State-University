// ## Instructions are imported from java 164 class.
// ## The syntax && logic flow might not follow exact instructions. 
/*
(1) Prompt the user to input a wall's height and width. Calculate and output the wall's area. (2 pts)

Note: This zyLab outputs a newline after each user-input prompt. For convenience in the examples below, the user's input value is shown on the next line, but such values don't actually appear as output when the program runs.

    Enter wall height (feet):
    12.0
    Enter wall width (feet):
    15.0
    Wall area: 180.0 square feet

(2) Extend to also calculate and output the amount of paint in gallons needed to paint the wall. Assume a gallon of paint covers 350 square feet. Store this value using a const double variable. (2 pts)

    Enter wall height (feet):
    12.0
    Enter wall width (feet):
    15.0
    Wall area: 180.0 square feet
    Paint needed: 0.5142857142857142 gallons

(3) Extend to also calculate and output the number of 1 gallon cans needed to paint the wall. Hint: Use a math function to round up to the nearest gallon. (2 pts)

    Enter wall height (feet):
    12.0
    Enter wall width (feet):
    15.0
    Wall area: 180.0 square feet
    Paint needed: 0.5142857142857142 gallons
    Cans needed: 1 can(s)

*/

#include <iostream>

class Paint_Estimator {
    public:
        void calculations(double wall_height, double wall_width) {
            // get wall area
            double wall_area {wall_height * wall_width};
            printf("Wall area: %.1f square feet\n",wall_area);
            // get paint needed
            double paint_needed {wall_area / 350.00};
            // set std precision for full double
            std::cout.precision(16);
            std::cout << "Paint needed: " << paint_needed << " gallons\n";
            // get cans needed
            printf("Cans needed: %d can(s)\n",(int)paint_needed + 1);
        }
};

int main(int argc, char const *argv[]) {
    Paint_Estimator lab_program {};
    double wall_height;
    double wall_width;
    std::cout << "Enter wall height (feet):\n";
    std::cin >> wall_height;
    std::cout << "Enter wall width (feet)\n";
    std::cin >> wall_width;
    std::cin.clear();
    lab_program.calculations(wall_height, wall_width);
    return 0;
}
