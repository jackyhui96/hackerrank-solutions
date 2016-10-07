#include <stdio.h>

int main() {
    int i = 4;
    double d = 4.0;
    char s[] = "HackerRank ";

   // Declare second integer, double, and String variables.
    int j = 0;
    double e = 0.0;
    char t[100];
    // Read and save an integer, double, and String to your variables.
    scanf("%d", &j);
    scanf("%lf", &e);
    scanf(" %[^\n]", t);
    // Print the sum of both integer varaibles on anew line.
    int intSum = i + j;
    printf("%d\n", intSum);
    // Print the sum of the double variables on a new line.
    double doubleSum = d + e;
    printf("%.1f\n", doubleSum);
    // Concatenate and print the String variables on a new line
    // The 's' variable above should be printed first.
    printf("%s", s);
    printf("%s", t);

    return 0;
}