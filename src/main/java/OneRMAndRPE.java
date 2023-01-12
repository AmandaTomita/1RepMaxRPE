import java.util.Scanner;

public class OneRMAndRPE {


    public static void main(String[] args) {
        double oneRepMax;
        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter weight in pounds(lb): ");
        String weightLifted = scan.nextLine();

        double weightLiftedDb = Double.parseDouble(weightLifted);

        System.out.println("Please enter number of repetitions at this weight: ");
        String repsLifted = scan.nextLine();

        double repsLiftedDb = Double.parseDouble(repsLifted);
        //epley 1RM equation
        //= weightLiftedDb*(1 + (0.0333 *repsLiftedDb)
        oneRepMax = weightLiftedDb * (1 + (repsLiftedDb *0.0333));

        System.out.println("Your 1 Rep Max is: " + (int)oneRepMax);

        System.out.println("*Based off of the Epley formula");
        System.out.println(" ");

        printBoard(percentage(oneRepMax));
    }

    public static void printBoard(double[] percent) {
        String[] reps = {"    ", "   1   ", "   2   ", "   3   ", "   4   ", "   5   ", "   6   ", "   7   ",
                "   8   ", "   9   ", "   10  ", "   11  ", "   12  "};
        String[] rpe = {"", "   ", "10 ", "9.5", " 9 ", "8.5", " 8 ", "7.5", " 7 ", "6.5"};
        int k = 0;

        for (int i = 0; i <= 9; i++) {
            for (int m = 0; m <= 12; m++) {
                if (i == 0) {
                    System.out.print(reps[m]);
                } else if (m == 0) {
                    System.out.print(rpe[i] + " ");
                } else if (i == 1) {
                    System.out.print("-------");
                } else {
                    if (percent[k] == 0.0) {
                        System.out.print( "  " + percent[k] +"  ");
                    } else if (percent[k] < 10) {
                        System.out.print("  " + percent[k]+"  ");
                    } else if (percent[k] < 100) {
                        System.out.print(" " + percent[k]+"  ");
                    } else {
                        System.out.print(" "+percent[k]+" ");
                    }
                    k++;
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }
        public static double[] percentage(double oneRepMax){
            double[] percentageOfRpe = new double[96];

            for (int i = 0; i < percentageOfRpe.length; i++) {

                if (i == 0) {
                    percentageOfRpe[i] = oneRepMax;
                } else if (i == 1 || i == 24) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.96 * 10) / 10;
                } else if (i == 2 || i == 25 || i == 48) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.92 * 10) / 10;
                } else if (i == 3 || i == 26 || i == 49 || i == 72) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.89 * 10) / 10;
                } else if (i == 4 || i == 27 || i == 50 || i == 73) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.86 * 10) / 10;
                } else if (i == 5 || i == 28 || i == 51 || i == 74) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.84 * 10) / 10;
                } else if (i == 6 || i == 29 || i == 52 || i == 75) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.81 * 10) / 10;
                } else if (i == 7 || i == 30 || i == 53 || i == 76) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.79 * 10) / 10;
                } else if (i == 8 || i == 31 || i == 54 || i == 77) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.76 * 10) / 10;
                } else if (i == 9 || i == 32 || i == 55 || i == 78) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.74 * 10) / 10;
                } else if (i == 10 || i == 33 || i == 56 || i == 79) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.71 * 10) / 10;
                } else if (i == 11 || i == 34 || i == 57 || i == 80) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.68 * 10) / 10;
                } else if (i == 12) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.98 * 10) / 10;
                } else if (i == 13 || i == 36) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.94 * 10) / 10;
                } else if (i == 14 || i == 37 || i == 60) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.91 * 10) / 10;
                } else if (i == 15 || i == 38 || i == 61 || i == 84) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.88 * 10) / 10;
                } else if (i == 16 || i == 39 || i == 62 || i == 85) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.85 * 10) / 10;
                } else if (i == 17 || i == 40 || i == 63 || i == 86) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.82 * 10) / 10;
                } else if (i == 18 || i == 41 || i == 64 || i == 87) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.80 * 10) / 10;
                } else if (i == 19 || i == 42 || i == 65 || i == 88) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.77 * 10) / 10;
                } else if (i == 20 || i == 43 || i == 66 || i == 89) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.75 * 10) / 10;
                } else if (i == 21 || i == 44 || i == 67 || i == 90) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.72 * 10) / 10;
                } else if (i == 22 || i == 45 || i == 68 || i == 91) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.69 * 10) / 10;
                } else if (i == 23 || i == 46 || i == 69 || i == 92) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.67 * 10) / 10;
                } else if (i == 34 || i == 57 || i == 80) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.68 * 10) / 10;
                } else if (i == 35 || i == 58 || i == 81) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.65 * 10) / 10;
                } else if (i == 47 || i == 70 || i == 93) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.64 * 10) / 10;
                } else if (i == 59 || i == 82) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.63 * 10) / 10;
                } else if (i == 71 || i == 94) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.61 * 10) / 10;
                } else if (i == 83) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.60 * 10) / 10;
                } else if (i == 95) {
                    percentageOfRpe[i] = Math.round(oneRepMax * 0.59 * 10) / 10;
                }
            } return percentageOfRpe;
        }

}

