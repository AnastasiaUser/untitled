package voteHW;

import java.util.Scanner;

public class VoteApp {
    public static void main(String[] args) {


        VoteApp vote = new VoteApp();

        vote.showIssuesAndVote();
        vote.arrayAndAverage();
        System.out.println();
        vote.getMinAndMax();
    }
        String[] issues =
                {"World energy issue",
                        "Demographic issue",
                        "Ecological issue",
                        "The problem of wars",
                        "Natural cataclysms"};
        double avg;
        int min, max;
        int[][] marks = new int[5][10];
        Scanner in = new Scanner(System.in);

        int putMarks () {
            int k;
            while (true) {
                k = in.nextInt();
                if (!(k < 11 && k > 0))
                    System.out.println("Attention! Out of range 1-10. Please try again: ");
                else break;
            }
            return k;
        }

        void showIssuesAndVote () {
            System.out.println("Top " + issues.length + " critical global issues:\n");
            for (int i = 0; i < issues.length; i++) System.out.println((i + 1) + "." + issues[i]);
            System.out.println("\n Please rate each issue on a scale of 1 - 10\n" +
                    "(1 being a minor issue, 10 being a disaster).");

            for (int i = 0; i < marks.length; i++) {
                System.out.println();
                System.out.println("Let rate " + (issues[i]) + ": ");
                int j;
                for (j = 0; j < marks[i].length; j++) {
                    System.out.println((j + 1) + " person, it's your turn to vote: ");
                    marks[i][j] = putMarks();
                }
            }
            System.out.println();
        }

        void arrayAndAverage () {
            System.out.println("Issue Type");
            int total = 0;
            for (int i = 0; i < marks.length; i++) {
                total = 0;
                System.out.println(issues[i] + "\t\t");
                for (int j = 0; j < marks[i].length; j++) {
                    System.out.println(marks[i][j] + "\t");
                    avg = avg + marks[i][j];
                    total += marks[i][j];
                }
                avg = avg / marks[i].length;
                System.out.println("\t\t" + marks[i].length + ";\t");
                System.out.println("\t\t" + avg);
                System.out.println("\t\t" + total);
                avg = 0;
            }
        }
        void getMinAndMax () {
            int total = 0;
            max = 0;
            min = 101;
            int currentMinIssue = 0;
            int currentMaxIssue = 0;
            for (int i = 0; i < marks.length; i++) {
                total = 0;
                for (int j = 0; j < marks[i].length; j++) {
                    total += marks[i][j];
                }
                if (total < min) {
                    min = total;
                    currentMinIssue = i;
                }
                if (total > max) {
                    max = total;
                    currentMaxIssue = i;
                }
                System.out.println("\nThe least important is issue: " + issues[currentMinIssue] + " - with marks sum equal to " + min++);
                System.out.println("\nThe most important is issue: " + issues[currentMaxIssue] + " - with marks sum equal to " + max++);
            }

        }
    }
