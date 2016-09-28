/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfilter;

/**
 *
 * @author _
 */
enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}

public class TextFilter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sss;
        sss = "spam spaa";
        Label l;
        String[] s = new String[1];
        s[0] = "spam";
        SpamAnalyzer ta1 = new SpamAnalyzer(s);
        NegativeTextAnalyzer ta2 = new NegativeTextAnalyzer();
        TooLongTextAnalyzer ta3 = new TooLongTextAnalyzer(10);
        TextAnalyzer[] ta = {ta2, ta1,  ta3};
        tFilter x = new tFilter();
        l = x.checkLabels(ta, sss);
        switch (l) {
            case OK:
                System.out.println("OK");
                break;
            case SPAM:
                System.out.println("SPAM");
                break;
            case NEGATIVE_TEXT:
                System.out.println("NEGATIVE_TEXT");
                break;
            case TOO_LONG:
                System.out.println("TOO_LONG");
                break;
        }
        // TODO code application logic here
    }
}
