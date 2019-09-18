public class ArrayControl {

    public static void findSort(int[] tempArray) {
        int y[] = tempArray;
        int a = 2;
        boolean t = false;
        for (int i = 0; i < 6; i++) {
            if (y[i] == a) {
                t = true;
                break;
            }
        }
        if (!t)
            System.out.println("没有找到！");
        else
            System.out.println("找到！");
    }

    public static void choiceSort(int[] tempArray) {

        int i, min;
        int str[] = tempArray;
        for (i = 0; i < 7; i++) {
            min = i;
            for (int j = i + 1; j < 7; j++) {
                if (str[min] > str[j]) {
                    int at = str[j];
                    str[j] = str[min];
                    str[min] = at;
                }
            }
        }
        for (i = 0; i < 7; i++)
            System.out.println(str[i] + " ");

    }
}


