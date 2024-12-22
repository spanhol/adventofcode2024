package dev.spanhol.day19;

import java.util.*;

public class Day19 {
    String input = "urbu, wrrbwrg, rgug, uwb, uwg, wubwgu, bgrwu, gubbuu, wrrub, rbr, bgrr, rrgrrur, rgu, ugrrru, bgu, uubbwrb, ugru, bwb, uwuu, urb, gwubw, ubu, wubwu, ubb, rugrgw, guu, rbwg, rug, brgugb, rwbrbwu, wu, bgrb, wgburg, uuguw, wbggr, guurrbbu, rggw, guwr, rwgrbrb, urbb, bwggwg, wgr, bbwurrw, bgubr, uuu, grru, rbbrbgbr, buwub, urr, gwrgb, wrwrgubu, rurrb, bwbuub, bgbub, wguu, gbrburw, rrb, rwuu, wgwgwubb, rruw, rurru, uuw, uu, ruu, wrwb, wbrgu, gwbuu, bbgw, grgggbr, bwgww, wbuw, wwb, wubguurw, wbuu, uwurgw, ugwbbbr, rbg, uburg, wrbug, gu, bwuugb, rbuwrbur, wguur, wwwbgu, ugbb, guwubw, uwbug, rwub, uwwgug, uur, wrg, ubgbb, uw, wru, uww, uubwg, wgrgw, bu, ugb, rur, bbw, wbgru, ruug, rrbb, ugu, urbgb, bbgu, bgbwgg, gbrwb, brub, wbu, rwbuur, bgggrw, rg, bgwr, wgwwuwu, gbg, gw, ruuw, wr, bww, uwr, ubgg, guwrw, rrr, wburguu, wrbbrru, rwwrg, rwg, bgg, wgw, www, gggbrrur, gbw, rgrr, bb, bwrwww, rb, rgbbu, bubu, ubwubw, w, wgbb, gwwb, r, gru, wugr, b, bubwu, ub, uugggg, ruwuub, buw, uuruuub, gb, grbgr, wwrg, wwg, grwr, wwr, rbrb, wwrrub, uuwbwgw, gggr, rgubr, guggu, rgwwg, bggr, wrruu, grub, gbbbbr, ubw, rbubw, bbbwwww, wuu, uwuuwww, wwu, gww, wbw, rwb, gbwg, bwr, gubgu, urubwrub, uuuw, rrw, wwruu, ggg, bwrrg, bugw, urw, gggwgw, uwgrgwrr, ugr, rgru, bgr, wbbwb, brg, rwbw, bwuu, brw, bbwbuwu, grur, wgbbwu, ru, rwu, rrgb, urbwrub, ubug, bwu, wbgbbg, uuubu, wbrgwrwg, gbgg, buu, uugu, rrbuu, brbg, brwuw, rbbbw, rbgr, buggrug, gbwr, gwr, wrrw, urug, bbbb, bbrgu, rrbwuru, ugggw, bbb, rrbrw, ubg, bwubgw, ugw, urwgr, uwwrgw, ugrbwu, rggwwwb, grubb, brb, rww, ububwr, brruburb, bbrgrur, uwwbgg, gbbrr, rggu, bbwug, wrb, wgugu, br, bbu, gbr, wbg, gbuw, wwug, bru, grwrur, bbr, bugwur, wrug, rrwbu, rw, uug, rgr, ugrubu, rbb, brgwug, rgwbg, rub, gbbg, bur, grg, bubgg, ugg, rbwu, rwr, bub, rrguw, gubb, bbgr, wbbburg, bgw, wb, wubw, ggwuub, bwg, bwbbrw, ggw, grubrg, rgw, uwwuw, uwbr, grr, rgb, bwrggwg, brbwur, uru, bguuubr, wwuwg, wuruwwbw, grrwwrgr, bwbu, rbuuuw, ubru, uub, uwbb, ruw, gwg, rbur, grw, gbgbu, uwbugw, wbb, gurb, ugbwgub, rgubrw, bbugu, urg, wrr, bw, wbubruw, wwwr, rrrb, ggbbbg, wug, rgruu, guwb, uuuggug, brrbrr, gr, buwbguwu, rgg, rrwg, wwgwrr, rrg, wurur, ggwbbrg, rrwgr, rruwu, buww, gbu, rrwuruub, brgr, wguwuu, urbrbg, rru, wgb, urubb, rbw, guru, buru, gur, ww, u, rwgw, gug, wwurwuw, rrbgrw, bwuwubu, bgrw, gguuugub, rbu, rubub, wrw, ggb, buwugrg, wgu, wwrbuu, bgurbg, gwu, bbwgb, uwwrrb, urugu, wugwrrgr, gwbbr, rgubg, bwrww, ug, wrwr, brur, bwur, gwgguw, wuwub, burww, gubwru, gub, bug, bwww, gwgugg, gruw, wgg, wrub, uwuwbgu, bwbw, gwuw, ubr, gbb, ubggru, wwubuw, rgrgru, wg, wub, wrgww, bwwub, gbur, bwgu, ur, rgwrrbw, wguuurb, rwrrg, ubrbburg, rgbggww, rgbgrur, brr, wrggbwr, ggr, guw, bgwb, gwrbwg, wrwbug, ubggu, bgrrb, wbr, wgub, gwbw, grb, rwbubwur, ubgw, gwbb, ugwwggrb, ggww, wugwur, rubwg, bgugw, wbubbu, rbbw, bgug, uggu, bgwrwrw, gwb, bgb, uwug, gurguug, wrrbw, gg\n" +
            "\n" +
            "wbrurgggrgbuwguwuwuwuwwwwgugwbwrwwuguwrrwubwuwrgwbugw\n" +
            "uubrgurbrbgwgbbrruwrwrwgbrrgguuwrwbrgwgwgrgrgu\n" +
            "bugwgurruguwwbgwuuggrrbrubgggbgrubbwuuuuuurrgwwurwguwugggg\n" +
            "brwugubrrbrgubrwubgwbrggrrrbwburgbugrwbrwubbg\n" +
            "gbggwbrwugrbbrrbbrgbbbuguwwurrgguwrbubbbgbbgbbbg\n" +
            "bgrwgugurwugurrwwgwbrruubuwuwggrubwrbbugggw\n" +
            "wbrwrugwbugrubgwuggguwubbbrbrgrugwugggggrbbugwbgbbrbbg\n" +
            "rwrbbrubwrbbbwurggwgurrwubgrwwwurwgburbbwgwu\n" +
            "rubbbgggwuwggubuwgrrwurwgwbrwrguurugbgrgbbuburgbg\n" +
            "bggubbgrgruubbbubrbburggguwgggrrguuwuubrugbgbgwuruur\n" +
            "ugwgugugubrbgwwwguugrwbwubburwwgwbrbrbbbwgbb\n" +
            "gbgbbrbrwububuubgbwubgbbwrrwwggbugwrwbgrgwwggbwgggbrbuwwg\n" +
            "ugubgrbwbubrbugwguwrurguwwrgbrrurrbubuwrgburbwwgwu\n" +
            "gubbbrwguugwwgbwbwwgbbgbuubbgrburrururgwbwr\n" +
            "gwwbrrbwguurgrbgrwbubggurbbugrbwggrrwbgggbgbugbur\n" +
            "wruwwurwuwgugurugwbuwbguwuwgugwguwuugggwubbrbu\n" +
            "grwbuwuwrgubwbubuwwbbwrwbwrggbgugbbugwuuugg\n" +
            "burguuguuuuguwwggruwgbggbbbuuubwwguuwbgrrrrbuuu\n" +
            "urbbgrwgbbbggurggbwuwgrubrwbgrbwugbwubwugbwrurw\n" +
            "gggrbbgurruuguwwbbwguuugrwggbubwrubgbwwwgwbrgwwugrwgb\n" +
            "rrrgrurwbwgrggrbrubbbbrgruubuuwgrgwrruwrbgb\n" +
            "rgwrguggbgbwwbwwrggurgrgbuwubugwrugwbuggurbgwgwwrwgw\n" +
            "wuwbuugggbrggbwgrugubrgwwrurwuuggubwwubuwwwwbubrrbwwbwubbg\n" +
            "wuuuwgguuwgwgbrrbubbugggwbwgrwwgrgwubrgwbrwubwwwww\n" +
            "ubugbugrwbwwgbgugbruububggbgwwgggbggwuwuurruugbugrgrb\n" +
            "wguruubgbbrgubguuwgbugurrbbwubruguwuggbwrguuguwrwuuwbbg\n" +
            "rurwgbwbbrwrbugwwwbbuwwbbrrrbuuuugwrburgwbbbbwg\n" +
            "wgbbgbwrwrrgubrwbgwwguwuwwugrbwwrubgrwburgrrbuwrgwrbrugbuw\n" +
            "uggbrggbgwwgrbbrurwuuwgguwrbrgggwbrrggwuruurwrubgugguu\n" +
            "gwbgrgruuubgwbrrrwwurgbbugbgbwgwgwubbwwurwrrurbubg\n" +
            "wurrwuugbuggbrrrgwwugurgguurgugbbrgurgbwrwrbbg\n" +
            "uwrggrgbrwbgrbgbbuwrubbububgwbrgbgubwbguuuwbr\n" +
            "bbwurbgwuuwurwrwbrgrwrrbuubuggrrbwwgbwwurrrbugwwbubgubwr\n" +
            "rgbrggrurgwbwbuubgurruwrgubuuwrwrrwuwrgbwugrbbguu\n" +
            "wuwrgrbrugrgwugubggbubbrbbrgbbbrbbwgwbbg\n" +
            "ugwwbubwbruubwwgrwrburwrurubbwwrrugrbugugguwbuwwwgb\n" +
            "rgwuuggbrwbgubbbbuwwuuruurbugbbugbbrrgbwbwgurrggu\n" +
            "gugwwruurgwrrrwugbuwguubuwbwrrbugbggwwuwruww\n" +
            "ruugbggrubrbburgrbwwgugbgwbrguugrgggwrwwrggggubwuuugguwuubbg\n" +
            "buubbwgbggbrubgurgurrubbbrgwuruurbwgbwuubwb\n" +
            "rbwguwubgrwruggwrwuubuggwurburbwbggubbwguuw\n" +
            "bwuuwrrrwbburggubwggbuguwuwwwruwuwggwuuwubrrbu\n" +
            "rrwwwubrrwrgburbrwbbbgwbgbwgugbrwwrrbbgubgguuuwguuurrg\n" +
            "guurrbburuugggbwwwgbgbgugwubbgwbrbugbbbg\n" +
            "rbbrruurbrgbrwrwruggwrgguuwuwwgrbgwwrbgrbbrbgbrrgggwwbgwwu\n" +
            "wbbgbrrbrrgwbuwwwuwwuwruwbgwrrgbwuruuggbgbbbg\n" +
            "rwbbrgurbwbwwbburwwguwgrrguuwgggwbgrrurbwubrruwgb\n" +
            "rgrburrrgurwrgrbwurwwggwuuubwrugrguubuwugwwbbg\n" +
            "urgwbwurugbwbgbbrwguggbugbbuwgguwgugrrwwgrrggrgugbrgbruwbbbg\n" +
            "urwbrgggbururbwwrubgugwrgwbwbbwwbwrgrwgwrrggrbrurgggww\n" +
            "rwguwwgwrbugrwruurbbbbwubwwbrwgwuwwrubwwbuubbwuuwuuwwbrg\n" +
            "grubugbuurgwbgwwgwbbuugurugwbbbwubgurrurgwubbg\n" +
            "grggguwubgbrwrrbgwuuwbgwrbgbuwwrrubbbwugrbubg\n" +
            "bbbbwwurbrbbruubwuurwwwuuwbrbbbrgbwugrrgbbguwrubuuwbbg\n" +
            "urruwrbrruburbugbwgruguuuuwbubuwrwgrbgrgrb\n" +
            "urgrwwrggbgrwuubgbgwrwrurwubguruguwugubugwbbbrgg\n" +
            "ggbuwugrugbgguwurgrgwgbgwggubbrwrurrwuwwuurbbrgwwrwww\n" +
            "urwgbugrbguuuwuwwbggbwruubgbbubgrgrwruubrwrugbbbbgwbg\n" +
            "grbwgwgwuwwrugwuuggwrrurrrbwubbgrrgguwburuuuwrubg\n" +
            "uubugggrgurwrrbgrgubrwbubwgwgrrwwrgruurrbbbgbwgwubbg\n" +
            "rgwrbgrbruuubburgrgguuwgurguuggbruurbbugwwrwbubbrbbg\n" +
            "bgwubwuuwwubgwrrwggrubrrbgbrbgubrrbwugbguubwbwuuuwrbgrw\n" +
            "rbwgwwugburbgbgruguguggrgrbbrgrbrrwugbuubuurwurrwrbrrbbbg\n" +
            "grbguwgrrrgbwugwrrgrgbbbrwrrrugugrgrrbrwrbrbrrwuubuuw\n" +
            "bbbwugwbwrwuwrurwuuuwgbguuwurguwrgruwggurrwbgubgggbwb\n" +
            "wgrbuwrburrgwbuurbrbrgbbuguubrrwugwbgwggwggrb\n" +
            "gguwbbbubgrwrurrgbuburwwwrgbwwgbrwgbuwwrwbgrguugbgbgwrr\n" +
            "rbgwbubgbwwbuubwrwbgrgbwrrgrwgwguwburbbbbbugwgbu\n" +
            "wrruwrguwrwuwbrbgwguuurrugbwggrruugrbgugbbwurbruurgurbbg\n" +
            "gugubbuubrguuuugbuwubwbwgubwwwwgwgwuwgrrwubu\n" +
            "uruuuuggwuuwgwgwbrwwgguwgbuuwwrguwguwuwrwgwubbrrw\n" +
            "buuwrrgrwbrugrrwwbbguurbwwbgugbbguwrwuubrwuggw\n" +
            "rrurgugbrbrbwbbubbggwwuwwwbrurbwugwbbgwwgg\n" +
            "wgwuwguurbggrbwgrrrrggbuwggrwgbbgwubrgbrburbgwwurwu\n" +
            "uwbwgwwbwurrurruugbggurbrgwwgrbuwurggwubuwr\n" +
            "uuwwrwwwuuwwguwubgubbrurbbrgurwwgrrubbgubb\n" +
            "rgwgguguguwwuwbbrgbuwguwggbrwgbugrwbugwbubgb\n" +
            "gbbrwbwrrwgbwgwurugwuwbwbwwwrrrguuubggwrurwbwrbbrrwwrgwgb\n" +
            "wuguwwwgbrbwubuuuguburugbbwgwgubwbugbgrrugwwwgbgbubgrw\n" +
            "uugbwguubuubbrbrguwuwwgurbbwbgrgbugwgwgggrubbg\n" +
            "wbrwurwwruwgwuuwruwgbrwrgrrbrwwgurbugbrgbbbbg\n" +
            "ruuwggwgwrrwgbrbwuuwuuburrgbbrguwugbrrubrwuu\n" +
            "ruruubgrrugggruruubbubugruruwbruwwgugwbgwuwuuwwbubbwbgwu\n" +
            "bgwubguurgwuggwgwrrwgwuubrbgwbrwuurwwbrrurwgrgwgwrrrrwwru\n" +
            "rrgbbgwwwbbwuuuruubgurwugbrrgwruwrurwbbwrg\n" +
            "gwgbwwurwrugrrruwbbuwbugrbubgbggwuubwrurwugrwrugurbwgubbrb\n" +
            "uwbgbggbwwuwwrwgwrrrbwbwwrbubwgwbbrrwguwgbuwuubwrburuwbw\n" +
            "rwgbguruuuruwbgbwrbrgggrbrgburwbrugguwrrbbbg\n" +
            "bugubbrubrbgwbbruuurbwgwgbbgbrbruugrbrbgrgrbbg\n" +
            "guugrwwrwrgubuwbgbwrrgrbggrrgrubgruugbwrbrbwu\n" +
            "wbuwubrggubgrggbubrugbrwwgwurrbgwgwwbuwgbbwurbuuububbggb\n" +
            "ugrugrubbwruburbbgwrburbbrbgbrbrggwwwuuuwwgurruubbrbbg\n" +
            "grbbrrubbbuwwurrurwwugggubrgbbwguwgbbgwbwwrr\n" +
            "gbwbbwbugbggbwrgrwbbbbuwruuruuwrwbrrrgwuwubbugrgwwrruguwub\n" +
            "ruwgggwgwgubwwgrubgrwrguurrrubwbgbgruburwrgugruwuubwgwrbbg\n" +
            "bwrgugwuubuwgugwgrgrugrgurwgwrgbuwbbrrbgrbwwrgbbugubbugbbbg\n" +
            "rbrgrbuurgbwrrurwbrbrrgwgubwbbwuugrbwgbrgbrrw\n" +
            "gwuuubuuggrwrbwruwbrwgwwruurbugwrgwwurrbrwwbbgwbbubrurbg\n" +
            "ggrrwgrrgburwrgurbbwwwrgrubrugrrwgbwbbbgbbwuuurubbgb\n" +
            "rbugrwrubwuurwrrwwbwwwggwurwgrrrrruwggrgrurr\n" +
            "ubgwrbbbrrbwwgwwbbwbwwurruwgbbubwugurbuubbwuubrburbbg\n" +
            "ruuubrurgrgubuggrwgrbrbwbuuguwuburwuwuuggwgugrugbrgwurbww\n" +
            "gwbrbrbrwubwbuururubrgubgrrgburrrbrbbrgugrwgwgwurb\n" +
            "gguurgwgugrbwgbbbrwwbwgwwggubwbrrubrwbwrrbbg\n" +
            "wugwrrgrwgguuurwwbgwururrwurwwbrrwgrwbbg\n" +
            "brrrwwwuwrbubbgrruwrwggbgwrgurgbrrwbwwwbwugwgr\n" +
            "bgwrruwbrbubugwggrbbrggrrwwguububwbuwrgwbrgrrubbbbbgrgwuww\n" +
            "rwbwbrbrguuwurwwrwgwururgwuwgbruburwbbwrbrwgbrwubwgwrgrrrw\n" +
            "ugubrbugbwggwbwuggugrwbggbbbwrubbrwugugwwburugbwbbg\n" +
            "ruwbbwrbwwuububwwuwurbrrwrbggbbrrbrwrwwgwbgbrgbwb\n" +
            "gggbbwgwuuwrbuwwrburggbugurwbgbbgbruuwbbg\n" +
            "gbrbgggbruurbgrwrrrbgwwruwugbgrwgwwrrurruwruubrurbrubgrwg\n" +
            "bugwgbuwbbggrbuuggurrrrgrwwrrbbuwrrbugugwgwwuggrbgrggrur\n" +
            "rrwgurwwgrbuurbgguwurrugggbrwwugwwubrrbbgwwburbrwu\n" +
            "wwbgbwubwuwbbbburgugugubrbwgggbrbgrbbbggwubrgr\n" +
            "rbbuwrbrbbwbwguruwrggurgurwrgubbwrrwrwruwwuuubw\n" +
            "rbwbguuwwrgrwurbbuurgubuubuggrrwrggwrgwbgbuwrwu\n" +
            "bwgbwbbubguwuugwrbrgbrguwrubuwguuwggwwburw\n" +
            "rgruwruwrruwrurbrguuwrrbbbrrgwubbururgwgrur\n" +
            "burwugruurwwwwrwbwrrrbubgrrrrubuuuwwbbgrbg\n" +
            "bgbwrggwguurbbubwwwbuugwggubrgbubrwgwwwrwubbbg\n" +
            "uwuruugwbbwbuwgrwgbbrbbgggggwuwggbwuubgbrrguw\n" +
            "rbguuggrruwrrubggbuwrrwguwrubbbrbrrwgbgguuuuuuguuuug\n" +
            "rwbwgurrbgurwrgbbrugwugugrbrwuuwrbgrgbgguwbgbubuuwrbg\n" +
            "rrrrgwuwubwwuububwugruurbgburgbggburgbgwwuuuugwwrb\n" +
            "wwgwubbwbrrurgrubbrubgrwrgbwrrruugwbrubugrrrbgwbbg\n" +
            "uuguggrugguwgwrwbguwrgbrgugwwggrbwbubuwbwbwrrrwwuggruwwbwbbg\n" +
            "bbrugbguwrgrurwwgbwwwrwgwbbwugbwurrrwbubuggrrbwwwwgb\n" +
            "uugbbwburgbbruugwrubgugbwwugggggguugruuwbrbbg\n" +
            "uwuurugrwubgggrgrugggrguuuugbgwwurrbuwrugbr\n" +
            "wubrbgwgrwrwbwuggbwbgggrbuwwrbwggruugrggrrwubguurwbbg\n" +
            "gbugrwgruuwwubgwbwbuguugggrggwwbgbubwgrubgbgrubgugur\n" +
            "wwurwrurrrbugrbuwbwwuubrrbgwugbbuuwgrrbwwrbuwbbwwurbwrur\n" +
            "rgurbugurgrwrrwbrrgwrgubwrbwbugwubrbwgubuuggrugwuguw\n" +
            "buwrgrrgrwgggbwgubgrrbgggbugwuugrrwbgubwugwruuruguw\n" +
            "rwururuurggbugwrgrrugrbbuwwbwrwbrburgugwwrugbgwgwb\n" +
            "ggubrgbbrrgrgbuwuwurrgrrbbbwbrurrgbbbbgubrg\n" +
            "wwwwgwrgubgrgubbrrwbbubbugurrwugbrgurrbggugbbbwgb\n" +
            "rbrrrubuggrbrubwwuwbrwurgrwbwbgbbwrrbrrwgrbrggwbbugwbwwr\n" +
            "rwugrbrbwwbugrbbuuugwurrgrrbuuwbgrrbrrgrrgwguwgrbbuuugugbbbg\n" +
            "rgwrgrbububuubgbrrgwurwwrbrwwbbbbwgbgrbgwruwgwbgbrubrwgugw\n" +
            "uggwubwggbwuwrggrrububgbwbrbwgrrgbwbwggwubwr\n" +
            "bggugrbbuuurwuurubwgwwrburggwuubwuguwrgrrgrburgr\n" +
            "rbrwwrrgrugwuwrugwwbburbuwwugrwgurwbwruuuurgwrubuubbbbbg\n" +
            "gurgwbbubrrurwbubgrguwgbgwuuugggrgrggubugubwbbg\n" +
            "uuubrbgwbrbbrgugrgbwubbrurgrugubbubwbrrwurgr\n" +
            "bwbbrurgbbrwrbubgwgubugubuwbgruwuwgruwwwuuruu\n" +
            "rwbgwuruubugggbrrurrrubwbwwwgrrwugbrgwgwbwgrggbrrr\n" +
            "bwwwwgruwbuwrwbrrbbuburwwbggrgbwururrwggubwrugwwgbbugw\n" +
            "ubguggwugubgggbguuwgruuubgrrbgwwuurruwruuwrwbbwubbbbgbw\n" +
            "uburwubgwugbgugwrwrbbwbrgbuwuuwrrwbrgbgrgbwwgwrbgbwwrbgwb\n" +
            "rugurrbbgbrurrggbrbbgrugubwrubwgbuwuwbrrwgrrubbwbrgb\n" +
            "gubwubbuwrbrgrrgwuwbwgggguggrgwgwugbrwruuwurgwrrbbg\n" +
            "wggrwbgggrwrggrgrwrbbuurguggwrrubuuwggwbgbgbbggbr\n" +
            "rwwwurwbbrbrubrruwuuuurrwwrurgrrbbwuruwbru\n" +
            "uwuuggbgbuwubrrggrrbgwgrrbubbrrurbwguguwgbrubbg\n" +
            "ruugbbwggbgwurwwbgbrrbwburuuruggbgbuuwbbguuw\n" +
            "rbrgbuugbwuggrruurrwbbbguguurururwwrwbrwrwuwwbbw\n" +
            "wwgrruwbrbrrrbgrbbrgrwrwwbwruuugrwbuwrwbbrgbrwr\n" +
            "wrwrguburwbuwbrgwurbwrgrwgbgburwgwgrrguugbbrugrbwgbgrrbbbg\n" +
            "guuruugubguwggrbubwgrgwbbbugrrbbguguwuubbbbbg\n" +
            "wwbrwurrubggrrbrbbuuwuwwbubgbwbgrbubrurugbrgbgbbbrubbr\n" +
            "wwwrburruwbwguwwuwruwugwguuugbwgwrrgbuggwburgwggrbw\n" +
            "grgwrruuuubuurbururguwwrrwgwwburwrrbwgrwrgguurrb\n" +
            "rwgurwuburbbwrwgrwrgurbwbrrwrbuwgwuurwuwguburwurburr\n" +
            "bubwgbrrwwrbgbrwwurwuurwbuwuruurbrwwugugggguubuububruw\n" +
            "gurbwgwuwuwgwwuwrrrrurbbugwgrgwrgugubgbbuug\n" +
            "wurbrggwgrbguubgrggrwwgwurubburggrbgrwwbggbwrggbwurguu\n" +
            "ugwgwwwrurgbbgrrgrgbbrwgwwbubwbbbrwbgrurbbbuwrw\n" +
            "wbrubrwbgbwrbbburbrbubgbggugrrrgubwrgbbbbg\n" +
            "rbbwbwwwbbwrwuuugwurgrubuuwrbguwggwubrwburgwrgurugwuwrw\n" +
            "wubbwbruuuburbguwwrugguurwbrrwbuwbgwwrwubuwgwwwggbuw\n" +
            "wrbwrrgugubwbbrwrgbruwrrruuwrwgurugwbrbburwrgbguurw\n" +
            "bbgwrbgrguburrguurrbubwbubwggbubwuguwwubrggwgbwuuguwurrbbbg\n" +
            "ubrbuuuuubuurrwwwggwuwrwububgrgwrrbbgwruwwbrwgbguwbwggw\n" +
            "bburrrbrrbwgurwgwrwbbgrgrggbgrggruugwuwbbggbgbrru\n" +
            "ubbuubwwrwrbwrwbbggrwuuugugbwurgggbggrwgwuuurgbwgruwbggwbbg\n" +
            "wubwwrwbuggwugbwwuugugrwbwuuwuwgbgwuwubbbg\n" +
            "ubwrwwrggrrwgurwruuwburbuggrbbgubrwwgrguwg\n" +
            "wwbwrgwugbgwggrrbwugbwbrgbbrurbwgggrbwbrubwgr\n" +
            "bwggwgbuuuurwurwgbrwguurwbbguwbrguwrgurubrwugrgugguuurgbu\n" +
            "rggrggwuwwgwgbwrubggubrgwuwugguwuwrwbwgrru\n" +
            "rburwbbuguwugwggruugwgwuuruurwwwbgwwbuwubbwbwwwgbrggu\n" +
            "ggbgbrbggugwbbgbwwruuguuubuugwrwrbbrggbubwgw\n" +
            "ugwrwbuwwgbgwuugguurburrgrggggbbwwwurugrurgwwbbugr\n" +
            "rggwuubwruwgrrbbbbwgrgubrwbbgubrguburbgwwrrbgwbrbgubwwrrw\n" +
            "ugbugrurgwbuwrbrgubbuuuuwrrwrrbwuwrwrbbg\n" +
            "ubwuruuugrggubbrrwrrgwruubwrwbuwwwwuwrggurgurr\n" +
            "bbgrwwwbwbwrbgurbrgwbrwwwgrrwrwugurgruwubug\n" +
            "wrbruguugwggwubguggrbgwuwbwwuuuwwugggwwgrb\n" +
            "uwrrwwubwrwrbgwgrruurwgbbbbbgrrgbrbgwgruwbruwwbrwbrr\n" +
            "wrugbrubrgwgbgruwrbrrwgwrrbugrguwrwrwuwrrgu\n" +
            "guwrubbgrgbrwurwbbbrgwubwrwwbuwbrugbbbrbguruwwg\n" +
            "ggrbwbuwrbrbwwrrwwwguwgbuuwwgrggwbuwwwugrgwwrrru\n" +
            "rggbrubrugrrgwrrwuwbubbgggugwgbuububbwrgrgbbwrgw\n" +
            "uuurrbbrrrwrbwwwwbwrbgwbwgbugrgrwuwburbbrwrbrwur\n" +
            "wurguurbrrbgbuwuwruwgwurgugwbwbgbwurbggbwbruubbbbgbubwg\n" +
            "grbwgrrgrugrbbububwwruguubguwuwuururwggrbrrrwb\n" +
            "ggrbruurwggubrwruwbrrgwwwgurwuggugwbbgurbwrguburrgw\n" +
            "bbwbrrwbubwururubwgrwbbgurwuwruruugrgrbwbbbg\n" +
            "bguguurrrbuugburubgburwuuwbgwgwrbwbguurwrwggbrrwrbwbbg\n" +
            "grwwwuwrruuwbrbwbugbwgbuuggbgbbbgrbgggubgrwwuwuwwrubrgr\n" +
            "bbrwwrwuruubrruugbwburwgubbbgwggrggwwuwrugbbbbbg\n" +
            "wuuuguugbggrgrbwrubruguwurgrrrruwggwwuuwbbgububgbwbgwr\n" +
            "rgurrbugurgubgbwbgggurwuuruubrubbuwbgrbgbbuubbg\n" +
            "grgwrugrbgwrgburgbbwugbwbrrbbwgrrbwgbuwrgugrwubg\n" +
            "wbgwgwwwbwbubbbgurbrwrubbrwrbbbbrurguurgwuwggu\n" +
            "rgurugwbruguuggrbbgwwurrbbgbwuubgrugwbbrwwrrbbg\n" +
            "rurgrgrgbwubwrbrgbgwruuwurggbwggrruwbwuubbugg\n" +
            "uuuggwgurgwgrgrwwgbuuwggurbwwwbrububugbgrubgrrrwubbg\n" +
            "wwbubbwuwwgwwuwuubgwwbrwwrwbbbggrrwbuwuwrwgwgwubbg\n" +
            "wugwruwwgrbubwuruguuwwwwgwuugwubgurgrrwrrwubuuuggrgu\n" +
            "wubuwwubrgwuuwgbbgrwbgwrwbwrugbruggbugrbuwubbg\n" +
            "ggbbrubrgrwrgwuwwrrbgugguuwbwbwggrbbwbwbbwurbuwbugurrr\n" +
            "wbbbrbwwubggrruuguwbrurgwbbrrrrrwbbrwurrgrugbrwurub\n" +
            "wrubbbuwbwgguwbrrwrbbbruuruuugrrbwrrbruwbwbggrbggrgbbru\n" +
            "urbbbwbrbubwgrrrwrgwrugrwrgggguwwbruggwrwrruurbgr\n" +
            "gggbrgrrgbwbuwbguwuguwguugwwggbrrubbgrbg\n" +
            "ubrwgbbuwubrggrrbbruuuruuwurbubugbrbgguwbwwwuwbbg\n" +
            "wuburburwrwbrrwbrugbwurbbwugrugbrbggwuurubbg\n" +
            "bububugguuggbrgwgrbrgbbgwwruubggbggbrwubbgrbuwwru\n" +
            "rwwwwrubuguwburubwubguurwbrrwwbgbgwbrugugwrgwrggu\n" +
            "bbruugubugbrgururbbuwubbwbwbgrggrbruwwuwggwgbruggbgggg\n" +
            "uuuuwbruugugwgwwwwugurwbguwbrwgguurgwgruwggugbrwrgr\n" +
            "bbrrgburuwrwrrbbbuururrrwbgurwuuwubrguguuwuwgububugrbugu\n" +
            "wbbggwbwggbgrrugurbgwrrburbuubrwruwugrbwwgwubbg\n" +
            "wruugurwgbruburgbruuuugwguubggbwugrrggrurbbruugrg\n" +
            "rubbrbubgbwwbbbgbrrubwrwwbrbuuwgbwubwwrwuggrrrbruuguwrwuub\n" +
            "ruwggruugruuuuburbugbuggbuurbbwrgguwrgbrbrbbg\n" +
            "ggwurbuurruurguubwugwrgwwbbugrwwgwggwwbburrgbggggruwbgr\n" +
            "uuubrrrgwrbwgbgururuwwgwgbuwbuwggggbgbwbrgg\n" +
            "burgubwburbwwgwgrwurrgbburubbrwguwrwgbrrgrbwbb\n" +
            "wwwwuggrbbbwugwgwwwgrgwugrwbbrbuuwggbrwgwwrrwwwrwg\n" +
            "urbrrgruwwrgbgwwbguburuuubbbrgrgubuuwuwrbu\n" +
            "gwwwubrgwwuggugwwurwbgbwgbwubbuugguuugubbg\n" +
            "wrwgwrrubbwbrwruguurbrwbbuuurrwbbbgbgwubwbbbg\n" +
            "uurrgbwguugbwubbuwwbubwwbbgrwbggbwrgubbgruwr\n" +
            "brwuwwgrrwurruwgrwugrubugrrgbgwgwrwbgwrgbuuruuugg\n" +
            "wrrrgrbwgrgrwwwwbggbgguggbbrugwwbuggburbguubwrbbrbgubbg\n" +
            "ubwwuwgbgguwggugwuuwbrggbwrrgbwgurbguwbrrbwbrrwugwwrubwur\n" +
            "wwbgguburggbgbwgbrugrwgrubbrurbbbuwgbrgbgguwbwgw\n" +
            "wbuwubwgwguwwwrrrbwbgwgugbubugguuwrbugurbubwbwburrbubbrurb\n" +
            "brbwrrgrrwurbgwggggwgrguruuburuuwuwrwwwgbruuuwbrrgwwgrrggw\n" +
            "bbbwuurrbwgwugurbrbgguwgwrwbwuwrgwwgwrggurwubgugrr\n" +
            "uburwguwuwwwwrugwbrbugrrubrgubwbrgwugurrrgwruwwbgrg\n" +
            "wubgrrwbbbgwugwuwuwrgurugbrwgbgbrwgrbbgwgu\n" +
            "bbwurgbwubbwgruugugbbrwuruwwbwburuurgggrbbubbg\n" +
            "wburgbwbugrurwwuwwrrbwbbrugbubuwurgbgwgbwbgwbu\n" +
            "bwwgrubgwrrrrbwrrrwbuuugugrwuggrgurrrggrbggwbrbgwbbg\n" +
            "bgbggwbwwwwgbbrbwugwuuugrgbrurwgwbgugrrwbwbuwgbgbbub\n" +
            "rbuwrgbrggbruwurwbrwbgbgrbuwrrwggugbrgbwubgwuggrugwwgurrww\n" +
            "rggbwrubggurwrubgwugbwbuugwbrrggurggguuwwwbwwwrubrgrbrgu\n" +
            "rgguwwrgrgwwurggbwbwbwgbgbggbgugbbbwrbrgbwbbg\n" +
            "wugugrwbugbwbugrggbubuwwgwrbrwgwurwrbbbg\n" +
            "bgbwwrwurgwuuuwwrbwrbugrwrwrwwgwwugwuuwwbwbugb\n" +
            "grrubwrwuggrwrgwbggbggwuubgubrrrrrbgggurrrwrw\n" +
            "burruwwbbbbbguuguuwrrgwgwuwrrrrubgwrbrrwwbbbrgu\n" +
            "rrrgrrwrrwbbwubrwuugggrrburrwwurgggrrwwrgrwwuu\n" +
            "grbwrbgwugrbugbrbbgbwbrrrrubbgbgbggbrrruwuwgwbugu\n" +
            "uuwwggwwrgurwbwgbrwrbbgwubgbuuruwgwbwbwwrwbugrbg\n" +
            "wbgbrurrguurrwruwuubbbrrubwurbbbbbugbbguurrrgwrgb\n" +
            "rwbbwbwwuubrbruuuwbgguburgrburwbgwbgugrurwbbubrb\n" +
            "ubwgugruuuwwrwbgwgwbrggggrwgbbwrgwrrgrbwbbgrguurgb\n" +
            "bggrrgurgbgubgbugwrggggwuurbruwruugrbbrwbbugugru\n" +
            "urugugrubrgubwrrrbwugwururrwuwwrugwbgwwuubugw\n" +
            "wubuwgwbwgrbuguwwubwrbuguwwbgwrrbrrwugwuubrrb\n" +
            "uugbrruburbrrrrgrrgbrgbruwbgwwbrrurgguwuubbg\n" +
            "ubbwgwbgwugbwgwwrwbwbrrurguurguuurwgugrggbggwgw\n" +
            "urrburbbrrwgrbgwggrugggbugurrburwugugubwwwrrwrbuggwgwuuruw\n" +
            "wbrwuurggbgguruwrrgwrrrrbrrwrbgggrguwrwuurbbbuwgrurwu\n" +
            "rrrgbbgrbwrwrwwbbuwrbguuwwurbwggwwbgwbwubrgwwgruggww\n" +
            "bwgrwuurbwbwbrgwrwgwgwurugwrrrwuugrgrruwwgrru\n" +
            "urwubrgwrgwgbbguwuggrwuburuwgggrrggubwggbg\n" +
            "gbgguruubbrubwwruwwgwguuguuuuugwugrwgwuuwugrww\n" +
            "rwrubugrguurggbgrugrgbuubbwwuuurbguggrwwgwggwuw\n" +
            "guuuuwuwgrubggwuggrurgubwrbwruubgwbbugwwuggrgwrbug\n" +
            "wbbuuguguruuwubuwgwwwbwubgwrbbrggwbbrrgbbbbuw\n" +
            "rwruuubgburrguruugrwwruwrrubwbwwrgbrubwrgrbgwgwurbggwugur\n" +
            "brwurwuubwwrwwgwwrwgrruburuwggbwbggbuugwuu\n" +
            "guwburubwruubwguurrbwurwgwuwbguuruuwwgwrwuuwbrrbugg\n" +
            "urububwuwgrgrwwrwrwbbggrrrruugrrrugwbbbrubwbwggrguggurwrwbbg\n" +
            "uruubbwurwrgrgrrgrbburrggwwbwwubwrgwgwugwwbburbgrrgbwb\n" +
            "bbrrwgwrguubbuggwbbbwrrrurrguwrbggbbubrrggggwrwbrg\n" +
            "gbbggwrrrgwrrrggubbbbuubwguuugubggrwrgrggbuwbbg\n" +
            "gwrwbrgbubbbrugwgruuggguburbbgruububgrbbg\n" +
            "rbgrruwguurwurgwugbuugrrggugbuwrubbrgwbuwggubuurgg\n" +
            "wugwwgwgrbwbguruguguurwrggubrubruwrrugbbbwuubwrgwwgr\n" +
            "bwbuubgbwwuwwggwgbburgugbbrgbuggrbubbgwurrrgur\n" +
            "ggbgrwgwbrgugwwwubbbubwrgbguuububuuburgrwgg\n" +
            "burbwuwbrwbwrguwbwgrwruugggbrgwubbwbwrubbbbbrurrgbbrgrbwg\n" +
            "bgrgugrwwggbbrgwgbbgbuuggguwwwwrrurbwwgrwrbbbbbbw\n" +
            "rubrbgbuurgbrrwrbgrrwbbbwgbubguuuggrwgwrubgrrggguwbub\n" +
            "bbwubwrgguugubwbbrwwgrrgubbgrgguggwbbbbgbruwgwwg\n" +
            "bwburrwuruubggugwubgbrubwugwugurrgwgwgbbgbwrwuuubbwrwbbggbg\n" +
            "rrwrwrggwbbrwuuwgbrwgruuubggwbbwwuuwwbbrrrbuwggugwu\n" +
            "wrrrgubwwuubrbbburburwbbuwrggbgubgrbrbgrggwrrwgbbbg\n" +
            "grubwbwrrburrguwwuwbbwwwrgubgubwwwwrubgwggbuubggwburggrgrg\n" +
            "rbgbbwrggrgrggbgrubrrrwubggrbggbbwrbwbrwwwguuuwwrbbuuwwbru\n" +
            "gbubrgbrurrwuwgrrbgbgrbrgurrubuuruwwrbwuuurgrbrwbbg\n" +
            "rrguuwwrbubbwggbgbbgwgwurrruwuuwuruuwwwrrwwubrbubuubg\n" +
            "urrbubgwrgrgbrwburrggrbrwrugrrbggrbubrrrrbuurbbrrwugbbubbg\n" +
            "wwugbruwbbwgbwwwruuwgrgwbuugurbwuuggrugrwgbubbbg\n" +
            "rgruugbbgbruubgubgwwuugrggrbugrwbrrbubwwbggbrrgrrbbg\n" +
            "ubuwrwwgurbggwruuruwuwbbbggrugwuurwrrrwrgubbwbgugubub\n" +
            "brurbbbbbwuugbrrgrurgwuuggbruwuubwguwggwugwgwwbubuwgru\n" +
            "bgwgrbrbgbuguwwrgbwwwrgurwuwbrgugbruwrrgbwwbgrw\n" +
            "brggbwwwrbrwwurbbwggwbuuugrubrbbgwbrgrwwwrwwwwrubbuuw\n" +
            "wwwuggggbbbuuwgggurbgrrwurwggbubbwgbgbgwurb\n" +
            "bwuubuuwrwrurgbbubbrwubbuuuugwbgbwuuugggrbruwbgurwr\n" +
            "rurguruwrrbbruruwgurugwugwrrgbwggrbugwrubrbbg\n" +
            "urbrgggwrbbwwgugrrbwrrbwugrugrbrgbruurrwurburwburggbwwww\n" +
            "ugwwbrrrrbwgggggguwbwrwbwrbububgwgbwbuurugbwuburguwr\n" +
            "rbubbrwurbbbwwgbgwgrwbwuurrbggugbrgbuuwubguwgururrrbww\n" +
            "bbbwgrbrurggwbgwgbgrgwwrburwuwbrwguwrbgwbruuwgwrgggu\n" +
            "bwwwurwgwwbwgurwugrgbgrwwbrburbwrgggwrwurwbbrwrgrrwgww\n" +
            "uuugugugguwbuuugbugrbgbbwwgugbbwwwrrugrbbwguubwbbgrubruub\n" +
            "uuuggbgbugbruuuwbgwgurggbbgbwwwbwbwuugrurrugbrwbgw\n" +
            "wbwrgggbrrguuwbuwgrwggbwuwgwbgurbuubugwbuw\n" +
            "bggbuuwurwgbbubbwubwbugwrbugbggggrbwruwwgbrrwubwubugwwwbbg\n" +
            "uuugwbuurgbwwgurwrrwrbrrrgrgrwrbbbuuuuuguwgwwbrbbg\n" +
            "wbgurgurrrgwbwuwbuggwrgrwwuuburwuwwwgggruwwbugbbbg\n" +
            "gbrrruubbwgbuubgbgwrugubbgrwbubgbwwurwruubwgw\n" +
            "ggbubrwwbbuugurrgrgwrwrbbuuwrguwruubrrggrggbwguwgu\n" +
            "guwuwgggbubwwwbrwgbgrrbwuwrwruuubbguurwwwguuruwbgwwr\n" +
            "ubwugrurrguguwbuwggurbwwrggggbgrbuuuwwrurubwubgbgbwguguwg\n" +
            "gwbgubuuurguwggrrguubuwuwbbgwubrbuwuuwrwbguurrbbuwrrwrb\n" +
            "wrrrgwbgwwugrbuubgrrrruuwrgrwgrgrgggbrrurguugrubgwuwbgggwbbg\n" +
            "rrrgwuwubwurwgwrubuurgruwbrwuguubbbwrwrbbggwbwwbww\n" +
            "bwbbbggbwuwrgbbubrubrggrwurbwwbwuwuggrggrrbubg\n" +
            "gruwguuwbrwururrwuuugbggbgugwuguugwrbbggurrwrbubb\n" +
            "uggwuubrgugrgggrrwgrgrbgbrbgbwrwbggrwubwbbuu\n" +
            "ggrbbbgbwrgrwrurgrbgwbwbbrruruwgwrwbubgwwbwbwbuwwgburb\n" +
            "uwwwrwubrwguruwwbwggbrgbrbuburbururgggugrwgrrwgguugwbwwbgg\n" +
            "grrbbwwrgbbbubrwbbbuuruugwwgwrrbggurrbggwwwwrgbr\n" +
            "rgrubrbgguuugubwubrwuwuwgggurugrrubbrubwuurrgg\n" +
            "wwwgwburwrbrwbwwwruurrbgbggubrbruuwbwwbgbrrbgwrww\n" +
            "bubwbwrgrbuwrburwurgwgrwwbbwwgggbgggruuurggrbbg\n" +
            "rbuuwbgwgwbwwwwbbggrwugugggwbgbbgwurwbuwwuwuur\n" +
            "gurwrrubrgwgwgrgbrgrrbuwrbbuwggwbwrwbubwurguuwgwur\n" +
            "brgwrrrugrbgbbwruubwuguguugwbugbuwrgwrrwgurwwbrwwubwggwu\n" +
            "uuurbrrgbubwrwgrbgwbrubuuugguwgwbrwbrruuugu\n" +
            "gurrurwwuggruuwrgruwrbrwugrwwbbbwrgbugrrwbwwgbgburgbguwuw\n" +
            "rruurbbbwbgbrrrrbgrgwuwwgrugggwbuwubbuugbwb\n" +
            "urwuuuggugbbgrrgubbbrbururbggggrrubbbgwuuurbubbgbuwrurg\n" +
            "brwrugbwgbgbgwgwgwuwgggubrbbgbgurgubuwbbuu\n" +
            "uugbgggwbubwrugurbwuwrbguuurgwwbwrrrrgwruburbrgruwbwuuguwbbg\n" +
            "rwrbwubggrgggubwbwgwgbgrugbbwbugrgbrrgwrgrgbwuwruggugbggu\n" +
            "wgrgbrwbguwuurwuwgbuwwrbwuwubwgwrggurrrrbrwwbwubgwg\n" +
            "rrururggggrrrrrbbgubugwrwbgbuggbwugrwrwwgwbbbbrurbrgururgb\n" +
            "ugwwrubuwbuuwwbbrbbrwbwgurgwgugurubgbwgwruurbbwr\n" +
            "wbgrgbbubbuwwgwwuwrbbbgwuubrbguurgbrbbgbggg\n" +
            "grwwuguwbbrggwbbugrbbubwwwwuuurwbgwwrrwwwrrbrwrggw\n" +
            "ggrgugbgbrwgwgubwbrwuruwurubrurugwrgruubbbwruurwbbbg\n" +
            "rwbggbggbwgrgrrbuuwgbrrbwbubruubrgbwwburwbubrrgbgrgggubbrbbg\n" +
            "wrwurrwwrggwwbwrbuurbwwgurbrgrbbugguwbugrrwu\n" +
            "rgubggrubrggbbuuuwrwruurbrwugrwgguuburgurbuub\n" +
            "bgguggbgwwgrbbrbgbrruggwuuwwugwuwbrubbgbwuuggbbwrwguggrb\n" +
            "bgggubwbuuwgrgwrrwuruwwrugbugbwrrbgbrgwugugwwbbg\n" +
            "brruwubwugwuububwrbgbugurrruubggguwbubgrgwrgrrr\n" +
            "wwwbubrrubbugurwrruwwruubbgwwgrwugwbuggubwr\n" +
            "rwrggrrbugubguuggrwwrgwggruggrwugurwgubbg\n" +
            "wwbbubwwrrrguurugurgugrwbugrgruburwurubwrububbggg\n" +
            "gubrwbuwgrgbrbbubwbrrbrbbgrgbubrbwgubbbbg\n" +
            "guwrgburrbrugbwbwbrgwrwgbuugbbggwbguwuwwwubbg\n" +
            "ubwwwburwbwwuurubgrgwrrgwuwbrrrwuruubrurww\n" +
            "rgrgguubgrggwbrgrgbguuubbggrruwbrrruwruggrurwg\n" +
            "uwwgbgwugurubbrbgwurbwubwurrurgbrbrbburgbrbwrguwuw\n" +
            "rgwrgwwwrbruwrwbrgbbrbugbugugugururruwugburgbrwggruburbrb\n" +
            "gbbubbwbububwurggwbugrbwgbwbrwwubuwbuubuugbwbbrw\n" +
            "bwgggwrrguugbbgubuwwwubbgwrbrggrgggbrbwwww\n" +
            "wguwbuwuwrbburrgbburbwuuwbwrrgrurwrwbrgwugubugbbwgwgru\n" +
            "bbrbbwbbgwgrwbrwwgrwrrwrgwwwwgugruubbrbbbbg\n" +
            "rgrwuwrgwrgwbrururbbbgggguwwubggwrrbrururbbb\n" +
            "ggwugugbwggurrwgubrwurugrwgwgrgbbrruuurwugrwr\n" +
            "wrruugwwwrbgwbuurrubrwwubuugbgrbubgubbbg\n" +
            "wgwwgbubwuuwrbggwrrrbrwrbwwguwbwwruuguugurwruug\n" +
            "uuwggugubbgrguwgggwbbuwrgurgwubbrwbwgbgguurw\n" +
            "bwwrrwruwrwbbbwwgggrbrwuuguwbwuwurggguwrubrwwbwuwbbg\n" +
            "bbgwurwggbruwbgbbubbwgwgwbgwgwbuggrwwggguwrugwwrg\n" +
            "uwbwgguwrgrbrgbruubgrbrurburugrugubbburuwuguwgugrwrbg\n" +
            "wgrbrbrwubrgbubgbbbbbwrrgbgrrbgbrwggbgrwwubrbbrrurgruugu\n" +
            "ubwuurggrrrwbgubwwbgwguruurbwrwuruwwbwbgggbuwwwbgwug\n" +
            "bugbbrugwbrggbburubwrubgbrurugwbbwgwggrbbbg\n" +
            "rwruubgrurwrrbugrrubrrwuurwwbrubwrubbgwugrrwggbgurwb\n" +
            "gwggugrbrbrgbbrugbuwbugwrgbrwugbbbwuwwgwgub\n" +
            "rbuuwbbrbbbgwwuggrwwgrgurrwbbuugubwggbgbrwbbg\n" +
            "bugrubwgbbbubrwguuruwwwgrruwbrgurubuuwwburrgubgg\n" +
            "wwrbbuguguwwwuuurbwuuuuwuwwwurugugrbbgbbrwuugbwurbwurgb\n" +
            "rgruugwbgbggbugggrrgggrwugbruuwwwrwggbwwwuwbwwgwwrggbubbg\n" +
            "wuwrrgrbgwrggwwgrwbrurbwwrgrgrwuuuuubwururwggrrbrgubgwgug\n" +
            "wruwbuwgrgbrwugburrrbugrguggwbgrrbwrgugwrbbwbrbrw\n" +
            "uuwrgrbwrbwugwbbggwuwwuruurgwbbubbrrgggrgbrbwwrrurrgrguwbbg\n" +
            "wbuwrbuguwwbbubwrwbgbgrbwwuwruwwuurrrwurgwrwguwgrwur\n" +
            "ugubbwrgwgbbururbuguubwbwugrbbggubgwuwgbuuggw\n" +
            "uugwuuurrurgrugwgwbbwurggrbgugruurrruurgbuuw\n" +
            "gugwbgbwbuwwbuwgrubbbgurgugwubguruwrwwrgrbgbbwbg\n" +
            "wwurwurrrbwrgwurgwwuubrrgbbgbguuggbwuwbbbrggrbbg\n" +
            "rubrgwwuwbwubwgwuurrrbgwugwwrwubwugwwggrbrrwggruurbuwubu\n" +
            "rgurggrgruwrguwubwgrrwrrrubrrbuwwbwuwwwuwgb\n" +
            "ububwrwrubggwuggwrwuuwbwgbgwrguubruggbrgwbrrwug";
    ArrayList<Towel> patternsList;
    HashMap<Character, ArrayList<Towel>> patternStarters;
    ArrayList<String> display;


