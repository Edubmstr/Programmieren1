package randomstuff1;

public class binarysearch {
    public static void main(String[] args){

        int [] numbers = {1, 2, 3, 5, 7, 8, 9, 11, 12, 16, 17, 20};

        System.out.println(binarySearch(numbers, 20, 0, numbers.length - 1));
    }
    public static int binarySearch(int [] numbers, int number, int lowIndex, int highIndex){
        int middleIndex = highIndex - (highIndex - lowIndex) / 2;
        if (lowIndex > highIndex){
            return -1;
        }
        if(number > numbers[middleIndex]){
            return binarySearch(numbers, number, middleIndex + 1, highIndex);
        }
        if(number < numbers[middleIndex]){
            return binarySearch(numbers, number, lowIndex, middleIndex - 1);
        }
        if(number == numbers[middleIndex]){
            return middleIndex;
        }
        return 0;
    }
}

