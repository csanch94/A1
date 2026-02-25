Part 1
    1. A. This is the answer because 570 is boundary value where the condition holds true, 570 == numberOfPoints.
    Whereas 571 is just outside the boundary 571 > numberOfPoints.
    2. The on point for x == 10 is 10 because that is the only value where the condition holds true. The off
    points are 9 and 11 because those two values are just outside the boundary so in this case where the boundary
    is 10, the values that don't equal 10 and are close to the number are 9 and 11.
    3. Since the input is a string, some boundary cases that can be tested is if the input instead of having
    letters, it has other symbols like special characters or characters of a different language. This may
    exercise the program in the way that it might break or further strengthen the program as it validates
    only specific characters.

Part 3
    There is a bug in the program. One would expect that when adding two of my lists, in this case my test
    adds an empty list (left) with a list of multiple values (right), that when adding them would just equal right.
    But what ends up happening is that when you add the two values, the lists being used to add them get
    reversed which is certainly an unintended feature.