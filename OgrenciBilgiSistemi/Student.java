package OgrenciBilgiSistemi;


public class Student {

    Course mat;
    Course fizik;
    Course kimya;
    String name, stuNo;
    int classes;
    boolean isPass;
    double avarage;

    public Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            if (this.isPass){
                System.out.println("Sınıfı geçti");
            }else {
                System.out.println("Sınıfta kaldı");
            }


        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.mat.note + this.kimya.note) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik notu : " + this.mat.note);
        System.out.println("Fizik notu : " + this.fizik.note);
        System.out.println("Kimya notu : " + this.kimya.note);
        System.out.println("Ortalama : " + this.avarage);
    }



}
