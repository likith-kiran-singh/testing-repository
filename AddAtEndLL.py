class Node:
    def __init__ (self,data):
        self.data=data
        self.ref=None
class LinkedList:
    def __init__ (self):
        self.head=None
    def Print_ll(self):
        if self.head is None:
            print("Linked list is empty")
        else:
            n=self.head
            while n is not None:
                print(n.data)
                n=n.ref
    def add_begin(self,data):
        
        new_node=Node(data)
        new_node.ref=self.head
        self.head=new_node
    def add_end(self,data):
        new_node=Node(data)
        if self.head is None:
            self.head=new_node
        else:
            n=self.head
            while n.ref is not None:
                n=n.ref
                n.ref=new_node
    
ll1=LinkedList()
print("At beginning")
ll1.add_begin(10)
ll1.add_begin(20)
ll1.add_begin(30)
ll1.Print_ll()
print("after adding at end")
ll1.add_end(100)
ll1.Print_ll()
"""
Output:

"""
