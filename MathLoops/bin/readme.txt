Math loops


The program consists of three methods:
1. Main
2.Prime
3.Factors


The main method executes the code and asking the user’s input with our prime method and the factors method. If the user enters prime and number, we print out if it’s true or not. If the user enters factors number, we print out all the factors.


Prime method determines if the number user enters prime or not.
If the number is smaller than 2, it’s a prime number. Otherwise, let the number keep divided by a factor greater than 2 using the for loops. If the number mod factor equals 0, it’s not a prime number(return false). Since we are using a boolean method, the last line will be a return statement.


The factors method gets every factor of the number. It keeps looping as long as the strating factor 2 is smaller than the user input.  If the number mod factor is 0 and it’s a prime number, then we add the factor into our answer. Otherwise, we add the factor by one and repeat the process. In the end, we return the result.