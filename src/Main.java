import java.util.Scanner;
import java.util.Arrays;

class Main{
    static Scanner input = new Scanner(System.in);
    static String student [][] = new String[0][2];
    static double mark[][] = new double[0][2];

    public static void main(String args[]){

        while(true){
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("|             WELCOME TO GDSE MARKS MANAGEMENT SYSTEM                     |");
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("[1] Add new student                           ");
            System.out.print("[2] Add new student with marks \n[3] Add marks                                 ");
            System.out.print("[4] Update student details \n[5] Update marks                              ");
            System.out.print("[6] Delete student \n[7] Print student details                     ");
            System.out.print("[8] Print student ranks \n[9] Best in Programming Fundementals          ");
            System.out.println("[10] Best in Database Management System");

            System.out.print("\nEnter an option to continue > ");
            int opt = input.nextInt();


            switch(opt){
                case 1:
                    clearConsole();
                    System.out.println("------------------------------------------------");
                    System.out.println("|                ADD NEW STUDENT                ");
                    System.out.println("------------------------------------------------");

                    addNewStudent();
                    break;
                case 2:
                    clearConsole();
                    System.out.println("------------------------------------------------");
                    System.out.println("|          ADD NEW STUDENT WITH MARKS          |");
                    System.out.println("------------------------------------------------");

                    addStudentWithMarks();
                    break;
                case 3:
                    clearConsole();
                    System.out.println("------------------------------------------------");
                    System.out.println("|                    ADD MARKS                 |");
                    System.out.println("------------------------------------------------");

                    addMarks();
                    break;
                case 4:
                    clearConsole();
                    System.out.println("------------------------------------------------");
                    System.out.println("|            UPDATE STUDENT DETAILS            |");
                    System.out.println("------------------------------------------------");

                    updateStudentDetails();
                    break;
                case 5:
                    clearConsole();
                    System.out.println("------------------------------------------------");
                    System.out.println("|                  UPDATE MARKS                |");
                    System.out.println("------------------------------------------------");

                    updateMarks();
                    break;
                case 6:
                    clearConsole();
                    System.out.println("------------------------------------------------");
                    System.out.println("|                 DELETE STUDENT               |");
                    System.out.println("------------------------------------------------");

                    deleteStudent();
                    break;
                case 7:
                    clearConsole();
                    System.out.println("------------------------------------------------");
                    System.out.println("|             PRINT STUDENT DETAILS            |");
                    System.out.println("------------------------------------------------");

                    printStudentDetails();
                    break;
                case 8:
                    clearConsole();
                    System.out.println("------------------------------------------------");
                    System.out.println("|               PRINT STUDENT RANKS            |");
                    System.out.println("------------------------------------------------");

                    printStudentRanks();
                    break;
                case 9:
                    clearConsole();
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("|              BEST IN PROGRAMMING FUNDEMENTALS             |");
                    System.out.println("-------------------------------------------------------------");

                    bestInPRF();
                    break;
                case 10:
                    clearConsole();
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("|              BEST IN DATABASE MANAGEMENT SYSTEM             |");
                    System.out.println("---------------------------------------------------------------");

                    bestInDBMS();
                    break;
                default:
                    clearConsole();
                    System.out.println("Invalid input.Try again with given options.");
                    break;
            }
        }

    }

    public static void addNewStudent(){//This one for ADD NEW STUDENT [1].
        String op = "y";
        while(op.equalsIgnoreCase("y")){

            extendArray();

            while(true){
                System.out.print("\nEnter Student ID : ");
                student[student.length-1][0] = input.next();

                int count=0;
                for(int i=0; i<student.length-1; i++){
                    if(student[student.length-1][0].equals(student[i][0])){
                        count++;
                    }
                }

                if(count==0){
                    break;
                }else{
                    System.out.println("The Student ID already exists");
                }
            }

            System.out.print("Enter Student name : ");
            student[student.length-1][1] = input.next();
            System.out.println();


            System.out.print("Student has been added successfully.");

            while(true){
                System.out.print("Do you want to add new student(y/n) : ");
                op = input.next();

                if(op.equalsIgnoreCase("y") || op.equalsIgnoreCase("n")){
                    break;
                }else{
                    System.out.print("Invalid Input.");
                }

            }
            clearConsole();
        }
    }


