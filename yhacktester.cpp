/* 
	@desc Simple modulo calculator
	@author Team Cursed
	@date Today
	@ref iostream
	@ref cstdlib
*/
#include <iostream>
#include <cstdlib>

void printOut(int, int);

/*
	@note entry point of program
	@returns success state of program
*/
int main(int argc, char*argv[]){
    if (argc != 3){
        std::cout << "enter quotient then divisor after exe call" << std::endl;
        return -1;
    }
    int q = atoi(argv[1]);
    int d = atoi(argv[2]);
    std::cout << "Quotient: " << q/d << std::endl;
    std::cout << "Remainder" << q%d << std::endl;
    return 0;	// We're good to go!
}

/*
	@name printOut
	@function displays results to screen
	@param numerator the dividend of the math
	@param denominator the divisor of the math
*/
void printOut(int numerator, int denominator){
	std::cout << "Quotient: " << numerator/denominator << std::endl;
    std::cout << "Remainder" << numerator%denominator << std::endl;
}