package Senfter;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;


import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Coder_Controller {
    private String message="";
    private String lastencoded="";
    public Button forth;
    public Button back;
    public Button copy;
    public TextField input;
    public TextField first;
    public TextField second;
    public TextField third;
    public TextField last;

    public void encode(){
        lastencoded=input.getText();
        encodeone();
        encodetwo();
        encodethree();
        encodefour();
    }

    public void decode(){
        lastencoded=input.getText();
        decodeone();
        decodetwo();
        decodethree();
        decodefour();
    }

    public void copy(){
        String myString = last.getText();
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }

    public void encodeone() {
        first.clear();
        char[] msgtemp;
        String fin = "";
        message = lastencoded;
        msgtemp = message.toCharArray();
        for (char a : msgtemp) {
                int temp = (int) a;
            if ((temp <=90&&temp>=65)||(temp <=122&&temp>=97)) {
                if (temp == 90) temp = 65;
                else if (temp == 122) temp = 97;
                else temp++;
            }
            fin += (char) temp;

    }

        first.setText(fin);
        lastencoded = fin;
    }

    public void encodetwo(){
        second.clear();
        int sum=0;
        String fin=lastencoded;
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(lastencoded);
        while(m.find()) {
            String a = m.group();
            sum+=Integer.parseInt(a);
            fin=fin.replace(a,Integer.toString(sum));
        }
        second.setText(fin);
        lastencoded=fin;



    }

    public void encodethree(){
        third.clear();
        int numofins = 0;
        String fin = lastencoded;
        char[] temp = lastencoded.toCharArray();
        for (int i=0;i<temp.length;i++){
            if (i%3==0){
                String old = String.valueOf(temp[i]);
                int random = (int)(Math.random() * 92 + 33);
                char a = (char) random;
                String rep = a+old;
                fin = fin.substring(0,i+numofins) + a + fin.substring(i+numofins);
                numofins++;
            }
        }
        third.setText(fin);
        lastencoded=fin;
    }

    public void encodefour(){
        last.clear();
        String fin = lastencoded;
        fin = fin.replaceAll("R","%L%");
        last.setText(fin);
    }

    public void decodeone(){
        first.clear();
        String fin = lastencoded;
        fin = fin.replaceAll("%L%","R");
        first.setText(fin);
        lastencoded=fin;
    }

    public  void decodetwo(){
        second.clear();
        int rem=0;
        String fin = lastencoded;
        for (int i=0;i<fin.length();i+=3){
            fin=fin.substring(0,i+-rem)+fin.substring(i+1-rem);
        }
        second.setText(fin);
        lastencoded=fin;
    }

    public void decodethree(){
        third.clear();
        String fin=lastencoded;
        ArrayList<String> given= new ArrayList();
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(lastencoded);
        while(m.find()) {
            String a = m.group();
            given.add(a);
        }
        int numof = given.size();
        String[] old = given.stream().toArray(String[]::new);
        ArrayList<String> temp= new ArrayList();
        Collections.reverse(given);
        given.add("0");
        for (int i = 0; i<numof;i++){
            int one = Integer.parseInt(given.get(i));
            int two = Integer.parseInt(given.get(i+1));
            temp.add(Integer.toString(one-two));
        }
        Collections.reverse(temp);
        String[] rep = temp.stream().toArray(String[]::new);
        for (int i = 0; i<numof;i++){
            fin=fin.replace(old[i],rep[i]);
        }
        third.setText(fin);
        lastencoded=fin;

    }

    public void decodefour(){
        last.clear();
        char[] msgtemp;
        String fin = "";
        message = lastencoded;
        msgtemp = message.toCharArray();
        for (char a : msgtemp) {
            int temp = (int) a;
            if ((temp <=90&&temp>=65)||(temp <=122&&temp>=97)) {
                if (temp == 65) temp = 90;
                else if (temp == 97) temp = 122;
                else temp--;
            }
            fin += (char) temp;

        }

        last.setText(fin);
    }


    public static void ausgabe(String[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.println(i + ": " + arr[i]);

        }

    }
}

