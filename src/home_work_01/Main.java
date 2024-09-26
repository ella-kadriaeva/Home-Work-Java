package home_work_01;

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