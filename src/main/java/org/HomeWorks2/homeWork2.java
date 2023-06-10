package org.HomeWorks2;

public class homeWork2 {
//    Дана строка sql-запроса "select * from students where ".
//    Сформируйте часть WHERE этого запроса, используя StringBuilder.
//    Данные для фильтрации приведены ниже в виде json-строки.
//    Если значение null, то параметр не должен попадать в запрос.
//    Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//    В итоге должно получится select * from students where name=Ivanov, country=Russia, city=Moscow, age=null
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("select * from students where");
        String filter = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String filter1  = filter.replace("\"", "")
                .replace("{","").replace("}","")
                .replace(":","=");
        str = new StringBuilder(str + " " + filter1);
        String finishtext2 = str.toString();
        if(finishtext2.contains("age=null")) finishtext2 = finishtext2.replace(", age=null","");
        if(finishtext2.contains("name=null")) finishtext2 = finishtext2.replace(", name=null","");
        if(finishtext2.contains("country=null")) finishtext2 = finishtext2.replace(", country=null","");
        if(finishtext2.contains("city=null")) finishtext2 = finishtext2.replace(", city=null","");

        System.out.println(finishtext2);







    }
}
