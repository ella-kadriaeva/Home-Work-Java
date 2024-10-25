package home_work_01;
//https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf горячие клавиши Intellij Idea
//
//и книги по java
//http://uchcom7.botik.ru/L/prog/java/java_2_tom_1_8-e_izd.pdf
//http://uchcom7.botik.ru/L/prog/java/java_2_tom_2_8-e_izd.pdf
//https://library.bsuir.by/m/12_101945_1_131228.pdf
//GitHub
//GitHub - tel-ran-de/130824-m-basic-java: 130824-m-basic-java
//130824-m-basic-java. Contribute to tel-ran-de/130824-m-basic-java development by creating an account on GitHub.

public class Main {
    public static void main(String[] args) {
        char letter = 'G';
        int number = 89;
        byte numberByte = 4;
        short numberShort = 56;
        float numberFloat = 4.7333436f;
        double numberDouble = 4.355453532;
        long numberLong = 12121L;
        System.out.printf("%c %d %d %d %f %f %o", letter, number, numberByte, numberShort, numberFloat, numberDouble, numberLong );
        System.out.println(" ");
        Character letterObj = 'G';
        Integer numberObj = 89;
        Byte numberByteObj = 4;
        Short numberShortObj = 56;
        Float numberFloatObj = 4.7333436F;
        Double numberDoubleObj = 4.355453532;
        Long numberLongObj = 12121L;
        System.out.printf("%c %d %d %d %f %f %o", letterObj, numberObj, numberByteObj, numberShortObj, numberFloatObj, numberDoubleObj, numberLongObj );
    }
}