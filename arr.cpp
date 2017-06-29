#include<iostream>
using namespace std;
 

void swap(int *x, int *y);
 

class MinHeap
{
    int *harr;
    int heap_size; 
public:
    
    MinHeap(int a[], int size);
 
    
    void MinHeapify(int );
 
   
    int left(int i) { return (2*i + 1); }
 
    
    int right(int i) { return (2*i + 2); }
 
    int replaceMin(int x);
 
    
    int extractMin();
};
int sortK(int arr[], int n, int k)
{
    
    int *harr = new int[k+1];
    for (int i = 0; i<=k && i<n; i++) 
        harr[i] = arr[i];
    MinHeap hp(harr, k+1);
 
    for(int i = k+1, ti = 0; ti < n; i++, ti++)
    {
        
        if (i < n)
            arr[ti] = hp.replaceMin(arr[i]); 
 
        
        else
            arr[ti] = hp.extractMin();
    }
    MinHeap::MinHeap(int a[], int size)
{
    heap_size = size;
    harr = a;  
    int i = (heap_size - 1)/2;
    while (i >= 0)
    {
        MinHeapify(i);
        i--;
    }
}
 

int MinHeap::extractMin()
{
    int root = harr[0];
    if (heap_size > 1)
    {
        harr[0] = harr[heap_size-1];
        heap_size--;
        MinHeapify(0);
    }
    return root;
}
 

int MinHeap::replaceMin(int x)
{
    int root = harr[0];
    harr[0] = x;
    if (root < x)
        MinHeapify(0);
    return root;
}
void printArray(int arr[], int size)
{
   for (int i=0; i < size; i++)
       cout << arr[i] << " ";
   cout << endl;
}
 

int main()
{
    int k = 3;
    int arr[] = {2, 6, 3, 12, 56, 8};
    int n = sizeof(arr)/sizeof(arr[0]);
    sortK(arr, n, k);
 
    cout << "Following is sorted array\n";
    printArray (arr, n);
 
