class QuickSort
{
    int pivot;
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    void swap(int arr[],int i,int j){
        //Your code here
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    int partition(int arr[], int low, int high)
    {
        pivot = arr[high];
        int i=low -1;
        for(int x=low; x <= high -1;x++)
        {
            if(arr[x]<=pivot)
            {
                i++;
                swap(arr,i,x);
            }
        }
        swap(arr,i+1,high);
        return i+1;
//        while(low<=high) {
//            while (arr[low] < pivot)
//                low++;
//            while (arr[high] > pivot)
//                high--;
//            if (low <= high) {
//                swap(arr, low, high);
//                low++;
//                high--;
//            }
//        }
//        swap(arr,low+1,high);
//        return low + 1;
   	//Write code here for Partition and Swap
    }
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    void sort(int arr[], int low, int high)
    {
        while(low>=high)
        {
            return;
        }
        int j = partition(arr, low, high);
        sort(arr,low,j-1);
        sort(arr,j+1,high);

            // Recursively sort elements before
            // partition and after partition
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[])
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);

        System.out.println("sorted array");
        printArray(arr);
    }
}
