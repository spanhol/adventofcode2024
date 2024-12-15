package dev.spanhol.day15;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day15 {
    String input = "##################################################\n" +
            "#OO...O#.O...#.........O....#.#...O............OO#\n" +
            "#..O.O...O..#.O#.O....O.O.O#.OO.O....O.#O...OO.O.#\n" +
            "#....O.....##.......O.O....#.......OO#O.O.#....O##\n" +
            "#O........O#...O....O...OO.O..OOO.O.OO...#..OO.O.#\n" +
            "#..O...O.OO......#O#.......O.O..#..OOO.OOO..O.#.O#\n" +
            "#....OOO.O..O#..O...........O....O.O.OO.OO.O#O...#\n" +
            "#..O....#O....OO....O#O..........O..OO.O.O.......#\n" +
            "#...O...OO...O....OO...O.O.O.....O.OOO...#...#...#\n" +
            "#....#.#.....O.#O....O..O.....#.O.O.....O..O#..OO#\n" +
            "#..O..O...O.##....O..O#.OO...OO..O...#O#OO.......#\n" +
            "#.....O....O..O###.O.O#.O...#O.OO...O.#.##O.#O...#\n" +
            "#..O.#.....O.#.O..O.O...O...O#.O...O.O..O.O....#O#\n" +
            "#O...OO#O.....O.OO..O##.OO#.O.OO..OO.OOO.O....#O.#\n" +
            "#.O..O....O.O.#OO..#O..OO...O.#O........O....O..O#\n" +
            "#OO#.OOOO.##........O.......#OO.......O.OO......O#\n" +
            "#..O..##.O.O..O...##..O.O....OOOOO.......OO.OOO#.#\n" +
            "#.O.##O..O..O.#.OO..OO.O.....O..O.O#...O........O#\n" +
            "##....O..................O.....O#....O.O.O#.....##\n" +
            "#..O#....#.....O....OO...#.#O.........O...O.O...O#\n" +
            "#.#....OO#...#..##..OO..OO..#....O....O......O.#O#\n" +
            "#....O...O.OO..#O...#.O.O....O##.OO...O.##.#..O..#\n" +
            "#..O.O..O..#O.O......OOOOO.......O.#O.OO.O...O..O#\n" +
            "#.O.O.#..O#OO#OOO.O...O..........O...O..O##O..O..#\n" +
            "#O....O..OO..OOO.O.....O@O..O..OO...............O#\n" +
            "#..O..OO......##........O.OO.......#....O..O.....#\n" +
            "#O.OO.O.O.......#..#....O.O...O.......#.#.O.OO#.O#\n" +
            "#...O#...........#.O..OOOO..O...#.#.O....OO.O.#..#\n" +
            "##....OO..#.O#OO....O...OO#.......O...OOO.O.O.OO.#\n" +
            "##.....O.........##.O....OO..#....##.O..........O#\n" +
            "#O.#..OO.......#O..#...OOO..O.O..OO.O.OOO...O.O..#\n" +
            "#O.OOOO.OO..........O........OO..OO.O#.O.O..O....#\n" +
            "#.##.O.OOO.........O...O...O.OO.O.#..O#.O...O...##\n" +
            "#.OO#O.O..O.O.O..O..#.O.O...O..O..O....#O.#..O...#\n" +
            "#......O.#O.O.O....OO#.......O.O..OO#O..##.......#\n" +
            "#.OO.O.OOO.O.O##...O#.....O..O#...O.O.O..O..O..O.#\n" +
            "#....O........O.##..O..#.....#..OO#....OO#O..O...#\n" +
            "#OO...O...OO.O.....O..O......O.O..O.......O...O..#\n" +
            "#.....O.O.O......O#..O.O.OO...O...OO...O.....OO..#\n" +
            "#.O.O.O....O.O#.O......O...#..O..O#...OO..O#.O...#\n" +
            "##.O....#......#.....OOOO.OOOO.O.OOO.O..O.O..#O..#\n" +
            "#O.#O.O....O.O.O....#...#..OO......O..#O........##\n" +
            "#O...#O..O.O.O.........O#O.OO...O....O...O.O.O.O.#\n" +
            "#.O.#...O#..O......#.....O..OO#...#.#........O.#.#\n" +
            "#O.O..O....O.....O.O.O....OO.......O...O.O.OO....#\n" +
            "#.#O............O.....##OO..OO........OOOO#O.#.O##\n" +
            "#.#.O..OO.......O...O...#..O..O....O.O......OOO..#\n" +
            "#...##.OOOOO.#...O...#....O...O.#......O.O...O.OO#\n" +
            "#....O.O..O.#...OO#..OO.O..................#...#.#\n" +
            "##################################################\n" +
            "\n" +
            ">^v<v<<vvv<>^^>^<>v^^^>vvv><>vvvv^>>v>^v^v>^>v^^v^^v>v<<^<>v>^><<<<v>v<>^^^^>^^v>^^v><^<vv^><>><<v<v>^><^^^>v^^<>^v<<^^v<v<^^^<v<>^<<v^vv^v<><^<^^>^<>>v<<>vv<vv<^^<><v<<^^<^v><v^<<>v><v>><^^vv<v>>^v>>><^<>>vvv<<>^^<<<^>>^>^><^<v>vv><<vv<<vv<v<v<<^^<<^<<^vv^<<<>v>v>^^^>>vv><^>>><<vv>><<<>>^><><v<v>v^^^<^<<><<>v<<^^vvv<v^^^v>^v<v<><>><<><>vv^<<<><>v^^vv<^<><vvv<^^<^>^<vv<^v^>^<^>^<>><<v><^v>><<<<<>><^^>^^v><<<v>v^v>^^<v<^<<>v^v<<>v>v<<>>^v>>vvv>>v^v><^<v^<<<<v<<<^vv^><<>v<^v^v<^^vv^>v^>v^^>v><<^>^<v<<vv>^<>>v>vvv^>v><v>v>^<>^<><^>^^v<<>vv>v>>^^v>>^v^><^v<^><>>^v>v^<^>^v^>^<<>>^^v><>v<>^^>>^>v^<^v<v><<vv<^^^v^vv<^^>^^>v>vvvv><vvvv>v<<>>><v><v^^v>>><v>>^><v>>>>^v>^>^vv^<><>><><^v^v>^>>^>^><vv>^v><v^v^><<><^^v^^<v^vv^^<v<v^vv^^<><v^<<>v<><<^<>>>v>>><<<^^vv^^>^^^^v>^vvv<<<>>^^v^<<v^<><<<>>v>><v<<<>^>v^^v><>^>v<^>><^^vv>^^><>><^<>><^^<v^^><>>^>^^^<<><<vv><><v<^v^>^vv<^>><^^vv><>^>^>><v<>>v<vv><><<vv>>^^vv>^^><v^v^<v<^<<>^v<^^vvv^<>^>v^v^<<v^^v>v^>^<vv>^v>v>>v<>><<v^v>v<><<^^<>^>>v^^vv^vv<^>><\n" +
            ">^><^<vvvvvv^<>>^v>>^<><vv<^v^<<v^^>^>v^>>v^vv>v<v^<>^<>v^v<<^^<v>>v>v>>^^v^^v^>v<^<^<>><^^v^<^<>^<^<v>>vvv^>>^>^>><>^^<v>v<vv><v>^^<<>v^^^><>>^<^>v^^<<>v<<v<>^^<<>^^v^^<<^>>^v<^<><v>>v^vv>^v^><^<<<vv^><>^^<<vv<>v>^>vv^v<^^v^^^<^<vv<^v>^<v><v>^vvv^vv<^v^<><v><>^^v^>><^v^v><v<^v>>>^><>><<<vvv<^<>^^vv>v<vv<vv>><^<<<>>v^<>><><vvvv<^>>v<><<^vv<>^<>^^vv<><^<v>>vvvvvv>>>>>v>^>v^^^<^v<><^<^v>v>>vv<<<^<>vv^<v><>>^<v><<^<<^<^^>^^v^<v<^v><v><v^^^>v>v^><^><^^^v>>^>^><<><><<^<>><<vv^<v^<>^^v^v<><<v<vv^^v<v<>v<^^^<v^<^<vvv^vv<>^>^vv<<<^<<<^>^^vvvvv<<v>>v^>>>v^><vv><><>v>v<><v^vv^<<vv^<>v<^^><v^^<<>>^v<^^>v<vv<<><><^^^v<^<v><v^>>v>v>>v>>>><v>v<v<><>v^<>>><<><<<<>>^^^^>v>v^>><vv^v^><v^>>^^>v<vv^><v^vv^^^^^^v<<^^^^>>>^^^>v^<<><^<<>>>^^<^>^<^><^><>v<<<^^^>^<^<^vv>>^>^>vv^<<^<v<>v><^^<>vvvv>^<>>>^<vvv^v^>v^^^^>v^vv<>>v><^v>>>v>^^vv<^v>^v><>^><v>^<>^^v<^^<>><^^v<^^>^v>>^>>v><><^^>>>^vvv>>^v<>^>>^^><v>>v><<>v<><<v<<v<vv^<>^v<^>^v^vvvvv<>^^v^^vv^^<<v<<^^v^^<<v<^^<^v<v><^v<^><v^>^^^vv>^<^^<>>vvv^>^v^<v^vv<v\n" +
            "<v<v>>v<>>>v><<<^v>>v>>^vv>v^<^^<><v>^^<>vv^>>^>>><v<<>v><<<<^v>v<>>>v>v^v^v>^^<^v<<^v<><<<^vvv>^<>>^>><>>v<v<v<v^><v<<^^^vv<^<>v>v><<v^v>^^^vvv>>vv<<><>^v<<<^^^>>>>>^v>vv<<<^<^<<^v^^><^>^^^^vv<v<<<v>^v^v>>>^^>vv^^<v^^>><^^<v>^><v>^v^v>^<>^<^>>>v>^^v^v^><<<v<>^v<vv^>v><v>>>^<>><<><<^^<<>^^vvv^^<<^><vv<>v<><><^v^<^>v>v<v>>>vvv^v<^<><<v<vv<v>>^^<v^v^^<>><^<<^v>v^^v^v^^>^><>^^^v>vvv>v<>^v><^^<^^><>>vv^>v<^^v<<<v>>v>^<vv^<^^v><v^^^^^<vvvvvv^<>>v>^v^v><v^^><><>>^v>^<<<><<<<^^>^<v^<vv^>^^><v<^^^<^<>>v><>^v>^<<^vvv^^<^^v^vvv^>v<v<>>^^^^>><^>>^^<^<vv>^><<v^<v<>^><<><<>vv<^vvv<^<><<v<v^^<^>v<^<^v<v<^^<^>^<v^>v>>v>vv<<><vv^^v>>v^><^vv<>v<^^<>^v^>>^>v^<vv>><>^^v><v^>v><<^<vv><>><v>^>^^<v^>>><v><>v^^v^>><^v><<>^^^v^vv^>v^^vvvvvv>^>>>^><^>^>vv<v><v^<v<v>^^v<<^<^<v<v>>>>^^^^>^vv<>^vv<><^>^>^^>v<<<v<>^<<v>v^v^>v>>><><^>vv<^<^^>>>>^vv^^v<vvv<>v><v<vv<^^<>v<v^<^<<^^<vv>><<v>><vvv>^^<<^^<^v>^<^^v>^<<^v>><^<v<>v<^v<v<^vv>v^<>>>>>^vv<><<<>^>v>v<><<v^<^v^><>v^<>v<^v><><>v<>>><>^<^v^<v^^<^vv<<v<<<^vv^^<>v>^\n" +
            "<<^<<<<<>^>v^v^vv^>><<vv<<v>^><<vv>>^v<^v^>^^^^v^>v^<v>v<<^^^v<^>><v^vv<vv<>^<>^<^<v<><^^v><<>v<v^>^<vv>v^<^<>^><v>^^^>>^^>^^v<>v<>>v<^v>v<<>^><vv>>>v><vv^vv<^<^<<v^<><v>>v^<<v><<^>>v<<^<^<>><><<^>^>>^<<^^vv^v^>^^<<>^^v^>v>^^<>>^>^>^>^^^^<^vv<^vv^^v^^>^^v^v^^v<^>v>^v<>>><>^>v>>^<^><v<^v<^>^<vvvv><v^<^><<<^v^^^<>v<<>v<<v<<vv<v<<^<vv><^<vv<>^^<><><>>vv^<^>vv<>^<^<vv<^>v>v><^^>>>^<<<^<<<^^v<><vv><v^vv>v>v^><><>v>^><v^^v^>>^>^<<<<<>>>^>><<<<>>v>><^^>>>^v<>vv<^vvv^^<>vv^><v<<<v>>^^>^>>^^>^^v^<vv^v>v>>>v^^<<v><<>><vv>>^>v<^<^vv>v<v<^<^<<<v^<<v^<<>v>>vvv^>>^>vv<^^>v^^>^><v>v^<<v^^>>^v<<v>>>>>^v<<^>>>v^^v^v^>vv^^<><^^>v>>^<v^^v>>^vv<vv^^v<<v<^<><>>v^^v><<<>v<v<>>>>>><^^<vvv<<v^<>v>^v<v^^>vvvv^v^v><<^>v>>v^v>^^^>v^<v<v^<<v<>>v<<^^><>^<<>>><<v^<<^>v>^<><^^>^><v^<v>vv>^>^^^^>>v<v<^><^v<v^^<>v^>v^><^<v>>v^v>v<<<>v><^>v^v<>vv>^<^<<v<<^v><>^vv<>v^v><vv><><<^>^<<^>><>v>^>>v^><<v<>>^^vv<^><^<^v<<v^>><^^^><>v>^<><>^v^<>>v>>^>>>v<^>v>v>v<^>v>^^^<<<>^<>v<^^<<>v>^<<v^<<vv<^<v^>vv^>>>^vv^^>v>>v>^><^v^>v<v>\n" +
            "<<^>v<<^>>><<v<<^^^<>v^<v>><<><>v>v<<vv<>v<>v^^v^^vv<><^v>^>^<<v^^^<<<v^^^><^^<vv>v<^<>^<>>>v^^v><v><<<>^<>>v^v^<<v^<v^^<^^><<<v<>^>>v^^v>><>v^v<><^><v^<v>^vv^><<^^^v>^<^v^>^>v<<^>vv<>vv<v^^>^><^v>>v>^^v><<<^<^<vvvvv^^v<<^^>>^vv<vv^<<<^<<v>^><>>>>vv<<>v>><v^v<v^vv^^^^>vv>^v<>v^^vv^^vv>^<<>^<v>><v<vv>vv^^^<^^vv<^<<<vvv<<^^v<vvv<v^><^<^^vv<<>v^>v^^><vv<>>>>v><^^v>v<v><v<^><<v^v<>><>^>^v<^<^^vv>^v^<v>>>v>^v>^^><^><v>vv<<^<>vv^>^^>vv>^v><v<>v^v^v><<>>^>><<^<<<v^v<<^>vv<v>v>v<^^<>^>>>^^^v<>>^<>^v^<v<><<v<v>vv<<><>v><^^<>vv^><<><>v^v^^v^vv>>>><<<vv<<>>v<^<v>^<^>>v<^v>v^<<>^>>>>><<><^^v>>>>vvv<v^<>>v^<^>^^>v<<><>>v>v^v^<^<>v>vv^v>^<^^<>^vv<><^v<<vvv>>^v<v<^<<>v<^<^<<v^v<^v>^<<>v<>>v><<<>^<vv^v>><^^<^>><>>^^v<<^v^<^<^vv><^<^vv^v<^>^^v<v><^^<vv>v>^>^v>>vv^>^>^<><v<<v<>v^v^^>^^v><^<><v>>>vv<<<>><<v^><^v<v^>v^<>^v^<^v^>^>>^v^<^v<>^<>v<v<v><>>vv<><vvv^^v>>^><vv^>^vv^<>^^v^^>v<<>^vv><<^^<^>vv>v^<>>v>vv^v^<>>>^>v^^<<><v>^>^^^v><v<<<^v>^>v^^>^<<v>^>^<>vv>^>>^<><><v<^^>>vv><^^>^^>^>^>v^^^<<>^>^>v><v^^\n" +
            "v>v^<vv<^>>>v>^^^v>v<><^v^^<<<<v>vv<^^vvvv^<^^<<v>^>>^^<<^vvv<^v>^<v<^^^<v>>>v^^v<v<^v>v><v<>vv><>>^^><v<<>^>^>><><^v^>vvv<><^v^v^><<<>v><vv<v^^v>^^>^<<^<<><>>^>^^<<v<<^>>v<>^<^v>>><^<<>v<vv>vvv>><v>^^v^vv<<<>><><vvv^<^><^^<<>^v><<>>^>^<vv^v<^v<<v^vv<>v<>>>>>^>v^>>v<<><<v>vv>>v^><^vv>vv<><><v>^<^^^>>v<<>><v^>>>v^v<>^v<v<<vvv<>>v<vv^v<v<<^^>^><>^^><^^><^>>^^vv^>v^>^^><v>^v<<>vv><<vvv>vv^v^<vv><>><<>v><vv<>^><vv^>^^^^v<><vv<<^<><<<vvvv^<vv^v^><>><^^^><<^^^^>><v^^v^<^v^v^>>^vv>>^^<<>^^^v<v^vv<<^vv<>v<vvvv>v>>^>v<^<v<vv>v><^>vv<v^<^>>v><<vv>v><><^<^<^v<<^<>>^^>^<^><>>>^^vv^v<v^><>>^v>v>>>>v><>^<^><><^v>><v^vvv>^><^><>>^^<>>^>>><^<>vv<v><v^>v^^^>v<><^<>v^v>>^>>^v>>v<>>>v^^^^^^<v^>vv<<<^><<vv>^>>v>><v>^^v>><^vvv^>v>>v><^^v^^<^><v^<vv><>^v>><v^^v^^^<vvv>^<<^<<>>vv^^^v^<<<^v<vv>v^^>><^<v^>>^<v<>>>^<>>^>vv<>v^^>><>^<v><<v<^<v<>vvv><^<vv>v>^^>^<vvv^^^<>v^<v<><<v>><><vv^v><v>^v<><^<vv><<<vv^>^^<<vv><v>^>^^v<><><>vvv<^^v<<<<<<<<^v<><v<v><<><vv>v>>^<vv^v^>><<v^>^^>v^>><v^>^^v^vv^<vv>^>v>v<v><<><<<<\n" +
            "^<>^^v^^<^^<>v<<<<<^vvvv<>>^vv^><>^vv><>v<^<>>v^v^^<><<v<v>v<<v<>>^<v>>v>v>>v^v<v>vvv>>>^^>><vv>v>v<>><<v>vv><<<v<<>v<><v^vv>^>v>v<^<>v<<>vv^v<>v<v^<<>vvv>v<>v<><<v^>^>v>>>>><>>v>v>^v>^^><v^<^<^v<vv<v^v^>^v^v^<>><v>>>><^^^>>^><<<<<v>^^<^v>^<^<^><^>>^v<>^>>><><<vv<^<<>^><>v<v<><><v>vvv<vvv^><><^><v^>vv^vvv<v>vvv>^><<^^>^>>v<^^<<>>^>><v<v^v^^v<^^^<^vv>^v>>>>><>>><v>>^v>>vv^v<<<v>><v^^<<<>vv<^v^v^><<>v^^v<^vv^v>v^<<v><>^vv^^>>vv<<>^v^^<^<v<>^^v^<^>^^<^<>^^>v>^v>^<>v^^>v<v<^>>v^><v^^v>v<^vv<<^^^v^><><v<vv>v>>>v<^><^>>^<v^<v>>v<^v<>^^^><^v>vvv^^<<>^^<^v>>>>><^^<^>>>v^v^<vv^<vv<<>^v^<<v>v^<^v>vv^^^vv<><^>^^v<>v>v^><<v^>^v<v<>><<^^<vv>>>>v><v^>>v><>>^vvv>vv>><<<v><^>^v<><^v>^>>>>>^v^<^^v^<>v>^<^<>vv<v>^^<v>v>><^vv<vvv>vv<^<>^>v><>v^<><>vv<^^vv<>^v^^>^^^<v>><v>><<>^<<<v>v<<vv<<>v>vv^^v>>^>^><<<^<<^vv<^>^>v^>v^vv^v^^<^vvv<^v^><^^>^^^^>vv^^^>>^v>>vvvv<<^vv^<v<vvv^<^<^v<^^><>v><<<<v>v><>v>vv<v>^v<<^<^>>^v><v>>v<v>v^v<<><^v<^v><^v^>v><><v<^^>^>^>v<>v^>>^^vv><^<>>>vv>v>v^^v^vv^^<v><^<<<><<<<v>><^^v\n" +
            "^^^<<<><v<vvv>v>>vv^>^v<v^^><v><>vvv<>vv<^vv>^><v^>^<>>>v^>v<^><<^v^><^<v<<^<^^>v<<^vvv^^^<<<>>v>^^^<<^>v<vvv<v^^<^v^vv>>>v^^v^^<vv<>><<>v<<>v^>>^>><vv^v<v^>vv^v<v>>^<<v<vv>v<v>^v>^v>^<v^<>vvv>v<<v>v>>^<<v^<<>v^v>>><>vv<<<^^>vv^vv<vv^><v<>><^^^<v^v^<><><^^<^<<>v<<vv>>><<<<^vv<^^v>>v>^vv>^^v^>^^>><^<^v^<<v<><vv>>^^^>>^vvv><^>>v>>vv^<vv^v^<<>^^><<v<^>>^<^><><>^<<<>>vvv<v^v>v>v>v^<<^vv^<^^<<^v>><<<^v><>^>>^v>^>v^>v^>^<>><<<<<^><v<<>><v^vv<><>^^>><^<^^<v^vv>>^vvvvvv^<^<v^<v<>v<<<>>vv<<>>vv<><<<>>v><>v>v^^>>><vv>>v<^><v<<vv><vvv<v<v>v^^>>v>^^>>^^<<v<><v^>v><><^<^^><^^<^^vv^><^>>^>><v^^v>^<v>^^vv<^>>>>>^<vv<>^^^<^<^v>><>v^<<<v^v><<><v<<^>v><<>^<<<vv><>vvv<>v>v<>vv>^>v><v<v^<v>><<vv>v^<^v^^^^^>>vv>v^^v^<>^><v^v^^<>^>^<>v<>>^^>^><<<v>>>v>^^>^>>^<<>^>v>v>v<<<><v><<>^vvv^vv>^><v<<^<<<><<^v<<^^><v<^<>^>>^^v<<v>vv<v<><^^>^^^<>^^^<><v><v>vv<<<><<^<<<v^<<>v<<>^><>>>v>v^v>v<vvvv<v<^<<^>^v<><<v><<>^^<>><>><^<^v>v^^<>>^^><^<vv<<v^^>vv^vv>v<^^><vv<vv^<<>vv^v^^><>>>>>v^<v<^<<<<^<<<><<^^v<^^><<>v^>>v<v>v>\n" +
            "><<<<<<>>vv<>>v>^v>^v>>^><v>^^^>v<>vvvv^v>^^v^^<^v><<<v>>>>>v^>>^v^v^^>>^>^>>>>^>^>^<<>v<>^v^>>v<^^>^><><<^><><<^^<<>>^>>^>vvv<<><<>v<>>>^^^v^^^<>><^v^^>v>v^^><<<>^>vv^<vvv^<>^v<<><<<v<vv<>v>v>^^>v<v^>v>^>>v>>><>v>v^>v^>^>>><>v><^<>v><^v<<v^>v^^^v^^^^^v^v<v^vv^^^^<^^>^>^>>vv><<^^v>^>^>>^<vv<v<<^vv^><<vv^<^><^><^^>><^>v<v<^<v<vv^>v>v<<>^^><><>><vvvv^>>v<<v>v^^^^^^<v<<<v^v^>>>^v>^vv<v^^^>>>v>v>^>v^vvv^v<vv>vvv<>^>>vv>^^v<>^<>v<v>vv>><<>^v^>v<<>^<<^>vv^v^v>>v><vv<v<<<v<^><^<^<>vv>><><^vv<v^>><>v>vv<^^>>v<>>^v^^^<<<>v<^<<^^v><^v>v<<^v^<v><<><>^<<<><>v^>^v^^^vvvv^^v>>vv<vv>><<>>^>v>>^>^><^v<><v<<<<v^v>v>>>>^>^><<<^^v>vv<>^>^<^><<^>>^<vv<>v>^>>^<<^v<><^<>><v>v<>><>v^v>><^^^^^^>^vv>>v^v^^v>>^>>>>v^vv<>vv^>^>><>>>>>v^^<^>>^<>^v^><><><v<<vvv^^<v<^<<^<^<<v<>vv<^<<v^<v><v>^^<v>^><<>>><>>v>>v>vv<>>vv>><<v<<>^<v<v>^v^v^^v<v<<vv<^>>><>>^vv>^<vvv<^<^v<v^<^<vv><>^>>>>>v<v<<>^<<v<<^^^v<<^vv<^<v>^<>^<<<v<vv^<^^v>>^<^^<<v><><v><<vv^^v^^>^<vv<<>>><><>^^vv<vv>v<vv><<<v^>><>^<^vvvvv<><<>vv^<^>><v^>v>>><<<v<\n" +
            "v<>>v>>^^><<<^<vvv^>^<>>v^>^v>><<vv^>>^><^v<><>^^<<<><<^>^vv>v<<^>v<<v<>>v><<<^>><<<v^v<^<<>^>>v<>><>>v^^^>>^>^>^<^v^v>^^^<<>>^>^><^^^>v>^^^^v^>>>^vv^vv^^^^v<>^^<>^^>><>^v>v^v<<><^>>vvv^^><<<v<^<v>^>>v<<v<<v<^>>>>^^^<v>v^<><vv^<^v^v<>^^^^>^^v<>vv<vv>>>vvvv^vv>^>v>^<<<v^>><^^<^^^><><<v<<>>v>^>v^^<<>v^v>^>^v<^^>^>>v<<v>v^<>^v^<<v<v^>>v>v<vv^<^><><<^<><^><^<<^^<><>v<^^^v<^^v<>^^>><v>v^<v<v^>^<v>^v<<>^>^^<^v^>><><>>>>>^<>vvv^<v<v^^v^^^>v^^<>>v>>^><<><^>v^^<<<v<>>v>v^^v^^<<<^^<<v<^<>v>^^<^^vvv^>^><>^<<>>^^<^>v<<<<<^<<>^vv<^<v^<<<<>^^><<^^^<vv<vv<^v<>v<>v<>><><vv^v^>^<vvv>><><<<^<>v>^v<><>>><v<>^v<vv<^^>^<v<v^<v><><^>>^v>>^vv<<^>>vv^<<vv>v>><v<><>>^>v<v<v>v>>>v^<>^<v^<<<><v<><<>v^^<<<vv<<><^v<<><<>>^^<^^<^<><<>vv<<^>>^^>^v^v<^vv^>^v>^vv^<v<>^^<>>v>v<v<<^>^^^^^><><v<><>v<v^>>v<>>^>v^vv^<<<<v>^^>v>v^<^v^v^<<>><v^v^v<<>^>>>>vv<v><<^v^vv<>^>^v^^<vvv>^<^>^<v^>>vv^^>vv^^v<^^<^<>^^<^vv>vv>v>^v><^>v>>v<v<><>>>><v^<v^<<v^^v^^v^<^>v>^vv^^v^>^>>vvv^^<v>^><>vv><>^>>v>v><<^>>^^^vv<vv><<v<<>>vvv<^<<>><^><\n" +
            "^v>vv^^<v<<>^^>^v^<vvvv^v>^^^v^<<^>^^v>>^>^^<<vv>vv^<vv>>vvv>^<v^^vvv^^v<^<^^><<><>^v<<v>v>>^v><v>>^<^<v^v>v^><^<><v^<<><^>vv>v>v<<<<^<v>v<>>^>^>>^<<^<^^^>^vv^<<<<<>^v<<>v^>v<>^<^<v<>^<>^><^^>>^><v^<<^v^v>^<>^^^v<<<<^v>>>v<<<v<<^^<^><v>^^<vv>v><v^v^v<v^v^^v<v><>>vv<<v^^<^^>>^<>>^^^vvv<v>>^>vv<>><^vvv>><vv<v^>^<^<>vvvv^<^^v<><^v^><><<v<>>^^<>><^<<<<<>vvv^<v^^<vvv<<><<^vv<^v<vv^<^<<^><<<^><^<^<vv>vv<<<v^<>^<<>v>>^^>^v^>^>^>>v<>^v^v^v>v>v<>v<v><<v>>v<<<^><v^>>v>^^<<^^<><v>v^<><^v<v<^^v^<>>>>><>^^^>^v>>^^>vvv<>>><>^<v>>>>v<^^<v^>^<>>><<<^v>v^<v^^v^^v<v<<<>vv>>^>>^vv^^>>>^><^^>>>v^^^<v<<^<<^>><>^<^<<v<<<>^^v<^<><>>vv>>^<<v^vv<^^v<v^^>v<^>v^^v>v>v<v>>v<<<^><><><^><<v><v^<<^v<^>^>>^<<^^v^<>^<v<>vv<>>v<^><^^^v<v<<><<vv^<<<>>^v^^^>^vvvvv^<<>v<<<vv<>v<<^<^^^<v^^<>^>^<v>v<vv><^<^^^v^v^<v^<^<v<>^>^^v<<>>^<>^>^v^<>v>v^>v><<><v^vv^<<^>^<vv>><>v^<v<^v^vv^^^><>^^>>v><v>^vv<>v^<<<<>v>v<v>>>^v<>^>^<^>^^<^<^><<<v<><^<v^^<>>^<><v^^^v^<<<<v^^><<^^^v^^^><<v><<>v^^^<v^<>^<<<^^v^^<v>><<<<v<v^v^^<<v>^^v<>><vvv\n" +
            "^v<>><v>>^^^<<^v<v<<^>^<^^<<<v<v^><^^vv^v^v^v^^>>vvv^><vvv>>^^v^^^^>>>>vv>><><v><>vvv^<^v<^v^<^<v<^><v^>^<<v<<v>vv^^^^v^^<v<vv>v>^<vvvvvv^v^><<v<<vvv^^<^>v>v^v<><<v<>vv<^v^v><v>>^><vvv>^><^>^><^>v>^<><v>v<v><^^v>>^^>>>vvv>vv>>v<v<<<>vv<<>^>^><vv<><^<<^vv^vv<<vv^v^vv<v>>v<<^<^<vv^^v<^^v^<^v>^^v>^<>>>vv><^<^<^>>>>><<>^^v<v><>><^^<^v<>v<^<<>v<v>^<v>>v<<>^<v^^<^v^>>v<>^>>^<^>>v>^<v<^<>^<v<^<^^^<<>v<^<<>>vv^<v<<>^<v>vvvv>^<>v>>>v<>v^v>v^<^<^>vvv<><>^>^>^^<v^<<>^<v<vv<^^<<>v<vv^>>^>vv^><<v><<><^><^><<^>v>vv^v^>>>><<vv>>>>v^^v>v<^v>v^<^^^^<<>^<>v>>^>>vvvvv>>^v^^^>^>><>^<<>v>vv<<v>^>>v<v><^v>^>v^<>><>^v^v<^<>^<v>^>v><>^vv^<vv><v^<<v<v>>^>><<><><v<^>>>^vv^<v^<vv<^^>^><>^vvvv>>>v^^>^<<>^<^v^vv>><>>>v^>v<<v>^^v>>>^>v^<vv<<v>^>>>><>^>>^^v^v<>v>vv^^v^v<<v^^v^<^v>^^<v>^<^^<>v>vv>^^<>v>^>>v^v>vvvv>^<vv>><>>v>^<<<>v<<<^vv^<<v>v<vv^^v<v^vv><vvv<<^^^^vv><vv>v^v<vvv><^>^^v^^v^v<<><<^>v<^v^^<v^><v>>><<<v<^<^<>>^^><vv><v>>^<v^^<^><><^^v^<<<v><<<^<v<^^v<^>>^vv^<><^v^^<v<^<v^<>>>>>^v>v^<<<>^^>>>><>><<vv<v>^<\n" +
            "^>>v>^><<^<<v>^^^v^<vv<v><<<^>^vv<>>^><>^>>v^^v>v><>v^v^^<<v<>><v>>v^<<>^^><>><><>vv>^^<^><<^>v^>^>v^^<<^<^<<<>^v<v^<^^v<>^v<>^>>vv>v><>v^<><>v<vv^v<>vv<^>>>^v<><^<^^^<v^><v^v^^<<^^><>v>><^v>v^>^>^v^v<>v^><>><^v>><^v>^<^<^vvvv<<<v^v<<v^>>v<^^>^>^>^<vv^<^<v><<<^v><>>><^^>>><>^^<v<><<<>>v>>><<vv<>^v^><><<<<v^v<>v><<v>>>><v<v><>v^^^^^>>v^^<>>>vv^v<<v^^v^^vv<v^v<^>vv^>v>v>>>^<<^^^<v<v<^^v>^>^<v<>^v^<<<vvvv<v>v>>^<^vvvv^>vv<vvv<^>^v<^^<>^v<^<>^^<v>^^vv>><>^<v>v><>vv>v>><<>v><>>^v>v<^^v^><<v><^v>vv><><<vvv^v>^<<v<^vvvv>^><>v^vv>^^v<v>^>>v>^><<^<v<<>^>v><><^<<<>v^<><>^v<^^v>>^<>>>>^^><v^<><<>v<^>>v^^^<>>^<^^^v^v<>^v^<^v<>vv>>^^v^v<v><^^>><<><vvv^>v<<vv>v>v>vv>^<<v^vv<^<<>^v<v<vv>>>vvvv<^^^v>>>>v^^<v>>vvvv<^^v^<<>>><^<>^v>^<>^v<<<v^<v^<^>>^v^<<v<>v^>>>v<<><^^^>^<v<^>vv^^<<v<>vv<<<^^<<>>^><<<<v^^<^v>v^^^>v>v^^>v>v<v>>^v>>^><<<>^<><>^>>^^^>v><v<>>^<^^^><>^<^v^v^vvv>v>vv>vv>>vv<v<>^>v>><v>><<^vv<<>>v<<<^><v^vv>>>v><<v^>^<v>v><<>><^^v>>^<v^>^<^<^v<<<^^<<v<>vv<vv<<v>^v><vv^vv>>v<>v^vv><<<v><^<v<>v<\n" +
            "<><v>>^<>vv>v><<^v><>vv<<><<<><v^><v^^^>>><v^^<>^^<^>v^^><v^<>>v>^>>>>>^<^^^^<<>^v^>vvvvv^^^<<v<v>><<^>>>vv^v><><<^vv<^^^>^>>v<<^><^><v<^^>v<^^>vv<<<<^v>v>^v^vvv^v<^v<<^>^>^vv^<><<vv>v<v>>v>>v^^^<^^>>v^<^v>^v><^^>^<^<>vv<^>>v^^<vvv<vv^v<vv<vvv^<vv<v<>^v><^>>><^>^^vvvv<<^v^vv<<<>v>v^>^>>^^v^>^>v><v<^v^^<^v<<<v^vv<v^>v<^<^>vvv><>v>><<<^<vv^><v^<<^<><>v^^>^^<vv^vvv><>><>vv<^<>>>v>vv<^v<v>^>^^^<<^>^><^>v^^<>v<^v<v^vv>v<><^><>>v^>v><v>^v<vvv^<>>^<<^<^^vv>>>v<>^v>vvv^vv^^^>^vvv<v^v>^>v^v>^<v<>^>v>v<<<><><>v<^v><vvvv><^>v<><v>vv<<vv<<^^^v<>^^^>>v><><>>v<^^><^^<v>>^^^^>v<^vvv<v^<><<<v^^<<^v>v<^^>v^<>vv^<v><^v>^^v^vv^><>^v^^^^>^^>v^>v^>v>v>^><^><>v^v>>v><>^><v<><v<><<vv^v<v<<<^v<<v>v<^v^<>^^v<<v<^^><>v^>>>vv>v^vvvvv>><v>>v<<<v>>^<<^><>>^>^v>>v><v><^^v^><>>^<v<>^<vv^v>^v<^<v><>v^^^<v^<<v^^<<><<v^v>^<^v>>v<v>vv<v>^^>v^v^>>vv<><>vvv>vv>><^><^>^vv><<^^>>vvvvv<<<v^^<v^^vvv>>>^^^^<^>vv>^vv<>v^>>^<v><<<^^v>^>vv>vv^>vvv^^^^<v>>>>v^vv^^>^>><>>>>><<^vvvv>^vvv<^<^^>v^<vv<v><<<^^>^v>><^^v><^^vv<^v><v>v^vv>\n" +
            "v>^<<>vv^<<<^>vv^<<v>^<^<v<>^<><^^<^^>vv><vvv<<v<v^<>><>^<^><v>><v><>v^^v<>v>v<>>^^><<vv<>>^^<<<<v<^<>vv><<v^vv>vv^v<vv<>v<^<^<^^^^vv<<v^^v^v<v>><><<<v><v>>v><^v^>vvv<><v>>vv^>v^<<<v<>><^<^^v><<^<^<>v^v^^>v^<^>><^>v>v>><<v<<^^>^^>>v>><<<v^v^^>v^v^^v<v><v^<<>>v^<<>vvv<>^<v^><^v>^v<^v><<^<v<<<>v^>>^>v><>v><^^<>>^^<><<<v<v<<>^><>>>>>vv>>>>>v<vv>^^v^>^><vv>vv^><>^^<vv^v^v>v^>vv^<>><>^<<><vv^<><>>>^>vv^<>>vv><<v<<vvv>>v^v><v>><<<>v>v^v<><<<^<^^v>>v<^><v>vv<<vv<v^v><<<vv>v^^<v>v^vvvv^<<><v^v^<<^v<<>>vv<v^v^^>^>v^<>><<<v^^<^^v<<v<>^^>><v<<^v><>v>v<><^>^^^<v<<>>v<^<><>vv^<<>v>v<vv<v>><^>^v^<<>^<><>>v^^<<>>><<v><<v^v>>v<v<<^v^^^v^^v<<<<^v>^^><><<<>^v<><<vv^^><v<<v<^^vv>><v>v^v>><v<v<v^><^^^^<^>^<^>v<^<<v^^^>v<<v><^>><<><^<^>>>><v^^<v>><<^<^<^v>^<<<v>^>v><v>><>^<>^^>>v<<v^^^<>^^>>>>^^^vv>vv^^<v>v<v<^<>v<v^<^>^v><v><<vv<>>>><<>v>>^^<>><>><^v^v>^v^^<<<^>v<><>^>>vvv<^^<>>^>^v<^<<<><<v><<^<<^^^vv>vv<<<>^<vv^vv^<v><>^><<^<v>v<^^^<^>^v^v>^<v<>>v<vv^><>v>>^v<<<^vv>v>>v<<<^<^>vv><>v>>><v>v<>v^><><^v^^^<\n" +
            "<>vv<><^^><<<<>v^v>v<v^v<^<>vv><^>>^^v<vvv>v<v^><v^v>v>vvvv^<^vvv^vv<>v^^>v><>v<v^vv>vv^^vv<<<>vv>vv<<^v<<^><>v^<^<vv^^^^>><<^^v<v^<<>^v<^^^v>>>v<^^^v>^>^<<<<v<v^^>^v<>>^>>>>^<vv^^^^>v>v>v<^<<v<<vv><>>vvv<v^^>^><>^>^v>><^>^<>^v^^>^^<^<^v<<v<><<>^<v^vv>v<v<v<<v>><<<>vvvv^<^vv<v^^>>><v><^<^<^^<^>^<<>>v>>^^>><v>>vv>v^^v^>^<>v><>v^<>^><<^^><>>^><<v^<^^^v>^>v^<^>vv>>vv^>^vv<>>^<<>^>v<^vv<<>>v>v^^^^^v^v^^><vv>^^^v>^vv<><>^>^>v>^v^<v>v<<><^<<^<v^<<^vv^^<>vv><vv^^>^v<<>v^>vv<v><v>v^>^^>^^>v<v^^^<v^>^vv^>^<v^>^>v>v<<^v>^<v<^>^<v>vv^>vv<>^>^<^>vv>vv^v<^<>v><><vv^<^^^^vv^^<<v^v<<^>>><>v<>>^^^>^<vvv><^^v>><><v<<^^<<v>^^<v><^>^><^vv>><^^>^<vv>>v>><^>vv<<v^><^><<>v<>^^<^vv<<>v><>>^vvv>v><>>^vv>>vv<<^^>v>v>>vv^<v><>v^<^>>>vvv><v^^v^^vv<^<v<v^>>^v<^^<>v^><vvv<v>>>>^>^^<><v^^>><<<<v>^v<v^vv<>^vv<>^v>^^^v^>^vv^vv<^><<<<v<<vvv<>^<^^<<^>vv>^>^vv>vv<^^<>>v<v^v>v^^>>vv<^>^<^>v^<v><v>^vv^<^^^<<^^v>>>>>^<^vv>^^>^>^^>>^<<vv<^<<>^<><v>v<>v<<^^>^>^v^<<vv^vvvv<^>>><>>vv<^<v^<>^^v<<^<<<^^^^<><<v><v>><<<v^<<>>v>^><\n" +
            ">><<^<<<<><^>vv^>>vv>^^>>^v^<<^^v>v<>v<v<v^><<^><<>v^><>v^<<<v<<<<<^>^>><>^v>>><<<v<^>^>><<v>^^<^>v>v<<vv><v<^<>^><^^v^^v<><vv^>><^v>^<<v><vvv^<^<<v<>^^vv<>>^>v<>^><^<>vvv<^>vv<v><v^v^^v^>^^>v<^>^^<<v><>v^<^v>^><><<><>><^<v<v<^v<vv><^>^>vv^<v>^><^>vv><><>vv<^^<>v>^<>vv<v^v>>>v>v^><^<><v>^v>v^v<^v^v>>>v^vv>>v>^vv^>^>><>>^^v>^v^^^^<v>><^>vv^<>><<^^v>^v<^<<>^v^<><^>v<<^<^>>^<>><>^^^vv^v>vv<>^>v<>v^v^^^^><^<vv><<^>^><<^v^^^><>^<vv^<^><v<v<v<^>vv<v^<<>^>>><v><>>><>vv>>^><^<>vv>>v^<>v^v^^>^>v<<><^^^v<^^>>^^<v>v>^<vv><v<^>^^^>vvv<>>>v^><v^^vv<<>>>^<>>v>>>><v>v<>v^^^^>v<<<<^^<^^<v<>^>^v>^<<><^>^vv^^<^>v^^vvv<vv^vv<v^v<>>^^>><^v>vvv>^^>^>^>vv^>v^v^vv^^^^v<v^vv>>v<^<><v<<<<<v><>>v^<^^<^<>>^v<^<<v>v^>^<<^<^<^^vv><><^^v<<<<v<<<^<<>^^^<>^v^^><>^>>vv^<<<^>vv<>v><^>>^v<<^>^^><v<^>>>^^>v^<^<<^^v>^v<><^<vv^<vv<^><vvvvv>^><v>v>>v>^^^^><>^>^^<vvv>>>v<v><<><<<<>>><<>^^^vvv^^>^^^<v^v<v<<v<<v^<v>^>>^>v>^v><<>^<v>^<^<^^<v<><^<<^>>vv^><>v<^<^vv><><>>^^^v><<>v>>>><>^><>>>><vv^<>>^v>^<v<^v>v>v><<^^v^<>>^vv<<^<^\n" +
            "<v>vv<^<^<>^>>>><^<>v^<<^v<^^<v<>><v<v^>vvv<<<<<v>^<v^vvv>>vv^>><>v<^^<><><^<^<<v^^>>vv><><^<^v<^<<<^^<>><>>v^v><>>^<^v><^<^^<>v><^v<^<^<<>v<>^<^v<^v^^v>^><v>v^^^v>v^^>>^><^<^<<>^v>v<^vv<v^^<^>><><^v^<>v^<v<v^v^v>^^v<^<^^vv<<>>><>vvv^^<>^^>^<^v^<<>v^<^<^<v^^^>^>^v<v<>vv>>>^<<^v<v>v><>^v>^vv<v<>v^>>^>v>^<^<^>><v>vvv^<>v^^<>v^>><<>^<><>^>^<^^v^<^^<^^^v^<v><v^>>><v^^>>v<v>>><<vv<<><^v<v>>^<v>vvv^>>>>>>>v><>^>>^<<^<>^v^vv^>>v<^^^<vvv^><v<vv>^>v<>^^<vv>v^><<vv><^<vv>v<<^<<v<vv<^>><<^>^v<^v<^><><^<v<v>>^^<^><<<<v>>^v>><^>>^v^<<v<>^<><<>>v>v<^>>>^>>^^<<v<v<<<<^>><vv>>^v<<v<^<^v<<^<>^^v>^v>^^<v<^^>^><<<<^<^<><^><v<>^>vv^>><>>><v><v^><v>vv<<^^^v>^>v<^v>><>^<v>^<^^>v^<>>v<>v<<^^v^^>>vvv<><v<v^<<v<^v^>v^^^v>v>>v<<<<<^>v><<v^>v>>><v^<>>>>v>v^^<vv>><v><v^<^><>v^vv><<>><v<>^^>v<<vv>vv^<v>><<v^^>v<>v^^><>^<^>v><<><v><v^><v^<^<vv>^<<^><<vv<<<vvv^^<^v<v<>v><>><v<><><<v>^<>^v^^<>v<><<<<^<vv<vvvvvvv^>><^>vv^v<^v><>^^><v>>^>v<>><^><><^<>><>>v>>>>vv>^v>v<v>v<>^^<>>^<>>vvv^<vv^v^^^>vv>^vv>v<<>v>>>>v>^^v<>>>\n" +
            "v>v^^<^>v^<v^>>v><^><v>>^^>>v<^<>>^>v^v>>v^v^v<>v<>>^v>><v>>v<^^^<vv>^v^vv>>^^^vvvv^v^vvvv>v>><vv<<^v>^>><vvv^^>^<^^v><^<v^><^<<^>>>v>>><<<><<^>>v>^<^^><><>v^v><^^vv^><<<vvv<^<<>>^^v>>^vvv^>v^>v<<><>v>v>><<^v^>^^^^<<^<><<>^^<^v<>>><^<vv<<>v<v^^>v^>>^<<v>^^vv<<>>^><^<<^<^vvv^>>>v^^^<<<v^^<<vvv>v^v>v>vv><^v^>^^v^v>>v<<^^<^v>^^v><>>^>^^<vvv>vvv<^v^<vv>^^<v>>v^^>vv^<<v^vv^<<v<v>>><>^>^<^^v>v>^v<^^vvv^>^>vvv<^vvv>^>^><^<v^^<vvv><v^^v>><<>>^><v<<<v<<<^>v^><v<<v^v^<^<<>vv><v<^^v^><>>^>>^vv>^<>vv><><<vvv^^<^<^>^><<^v<>><<<^<>v<>^<^v<^v^v<><<><v><v>v^vv<<^^<^>^>^^>>v<<>><<vv^<<>v<<^>^^^v><>>>><>><><^^^>vv^^>v^>><^<>^<^>v<^>>v>v<v^^v^>vv^v<<<><vvvv<^<>^v^v^>vv<>^v>v^>^v<<<^vv^<>>v<^<<^^^<<<>v<v>><<^^^^<>v<>^<<^>>vv^>><v>^<<v<v>><^>^<v>v>v>v>v^^>vv^vvvv^<v>>>><^^<<v>v<^^<^>vvvv<<<vv^<>v^v^<v^>vv>^><<v^><>^^>^<<^vvv^v^><^vv>^<<<v>v><><>>^^>v>^^vv<^^v>>>v><^<^v^<^v>>>^<>^<>^v^^>^^>><^><><^><^v^><<<v^<>^^^<<^^<>><<>v^v^vvv^>v<v<<<^>>>v<>vv>>>v^vv>>^<>>vv^^^^^^vv^v^>>>>>^><v^^>^<>v^^^><><>v^^^^<>vv<<\n" +
            "^^<v>^>>>v<<><^^<^^<^v><><^v><v>>><>>v>><><<v^<v^<<<^<<v^<^^<^v><>v<<v^><^v<vv><^>v><<v^^>>>>^>>^^^v^v>>^vv>v^^<v^<>>^<^^^^v>>^><^v^v^^<^<<^^>^vv^^v^^v^><v^^^>^vv^<^vv<<>^>^^<>>>v^v<>>>^^^^<<^>>v<<<<v<^<>^vv^^>^>^><<<>v<>>><><^>^>^v>>v^v<><<v<^v<v^vv<>v<v>><>>^<v^>^vv>v>^^^>v^<v^v^>v^v^^v^vvvv<^^^^^vv>>v<<><<<>v><<<^^^><^><v<vv>>^><<<>^<^v<><v>>v><v>>^^<>>>^<^v<<^^>><>v<v^<^>^v>^<v>v>>>vv>>^^vv>^^v<>^<v^<vvv^>v^>>^<v^v^^<v><>v>>>^v><^v<>>v><^v>^<>>^<^v^>^<vv>v>^>^>>^>^<^<<^v<>v>>v^v<v>>^<^^<<>^^vv><<<<v>><<<><>^>v<><v^vvvv>vv^<><<^>^vv<<^v<v^<><><<>^>><^^v>v^<v>><<^>v<<v<<>>vvv<vv>^v<>^vv<v<<vvvv<<v^<vv><v^<^>><vvv><><vv><<>><>v^>>v^<<^<<^v^v<<>>><^<v<>^v^<^>v><^<^<^^^<<>^^><vv^>^>^^^^^^><vvvv>^>>^><<>^<<<<>>>>^<<>^vv<>^vv^vv><>v<v>^>^<<>v>v><<<><v<v<>>vv^^<<^>><v^<^>>vv>^>>vvv>^><^v^v<<><^^<>^^>vv<>>>v^>v^^^^>^v<<<^<<^><<^v^^v^<>>v<>v>^>>^^^^v^>v<>>>v^^>^<v>^v><><>><>>>>^^<vvv^<>^<<>v<>v<v<^<>v>^><<^v<v>><v<v^>vv<<<<v^>^v<v<^v><^<>>>^>>>>><v^vv<<>>v<<>><^>vv^><^><vv>^>><v^^^>>^<vv^vv>";

    Map map;
    String commands = "";

    public void read(boolean large) {
        StringBuilder mapStr = new StringBuilder();
        StringBuilder commandsStr = new StringBuilder();
        String[] lines = input.split("\n");
        for (String line : lines) {
            if (line.startsWith("#")) {
                mapStr.append(line).append("\n");
            } else {
                commandsStr.append(line);
            }
        }
        map = new Map(mapStr.toString(), large);
        commands = commandsStr.toString();
    }

    public void part1() {
//        input = "##########\n" +
//                "#..O..O.O#\n" +
//                "#......O.#\n" +
//                "#.OO..O.O#\n" +
//                "#..O@..O.#\n" +
//                "#O#..O...#\n" +
//                "#O..O..O.#\n" +
//                "#.OO.O.OO#\n" +
//                "#....O...#\n" +
//                "##########\n" +
//                "\n" +
//                "<vv>^<v^>v>^vv^v>v<>v^v<v<^vv<<<^><<><>>v<vvv<>^v^>^<<<><<v<<<v^vv^v>^\n" +
//                "vvv<<^>^v^^><<>>><>^<<><^vv^^<>vvv<>><^^v>^>vv<>v<<<<v<^v>^<^^>>>^<v<v\n" +
//                "><>vv>v^v^<>><>>>><^^>vv>v<^^^>>v^v^<^^>v^^>v^<^v>v<>>v^v^<v>v^^<^^vv<\n" +
//                "<<v<^>>^^^^>>>v^<>vvv^><v<<<>^^^vv^<vvv>^>v<^^^^v<>^>vvvv><>>v^<<^^^^^\n" +
//                "^><^><>>><>^^<<^^v>>><^<v>^<vv>>v>>>^v><>^v><<<<v>>v<v<v>vvv>^<><<>^><\n" +
//                "^>><>^v<><^vvv<^^<><v<<<<<><^v<<<><<<^^<v<^^^><^>>^<v^><<<^>>^v<v^v<v^\n" +
//                ">^>>^v>vv>^<<^v<>><<><<v<<v><>v<^vv<<<>^^v^>^^>>><<^v>>v^v><^^>>^<>vv^\n" +
//                "<><^^>^^^<><vvvvv^v<v<<>^v<v>v<<^><<><<><<<^^<<<^<<>><<><^^^>^^<>^>v<>\n" +
//                "^^>vv<^v^v<vv>^<><v<^v>^^^>>>^^vvv^>vvv<>>>^<^>>>>>^<<^v>^vvv<>^<><<v>\n" +
//                "v^^>>><<^^<>>^v^<v^vv<>v^<<>^<^v^v><^<<<><<^<v><v<>vv>>v><v^<vv<>v^<<^";
        read(false);
        System.out.println(map.toString());
        for (int i = 0; i < commands.length(); i++) {
            map.moveRobot(commands.charAt(i));
            System.out.println(i + " Move " + commands.charAt(i));
            System.out.println(map.toString());
        }
        System.out.println(map.getGPSValue());
    }

    public void part2() throws IOException {
//        input = "##########\n" +
//                "#..O..O.O#\n" +
//                "#......O.#\n" +
//                "#.OO..O.O#\n" +
//                "#..O@..O.#\n" +
//                "#O#..O...#\n" +
//                "#O..O..O.#\n" +
//                "#.OO.O.OO#\n" +
//                "#....O...#\n" +
//                "##########\n" +
//                "\n" +
//                "<vv>^<v^>v>^vv^v>v<>v^v<v<^vv<<<^><<><>>v<vvv<>^v^>^<<<><<v<<<v^vv^v>^\n" +
//                "vvv<<^>^v^^><<>>><>^<<><^vv^^<>vvv<>><^^v>^>vv<>v<<<<v<^v>^<^^>>>^<v<v\n" +
//                "><>vv>v^v^<>><>>>><^^>vv>v<^^^>>v^v^<^^>v^^>v^<^v>v<>>v^v^<v>v^^<^^vv<\n" +
//                "<<v<^>>^^^^>>>v^<>vvv^><v<<<>^^^vv^<vvv>^>v<^^^^v<>^>vvvv><>>v^<<^^^^^\n" +
//                "^><^><>>><>^^<<^^v>>><^<v>^<vv>>v>>>^v><>^v><<<<v>>v<v<v>vvv>^<><<>^><\n" +
//                "^>><>^v<><^vvv<^^<><v<<<<<><^v<<<><<<^^<v<^^^><^>>^<v^><<<^>>^v<v^v<v^\n" +
//                ">^>>^v>vv>^<<^v<>><<><<v<<v><>v<^vv<<<>^^v^>^^>>><<^v>>v^v><^^>>^<>vv^\n" +
//                "<><^^>^^^<><vvvvv^v<v<<>^v<v>v<<^><<><<><<<^^<<<^<<>><<><^^^>^^<>^>v<>\n" +
//                "^^>vv<^v^v<vv>^<><v<^v>^^^>>>^^vvv^>vvv<>>>^<^>>>>>^<<^v>^vvv<>^<><<v>\n" +
//                "v^^>>><<^^<>>^v^<v^vv<>v^<<>^<^v^v><^<<<><<^<v><v<>vv>>v><v^<vv<>v^<<^";

//        input = "#######\n" +
//                "#...#.#\n" +
//                "#.....#\n" +
//                "#..OO@#\n" +
//                "#..O..#\n" +
//                "#.....#\n" +
//                "#######\n" +
//                "\n" +
//                "<vv<<^^<<^^";
        read(true);

        File out = new File("out.txt");
        out.createNewFile();
        FileOutputStream fos = new FileOutputStream(out);

//        System.out.println(map.toString());
        fos.write((map.toString() + "\n").getBytes());
        for (int i = 0; i < commands.length(); i++) {
            if (i == 1972){
                System.out.println();
            }
            char c = commands.charAt(i);
            if (map.verifyMoveRobot(c)) {
                map.moveRobot(c);
            }
//            System.out.println(i + " Move " + c);
            fos.write((i + " Move " + c + "\n").getBytes());
//            System.out.println(map.toString());
            fos.write((map.toString() + "\n").getBytes());
        }
        System.out.println(map.getGPSValue());

        fos.close();
    }
}
