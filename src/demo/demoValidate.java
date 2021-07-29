package demo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class demoValidate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // vi du chi nhan vao 1 so:  "^[0-9]$"
        //Nhap nhieu so thi them + vao :  "^[0-9]+$"
        //Nhap vap lon hon >= 6 ky tu so :  "^[0-9]{6,}$"
        //Nhap chinh xac 6 ky tu : "^[0-9]{6}$"
        // Trong khoang bao nhieu ky tu so : tu 6-10 : "^[0-9]{6,10}$"
        // CHi duoc nhap vao chu : "^[a-zA-Z]+$"
        // CHi nhap vao chu va so : "^[a-zA-Z0-9]+$"
        // Muon nhap co dau cach thi them giau cach : "^[a-zA-Z0-9 ]+$"

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
        while (true){
            System.out.println("input txt : ");
            String txt = scanner.nextLine();
            if(pattern.matcher(txt).find()){
                System.err.println("txt ok");
                break;
            }else System.err.println(" txt not ok , Nhap lai de :");
        }
    }
}
