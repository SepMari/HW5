public class Main {
    public static void main(String[] args) {

        //Задание 1 и Задание 2
        int[] i = {1, 2, 3};
        double[] d = {1.57, 7.654, 9.986};
        char[] c = new char[2];

        c[0] = 72;
        c[1] = 73;

        System.out.print(i[0] + ", " + i[1] + ", " + i[2]);
        System.out.println();
        System.out.print(d[0] + ", " + d[1] + ", " + d[2]);
        System.out.println();
        System.out.print(c[0] + "," + c[1]);
        System.out.println();

        //Задание 3 (первый вариант решения)
        System.out.print(i[2] + ", " + i[1] + ", " + i[0]);
        System.out.println();
        System.out.print(d[2] + ", " + d[1] + ", " + d[0]);
        System.out.println();
        System.out.print(c[1] + "," + c[0]);
        System.out.println();

        //Задание 3 (второй вариант решения, но в конце все равно стоит запятая)
        for (int h = i.length - 1; h >= 0; h--){
            System.out.print(i[h] + ", ");
        }
            System.out.println();

        for (int k = d.length - 1; k >= 0; k--) {
            System.out.print(d[k] + ", ");
        }
            System.out.println();
        for (int n = c.length - 1; n >= 0; n--) {
            System.out.print(c[n] + ", ");
        }
            System.out.println();

        //Задание 4
        for (int a = 0; a < i.length; a++) {
            if (i[a] % 2 != 0)
                i[a] += 1; {
                System.out.print(i[a] + " ");
            }
        }


    }
}