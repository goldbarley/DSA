#include <stdio.h>

int str_len(char* s);

int main(void)
{
    char s[] = "string";
    printf("%i\n", str_len(s));

    return 0;
}

int str_len(char* s)
{
    return s[0] == '\0' ? 0 : 1 + str_len(s + 1);
}