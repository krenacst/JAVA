public class Main {

    public static void main(String[] args) {

        One();
        Two();
        Three();
        System.out.println("Hello World!");
        Four();
        Five();
        Six();
        Seven();
        Eight();
        Nine();
        Ten();
        Eleven();
        Twelve();
        Thirteen();
        Fourteen();
        Fiveteen();
        Sixteen();

    }

    public static void One() {
        int x = (int) (Math.random() * 10 + 1);
        int y = (int) (Math.random() * 10 + 1);
        System.out.println("x = " + x + "y = " + y);
        if (x > y) {
            System.out.println("Az x nagyobb.");
        } else if (x == y) {
            System.out.println("Egyenlők.");
        } else {
            System.out.println("Az y a nagyobb.");
        }
        System.out.println("------------111111111-------------------------------------------------------------");
    }

    public static void Two() {
        int x = (int) (Math.random() * 100 + 1);
        int y = (int) (Math.random() * 100 + 1);
        System.out.println("x = " + x + "y = " + y);
        if (x % y == 0) {
            System.out.println("Az x osztható y-nal");
        } //else if (x == y) {
        //System.out.println("Egyenlők.");
        else {
            System.out.println("Az x nem osztható y-nal.");
        }
        System.out.println("---------------------22222222222----------------------------------------------------");
    }

    public static void Three() {
        int x = (int) (Math.random() * 201 - 100);
        System.out.println(x);
        if (x % 2 == 0) {
            System.out.println("Az x páros szám.");
        } else {
            System.out.println("Az x nem páros szám.");
        }
        System.out.println("--------------------------------333333333333-----------------------------------------");
    }

    public static void Four() {
        int x = (int) (Math.random() * 100 - 50);
        int y = (int) (Math.random() * 100 - 50);
        int z = (int) (Math.random() * 100 - 50);

        if (x > y && x > z && y > z) {
            System.out.println(x + " , " + y + " , " + z);
        } else if (x > y && z > y && x > z) {
            System.out.println(x + " , " + z + " , " + y);
        } else if (y > x && y > z && x > z) {
            System.out.println(y + " , " + x + " , " + z);
        } else if (y > x && y > z && z > x) {
            System.out.println(y + " , " + z + " , " + x);
        } else if (z > x && z > y && x > y) {
            System.out.println(z + " , " + x + " , " + y);
        } else if (z > x && z > y && y > x) {
            System.out.println(z + " , " + y + " , " + z);
        }
        if (x == y && z < y) {
            System.out.println(x + " , " + y + " = " + z);
        }
        if (x == y && z > y) {
            System.out.println(z + " , " + y + " = " + x);
        }
        if (y == z && x < z) {
            System.out.println(y + " = " + z + " = " + x);
        }
        if (y == z && x > z) {
            System.out.println(x + " , " + y + " = " + z);
        }
        if (z == x && y > x) {
            System.out.println(z + " , " + y + " = " + x);
        }
        if (z == x && y < x) {
            System.out.println(x + " , " + z + " = " + y);
        }
        System.out.println("----------------44444444444444---------------------------------------------------------");
    }

    public static void Five() {
        int a = (int) (Math.random() * 420 - 110);
        int b = (int) (Math.random() * 420 - 110);
        int c = (int) (Math.random() * 420 - 110);
        int d = (int) (Math.random() * 420 - 110);
        int e = (int) (Math.random() * 420 - 110);

        if (e > a && b > a && c > a && d > a) {
            System.out.println("A legkisebb szám: " + a);
        }
        if (a > b && c > b && d > b && e > b) {
            System.out.println("A legkisebb szám: " + d);
        }
        if (a > c && d > c && b > c && e > c) {
            System.out.println("A legkisebb szám: " + c);
        }
        if (a > d && c > d && e > d && b > d) {
            System.out.println("A legkisebb szám: " + d);
        }
        if (a > e && b > e && c > e && d > e) {
            System.out.println("A legkisebb szám: " + e);
        } else {
            System.out.println("Rendes számokat találj már ki b+");


        }
        System.out.println("---------------------55555----------------------------------------------------");
    }

    public static void Six() {

        int a = (int) (Math.random() * 200);
        int b = a / 10;
        int c = a % 10;
        System.out.println(a);
        if (a < 100) {

            System.out.println(b);
            System.out.println(c);
            System.out.println(b + c);

            if (b % 2 == 0 && c % 2 != 0) {
                System.out.println('1');
            }
            if (b % 2 != 0 && c % 2 != 0) {
                System.out.println('0');
            }
            if (b % 2 != 0 && c % 2 == 0) {
                System.out.println('1');
            }
            if (b % 2 == 0 && c % 2 == 0) {
                System.out.println('2');
            }
        }
        System.out.println("------------6666666666-------------------------------------------------------------");
    }

    public static void Seven() {

        for (int i = 0; i < 101; i++) {
            System.out.println(i);
        }
        System.out.println("----------------------77777777777---------------------------------------------------");
    }

    public static void Eight() {
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("---------------------8888888888----------------------------------------------------");
    }

    public static void Nine() {
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }

        }
        System.out.println("---------------------999999999----------------------------------------------------");
    }

    public static void Ten() {
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }

        }
        System.out.println("----------------------10--------------10-----------------10------------10--------");
    }

    public static void Eleven() {
        int i = 100;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
        System.out.println("----------------------11--------------11-----------------11------------11--------");
    }

    public static void Twelve() {
        int v = (int) (Math.random() * 10) + 1;
        System.out.println(v);

        for (int j = 0; j < v; j++) {

            System.out.println(j += 5);
            System.out.println("----------------------12--------------12-----------------12------------12--------");
        }
    }

    public static void Thirteen() {
        int x = (int) (Math.random() * 3 + 1);
        int y = (int) (Math.random() * 6) + 5;
        for (int k = x; k < y; k++) {
            System.out.println(k);
        }
        System.out.println("----------------------13--------------13-----------------13------------13--------");
    }


    public static void Fourteen() {
        int x = (int) Math.floor(Math.random() * 3) + 1;
        int y = (int) Math.floor(Math.random() * 6) + 5;
        for (int k = x + 1; k < y; k++) {
            System.out.println(k);
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println("----------------14--------------14----------------14------------14--------");
    }

    public static void Fiveteen() {
        int x = (int) Math.floor(Math.random() * 6) + 5;
        int y = (int) Math.floor(Math.random() * 4) + 1;
        int z = (int) Math.floor(Math.random() * 4) + 10;
        System.out.println("Az első változó értéke: " + x);


        int e = z - y + 1;

        for (int i = 0; i < x; i++) {
            int g = (int) Math.floor(Math.random() * e) + y;
            System.out.println(g);
        }
        System.out.println("----------------15--------------15----------------15------------15--------");
    }

    public static void Sixteen() {
        int a = (int) Math.floor(Math.random() * 11 + 10) * 100;
        System.out.println(a);
            int crw = (int)Math.floor(Math.random() * 51) + 50;
        System.out.println("A filmre ennyien: " + crw + " látogattak el");
            int prc = a / 2;
            for (int i = 0; i < 100; i++) {
                int ppl = (int) Math.floor(Math.random() * 99) + 1;
                if (ppl < 5) {
                    System.out.println("A személy kora: " + ppl + " év, ezért a jegy ingyenes.");
                } else {
                    if (ppl < 18 || ppl > 65) {
                        System.out.println("A személy kora: " + ppl + " év, ezért a jegy ára: " + prc + " Ft");
                    } else if (ppl >= 18 && ppl <= 65) {
                        System.out.println("A személy kora: " + ppl + " év, ezért a jegy ára: " + a + " Ft");
                    }
                }
            }
        }
    }


