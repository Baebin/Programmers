#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

long long solution(long long n) {
    long long answer = -1;

    double i = sqrt(n);
    if (i == (int)i) return (i + 1) * (i + 1);

    return answer;
}