    public void read() {
        String[] lines = input.split("\n");
        display = new ArrayList<>();
        display.addAll(Arrays.asList(lines).subList(2, lines.length));
        patternStarters = new HashMap<>();
        patternStarters.put('w', new ArrayList<>());
        patternStarters.put('u', new ArrayList<>());
        patternStarters.put('b', new ArrayList<>());
        patternStarters.put('r', new ArrayList<>());
        patternStarters.put('g', new ArrayList<>());
        patternsList = new ArrayList<>();
        for (String s : lines[0].replaceAll(" ", "").split(",")) {
            patternsList.add(new Towel(s));

        }
        patternsList.sort((o1, o2) -> o2.colors.length() - o1.colors.length());
        for (Towel t : patternsList) {
            patternStarters.get(t.firstChar).add(t);
        }
    }

    public void part1() {
        input = "r, wr, b, g, bwu, rb, gb, br\n" + "\n" + "brwrr\n" + "bggr\n" + "gbbr\n" + "rrbgbr\n" + "ubwu\n" + "bwurrg\n" + "brgr\n" + "bbrgwb";
        read();
        int possible = 0;
        int possibleWays = 0;
        int i = 0;
        for (String disp : display) {
            System.out.println(i + " " + disp);
            int ans = start(disp);
            possibleWays += ans;
            if (ans > 0) {
                possible++;
            } else {
                System.out.println(" NOT OK");
            }
            i++;
        }
        System.out.println("Part1: possible arrangements: " + possible);
    }

