import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class StreamEx1 {
    public static void main(String args[]){
        List<Integer> nums = Arrays.asList(1,2,3,4,5,7,9,6,8,10,18,36);
        System.out.println("List of numbers: "+nums);

        double average = nums.stream()
        .mapToDouble(Integer::doubleValue)
        .average()
        .orElse(0.0);
        System.out.println("Average of numbers: "+average);

        //Sum of even numbers
        int sumOfEvens = nums.stream()
        .filter(num -> num%2==0)
        .mapToInt(Integer::intValue)
        .sum();
        System.out.println("Sum of even numbers: "+sumOfEvens);

        //Sum of odd numbers
        int sumOfOdd = nums.stream()
        .filter(num -> num%2!=0)
        .mapToInt(Integer::intValue)
        .sum();
        System.out.println("Sum of odd numbers: "+sumOfOdd);

        List<String> colorList = Arrays.asList("RED","grEEN","orange");
        System.out.println("List of origin color: "+colorList);

        List<String> asc = colorList.stream()
        .sorted()
        .collect(Collectors.toList());
        System.out.println("Color in in Ascending Order:"+ asc);

        List<String> desc = colorList.stream()
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());
        System.out.println("Color in in Descending Order:"+ desc);

        char start= 'R';
        long startCount=colorList.stream()
        .filter(s -> s.startsWith(String.valueOf(start)))
        .count();
        System.out.println("Count of the color start with R : "+startCount);

        char green= 'g';
        long count=colorList.stream()
        .filter(s -> s.startsWith(String.valueOf(green)))
        .count();
        System.out.println("Count of the color start with g : "+count);

        // Convert strings to uppercase using streams
        List<String> color = colorList.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
        System.out.println("List of convert uppercase color: "+color);

        // Convert strings to lowercase using streams
        List<String> lowerCaseColor = colorList.stream()
        .map(String::toLowerCase)
        .collect(Collectors.toList());
        System.out.println("List of convert lowerCase color: "+lowerCaseColor);

        List<Integer> numbers = Arrays.asList(35,36,1,2,3,4,5,7,9,6,8,10,18,36);
        int max_num = numbers.stream()
        .max(Integer::compare)
        .orElse(null);
        System.out.println("Maxinum number: "+ max_num);

        int min_num = numbers.stream()
        .min(Integer::compare)
        .orElse(null);
        System.out.println("Maxinum number: "+ min_num);

        int sec_smallest = numbers.stream()
        .distinct()
        .sorted()
        .skip(1)
        .findFirst()
        .orElse(null);
        System.out.println("Second smallest number: "+ sec_smallest);

        int sec_largest = numbers.stream()
        .distinct()
        .sorted((a,b)->Integer.compare(b, a))
        .skip(1)
        .findFirst()
        .orElse(null);
        System.out.println("Second largest number: "+ sec_largest);

        List<Integer> distinctNumber = numbers.stream()
        .distinct()
        .collect(Collectors.toList());
        System.out.println("List of Distinct numbers: "+distinctNumber);
    }
    
}