    public static void addStudentWithMarks(){//This one for ADD NEW STUDENT WITH MARKS [2].

        String op ="y";

        while(op.equals("y")){
            extendArray();

            while(true){
                System.out.print("\nEnter Student ID : ");
                student[student.length-1][0] = input.next();

                int count=0;

                for(int i=0; i<student.length-1; i++){
                    if(student[student.length-1][0].equals(student[i][0])){
                        count++;
                    }
                }

                if(count==0){
                    break;
                }else{
                    System.out.println("The Student ID already Exists");
                }
            }

            System.out.print("Enter Student name : ");
            student[student.length-1][1] = input.next();
            System.out.println();

            while(true){
                System.out.print("Programming Fundamentals Mark : ");
                mark[mark.length-1][0] = input.nextDouble();

                if(mark[mark.length-1][0]<0 || mark[mark.length-1][0]>100 ){
                    System.out.println("Inavlid marks, Please enter correct marks.\n");
                }else{
                    break;
                }
            }

            while(true){
                System.out.print("Database Management System Mark : ");
                mark[mark.length-1][1] = input.nextDouble();

                if(mark[mark.length-1][1]<0 ||mark[mark.length-1][1]>100 ){
                    System.out.println("Inavlid marks, Please enter correct marks.");
                }else{
                    break;
                }
            }

            System.out.print("Student has been added successfully.");

            while(true){
                System.out.print("Do you want to add new student(y/n) : ");
                op = input.next();

                if(op.equalsIgnoreCase("y") || op.equalsIgnoreCase("n")){
                    break;
                }else{
                    System.out.print("Invalid Input.");
                }
            }

            clearConsole();
        }



    }

    public static void addMarks(){ //This one for ADD MARKS [3].

        String op = "y";

        while(op.equals("y")){

            String option = "y";
            int idNo = -1;
            while(true){
                System.out.print("\nEnter Student ID : ");
                String id = input.next();

                for(int i=0; i<student.length; i++){
                    if(id.equals(student[i][0])){
                        idNo=i;
                    }
                }

                if(idNo<0){
                    System.out.print("Invalid Student ID.");

                    while(true){
                        System.out.print("Do you want to search again(y/n)?");
                        option = input.next();

                        if(option.equalsIgnoreCase("y") || option.equalsIgnoreCase("n")){
                            break;
                        }else{
                            System.out.print("Invalid option.");
                        }
                    }

                }else{
                    System.out.println("Student name : " + student[idNo][1]);
                    break;
                }
                if(option.equalsIgnoreCase("n")){
                    break;
                }
            }

            if(option.equalsIgnoreCase("n")){
                break;
            }else if(mark[idNo][0]!=0 && mark[idNo][1]!=0){
                System.out.println("This student's marks have been already added.\nIf you want to update the marks, please use [5] Update marks option.\n");

                while(true){
                    System.out.print("Do you want to add marks for another student?(y/n)");
                    op = input.next();

                    if(op.equalsIgnoreCase("y") || op.equalsIgnoreCase("n")){
                        break;
                    }else{
                        System.out.print("Invalid option.");
                    }
                }
            }else{
                while(true){
                    System.out.print("\nProgrammingFundamentals Mark : ");
                    mark[idNo][0] = input.nextDouble();

                    if(mark[idNo][0]<0 || mark[idNo][0]>100 ){
                        System.out.println("Inavlid marks. Please Enter Valid Marks.\n");
                    }else{
                        break;
                    }
                }

                while(true){
                    System.out.print("Database Management System Mark : ");
                    mark[idNo][1] = input.nextDouble();

                    if(mark[idNo][1]<0 || mark[idNo][1]>100){
                        System.out.println("Inavlid marks. Please Enter Valid Marks.\n");
                    }else{
                        break;
                    }
                }
                System.out.print("Marks have been added.");

                while(true){
                    System.out.print("Do you want to add marks for another student?(y/n)");
                    op = input.next();

                    if(op.equalsIgnoreCase("y") || op.equalsIgnoreCase("n")){
                        break;
                    }else{
                        System.out.print("Invalid option.");
                    }
                }
            }
        }

        clearConsole();

    }

