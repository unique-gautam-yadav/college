
// import java.util.Scanner;

// public class main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         String n = sc.next();

//         boolean fr = false;
//         boolean sec = false;
//         boolean th = false;
//         boolean fif = false;

//         if (n.length() >= 8) {

//             for (int i = 0; i < n.length(); i++) {
//                 // if(n.charAt(i)>=65 && n.charAt(i)<=90 &&!fr) {
//                 // fr=true;
//                 // }
//                 if (n.charAt(i) >= 97 && n.charAt(i) <= 122 && !sec) {
//                     sec = true;
//                 }
//                 if (n.charAt(i) >= 48 && n.charAt(i) <= 57 && !th) {
//                     th = true;
//                 }

//                 if (n.charAt(i) == '_' || n.charAt(i) == '.' || n.charAt(i) == ',' || n.charAt(i) == '?'
//                         || n.charAt(i) == '!' || !fif) {

//                     fif = true;
//                 }

//             }

//         }

//         if (sec && th && fif) {
//             System.out.print("strong");
//         } else {
//             System.out.print("weak");
//         }
//     }
// }