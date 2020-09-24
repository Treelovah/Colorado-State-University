#include <iostream>
#include <string>
using namespace std;


class Node
{
public:
    string data;
    Node* nextNode = NULL;

    Node(string data)
    {
        this->data = data;
    }
    Node(string data, Node* nextNode)
    {
        this->data = data;
        this->nextNode = nextNode;
    }
    string getData()
    {
        return this->data;
    }
};

int main()
{
    Node node1 = Node("3");
    Node node2 = Node("5");
    Node node3 = Node("7");
    Node node4 = Node("hello");
    node1.nextNode = &node2;
    node2.nextNode = &node3;
    node3.nextNode = &node4;

    Node currentNode = node1;
    while (true)
    {
        cout << currentNode.data << " --> ";
        if (currentNode.nextNode == NULL)
        {
            cout << "NULL" << '\n';
            break;
        }
        currentNode = *currentNode.nextNode;
    }
    return 0;
}

