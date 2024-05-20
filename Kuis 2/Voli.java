public class Voli {
    Proliga head;

    boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Proliga tmp = head;
            System.out.printf("%-33s %-11s %-11s %-5s", "Tim", "Skor Menang", "Skor Kalah", "Poin");
            System.out.println("\n_________________________________________________________________");
            while (tmp != null) {
                System.out.printf("\n%-37s %-11s %-7s %-5s", tmp.tim, tmp.skorWin, tmp.skorLose, tmp.point);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List kosong");
        }
        System.out.println("\n");
    }

    public void addTim(String tim) {
        Proliga newNode = new Proliga(tim, null);
        if (head == null) {
            head = newNode;
        } else {
            Proliga tmp = head;
            while (tmp.next!= null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
        System.out.println(tim);
    }

    public Proliga findTim(String tim) {
        Proliga current = head;
        while (current!= null) {
            if (current.tim.equals(tim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void hitungPoint(String timA, String timB, int skorA, int skorB) {
        Proliga nodeA = findTim(timA);
        Proliga nodeB = findTim(timB);

        int pointTimA = 0;
        int pointTimB = 0;
        
        if (nodeA != null && nodeB != null) {
            if (skorA > skorB) {
                if (skorA == 3 && skorB == 0 || skorA == 3 && skorB == 1 ) {
                    pointTimA = 3;
                    pointTimB = 0;
                } else if (skorA == 3 && skorB == 2) {
                    pointTimA = 2;
                    pointTimB = 1;
                }
                
                nodeA.skorWin += 1;
                nodeB.skorLose += 1;

            } else if (skorB > skorA) {
                if (skorB == 3 && skorA == 0 || skorB == 3 && skorA == 1) {
                    pointTimB = 3;
                    pointTimA = 0;
                } else if (skorB == 3 && skorA == 2) {
                    pointTimB = 2;
                    pointTimA = 1;
                }
                
                nodeB.skorWin += 1;
                nodeA.skorLose += 1;
            }
            nodeA.point += pointTimA;
            nodeB.point += pointTimB;

            System.out.printf("%-9s%-32s%-3s%-1s", "Point tim ", nodeA.tim, " : ", pointTimA);
            System.out.printf("\n%-9s%-32s%-3s%-1s", "Point tim ", nodeB.tim, " : ", pointTimB);
        }
    }
}