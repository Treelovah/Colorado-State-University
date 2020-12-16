#include <iostream>
#include <cstdio>
#include <vector>


struct Node
{
    int data;
    struct Node* next;
    struct Node* prev;
};

struct Node* head;
void InsertAtFront(int x)
{
    struct Node node;
    node.data = x;

    if (head == nullptr)
        head = &node;
    else head->next = &node;
}

int main(int argc, char const *argv[])
{
    std::vector<int> arr{ 1,2,3,4,5,6,7,8,9,10,20,11 };
    for (int i : arr) InsertAtFront(i);
    return 0;
}