    public int start(String disp) {
        int totalLength = disp.length();
        int position = 0;
        HashMap<Integer, ArrayList<Node>> distances = setup(disp, totalLength);
        ArrayList<Node> completingNodes = new ArrayList<>();
        if (distances.get(position).isEmpty()) {
            return 0;
        }
        int resets = 0;
        int maxResets = 100;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        Node last = null;
        Node current = null;
        while (!stack.isEmpty()) {
            position = stack.peek();
            last = current;
            current = getClosest(distances.get(position));
            if (current == null) {
                if (last == null) {
                    resets++;
                    if (position == 0 || resets > maxResets) {
                        break;
                    } else {
                        stack.clear();
                        stack.push(0);
                        current = null;
                        continue;
                    }
                }
                last.valid = false;
                stack.pop();
                continue;
            }
            if (current.nextPosition > totalLength) {
                current.valid = false;
                continue;
            }
            System.out.println(stack);
            System.out.print(current.asString() + " ");

            if (current.nextPosition == totalLength) {
                current.completes = true;
                completingNodes.add(current);
                break;
            }
            stack.push(current.nextPosition);
        }
        return completingNodes.size();
    }

    public Node getClosest(ArrayList<Node> nodes) {
        Integer minDist = Integer.MAX_VALUE;
        Node closest = null;
        for (Node node : nodes) {
            if (node.valid && node.distanceToFinish < minDist) {
                minDist = node.distanceToFinish;
                closest = node;
            }
        }
        return closest;
    }

