#ifndef LINKED_LIST_H
#define LINKED_LIST_H

void prepend(void *value);
void append(void *value);
void insert(int index, void *value);
void remove(int index, void *value);
int size();
void reverse(int index, void *value);

#endif