    public static void updateStudentDetails(){ //This one for UPDATE STUDENT DETAILS[4].

        String op = "y";

        while(op.equals("y")){

            int idNo = -1;
            String option = "y";
            while(option.equals("y")){
                System.out.print("\nEnter Student ID : ");
                String id = input.next();

                for(int i=0; i<student.length; i++){
                    if(id.equals(student[i][0])){
                        idNo=i;
                    }
                }

                if(idNo<0){
                    System.out.print("Invalid Student ID.");

                    while(true){
                        System.out.print("Do you want to search again(y/n)?");
                        option = input.next();

                        if(option.equalsIgnoreCase("y") || option.equalsIgnoreCase("n")){
                            break;
                        }else{
                            System.out.print("Invalid option.");
                        }
                    }


                }else{
                    System.out.println("Student name : "+student[idNo][1]);
                    break;
                }
            }
            if(option.equals("n")){
                break;
            }

            System.out.print("\nEnter new student name : ");
            student[idNo][1] = input.next();

            System.out.println("Student details has been updated successfully.");

            while(true){
                System.out.print("Do you want to update another student details (y/n)?");
                op = input.next();

                if(op.equalsIgnoreCase("y") || op.equalsIgnoreCase("n")){
                    break;
                }else{
                    System.out.print("Invalid option.");
                }
            }
        }
        clearConsole();

    }

    public static void updateMarks(){ //This one for UPDATE MARKS[5].

        String op = "y";

        while(op.equals("y")){

            int idNo = -1;
            String option = "y";
            while(option.equals("y")){
                System.out.print("\nEnter Student ID : ");
                String id = input.next();

                for(int i=0; i<student.length; i++){
                    if(id.equals(student[i][0])){
                        idNo = i;
                    }
                }

                if(idNo<0){
                    System.out.print("Invalid Student ID.");

                    while(true){
                        System.out.print("Do you want to search again(y/n)?");
                        option = input.next();

                        if(option.equalsIgnoreCase("y") || option.equalsIgnoreCase("n")){
                            break;
                        }else{
                            System.out.print("Invalid option.");
                        }
                    }

                }else if(mark[idNo][0]==0 && mark[idNo][1]==0){
                    System.out.print("This student marks yet to be added.");

                    while(true){
                        System.out.print("Do you want to search again(y/n)?");
                        option = input.next();

                        if(option.equalsIgnoreCase("y") || option.equalsIgnoreCase("n")){
                            break;
                        }else{
                            System.out.print("Invalid option.");
                        }
                    }

                }else{
                    System.out.println("Student name : "+ student[idNo][1]);

                    System.out.println("Programming Fundamentals Marks : " + mark[idNo][0]);
                    System.out.println("Database Management Systems Marks : " + mark[idNo][1]);

                    break;
                }
            }
            if(option.equals("n")){
                break;
            }

            while(true){
                System.out.print("\nEnter new programming Fundamentals Marks : ");
                mark[idNo][0] = input.nextDouble();

                if(mark[idNo][0]<0 || mark[idNo][0]>100 ){
                    System.out.println("Inavlid marks, Please enter correct marks.\n");
                }else{
                    break;
                }
            }

            while(true){
                System.out.print("Enter new Database Management Systems Marks : ");
                mark[idNo][1] = input.nextDouble();

                if(mark[idNo][0]<0 || mark[idNo][0]>100 ){
                    System.out.println("Inavlid marks, Please enter correct marks.\n");
                }else{
                    break;
                }
            }

            System.out.println("Marks have been updated successfully.");

            while(true){
                System.out.print("Do you want to update marks for another student(y/n)?");
                op = input.next();

                if(op.equalsIgnoreCase("y") || op.equals("n")){
                    break;
                }else{
                    System.out.print("Invalid option.");
                }
            }
        }

        clearConsole();

    }

