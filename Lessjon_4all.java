public class Lessjon_4all {
    public static void main(String[] args) {
        printThreeWords();          //1
        checkSumSign();             //2
        printColor();              //3
        compareNumbers();           //4
        metod(10,4);            //5
        metod6(0);
        metod7(-1);              //7
        metod8(1,"какая-то строка вызванная N раз");    //8
        metod9(1, true);            //9
        meth10(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0});    //10
        meth11();                                           //11
        meth12(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}); //12
        meth13(new int[5][5]);              //13
        meth14(3, 6);
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }

    public static void checkSumSign() {
        int a = 1;
        int b = 2;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println();
    }

    public static void printColor() {
        int value = 3;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");

        }
        System.out.println();
    }
    public static void compareNumbers() {
        int a = 2;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        System.out.println();
    }
    public static void metod(int a, int b) {
        int c=a+b;
        if(c>10) {
            if (c <= 20) {
                System.out.println("true");
            }else {System.out.println("false");}
        }else {System.out.println("false");}
        System.out.println();
    };
    public static void metod6(int q){
        if(q<0){
            System.out.println("отрицательное");
        }
        if(q>=0){
            System.out.println("положительное");
        }
        System.out.println();
    }
    public  static void metod7(int w){
        boolean A =w<0;
        System.out.println(A);
        System.out.println();
    }
    public static void metod8(int W, String e) {
        int Q;
        for(Q=0; Q<W; Q++){
            System.out.println(e);}
        System.out.println();
    }
    public static void metod9 (int year, Boolean S) {
        if ((!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))) S = false;
        else S = true;
        {
            System.out.println(S);}
        System.out.println();
    }
    public static void meth10(int[] array){

        for(int i=0; i<array.length;i++){
            if(array[i] == 1){array[i]=0;
            }else if (array[i] == 0){array[i]=1;};
        }
        for (int i = 0; i < array.length; i++) {        //проверка
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
    public static void meth11(){
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = i+1;
            }
        }


        for (int i = 0; i < array.length; i++) {        //проверка
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
    public static void meth12(int[] arr) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] = array[i] * 2;
        }
        for (int i = 0; i < array.length; i++) {        //проверка
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
    public static void meth13(int[][] array){
        for (int i=0; i<array.length; i++){
            for (int k=0; k<array.length; k++) {
                array[i][i] = 1;
                System.out.print(array[i][k]+"  ");
            }
            System.out.println(" ");
        }
        System.out.println();}
    public static int[] meth14 (int len, int initialValue){
        int array[] = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.print(array[i] + " "); //это
        }
        System.out.println();
        return array;
    }
}
