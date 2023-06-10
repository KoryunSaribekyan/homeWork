package org.HomeWorks2;

public class task2 {
//    [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
//    {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//    {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//    Написать метод(ы), который распарсит json и, используя StringBuilder,
//    создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//    Пример вывода:
//    Студент Иванов получил 5 по предмету Математика.
//    Студент Петрова получил 4 по предмету Информатика.
//    Студент Краснов получил 5 по предмету Физика.
    public static void main(String[] args) {
        String json = "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}";
        String json2 = "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}";
        String json3 = "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}";

        String jsonRedact = json.replace("{","").replace("\"","")
                .replace(":", " ").replace("}","").replace(","," ");
        String jsonRedact2 = json2.replace("{","").replace("\"","")
                .replace(":", " ").replace("}","").replace(","," ");
        String jsonRedact3 = json3.replace("{","").replace("\"","")
                .replace(":", " ").replace("}","").replace(","," ");

        String [] strArray = jsonRedact.split(" ");
        String [] strArray2 = jsonRedact2.split(" ");
        String [] strArray3 = jsonRedact3.split(" ");

        StringBuilder sb = new StringBuilder("Студент"+" "+ strArray[1]+" "+"получил"+ " "+ strArray[3]+" "+"по предмету"+" "+strArray[5]);
        StringBuilder sb1 = new StringBuilder("Студент"+" "+ strArray2[1]+" "+"получил"+ " "+ strArray2[3]+" "+"по предмету"+" "+strArray2[5]);
        StringBuilder sb2 = new StringBuilder("Студент"+" "+ strArray3[1]+" "+"получил"+ " "+ strArray3[3]+" "+"по предмету"+" "+strArray3[5]);

        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb2);


    }
}
