package Lesson6;

import java.util.Scanner;
/**
 * Start
 */
public class Start {
    private static Internet internet;
    public static void main(String[] args) {
        NoteBooksBilder npb = new NoteBooksBilder();
        npb.create("Aser", "12345678", "17sm", "8G", "256G", "Intel 8",
                "Windows 10", "black", 100000d, "Electronic");
        npb.create("Aser-pro", "23456789", "19sm", "16G", "512G", "Intel 8 pro",
                "Windows 11", "white", 120000d, "Electronic");
        npb.create("Mack", "34567890", "22sm", "8G", "256G", "Intel 9",
                "", "white", 160000d, "Apple Store");
        npb.create("Mack-pro", "45678901", "18sm", "16G", "256G", "Apple M1",
                "", "white", 160000d, "Apple Store");
        npb.create("Aser", "12345678", "17sm", "8G", "256G", "Intel 8",
                "Windows 10", "white", 100000d, "Electronic");

        internet = new Internet(npb.getNoteBookList(), npb.getTags());
        Explorer();
    }
    static void Explorer(){
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while (!command.equals("off")){
            System.out.println(internet.runCommand(command));
            command = scanner.nextLine();
        }
        System.out.println("shatdown");
    }
}