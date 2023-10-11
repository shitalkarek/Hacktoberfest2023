/**
 * orderAgnosticBinarySearch
 */
public class orderAgnosticBinarySearch {

    public static void main(String[] args) {
        //ascending order array
        // int arr [] = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};s

        //desecding order array
        int arr[] = {89,45,22,18,15,4,3,2,0,-4};
       
       
        int target = 3;
        int answer = orderAgnosticBS(arr, target);
        System.out.println(answer);
        
    }



    //function

    static int orderAgnosticBS(int arr[], int target)
    {
        int start = 0 ;
        int end = arr.length-1;

        //find whether the array is ascending or decending order

        boolean isAscending;
        if(arr[start] < arr[end])
        {
            isAscending = true;
        }
        else{
            isAscending = false;
        }

        while(start <= end)
        {
            int mid = start + (end-start)/2;

            if(arr[mid] == target)
            {
                return mid;
            }

            if (isAscending)
            {
                if (target < arr[mid])
                {
                    end = mid-1;
                }

                else{
                    start = mid+1;
                }
            }

            else{

                if (target > arr[mid])
                {
                    end = mid-1;
                }

                else{
                    start = mid+1;
                }
            }
        }

        return -1;

    }
    
}
