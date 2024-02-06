import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class MGI {
    public int r;
    public int g;
    public int b;

    public MGI(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
}

public class Problem1 {

    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("./file.txt"));
            long res = 0;

            while (sc.hasNextLine()) {
                res += getNumbers(sc.nextLine());
            }
            System.out.println(res);
        } catch (Exception e) {
            System.out.println("File not found");
            return;
        }

        sc.close();
    }

    static int getNumbers(String line) {
        String GameID = line.split(":")[0];
        List<MGI> minigames = Arrays.stream(
                line.split(":")[1]
                        .split(";"))
                .map((minigame) -> {
                    MGI mgi = new MGI(0, 0, 0);
                    for (String qc : minigame.split(",")) {
                        qc = qc.trim();
                        switch (qc.charAt(qc.length() - 1)) {
                            case 'd':
                                mgi.r = Integer.parseInt(qc.split(" ")[0]);
                                break;
                            case 'n':
                                mgi.g = Integer.parseInt(qc.split(" ")[0]);
                                break;
                            case 'e':
                                mgi.b = Integer.parseInt(qc.split(" ")[0]);
                                break;

                            default:
                                break;
                        }
                    }
                    return mgi;
                }).toList();
        for (MGI minigame : minigames) {
            if (minigame.r > 12)
                return 0;
            if (minigame.g > 13)
                return 0;
            if (minigame.b > 14)
                return 0;
        }
        return Integer.parseInt(GameID.split(" ")[1]);
    }

}