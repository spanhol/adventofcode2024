package dev.spanhol.day6;

public class Six {

    String input = "....................................#.............#...............#..............................................................#\n" +
            "........................#....#............................................##.......#...................................#..........\n" +
            ".........#...............................................#..#.......#...#...........#......................#......................\n" +
            "...........#...........#...................#...........#.........................................#............................#...\n" +
            "................................................................#.....#...............................................#........#..\n" +
            "......................#..........#.#.......................................#...#........................................#.........\n" +
            "....#.......................#............#............#....#....................................................................#.\n" +
            "#.........#....................#.............#......................#............#....#..#................#........#.#.....#......\n" +
            ".................##...................#.................................#.........................................................\n" +
            "...........#...................................................................##..........#..........#.....#...............#.....\n" +
            "..................................#.........#....................................#....#..#...........................#............\n" +
            "............#.....#............................................................#......................#........#........#.........\n" +
            ".........#.........#......#...#.........#..............................................................................#..........\n" +
            ".........#..............................#..............#...........#.......................................#....#.............#...\n" +
            "...................................................................................................#..........#...................\n" +
            "....#.........#......................#..........#.........................................................................#......#\n" +
            "..............#.#........#..#......#..............................................................................................\n" +
            "#....#....#........................#...#...........................................#.....................#..#.......#...#.........\n" +
            "...............................#.........#........#.....................................#.........................................\n" +
            "................................#.....#..........#..........................................................#.....................\n" +
            "...#.......#...........#.....................................................#.....#...#.#..#...............#.#...................\n" +
            "...#...............#..#..................#.........................#................................................#.............\n" +
            ".#................#................................................#.#...........................#.............#................#.\n" +
            "....................#...............#..............#.........................................................#................#...\n" +
            "...............................................................................................#..........#.......................\n" +
            "............#......................................#....................................................#.........................\n" +
            ".......#.....#..................#....................................................................#..................#.....#...\n" +
            "...........#..........................................#.#.........................................................................\n" +
            "..........#..............................#.................................................................#..............#.......\n" +
            "...............#.........#...........#..........................................................................#.................\n" +
            "...............##................................................................##...#....................#....................#.\n" +
            "............##..........................................................................#....#............#.......................\n" +
            "........#.............#.#..#......#..#...........................#........#...........................#....................#......\n" +
            "...............................................................#........................#.#...................................#...\n" +
            "..#.....#.#............................#..........................................................................................\n" +
            "............................................#.#...........#....#............#.....#.......#..............#...................#....\n" +
            "..........................#............................#.#........................#......................#....#...................\n" +
            "..................#.......................#....#....................................#....................................#........\n" +
            "................#............................................#..............#...............................................#.#...\n" +
            ".............#.......................#...#............#...........................................................#..............#\n" +
            "#.#...#.............................................................#.#...........................................................\n" +
            "....#.............#..#.............................................#.............................#................................\n" +
            "..........................................#........#....#.........................#......................................#........\n" +
            "............................#..........#...........................#.......................................#......................\n" +
            "...#.......#..............#...........................#................................................#.......................#..\n" +
            ".#...............................#......................#...................#.........#...........................................\n" +
            ".#.....#......#........................#........#...............#..............................................#..........#.......\n" +
            "...........................................................................................................................#......\n" +
            "........................#......................................#............#.....................................................\n" +
            "........#.....#........#...............#.............#....#..........................................#.#.........................#\n" +
            "...........#........#.......#.........................................#.............................................#.............\n" +
            ".........#......#..........................................................................................#.....#................\n" +
            "........................................#...#...............#..................................#...........#......................\n" +
            ".......................................#.......#.#....#...#.................#.....#......^#.......................................\n" +
            ".#............#......#..........................................#.#......................................#............#.......#...\n" +
            ".................#.......#.........#........#..........................................................................#.....#....\n" +
            "...#..............................#.................#.........................#.........#.........................................\n" +
            "...#.................................................#..............#......................................................#......\n" +
            "....................#.#...............................#................#.....##...................................................\n" +
            ".........#...#....#.............................#.........#....#.....##............................#........#.....................\n" +
            "........#....#..............................#..................................................................#....#......#......\n" +
            "..........................#..#...........#..............#...............#....#..........#.........................................\n" +
            "...........#..........#...........................................#.......................##......................................\n" +
            ".............................................................................................#...................#...........#....\n" +
            "...............................#................#.....#...#..#....#...............................................................\n" +
            "#...#........#...#...................#.......#......................................................................#.............\n" +
            "#..................#..................................................................................#....................#..#..#\n" +
            ".#............#..#...........#................#.......#........#.........#...........#..............#.............................\n" +
            ".......................................#....#........#..............................................#..........#..................\n" +
            "...#....#........................................#....#...........................................................#....#.......#..\n" +
            "..............#....#.......................................#.............#..#.................................#...................\n" +
            "........................................#.#.......................#.#.......................................#.....................\n" +
            "......................#...#....................................................................................#.................#\n" +
            "........#...#...........#.....................#......#..........................................#.....................#.....#.....\n" +
            "...#......................#..........#............................................................................................\n" +
            "..............................................................................#..........#.....#..........#...#...................\n" +
            "........#............#.............#........##..................................................#...#.............................\n" +
            "..#....................................................................#.................#..........#.......#.........##..........\n" +
            "...................#.....................................................#......................#...#..#............#.............\n" +
            "......................................##.........#........................................................#...........#...........\n" +
            "..#..................................................#........................#...................#...............#...............\n" +
            "....#...................................#........#........................................................#.....................#.\n" +
            "....#.#......#..........................................#........................#................................................\n" +
            "#........................#.....................................................................................#...#..............\n" +
            ".#.............................#.......#...............#............#............#.....#.....#........#......#....................\n" +
            "....#......................................................#.......................................................#.......#...#..\n" +
            "............#.........................#.......##..............................#...................#.....#......#..................\n" +
            "........................................................................................#........................#.........#......\n" +
            ".#.......................#.........................#................#..##.........#..#.....................................#......\n" +
            "#...............#................#...#........#.........#......................#...................................#......#.#.....\n" +
            "................#............................##...................................#............#.....................#............\n" +
            "..#...#.................................................................#.........#.........................##................#...\n" +
            "...........................................#.................#............................#..#..............#......#.#............\n" +
            ".................#...........#..................#................#........#...............................#.................#..#.#\n" +
            ".......#.......................#................................#.#...............................................................\n" +
            ".......#.........#.........#...........................................................................#.........#...........#....\n" +
            ".....#.#................................................#.......#..........#......................................................\n" +
            "......................#.........................................#................#...............................#................\n" +
            "..........................#....#.......#....#.................#.#.................................................##...#..#.......\n" +
            "......................................................#.......#..#.....#............#...#..................................#......\n" +
            ".........#.#...............................#..........#...............................#...............#......................#....\n" +
            "..#...........................#.............................#............#...............#......#........................#........\n" +
            ".........#................................................................#....#..#.....##................#.........#.......#.....\n" +
            "...#....................................#...........#.............#...........................................#...................\n" +
            "#.........................#..........#.....................#......#.............#...........#...................................##\n" +
            "....................#......#...#.#.............................................#.............................#..............#.....\n" +
            ".....................#...#.....#......#.............................#........#......#.............#...............................\n" +
            "..................#.............................................................................#..............#..................\n" +
            ".......#...........................#........................................................................#...............#.....\n" +
            "............................................#......................................#..............................................\n" +
            ".....#..........#..................#.............#................................................#..................#...#......##\n" +
            "..............................................................#........................................#...............#..........\n" +
            "...................................#.#........................................................#.#...........#.....................\n" +
            "...#....................#........#.....................#..................................#..............#..#.....................\n" +
            ".................#....................#...#.....#..........#......#...........................#.#............................#.#..\n" +
            "....................................................#.............#..#.....#......................................................\n" +
            ".......#..............................#...............................................#.........................#.......#.........\n" +
            "........#...............#.................................................................................................#......#\n" +
            "#.#.#..............................................................#..............#................#...........#..........#.......\n" +
            "..#.....................................#...........#................................................#................#......#....\n" +
            "#.........................................................#...#................................#......#.#..........#..............\n" +
            ".#...#................#......#................##...#.........#.............#........#.........#........#.....#....................\n" +
            "................#..........................#.#................................................#.............#.....................\n" +
            "..............#................................................................#.............................#.............#......\n" +
            "..................................#...................................#...........................................................\n" +
            "........#.................#....#.........................................................................................#........\n" +
            "...........#...................#........#.......#................................................#..#......#..#...................\n" +
            ".........#.....#......................................................................#.........................#.....#...........\n" +
            "..........................................................#.............................................#.....#...................\n" +
            "...............#.##.................#....#.................#...#.......................#...................#........#.............";

