# Instructions are imported from java 164 class.
# The syntax && logic flow might not follow exact instructions. 
'''
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
'''

def calculate_area(wall_height, wall_width):
    wall_area = wall_height * wall_width
    print("Wall area: %.1f square feet" % wall_area)
    return wall_area

def calculate_paint(wall_area):
    gallons_needed = wall_area / 350.00
    print(f"Paint needed: {gallons_needed} gallons")
    return gallons_needed

def calculate_need(cans_needed):
    if cans_needed > 0.0 and cans_needed < 1.0:
        return f"Cans needed: {int(cans_needed) + 1} can(s)"
    else:
        return f"Cans needed: {int(cans_needed + 1)} can(s)"

def main():
    wall_height = input("Enter wall height (feet): ")
    wall_width = input("Enter wall width (feet): ")
    wall_area = calculate_area(float(wall_height), float(wall_width))
    gallons_needed= calculate_paint(wall_area)
    print(calculate_need(gallons_needed))
    

main()