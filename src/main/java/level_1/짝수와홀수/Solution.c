#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(int num) {
    // ������ ���� �޸𸮸� ���� �Ҵ����ּ���
    char* answer = (char*)malloc(sizeof(char));
    answer = (num % 2 == 0) ? "Even" : "Odd";

    return answer;
}