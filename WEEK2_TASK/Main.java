package WEEK2_TASK;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(readFile("/Users/mac/IdeaProjects/School_Model_Task1/src/WEEK2_TASK/Student.csv"));
        String[][] arr = {{"12345"},{"6789"}};
        System.out.println(teachersList());
        System.out.println(studentList());
    }

//    public static ArrayList<String> readFile(String pathName) throws IOException {
//        ArrayList<String> list = new ArrayList<>();
//        File file = new File(pathName);
//        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file)){
//
//        }

    public static ArrayList<String[]> teachersList(){
        ArrayList<String[]> teachersList = new ArrayList<>();
        for (int i = 0; i < readFile("/Users/mac/IdeaProjects/School_Model_Task1/src/WEEK2_TASK/teachers.csv").size(); i++){
            teachersList.add(split(readFile("/Users/mac/IdeaProjects/School_Model_Task1/src/WEEK2_TASK/teachers.csv")));
            System.out.println(Arrays.toString(teachersList.get(i)));
        }
        return teachersList;
    }

    private static String[] split(ArrayList<String> strings) {
        return strings.toArray(new String[0]);
    }

    public static ArrayList<String[]> studentList() {
        ArrayList<String[]> studentList = new ArrayList<>();
        for (int i = 0; i < readFile("/Users/mac/IdeaProjects/School_Model_Task1/src/WEEK2_TASK/Student.csv").size(); i++){
            studentList.add(split(readFile("/Users/mac/IdeaProjects/School_Model_Task1/src/WEEK2_TASK/Student.csv").get(i), ','));
            System.out.println(Arrays.toString(studentList.get(i)));
        }
        return studentList;
    }

    public static ArrayList<String> readFile(String pathName){
        ArrayList<String> list = new ArrayList<>();
        File file = new File(pathName);
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = bufferedReader.readLine()) != null){
                list.add(line);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }

    public static String[] split(String str, char regex){
        String newStr = "";
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == regex && i == str.length()-1){
                newStr += c + "null";
                break;
            }
            else if (c == regex && str.charAt(i+1) == regex) newStr += c + "null";
            else newStr += c;
        }
        return newStr.split(",");
    }


}

