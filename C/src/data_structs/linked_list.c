#include <stdlib.h>

#include "headers/linked_list.h"

typedef struct node
{
    struct node* prev;
    void *data;
    struct node *next;
} node;

node *list = NULL;
int size = 0;

void append(void);