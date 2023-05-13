class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p1= 0, p2 = numbers.length-1;
        int x=0, y=0;
        while (p1<p2){
            if (numbers[p1]+numbers[p2]==target){
                x=p1;
                y=p2;
                break;
            }
            else if (numbers[p1]+numbers[p2]>target) --p2;
            else ++p1;
        }
        return new int[] {++x,++y};
    }
}