package dev.spanhol.day8;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Objects;

public class Eight {
    String input = ".C...............w.......................M.E......\n" +
            "...............G........V.............Q....M......\n" +
            "u........k...........V.y..3........Q..........4.a.\n" +
            "..........c.9........k..................i..7..a...\n" +
            "..............y.......................o....a......\n" +
            ".......C...........6.......y.............E........\n" +
            ".............................5....x............i..\n" +
            "...............c.....wy..V.......5..............E.\n" +
            "........k.......c....G..I............o.........m..\n" +
            "............C....s......G......o..........5.......\n" +
            "......................Q...............5....e...4i.\n" +
            ".....I.....................................m.....j\n" +
            "....9K.T.....I...c......w...................X.....\n" +
            "................I.........w....f............3..e.N\n" +
            "C............9..........6..............7...3......\n" +
            "...Z........K.......T.................6...........\n" +
            "......Z..................6...............HN.E.m...\n" +
            "...K...........................1....N...e.o..X....\n" +
            "............hz......................7........j....\n" +
            ".........9......U.R......n.....4.Q..L...X.........\n" +
            "..................A...........S.......0...........\n" +
            "...............l.........p...........2.3M.......x.\n" +
            ".h........................U.................g.....\n" +
            "...Hld...........A..W.......................1x....\n" +
            ".....Z.....n.......lp...e............Xj...L.......\n" +
            "........hU................7...j...S...............\n" +
            "......n............U..........D....S..q...........\n" +
            "....H.....d.r..T..............0..........L.S......\n" +
            "......H......A..T...lp.........LK....1.....2.f.x..\n" +
            "....Z............................g....4...........\n" +
            "..d..r............V...............f..g....2.......\n" +
            ".rn.........D............Pp........q....g.........\n" +
            "..................................................\n" +
            "...................D...0.........Y..t...P.q.......\n" +
            ".......R.s.......................q.P..1...........\n" +
            "...........h..........................2.........f.\n" +
            "........................W.........................\n" +
            "...8...........O................k.................\n" +
            "....rY...........D................P...............\n" +
            "....................O...u.........................\n" +
            "..s..................F............................\n" +
            "...................R......F.......................\n" +
            "......8...........z0....F................J.W......\n" +
            "...................F..z................u..........\n" +
            "..............R.........O.............v.Jt........\n" +
            "s.............8.........m........J.t............v.\n" +
            "......Y.....M........................u..tv........\n" +
            ".................................................v\n" +
            "..................................................\n" +
            ".................z.W..................J...........";
    int width = 0;
    int height = 0;
    char[][] matrix;
    Hashtable<Character, Frequency> frequencies;


    public void read() {
        frequencies = new Hashtable<>();
        String[] lines = input.split("\n");
        height = lines[0].length();
        width = lines.length;
        matrix = new char[width][height];
        for (int y = 0; y < lines.length; y++) {
            String line = lines[y];
            Frequency f;
            for (int x = 0; x < line.length(); x++) {
                matrix[x][y] = line.charAt(x);
                if (matrix[x][y] == '#') {
                    System.out.println("# " + x + "," + y);
                }
                if (matrix[x][y] != '.' && matrix[x][y] != '#') {
                    f = frequencies.putIfAbsent(matrix[x][y], new Frequency(matrix[x][y]));
                    if (f == null) {
                        f = frequencies.get(matrix[x][y]);
                    }
                    f.addAntenaNode(x, y);
                }
            }
        }
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                System.out.print(matrix[x][y]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void part1() {
        read();
        for (Frequency freq : frequencies.values()) {
            for (Antena one : freq.getNodes()) {
                for (Antena two : freq.getNodes()) {
                    if (one.x == two.x && one.y == two.y) {
                        continue;
                    }
                    int distX = one.x - two.x;
                    int distY = one.y - two.y;
                    int ax = one.x + distX;
                    int ay = one.y + distY;
                    int bx = two.x + distX;
                    int by = two.y + distY;
                    if (ax >= 0 && ax < width && ay >= 0 && ay < height && (ax != one.x || ay != one.y) && (ax != two.x || ay != two.y)) {
                        freq.addAntenaAntinode(one.x + distX, one.y + distY);
                    }
                    if (bx >= 0 && bx < width && by >= 0 && by < height && (bx != one.x || by != one.y) && (bx != two.x || by != two.y)) {
                        freq.addAntenaAntinode(two.x + distX, two.y + distY);
                    }
                }
            }
        }
        List<Antena> antinodes = new ArrayList<>();
        for (Frequency freq : frequencies.values()) {
            antinodes.addAll(freq.getAntinode());
        }
        antinodes = antinodes.stream().distinct().toList();
        int sum = antinodes.size();
        System.out.println(sum);
//        for (Frequency freq : frequencies.values()) {
//            System.out.println(freq);
//            for (Antena node : freq.getNodes()) {
//                freq.getAntinode().remove(node);
//                freq.getAntinode().remove(node);
//                freq.getAntinode().remove(node);
//                freq.getAntinode().remove(node);
//            }
//            System.out.println(freq);
//        }
    }

    public void part2() {
        input = "......#....#\n" +
                "...#....0...\n" +
                "....#0....#.\n" +
                "..#....0....\n" +
                "....0....#..\n" +
                ".#....A.....\n" +
                "...#........\n" +
                "#......#....\n" +
                "........A...\n" +
                ".........A..\n" +
                "..........#.\n" +
                "..........#.";
    }

    public class Frequency {
        ArrayList<Antena> nodes;
        ArrayList<Antena> antinode;
        char name;

        public Frequency(char name) {
            this.name = name;
            nodes = new ArrayList<>();
            antinode = new ArrayList<>();
        }

        public void addAntenaNode(int x, int y) {
            nodes.add(new Antena(x, y));
        }

        public void addAntenaAntinode(int x, int y) {
            antinode.add(new Antena(x, y));
        }

        public char getName() {
            return name;
        }

        public void setName(char name) {
            this.name = name;
        }

        public ArrayList<Antena> getNodes() {
            return nodes;
        }

        public ArrayList<Antena> getAntinode() {
            return antinode;
        }

        @Override
        public String toString() {
            return ("" + name + nodes + " | anti=" + antinode);
        }
    }

    public class Antena {
        int x;
        int y;

        public Antena(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Antena antena = (Antena) o;
            return x == antena.x && y == antena.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "{" + "x=" + x + ", y=" + y + '}';
        }
    }
}
