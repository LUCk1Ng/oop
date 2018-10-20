package lab1;

public class Data {
    public static void main(String[] args) {

        Student students1 = new Student();
        students1.age = 19;
        students1.name = "Filip Adrian";
        students1.mark = 10f;

        Student students2 = new Student();
        students2.age = 20;
        students2.name = "Turcanu Ana";
        students2.mark = 10f;

        Student students3 = new Student();
        students3.age = 21;
        students3.name = "Cavcaliuc Nina";
        students3.mark = 10f;

        University UTM = new University();
        UTM.name_university = "UTM";
        UTM.foundation_year = 1964;
        UTM.lista[0] = students1;
        UTM.lista[1] = students2;
        UTM.lista[2] = students3;

        Student students10 = new Student();
        students10.age = 21;
        students10.name = "Doloscan Simion";
        students10.mark = 8.8f;

        Student students20 = new Student();
        students20.age = 22;
        students20.name = "Nicu Andrian";
        students20.mark = 9f;

        Student students30 = new Student();
        students30.age = 20;
        students30.name = "Tepes Vlad";
        students30.mark = 10f;

        University ASEM = new University();
        ASEM.name_university = "ASEM";
        ASEM.foundation_year = 1964;
        ASEM.lista[0] = students1;
        ASEM.lista[1] = students2;
        ASEM.lista[2] = students3;



    }
}
