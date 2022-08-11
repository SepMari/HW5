public class Main {
    public static void main(String[] args) {

        //Задание 1 и Задание 2
        int[] i = new int [3];

        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        for (int y = 0; y <= i.length - 1; y++){
            if ( y != i.length - 1) {
                System.out.print(i[y] + ", ");
            } else
                System.out.print(i[y] + " ");
        }
        System.out.println();

        double[] d = new double [3];

        d[0] = 1.57;
        d[1] = 7.654;
        d[2] = 9.986;

        for (int k = 0; k <= d.length - 1; k++) {
            if (k != d.length - 1) {
                System.out.print(d[k] + ", ");
            } else
                System.out.print(d[k]);
        }
        System.out.println();

        char[] c = new char[2];

        c[0] = 72;
        c[1] = 73;

        for (int n = 0; n <= c.length - 1; n++) {
            if (n != c.length - 1) {
                System.out.print(c[n] + ", ");
            } else
                System.out.print(c[n]);
        }
        System.out.println();

        //Задание 3 (второй вариант решения, но в конце все равно стоит запятая)
        for (int h = i.length - 1; h >= 0; h--){
            if ( h != 0) {
                System.out.print(i[h] + ", ");
            } else
                System.out.print(i[h]);
        }
        System.out.println();

        for (int k = d.length - 1; k >= 0; k--) {
            if ( k != 0) {
                System.out.print(d[k] + ", ");
            } else
                System.out.print(d[k]);
        }
        System.out.println();

        for (int n = c.length - 1; n >= 0; n--) {
            if ( n != 0 ) {
                System.out.print(c[n] + ", ");
            } else
                System.out.print(c[n]);
        }
            System.out.println();

        //Задание 4
        for (int a = 0; a < i.length; a++) {
            if (i[a] % 2 != 0) {
                i[a] += 1;
                System.out.print(i[a] + " ");
            }
        }


    }
}