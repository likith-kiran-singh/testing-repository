# lab-15-9-22
Scanner input methods Examples
# lab-23-9-22
[23/09, 6:15 am] Lakshman Vvit: # Python program for implementation of Insertion Sort
 
# Function to do insertion sort

def insertionSort(arr) :

    # Traverse through 1 to len(arr)

    for i in range(1, len(arr)):
 

        key = arr[i]
 

        # Move elements of arr[0..i-1], that are

        # greater than key, to one position ahead

        # of their current position

        j = i-1

        while j >=0 and key < arr[j] :

                arr[j+1] = arr[j]

                j -= 1

        arr[j+1] = key
 
 
#sorting the array [12, 11, 13, 5, 6] using insertionSort

arr = [12, 11, 13, 5, 6]
insertionSort(arr)

lst = [] #empty list to store sorted elements

print("Sorted array is : ")

for i in range(len(arr)):

    lst.append(arr[i])     #appending the elements in sorted order

print(lst)
[23/09, 6:15 am] Lakshman Vvit: # Python program for implementation of MergeSort
 
# Merges two subarrays of arr[].
# First subarray is arr[l..m]
# Second subarray is arr[m+1..r]
 
 

def merge(arr, l, m, r):

    n1 = m - l + 1

    n2 = r - m
 

    # create temp arrays

    L = [0] * (n1)

    R = [0] * (n2)
 

    # Copy data to temp arrays L[] and R[]

    for i in range(0, n1):

        L[i] = arr[l + i]
 

    for j in range(0, n2):

        R[j] = arr[m + 1 + j]
 

    # Merge the temp arrays back into arr[l..r]

    i = 0     # Initial index of first subarray

    j = 0     # Initial index of second subarray

    k = l     # Initial index of merged subarray
 

    while i < n1 and j < n2:

        if L[i] <= R[j]:

            arr[k] = L[i]

            i += 1

        else:

            arr[k] = R[j]

            j += 1

        k += 1
 

    # Copy the remaining elements of L[], if there

    # are any

    while i < n1:

        arr[k] = L[i]

        i += 1

        k += 1
 

    # Copy the remaining elements of R[], if there

    # are any

    while j < n2:

        arr[k] = R[j]

        j += 1

        k += 1
 
# l is for left index and r is right index of the
# sub-array of arr to be sorted
 
 

def mergeSort(arr, l, r):

    if l < r:
 

        # Same as (l+r)//2, but avoids overflow for

        # large l and h

        m = l+(r-l)//2
 

        # Sort first and second halves

        mergeSort(arr, l, m)

        mergeSort(arr, m+1, r)

        merge(arr, l, m, r)
 
 
# Driver code to test above

arr = [12, 11, 13, 5, 6, 7]

n = len(arr)

print("Given array is")

for i in range(n):

    print("%d" % arr[i],end=" ")
 

mergeSort(arr, 0, n-1)

print("\n\nSorted array is")

for i in range(n):
[23/09, 6:15 am] Lakshman Vvit: print("%d" % arr[i],end=" ")
[23/09, 6:15 am] Lakshman Vvit: # Python program for implementation of Quicksort Sort
 
# This implementation utilizes pivot as the last element in the nums list
# It has a pointer to keep track of the elements smaller than the pivot
# At the very end of partition() function, the pointer is swapped with the pivot
# to come up with a "sorted" nums relative to the pivot
 
 

def partition(l, r, nums):

    # Last element will be the pivot and the first element the pointer

    pivot, ptr = nums[r], l

    for i in range(l, r):

        if nums[i] <= pivot:

            # Swapping values smaller than the pivot to the front

            nums[i], nums[ptr] = nums[ptr], nums[i]

            ptr += 1

    # Finally swapping the last element with the pointer indexed number

    nums[ptr], nums[r] = nums[r], nums[ptr]

    return ptr
 
# With quicksort() function, we will be utilizing the above code to obtain the pointer
# at which the left values are all smaller than the number at pointer index and vice versa
# for the right values.
 
 

def quicksort(l, r, nums):

    if len(nums) == 1:  # Terminating Condition for recursion. VERY IMPORTANT!

        return nums

    if l < r:

        pi = partition(l, r, nums)

        quicksort(l, pi-1, nums)  # Recursively sorting the left values

        quicksort(pi+1, r, nums)  # Recursively sorting the right values

    return nums
 
 

example = [4, 5, 1, 2, 3]

result = [1, 2, 3, 4, 5]

print(quicksort(0, len(example)-1, example))
 

example = [2, 5, 6, 1, 4, 6, 2, 4, 7, 8]

result = [1, 2, 2, 4, 4, 5, 6, 6, 7, 8]
# As you can see, it works for duplicates too

print(quicksort(0, len(example)-1
