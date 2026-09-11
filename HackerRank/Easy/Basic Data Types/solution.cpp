// HackerRank Problem: Basic Data Types
// Link: https://www.hackerrank.com/challenges/c-tutorial-basic-data-types/problem
// Difficulty: Easy
// Language: cpp

#include <iostream>
#include <iomanip>

int main() {
    int i;
    long l;
    char c;
    float f;
    double d;
    
    // Read input
    std::cin >> i >> l >> c >> f >> d;
    
    // Print output with required precision
    std::cout << i << "\n";
    std::cout << l << "\n";
    std::cout << c << "\n";
    std::cout << std::fixed << std::setprecision(3) << f << "\n";
    std::cout << std::fixed << std::setprecision(9) << d << "\n";
    
    return 0;
}
