
class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        int countFirstList = 0;
        int countSecondList = 0;

        for (Integer element : list1) {
            if (element == elem) {
                countFirstList++;
            }
        }
        for (Integer element : list2) {
            if (element == elem) {
                countSecondList++;
            }
        }

        return countFirstList == countSecondList;
    }
}