/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author gowais
 */
public class Project1 {

    public static void main(String[] args) throws IOException {
        if (args.length == 1) {
            if ("dir".equals(args[0])) {
                String n = "";
                String path = "ls /";
                  Process p = Runtime.getRuntime().exec(path);
                BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String s = null;
                while ((s = br.readLine()) != null) {
                    System.out.println(s);
                }
              
                while (!"0".equals(n)) {
                    int x=0;

                    if ("<".equals(n)) {
                        if (path.equals("ls /")) {
                            System.out.println("*********************************");

                            System.out.println("you are in the root, you can't go more back");

                        } else {
                            StringBuilder sb = new StringBuilder(path);
                            for (int i = 0; i < path.length() - path.lastIndexOf("/"); i++) {
                                sb.deleteCharAt(path.lastIndexOf("/"));
                            }
                            path = sb.toString();
                            x++;
                        }
                    } else if (!n.equals("")) {
                         p = Runtime.getRuntime().exec(path);
                         br = new BufferedReader(new InputStreamReader(p.getInputStream()));
                         s = null;

                        int i = 0;
                        while ((s = br.readLine()) != null) {

                            if (s.equals(n)) {
                                i++;
                            }
                        }

                        if (i != 0) {
                            path += "/" + n;
                            x++;
                        } else {
                            System.out.println("***********************************");
                            System.out.println("no directory named with such intput");
                            n = "";
                            
                        }
                    }
                    if(x>0){

                    System.out.println("*********************************");
                     p = Runtime.getRuntime().exec(path);
                     br = new BufferedReader(new InputStreamReader(p.getInputStream()));
                     s = null;
                    while ((s = br.readLine()) != null) {

                        if (s.contains("/")) {
                            System.out.println("*********************************");

                            System.out.println("can't list the content, it might not be a directory, please go back");

                        } else {
                            System.out.println(s);
                        }
                    }} //result display line by line
                    System.out.println("________________________________");
                    System.out.println("enter a directory name to get in \nenter '<' to go back \nenter 0 to exit");
                    System.out.println("________________________________");
                    Scanner scan = new Scanner(System.in);
                    n = scan.nextLine();

                }
            } else {
                System.out.println("not a specific command");
            }

        } else {
            if (args.length == 0) {
                System.out.println("running GUI");
                new OSprojectFrame().setVisible(true);
            } else {
                System.out.println("too much commands");
            }

        }

    }
}