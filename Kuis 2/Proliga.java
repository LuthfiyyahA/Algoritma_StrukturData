public class Proliga {
    String tim;
    int skorWin, skorLose, point;
    Proliga next;

    public Proliga(String club, Proliga berikutnya) {
        tim = club;
        this.skorWin = 0;
        this.skorLose = 0;
        this.point = 0;
        this.next = berikutnya;
    }
}