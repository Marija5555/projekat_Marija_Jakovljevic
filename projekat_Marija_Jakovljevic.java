import java.util.Arrays;

public class projekat_Marija_Jakovljevic {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(varijabilniNiz(new int[]{15, 55, 76, 22, 37, 4, 3})));
        System.out.println(Arrays.toString(varijabilniNizStringa(new String[]{"Marija, Milos, Petar"})));
        System.out.println(Arrays.toString(varijabilniNizKaraktera(new char[] {'A', 'B', 'C', 'D'})));
        System.out.println(zbirCifara(5239));
        System.out.println(stepenBroja(16, 4));
        System.out.println(Arrays.toString(zbirIndexaNizaMeta(new int[]{1, 2, 4, 8}, 10)));
        System.out.println(toBinary(986));
        System.out.println(brojPonavljanja("rec", "rec u recenici"));
        System.out.println(Arrays.toString(pomeriNule(new int[]{1, 2, 0, 0, 3, 4, 0, 5})));
        System.out.println(Arrays.toString(izbaciDuplikate(new int[]{0, 0, 1, 2, 3, 4, 4, 5, 6, 6, 5})));


    }
    public static int[] varijabilniNiz(int[] arr1) {
        int[]arr = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++){
            arr[i] = arr1[i];
        }
        return arr1;
    }
    public static String[] varijabilniNizStringa(String[] st) {
        String[]st1 = new String [st.length];
        for(int i = 0; i < st.length; i++){
            st1[i] = st[i];
        }
        return st1;
    }
    public static char[] varijabilniNizKaraktera(char[] ch) {
        return ch;
    }

    public static  int zbirCifara(int n) {
        int a ;
        a =  (n - 1) % 9 + 1;
        return a;
    }

    public static boolean stepenBroja(int n, int m) {
        boolean bool = true;
        //int stepenBroja;
        int rez = m * m;
        while (rez <= n) {
            if (rez < n) {
                rez *= m;
            }
            if (rez == n) {
                break;
            }
        }
        if (rez > n) {
            bool = false;
        }
        return bool;
    }

    public static int[] zbirIndexaNizaMeta(int[] niz, int meta) {
        int[] noviNiz = new int[niz.length];
        int k = 0;
        for (int i = 0; i < niz.length; i++) {
            for (int j = 0; j < niz.length; j++) {
                if (niz[i] + niz[j] == meta) {
                    noviNiz[k] = i;
                    noviNiz[k + 1] = j;
                    k++;
                   // break;
                }
            }
        }
        return Arrays.copyOf(noviNiz, k);
    }

    public static String toBinary(int n) {
        int a = n;
        String str = "";

        while (a > 0) {
            String binarniBroj;
            if (a % 2 == 0) {
                binarniBroj = "0";
            } else {
                binarniBroj = "1";
            }
            str = binarniBroj + str;
            a = a / 2;
        }
        return str;
    }

    public static int brojPonavljanja(String s, String recenica) {
        String[] rec = recenica.split(" ");
        int m = 0;
        for (int i = 0; i < rec.length; i++) {
            if (s.equals(rec[i])) {
                m++;
            }
        }
        return m;
    }

    public static int[] pomeriNule(int[] niz) {
        int[] noviNiz = new int[niz.length];
        int brojac = 0;
        for (int i = 0; i < noviNiz.length; i++) {
            if (niz[i] != 0) {
                noviNiz[brojac] = niz[i];
                brojac++;
            }
        }
        return noviNiz;
    }

    public static int[] izbaciDuplikate(int[] niz) {
        int[] m = new int[niz.length];
        int brojacM = 0;
        for (int i = 0; i < niz.length; i++) {
            int trenutniBroj = niz[i];
            boolean duplikat = false;
            for (int j = 0; j < niz.length; j++) {
                if (i != j) {
                    if (trenutniBroj == niz[j]) {
                        duplikat = true;
                    }
                }
            }
            if (duplikat) {
                boolean upisanDuplikat = false;
                for (int j = 0; j < m.length; j++) {
                    if (m[j] == trenutniBroj) {
                        upisanDuplikat = true;
                    }
                }
                if (!upisanDuplikat) {
                    m[brojacM] = trenutniBroj;
                    brojacM++;
                }
            } else {
                m[brojacM] = trenutniBroj;
                brojacM++;
            }
        }
        int brojPraznihMesta = 0;

        for (int l = 0; l < m.length; l++) {
            if (m[l] == 0) {
                brojPraznihMesta++;
            }
        }
        int[] nizBezPraznina = new int[m.length - brojPraznihMesta];
        for (int r = 0; r < nizBezPraznina.length; r++) {
            nizBezPraznina[r] = m[r];
        }
        m = nizBezPraznina;
        return m;
    }

}



