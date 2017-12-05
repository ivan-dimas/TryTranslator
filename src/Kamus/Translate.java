package Kamus;

import java.util.Scanner;

class Header {
    public void getHeader() {
        System.out.println("HASIL TRANSLATE");
    }
}

class Method1 extends Header {
    String tempInd, tempEng;  

    public void getInput() {
        Indo ind1 = new Indo();
        English eng1 = new English();
        System.out.print("Input Kata 'Inggris' : ");
        Scanner in1 = new Scanner(System.in);
        tempEng = in1.nextLine();
        int x1 = tempEng.length();
        System.out.println();
    }
    
    public void getInput(int a) {
        super.getHeader();
        boolean err404 = true;
        for (int i = 0; i < Indo.list_indo.length; i++) {
            if (tempEng.equals(English.list_english[i])) {
                System.out.println(tempEng+" = "+Indo.list_indo[i]);
                err404 = false;
                System.out.println();
            }
        }
        if (err404) {
            System.err.println("Translate Failed");
        } 
    }
}

class Method2 extends Method1 {
    public void getInput2() {
        English eng2 = new English();
        Indo ind2 = new Indo();
        
        System.out.print("Input Kata 'Indonesia' : ");
        Scanner in2 = new Scanner(System.in);
        tempInd = in2.nextLine();
        int x2 = tempInd.length();
        System.out.println();
        
        super.getHeader();
        boolean err404 = true;
        for (int i = 0; i < English.list_english.length; i++) {
            if (tempInd.equals(Indo.list_indo[i])) {
                System.out.println(tempInd+" = "+English.list_english[i]);
                err404 = false;
                System.out.println();
            }
        }
        if (err404) {
            System.err.println("Translate Failed");
        }
    }
}

public class Translate {
    public static void main(String[] args) {
        int pilih;
        Method1 in = new Method1();
        Method2 in1 = new Method2();
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("1.  English to Indonesia");
            System.out.println("2.  Indonesia to English");
            System.out.println("3.  Keluar");
            System.out.println();
            System.out.print("Pilih Menu : ");
            pilih = input.nextInt();
            System.out.println();
            switch (pilih) {
                case 1:
                    in.getInput();
                    in.getInput(1);
                    break;
                case 2:
                    in1.getInput2();
                    break;
            }
        } while (pilih != 3);
    }
}  
