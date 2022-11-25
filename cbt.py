class newNode:
    def __init__(self,data):
        self.data=data
        self.left=self.right=None
def insertLevelOrder(arr,i,n):
    root=None
    if i<n:
        root=newNode(arr[i])
        root.left=insertLevelOrder(arr,2*i+1,n)
        root.right=insertLevelOrder(arr,2*i+2,n)
    return root
def inOrder(root):
    if root!=None:
        inOrder(root.left)
        print(root.data,end=" ")
        inOrder(root.right)
if __name__=='__main__':
    arr=[1,2,3,4,5,6,6,6,6]
    n=len(arr)
    root=None
    root=insertLevelOrder(arr,0,n)
    inOrder(root)



