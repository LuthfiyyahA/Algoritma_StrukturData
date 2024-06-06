public class Graph15 {
    int vertex;
    DoubleLinkedListG15 list[];

    public Graph15(int v) {
        vertex = v;
        list = new DoubleLinkedListG15[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedListG15();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        //directed
        list[asal].addFirst(tujuan, jarak);
        //undirected
        //list[tujuan].addFirst(asal, jarak);
    }

    public void degree(int asal) throws Exception {
        //undirected
        //System.out.println("Degree dari gedung " + (char) ('A' + asal) + " : " +list[asal].size());
        //directed
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            //indegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            //outdegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + " : " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + " : " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdge() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public boolean isAdjacent(int asal, int tujuan) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                return true;
            }
        }
        return false;
    }
}