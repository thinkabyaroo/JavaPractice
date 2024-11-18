class ArraySearch{
    public static void main(String [] args){
        int [] intArray={1,3,5,6,7,8,9,10};
        int searchedValue = 9;

        int index = indexSearch(intArray, searchedValue);
        System.out.println("The index of search value: "+ index);
        
        
    }
    public static int indexSearch(int[] array, int search){
        for (int i=0; i<array.length; i++){
            if (array[i]==search){
                return i;
            }
        }
        return -1;
    }

}