    public static void deleteStudent(){ //This one for DELETE STUDENT [6].

        String op = "y";

        while(op.equals("y")){

            int idNo = 1;

            System.out.print("\nEnter Student ID : ");
            String id = input.next();

            for(int i=0; i<student.length; i++){
                if(id.equals(student[i][0])){
                    idNo=i;
                }
            }

            if(idNo<0){
                System.out.print("Invalid Student ID.");

                while(true){
                    System.out.print("Do you want to search again(y/n)?");
                    op = input.next();

                    if(op.equalsIgnoreCase("y") || op.equalsIgnoreCase("n")){
                        break;
                    }else{
                        System.out.print("Invalid option.");
                    }
                }

            }else{
                String tempsId[][] = new String[student.length][2];
                double tempMarks[][] = new double[student.length][2];

                for(int i=0; i<student.length;i++){
                    for(int j=0; j<student[i].length;j++){
                        if(idNo!=i){
                            tempsId[i][j] = student[i][j];
                            tempMarks[i][j] = mark[i][j];
                        }

                    }
                }

                student = tempsId;
                mark = tempMarks;

                System.out.println("Student has benn deleted successfully.");

                while(true){
                    System.out.print("Do you want to delete another student(y/n)?");
                    op = input.next();

                    if(op.equalsIgnoreCase("y") || op.equalsIgnoreCase("n")){
                        break;
                    }else{
                        System.out.print("Invalid option.");
                    }
                }
            }
        }

        clearConsole();

    }

    public static void printStudentDetails(){//This one for PRINT STUDENT DETAILS[7].

        String op = "y";

        while(op.equals("y")){
            int idNo = 1;

            System.out.print("\nEnter Student ID : ");
            String id = input.next();

            for(int i=0; i<student.length;i++){
                if(id.equals(student[i][0])){
                    idNo = i;
                }
            }

            if(idNo<0){
                System.out.print("Invalid Student ID.");

                while(true){
                    System.out.print("Do you want to search again(y/n)?");
                    op = input.next();

                    if(op.equalsIgnoreCase("y") || op.equalsIgnoreCase("n")){
                        break;
                    }else{
                        System.out.print("Invalid option.");
                    }
                }
            }else {
                System.out.println("Student name : " + student[idNo][1]);

                if(mark[idNo][0]==0 || mark[idNo][1]==0){
                    System.out.println("\nMarks yet to be added.");

                }else{
                    System.out.println("+------------------------------+----------------+");
                    System.out.println("|Programming Fundamnetal Marks |          " + mark[idNo][0] + "  |");
                    System.out.println("|Database Management System    |          " + mark[idNo][1] + "  |");

                    double tot[] = total();
                    System.out.println("|Total Marks                   |         " + tot[idNo]+"  |");

                    double avg[] = average();
                    System.out.println("|Avg. Marks                    |          " + avg[idNo]+"  |");

                    String rank = rank(idNo);
                    System.out.println("|Rank                          |" + (rank(idNo)) + "|");

                    System.out.println("+------------------------------+----------------+");
                }

                while(true){
                    System.out.print("Do you want to search another student details(y/n)?");
                    op = input.next();

                    if(op.equalsIgnoreCase("y") || op.equalsIgnoreCase("n")){
                        break;
                    }else{
                        System.out.print("Invalid option.");
                    }
                }
            }

            clearConsole();
        }


    }

    public static void printStudentRanks(){//This one for PRINT STUDENT RANKS[8].

        System.out.println("+--------+-----+------------------+--------------+-------------+");
        System.out.println("|Rank    |ID   |Name              |Total Marks   |Avg. Marks   |");
        System.out.println("+--------+-----+------------------+--------------+-------------+");

        double desc[] = descOrd();
        double tot[] = descTot();
        String tempsId[][] = sIdDesc();

        for(int i=0; i<desc.length;i++){
            if(desc[i]!=0){

                System.out.println("|"+(i+1)+"       |"+tempsId[i][0]+" |"+tempsId[i][1]+"             |           "+tot[i]+"|         "+desc[i]+"|");
            }
        }

        System.out.println("+--------+-----+------------------+--------------+-------------+");

        String op = "y";

        while(true){
            System.out.print("Do you want to go back to main menu(y/n)?");
            op = input.next();

            if(op.equalsIgnoreCase("y")){
                break;
            }else if(op.equalsIgnoreCase("n")){
                System.out.println();
            }else{
                System.out.print("Invalid option.");
            }
        }

        if(op.equals("y")){
            clearConsole();
        }

    }