    public HashMap<Integer, ArrayList<Node>> setup(String disp, int totalLength) {
        HashMap<Integer, ArrayList<Node>> distances = new HashMap<>();
        for (int distance = 0; distance < totalLength; distance++) {
            ArrayList<Node> nodes = new ArrayList<>();
            distances.put(distance, nodes);
            ArrayList<Towel> patterns = patternStarters.get(disp.charAt(distance));
            for (Towel pattern : patterns) {
                if (pattern.colors.length() + distance > totalLength) {
                    continue;
                }
                String slice = disp.substring(distance, distance + pattern.colors.length());
                if (slice.compareTo(pattern.colors) != 0) {
                    continue;
                }
                Node from = pattern.getNewNode();
                from.setPosition(distance);
                from.setDistanceToFinish(totalLength - distance);
                nodes.add(from);
            }
        }
        return distances;
    }

    public void part2() {
        read();
        int possible = 0;
        int possibleWays = 0;
        int i = 0;
        for (String disp : display) {
            System.out.println(i + " " + disp);
            int ans = startBacktrack(disp);
            possibleWays += ans;
            if (ans > 0) {
                possible++;
            } else {
                System.out.println(" NOT OK");
            }
            i++;
        }
        System.out.println("Part1: possible arrangements: " + possible);
        System.out.println("Part2: possible ways        : " + possibleWays);
    }

    public int startBacktrack(String disp) {
        int totalLength = disp.length();
        HashMap<Integer, ArrayList<Node>> distances = setup(disp, totalLength);
        ArrayList<Node> completingNodes = new ArrayList<>();
        if (distances.get(0).isEmpty()) {
            return 0;
        }
        Stack<Node> stack = new Stack<>();
        for (Node node : distances.get(0)) {
            stack.push(node);
        }
        Node current;
        while (!stack.isEmpty()) {
            current = stack.pop();
            if (current.nextPosition > totalLength) {
                current.valid = false;
                continue;
            }
            if (current.nextPosition == totalLength) {
                current.completes = true;
                completingNodes.add(current);
                continue;
            }
            for (Node node : distances.get(current.nextPosition)) {
                stack.push(node);
            }
        }
        return completingNodes.size();
    }
}
