package binarySearch;

public class nextGreatestCharacter {
    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[] {'a','b','c','d','f'},'e'));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while(start<= end){
            int mid = start + (end-start / 2);

            if (target <letters[mid] ) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}