    public static void bestInPRF(){ // This one for BEST IN PROGRAMMING FUNDEMENTALS[9].

        System.out.println("+-----+------------------+--------------+-------------+");
        System.out.println("|ID   |Name              |PRF Marks     |DBMS Marks   |");
        System.out.println("+-----+------------------+--------------+-------------+");

        double desc[][] = PRFDesc();

        String tempsId[][] = sIdDesc();

        for(int i=0; i<desc.length; i++){
            if(desc[i][0]!=0 && desc[i][1]!=0){
                System.out.println("|" + tempsId[i][0] + " |" + tempsId[i][1] + "             |" + desc[i][0] + "            |" + desc[i][1] + "         |");
            }
        }

        System.out.println("+-----+------------------+--------------+-------------+");

        String op = "y";
        while(true){
            System.out.print("Do you want to go back to main menu(y/n)?");
            op = input.next();

            if(op.equalsIgnoreCase("y")){
                break;
            }else if(op.equalsIgnoreCase("n")){
                System.out.println();
            }else{
                System.out.print("Invalid option.");
            }
        }

        if(op.equals("y")){
            clearConsole();
        }

    }

    public static void bestInDBMS(){//This one for get BEST IN DATABASE MANAGEMENT SYSTEMS[10].

        System.out.println("+-----+------------------+--------------+-------------+");
        System.out.println("|ID   |Name              |DBMS Marks    |PRF Marks    |");
        System.out.println("+-----+------------------+--------------+-------------+");

        double desc[][] = DBMSDesc();

        String tempsId[][] = sIdDesc();

        for(int i=0; i<desc.length; i++){
            if(desc[i][0]!=0 && desc[i][1]!=0){
                System.out.println("|" + tempsId[i][0] + " |" + tempsId[i][1] + "             |" + desc[i][1]+"             |" + desc[i][0] + "         |");
            }
        }

        System.out.println("+-----+------------------+--------------+-------------+");

        String op = "y";
        while(op.equals("y")){
            System.out.print("Do you want to go back to main menu(y/n)?");
            op = input.next();

            if(op.equalsIgnoreCase("y")){
                break;
            }else if(op.equalsIgnoreCase("n")){
                System.out.println();
                break;
            }else{
                System.out.print("Invalid option.");
            }
        }

        if(op.equals("y")){
            clearConsole();
        }

    }


    public static void extendArray(){//This one is extend array.
        String tempsId[][] = new String[student.length+1][2];
        double tempMarks[][] = new double[student.length+1][2];

        for(int i=0; i<student.length;i++){
            for(int j=0; j<student[i].length;j++){
                tempsId[i][j] = student[i][j];
                tempMarks[i][j] = mark[i][j];
            }
        }

        student = tempsId;
        mark = tempMarks;
    }


