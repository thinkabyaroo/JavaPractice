    public class BinarySearch {
        public static void main(String[] args){
            int[] numbers ={4,2,3,8,11,9,7,10,15};
            int target = 9;
            int linearSearchResult = linearSearch(numbers, target);
            System.out.println("Linear Search :"+ linearSearchResult);

            int binarySearchResult = binarySearch(numbers, target);
            System.out.println("Linear Search :"+ binarySearchResult);
        }

        public static int linearSearch(int[] numbers, int value){
            int step = 0;
            for (int i=0; i< numbers.length; i++)
            {
                step++;
                if(numbers[i]== value)
                {
                    System.out.println("Step for Linear Search : "+ step);
                    return i;
                }
            }
            return -1;
        }

        public static int binarySearch(int[] numbers, int value){
            int step = 0;
            int left=0;
            int right=numbers.length-1;
            while (left <= right)
            {
                step++;
                int mid = (left+right)/2;
                if(numbers[mid]== value)
                {
                    System.out.println("Step for Binary : "+ step);
                    return mid;
                }
                else if (numbers[mid] < value)
                {
                    left = mid+1;
                }
                else 
                {
                    right = mid-1;
                }
            }
            System.out.println("Step for Binary : "+ step);
            return -1;
        }
        
    }