    int height;
    int width;
    int startPosX;
    int startPosY;
    int posX;
    int posY;
    char[][] map;
    int[][] walk;
    int[][] walkUp;
    int[][] walkRight;
    int[][] walkDown;
    int[][] walkLeft;

    public char[][] read() {
        String[] lines = input.split("\n");
        height = lines.length;
        width = lines[0].length();
        char[][] newMap = new char[width][height];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                newMap[x][y] = lines[y].charAt(x);
                if (newMap[x][y] == '^' || newMap[x][y] == '>' || newMap[x][y] == '<' || newMap[x][y] == 'v') {
                    startPosX = x;
                    startPosY = y;
                }
            }
        }

        return newMap;
    }

    public boolean isOutside(int posX, int posY) {
        return posX < 0 || posX >= width || posY < 0 || posY >= height;
    }

    public void part1() {
        map = read();
        posX = startPosX;
        posY = startPosY;
        walk = new int[width][height];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                walk[x][y] = 0;
            }
        }
        while (true) {
            if (posX < 0 || posX > width || posY < 0 || posY > height) {
                break;
            }
            char position = map[posX][posY];
//            System.out.println(position + " " + posX + "," + posY);
            char target;
            walk[posX][posY] = 1;
            if (position == '^') {
                if (isOutside(posX, posY - 1)) {
                    break;
                }
                target = map[posX][posY - 1];
                if (target == '#') {
                    map[posX][posY] = '>';
                } else if (target == '.') {
                    map[posX][posY] = '.';
                    posY = posY - 1;
                    map[posX][posY] = '^';
                }
            } else if (position == '>') {
                if (isOutside(posX + 1, posY)) {
                    break;
                }
                target = map[posX + 1][posY];
                if (target == '#') {
                    map[posX][posY] = 'v';

                } else if (target == '.') {
                    map[posX][posY] = '.';
                    posX = posX + 1;
                    map[posX][posY] = '>';
                }
            } else if (position == '<') {
                if (isOutside(posX - 1, posY)) {
                    break;
                }
                target = map[posX - 1][posY];
                if (target == '#') {
                    map[posX][posY] = '^';

                } else if (target == '.') {
                    map[posX][posY] = '.';
                    posX = posX - 1;
                    map[posX][posY] = '<';
                }
            } else if (position == 'v') {
                if (isOutside(posX, posY + 1)) {
                    break;
                }
                target = map[posX][posY + 1];
                if (target == '#') {
                    map[posX][posY] = '<';

                } else if (target == '.') {
                    map[posX][posY] = '.';
                    posY = posY + 1;
                    map[posX][posY] = 'v';
                }
            }
        }
        int answer = 0;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                answer += walk[x][y];
            }
        }

        System.out.println("Day six part 1 answer");
        System.out.println(answer);
    }

    public boolean pathLoops(char[][] map, int posX, int posY, int obsX, int obsY, char startDirection) {
        boolean loops = false;
        boolean start = true;
        int initX = posX;
        int initY = posY;
        map[obsX][obsY] = '#';
        map[initX][initY] = startDirection;
        if (obsX == 89 && obsY == 25) {
            System.out.println();
        }
        while (true) {
//            System.out.println("\nMap");
//            System.out.println(posX + ", " + posY);
//            for (int y = 0; y < height; y++) {
//                for (int x = 0; x < width; x++) {
//                    if (x == obsX && y == obsY) {
//                        System.out.print('@');
//                    } else {
//                        System.out.print(map[x][y]);
//                    }
//                }
//                System.out.println();
//            }
//            if (obsX == 89 && obsY == 25) {
//                for (int y = 0; y < height; y++) {
//                    for (int x = 0; x < width; x++) {
//                        if (x == obsX && y == obsY) {
//                            System.out.print('@');
//                        } else {
//                            System.out.print(map[x][y]);
//                        }
//                    }
//                    System.out.println();
//                }
//            }
            if (posX < 0 || posX > width || posY < 0 || posY > height) {
                break;
            }
            char position = map[posX][posY];
//            System.out.println(position + " " + posX + "," + posY);
            char target;
            if (position == '^') {
                if (isOutside(posX, posY - 1)) {
                    break;
                }
                target = map[posX][posY - 1];
                if (target == '#') {
                    map[posX][posY] = '>';
                    if (obsX == 89 && obsY == 51) {
                        for (int y = 0; y < height; y++) {
                            for (int x = 0; x < width; x++) {
                                if (x == obsX && y == obsY) {
                                    System.out.print('@');
                                } else {
                                    System.out.print(map[x][y]);
                                }
                            }
                            System.out.println();
                        }
                    }
                    System.out.println();
                } else if (target == '^') {
                    loops = true;
                } else {
                    posY = posY - 1;
                    map[posX][posY] = '^';
                    start = false;
                }
            } else if (position == '>') {
                if (isOutside(posX + 1, posY)) {
                    break;
                }
                target = map[posX + 1][posY];
                if (target == '#') {
                    map[posX][posY] = 'v';
                    if (obsX == 89 && obsY == 51) {
                        for (int y = 0; y < height; y++) {
                            for (int x = 0; x < width; x++) {
                                if (x == obsX && y == obsY) {
                                    System.out.print('@');
                                } else {
                                    System.out.print(map[x][y]);
                                }
                            }
                            System.out.println();
                        }
                    }
                    System.out.println();
                } else if (target == '>') {
                    loops = true;
                } else {
                    posX = posX + 1;
                    map[posX][posY] = '>';
                    start = false;
                }
            } else if (position == '<') {
                if (isOutside(posX - 1, posY)) {
                    break;
                }
                target = map[posX - 1][posY];
                if (target == '#') {
                    map[posX][posY] = '^';
                    if (obsX == 89 && obsY == 51) {
                        for (int y = 0; y < height; y++) {
                            for (int x = 0; x < width; x++) {
                                if (x == obsX && y == obsY) {
                                    System.out.print('@');
                                } else {
                                    System.out.print(map[x][y]);
                                }
                            }
                            System.out.println();
                        }
                    }
                    System.out.println();
                } else if (target == '<') {
                    loops = true;
                } else {
                    posX = posX - 1;
                    map[posX][posY] = '<';
                    start = false;
                }
            } else if (position == 'v') {
                if (isOutside(posX, posY + 1)) {
                    break;
                }
                target = map[posX][posY + 1];
                if (target == '#') {
                    map[posX][posY] = '<';
                    if (obsX == 89 && obsY == 51) {
                        for (int y = 0; y < height; y++) {
                            for (int x = 0; x < width; x++) {
                                if (x == obsX && y == obsY) {
                                    System.out.print('@');
                                } else {
                                    System.out.print(map[x][y]);
                                }
                            }
                            System.out.println();
                        }
                    }
                    System.out.println();
                } else if (target == 'v') {
                    loops = true;
                } else {
                    posY = posY + 1;
                    map[posX][posY] = 'v';
                    start = false;
                }
            }
        }
        if (loops) {
            System.out.println("\nLoops");
            System.out.println(posX + "," + posY + " -- " + obsX + "," + obsY);
//            for (int y = 0; y < height; y++) {
//                for (int x = 0; x < width; x++) {
//                    if (x == obsX && y == obsY) {
//                        System.out.print('@');
//                    } else {
//                        System.out.print(map[x][y]);
//                    }
//                }
//                System.out.println();
//            }
        } else {
            System.out.println("\ndonts");
            System.out.println(posX + "," + posY + " -- " + obsX + "," + obsY);
//            for (int y = 0; y < height; y++) {
//                for (int x = 0; x < width; x++) {
//                    if (x == obsX && y == obsY) {
//                        System.out.print('@');
//                    } else {
//                        System.out.print(map[x][y]);
//                    }
//                }
//                System.out.println();
//            }
        }
        return loops;
    }

    public void part2() {
        map = read();
        posX = startPosX;
        posY = startPosY;
        walkUp = new int[width][height];
        walkRight = new int[width][height];
        walkDown = new int[width][height];
        walkLeft = new int[width][height];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                walkUp[x][y] = 0;
                walkDown[x][y] = 0;
                walkRight[x][y] = 0;
                walkLeft[x][y] = 0;
            }
        }
        int[][] newObstruction = new int[width][height];
        while (true) {
            if (posX < 0 || posX >= width || posY < 0 || posY >= height) {
                break;
            }

//            System.out.println("\n-- map--");
//            for (int y = 0; y < height; y++) {
//                for (int x = 0; x < width; x++) {
//                    System.out.print(map[x][y]);
//                }
//                System.out.println();
//            }
//            System.out.println("\n         \n");
            char position = map[posX][posY];
//            System.out.println(position + " " + posX + "," + posY);
            char target;
            if (position == '^') {
                walkRight[posX][posY] = 1;
                if (isOutside(posX, posY - 1)) {
                    break;
                }
                target = map[posX][posY - 1];
                if (target == '#') {
                    map[posX][posY] = '>';
                } else {
//                    for (int x = posX + 1; x < width; x++) {
//                        if (walkRight[x][posY] == 1) {
                    char[][] newMap = read();
                    if (pathLoops(newMap, posX, posY, posX, posY - 1, '^')) {
                        addNewObstruction(posX, posY - 1, newObstruction);
                    }
//                            break;
//                        }
//                    }
                    posY = posY - 1;
                    map[posX][posY] = '^';
                }
            } else if (position == '>') {
                walkRight[posX][posY] = 1;
                if (isOutside(posX + 1, posY)) {
                    break;
                }
                target = map[posX + 1][posY];
                if (target == '#') {
                    map[posX][posY] = 'v';
                } else {
//                    for (int y = posY + 1; y < width; y++) {
//                        if (walkDown[posX][y] == 1) {
                    char[][] newMap = read();
                    if (pathLoops(newMap, posX, posY, posX + 1, posY, '>')) {
                        addNewObstruction(posX + 1, posY, newObstruction);
                    }
//                            break;
//                        }
//                    }
                    posX = posX + 1;
                    map[posX][posY] = '>';
                }
            } else if (position == '<') {
                walkLeft[posX][posY] = 1;
                if (isOutside(posX - 1, posY)) {
                    break;
                }
                target = map[posX - 1][posY];
                if (target == '#') {
                    map[posX][posY] = '^';
                } else {
//                    for (int y = posY - 1; y > 0; y--) {
//                        if (walkUp[posX][y] == 1) {
                    char[][] newMap = read();
                    if (pathLoops(newMap, posX, posY, posX - 1, posY, '<')) {
                        addNewObstruction(posX - 1, posY, newObstruction);
                    }
//                            break;
//                        }
//                    }
                    posX = posX - 1;
                    map[posX][posY] = '<';
                }
            } else if (position == 'v') {
                walkDown[posX][posY] = 1;
                if (isOutside(posX, posY + 1)) {
                    break;
                }
                target = map[posX][posY + 1];
                if (target == '#') {
                    map[posX][posY] = '<';
                } else {
//                    for (int x = posX - 1; x > 0; x--) {
//                        if (walkRight[x][posY] == 1) {
                    char[][] newMap = read();
                    if (pathLoops(newMap, posX, posY, posX, posY + 1, 'v')) {
                        addNewObstruction(posX, posY + 1, newObstruction);
                    }
//                            break;
//                        }
//                    }
                    posY = posY + 1;
                    map[posX][posY] = 'v';
                }
            }
        }