    public final static void clearConsole() { //This one for clear console.
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
            // Handle any exceptions.
        }
    }

    public static double[][] PRFDesc(){//This one for create PRF marks in descending order.
        double descOrder[][] = new double[mark.length][2];

        for(int i=0; i<descOrder.length;i++){
            descOrder[i][0] = mark[i][0];
        }

        for(int i=0; i<descOrder.length-1; i++){
            for(int j=0;j<descOrder.length-1; j++){
                if(descOrder[j][0]<descOrder[j+1][0]){
                    double temp = descOrder[j][0];
                    descOrder[j][0] = descOrder[j+1][0];
                    descOrder[j+1][0] = temp;
                }
            }
        }

        for (int i=0; i<descOrder.length; i++){
            for(int j=0; j < descOrder.length; j++){
                if(descOrder[i][0]==mark[j][0]){
                    descOrder[i][1] = mark[j][1];
                }

            }
        }

        return descOrder;
    }


    public static double[][] DBMSDesc(){//This one for create DBMS marks in descending order.
        double descOrder[][] = new double[mark.length][2];

        for(int i=0; i<descOrder.length;i++){
            descOrder[i][0] = mark[i][0];
        }

        for(int i=0; i<descOrder.length-1; i++){
            for(int j=0;j<descOrder.length-1; j++){
                if(descOrder[j][0]<descOrder[j+1][0]){
                    double temp = descOrder[j][0];
                    descOrder[j][0] = descOrder[j+1][0];
                    descOrder[j+1][0] = temp;
                }
            }
        }

        for (int i=0; i<descOrder.length; i++){
            for(int j=0; j < descOrder.length; j++){
                if(descOrder[i][0]==mark[j][0]){
                    descOrder[i][1] = mark[j][1];
                }

            }
        }

        return descOrder;
    }



    public static double[] total(){//This one for get total.
        double tot[] = new double[mark.length];

        for(int i=0; i<tot.length; i++){
            tot[i] = mark[i][0] + mark[i][1];
        }

        return tot;
    }

    public static double[] average(){	//This one for get average.
        double tot[] = total();
        double avg[] = new double[mark.length];

        for(int i=0; i<avg.length; i++){
            avg[i] = tot[i]/2;
        }

        return avg;
    }

    public static double[] descOrd(){	//This one for create the average marks descending order.
        double desc[] = average();

        for(int i=0; i<desc.length-1; i++){
            for(int j=0; j<desc.length-1; j++){
                if(desc[j]<desc[j+1]){
                    double temp = desc[j];
                    desc[j]=desc[j+1];
                    desc[j+1]=temp;
                }
            }
        }

        return desc;
    }

    public static String[][] sIdDesc(){//This one for create sIds' descending order according to avg.

        double desc[] = descOrd();
        double avg[] = average();
        String tempsId[][] = new String[desc.length][2];

        for (int i=0; i<desc.length; i++){
            for(int j=0; j<avg.length; j++){
                if(desc[i]==avg[j]){
                    tempsId[i][0] = student[j][0];
                    tempsId[i][1] = student[j][1];
                }

            }
        }
        return tempsId;

    }

    public static String rank(int index){//This one for get id ranks.
        double desc[] = descOrd();
        double avg[] = average();

        int r = 0;		//  r for the numerical value of the rank
        for (int i = 0; i<desc.length; i++){
            if(avg[index]==desc[i]){
                r = i+1;
            }
        }

        String rank="null";

        if(desc[desc.length-1]==avg[index]){
            rank = "        "+r+"(First)";
        }else{

            switch (r){
                case 1:
                    rank = "        "+r+"(First)";
                    break;
                case 2:
                    rank = "       "+r+"(Second)";
                    break;
                case 3:
                    rank = "        "+r+"(Third)";
                    break;
                case 4:
                    rank = "       "+r+"(Fourth)";
                    break;
                case 5:
                    rank = "        "+r+"(Fifth)";
                    break;
                case 6:
                    rank = "        "+r+"(Sixth)";
                    break;
                case 7:
                    rank = "      "+r+"(Seventh)";
                    break;
                case 8:
                    rank = "      "+r+"(Eightth)";
                    break;
                case 9:
                    rank = "       "+r+"(nineth)";
                    break;
                case 10:
                    rank = "       "+r+"(tenth)";
                    break;
                default :
                    rank = "      "+ r +"("+ r +"th)";
                    break;
            }

        }
        return rank;

    }

    public static double[] descTot(){

        double tot[] = total();

        for(int i=0; i<tot.length-1; i++){
            for(int j=0; j<tot.length-1; j++){
                if(tot[j]<tot[j+1]){
                    double temp = tot[j];
                    tot[j] = tot[j+1];
                    tot[j+1] = temp;
                }
            }
        }

        return tot;

    }

}
