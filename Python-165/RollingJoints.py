# recursion problem

'''
Role N amount of cannabis joints, recurrsively.
''' 

joints = ["Ghost OG", "BlueBerry Haze", "Sour Deisel", "Silver Haze", "Alien Dawg"]

def roll_joints_recursively(joints):
    if (len(joints) == 1):
        joint = joints[0]
        print(f"Worker is rolling {joint}")
    else:
        mid = len(joints) // 2
        first_half = joints[:mid]
        second_half = joints[mid:]
        
        roll_joints_recursively(first_half)
        roll_joints_recursively(second_half)

roll_joints_recursively(joints)