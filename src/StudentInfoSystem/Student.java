package StudentInfoSystem;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.printf("Ortalama : %5.2f" , this.avarage);
            System.out.println();
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note * 0.8 + this.fizik.oralNote * 0.2 + this.kimya.note * 0.8 + this.kimya.oralNote * 0.2 + this.mat.note * 0.8 + this.mat.oralNote * 0.2) / 3;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya, int oralMat, int oralFizik, int oralKimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

        if (oralMat >= 0 && oralMat <= 100) {
            this.mat.oralNote = oralMat;
        }

        if (oralFizik >= 0 && oralFizik <= 100) {
            this.fizik.oralNote = oralFizik;
        }

        if (oralKimya >= 0 && oralKimya <= 100) {
            this.kimya.oralNote = oralKimya;
        }

    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
}