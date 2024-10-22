package home_work_07;

public class StringTask {
    //    Сформировать SQL запрос: Вернуть все записи из cars, где параметры равны заданным, используя StringBuilder.
    //    Если значение null, то параметр не должен попадать в запрос.

    public static void main(String[] args) {
        String[] arr = {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null};

        StringBuilder sb = new StringBuilder("SELECT * FROM cars");
        boolean isExists = false;

        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i + 1] != null) {
                if (!isExists) {
                    sb.append(" WHERE");
                    isExists = true;
                } else {
                    sb.append(" and");
                }
                sb.append(" ").append(arr[i]).append(" = ").append(arr[i + 1]);
            }
        }

        sb.append(";");

        System.out.println(sb);
    }
}
