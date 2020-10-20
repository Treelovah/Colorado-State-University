#include <stdio.h>

using namespace std;

class Node
{
public:
    int data;
    Node* next;    
};


void print_data(Node* n)
{
    while (n != nullptr) 
    {
        printf("%d ",n->data);
        n = n->next;
    }
    printf("\n");
}

int main()
{
    Node* head = nullptr;
    Node* second = nullptr;
    Node* third = nullptr;

    head = new Node();
    second = new Node();
    third = new Node();

    head->data = 1;
    head->next = second;
    second->data = 2;
    second->next = third;
    third->data = 3;
    third->next = nullptr;
    
    print_data(head);
    delete head;
    delete second;
    delete third;
    return 0;
}