//        System.out.println("\nMap");
//        System.out.println(posX + ", " + posY);
//        for (int y = 0; y < height; y++) {
//            for (int x = 0; x < width; x++) {
//                System.out.print(map[x][y]);
//            }
//            System.out.println();
//        }
//
//        System.out.println("\nwalks");
//        for (int y = 0; y < height; y++) {
//            for (int x = 0; x < width; x++) {
//                if (walkRight[x][y] == 1 || walkLeft[x][y] == 1 || walkUp[x][y] == 1 || walkDown[x][y] == 1 || map[x][y] == '#') {
//                    System.out.print(map[x][y]);
//                } else if ((startPosX == x && startPosY == y)) {
//                    System.out.print('X');
//                } else {
//                    System.out.print(".");
//                }
//            }
//            System.out.println();
//        }
//
//        System.out.println("\nOBS");
//        System.out.println(posX + ", " + posY);
//        for (int y = 0; y < height; y++) {
//            for (int x = 0; x < width; x++) {
//                if (newObstruction[x][y] == 1) {
//                    System.out.print("O");
//                } else {
//                    System.out.print(map[x][y]);
//                }
//            }
//            System.out.println();
//        }

        int answer = 0;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                answer += newObstruction[x][y];
            }
        }
        System.out.println("Day six part 2 answer");
        System.out.println(answer);
    }

    private void addNewObstruction(int posX, int posY, int[][] newObstruction) {
        if (isOutside(posX, posY)) {
            return;
        }
        newObstruction[posX][posY] = 1;
//        System.out.println("\nOBS");
//        System.out.println(posX + ", " + posY);
//        for (int y = 0; y < height; y++) {
//            for (int x = 0; x < width; x++) {
//                if (newObstruction[x][y] == 1) {
//                    System.out.print("O");
//                } else {
//                    System.out.print(map[x][y]);
//                }
//            }
//            System.out.println();
//        }
//        System.out.println("\n           *******");
    }
}