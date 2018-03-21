package se.lexicon.ui;

import java.util.Scanner;

public class ScanInputs {

    private static ScanInputs sc;
    private Scanner cin = new Scanner(System.in);

    private ScanInputs(){ }

    public ScanInputs getInstance(){
        if (sc == null) {
            synchronized (this){
                if (sc == null) {
                    sc = new ScanInputs();
                }
            }

        }
        return this.sc;
    }

    public Scanner getCin() {
        return cin;
    }
}
