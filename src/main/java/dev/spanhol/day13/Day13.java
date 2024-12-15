package dev.spanhol.day13;

import java.util.ArrayList;

public class Day13 {
    String input = "Button A: X+62, Y+54\n" +
            "Button B: X+19, Y+93\n" +
            "Prize: X=4094, Y=11058\n" +
            "\n" +
            "Button A: X+55, Y+93\n" +
            "Button B: X+83, Y+27\n" +
            "Prize: X=9995, Y=7833\n" +
            "\n" +
            "Button A: X+83, Y+31\n" +
            "Button B: X+21, Y+34\n" +
            "Prize: X=8042, Y=4233\n" +
            "\n" +
            "Button A: X+21, Y+11\n" +
            "Button B: X+11, Y+23\n" +
            "Prize: X=13963, Y=17749\n" +
            "\n" +
            "Button A: X+65, Y+97\n" +
            "Button B: X+83, Y+12\n" +
            "Prize: X=6919, Y=3278\n" +
            "\n" +
            "Button A: X+28, Y+17\n" +
            "Button B: X+16, Y+43\n" +
            "Prize: X=19828, Y=14869\n" +
            "\n" +
            "Button A: X+26, Y+12\n" +
            "Button B: X+40, Y+59\n" +
            "Prize: X=19660, Y=1040\n" +
            "\n" +
            "Button A: X+17, Y+80\n" +
            "Button B: X+77, Y+16\n" +
            "Prize: X=11125, Y=19344\n" +
            "\n" +
            "Button A: X+41, Y+77\n" +
            "Button B: X+97, Y+15\n" +
            "Prize: X=6430, Y=4386\n" +
            "\n" +
            "Button A: X+18, Y+58\n" +
            "Button B: X+68, Y+24\n" +
            "Prize: X=3136, Y=3276\n" +
            "\n" +
            "Button A: X+40, Y+39\n" +
            "Button B: X+21, Y+98\n" +
            "Prize: X=2893, Y=8480\n" +
            "\n" +
            "Button A: X+57, Y+11\n" +
            "Button B: X+42, Y+99\n" +
            "Prize: X=7356, Y=6237\n" +
            "\n" +
            "Button A: X+21, Y+61\n" +
            "Button B: X+72, Y+24\n" +
            "Prize: X=7049, Y=5889\n" +
            "\n" +
            "Button A: X+55, Y+21\n" +
            "Button B: X+20, Y+37\n" +
            "Prize: X=17600, Y=18892\n" +
            "\n" +
            "Button A: X+39, Y+79\n" +
            "Button B: X+51, Y+14\n" +
            "Prize: X=11165, Y=15493\n" +
            "\n" +
            "Button A: X+59, Y+97\n" +
            "Button B: X+35, Y+19\n" +
            "Prize: X=1331, Y=1957\n" +
            "\n" +
            "Button A: X+65, Y+21\n" +
            "Button B: X+23, Y+54\n" +
            "Prize: X=8456, Y=3041\n" +
            "\n" +
            "Button A: X+29, Y+52\n" +
            "Button B: X+42, Y+17\n" +
            "Prize: X=7340, Y=17904\n" +
            "\n" +
            "Button A: X+97, Y+15\n" +
            "Button B: X+78, Y+75\n" +
            "Prize: X=10291, Y=6060\n" +
            "\n" +
            "Button A: X+14, Y+48\n" +
            "Button B: X+49, Y+26\n" +
            "Prize: X=18015, Y=4490\n" +
            "\n" +
            "Button A: X+47, Y+16\n" +
            "Button B: X+38, Y+68\n" +
            "Prize: X=4834, Y=6688\n" +
            "\n" +
            "Button A: X+76, Y+19\n" +
            "Button B: X+16, Y+62\n" +
            "Prize: X=18040, Y=6100\n" +
            "\n" +
            "Button A: X+15, Y+43\n" +
            "Button B: X+44, Y+15\n" +
            "Prize: X=18354, Y=6234\n" +
            "\n" +
            "Button A: X+27, Y+73\n" +
            "Button B: X+63, Y+20\n" +
            "Prize: X=18080, Y=2029\n" +
            "\n" +
            "Button A: X+52, Y+78\n" +
            "Button B: X+73, Y+31\n" +
            "Prize: X=6369, Y=3823\n" +
            "\n" +
            "Button A: X+16, Y+55\n" +
            "Button B: X+33, Y+16\n" +
            "Prize: X=19647, Y=4165\n" +
            "\n" +
            "Button A: X+23, Y+17\n" +
            "Button B: X+37, Y+86\n" +
            "Prize: X=2569, Y=3893\n" +
            "\n" +
            "Button A: X+18, Y+57\n" +
            "Button B: X+70, Y+17\n" +
            "Prize: X=10998, Y=4825\n" +
            "\n" +
            "Button A: X+16, Y+31\n" +
            "Button B: X+61, Y+36\n" +
            "Prize: X=262, Y=11902\n" +
            "\n" +
            "Button A: X+48, Y+27\n" +
            "Button B: X+13, Y+43\n" +
            "Prize: X=6877, Y=7117\n" +
            "\n" +
            "Button A: X+13, Y+36\n" +
            "Button B: X+49, Y+27\n" +
            "Prize: X=5930, Y=12113\n" +
            "\n" +
            "Button A: X+62, Y+21\n" +
            "Button B: X+31, Y+76\n" +
            "Prize: X=3184, Y=1310\n" +
            "\n" +
            "Button A: X+55, Y+13\n" +
            "Button B: X+33, Y+83\n" +
            "Prize: X=11298, Y=1134\n" +
            "\n" +
            "Button A: X+68, Y+13\n" +
            "Button B: X+63, Y+92\n" +
            "Prize: X=2972, Y=888\n" +
            "\n" +
            "Button A: X+18, Y+24\n" +
            "Button B: X+71, Y+11\n" +
            "Prize: X=6903, Y=2427\n" +
            "\n" +
            "Button A: X+84, Y+17\n" +
            "Button B: X+40, Y+53\n" +
            "Prize: X=4860, Y=1253\n" +
            "\n" +
            "Button A: X+74, Y+39\n" +
            "Button B: X+17, Y+51\n" +
            "Prize: X=5051, Y=6797\n" +
            "\n" +
            "Button A: X+65, Y+18\n" +
            "Button B: X+24, Y+76\n" +
            "Prize: X=9457, Y=8214\n" +
            "\n" +
            "Button A: X+66, Y+22\n" +
            "Button B: X+14, Y+43\n" +
            "Prize: X=810, Y=14750\n" +
            "\n" +
            "Button A: X+12, Y+82\n" +
            "Button B: X+93, Y+70\n" +
            "Prize: X=3672, Y=9258\n" +
            "\n" +
            "Button A: X+63, Y+26\n" +
            "Button B: X+35, Y+56\n" +
            "Prize: X=3948, Y=3998\n" +
            "\n" +
            "Button A: X+51, Y+25\n" +
            "Button B: X+28, Y+54\n" +
            "Prize: X=3832, Y=4456\n" +
            "\n" +
            "Button A: X+24, Y+62\n" +
            "Button B: X+67, Y+33\n" +
            "Prize: X=14082, Y=8066\n" +
            "\n" +
            "Button A: X+33, Y+15\n" +
            "Button B: X+28, Y+54\n" +
            "Prize: X=4793, Y=1049\n" +
            "\n" +
            "Button A: X+58, Y+25\n" +
            "Button B: X+27, Y+60\n" +
            "Prize: X=5684, Y=3440\n" +
            "\n" +
            "Button A: X+51, Y+27\n" +
            "Button B: X+12, Y+33\n" +
            "Prize: X=6641, Y=12200\n" +
            "\n" +
            "Button A: X+91, Y+41\n" +
            "Button B: X+39, Y+93\n" +
            "Prize: X=9633, Y=11355\n" +
            "\n" +
            "Button A: X+16, Y+41\n" +
            "Button B: X+60, Y+19\n" +
            "Prize: X=11624, Y=17434\n" +
            "\n" +
            "Button A: X+23, Y+62\n" +
            "Button B: X+70, Y+33\n" +
            "Prize: X=6285, Y=5378\n" +
            "\n" +
            "Button A: X+63, Y+38\n" +
            "Button B: X+24, Y+52\n" +
            "Prize: X=18713, Y=4086\n" +
            "\n" +
            "Button A: X+92, Y+17\n" +
            "Button B: X+44, Y+96\n" +
            "Prize: X=6932, Y=9980\n" +
            "\n" +
            "Button A: X+92, Y+99\n" +
            "Button B: X+99, Y+17\n" +
            "Prize: X=9724, Y=2585\n" +
            "\n" +
            "Button A: X+95, Y+16\n" +
            "Button B: X+63, Y+62\n" +
            "Prize: X=11570, Y=5032\n" +
            "\n" +
            "Button A: X+49, Y+18\n" +
            "Button B: X+18, Y+28\n" +
            "Prize: X=5064, Y=2288\n" +
            "\n" +
            "Button A: X+35, Y+77\n" +
            "Button B: X+53, Y+14\n" +
            "Prize: X=16536, Y=13857\n" +
            "\n" +
            "Button A: X+14, Y+41\n" +
            "Button B: X+89, Y+71\n" +
            "Prize: X=8902, Y=8623\n" +
            "\n" +
            "Button A: X+49, Y+17\n" +
            "Button B: X+27, Y+70\n" +
            "Prize: X=18325, Y=2157\n" +
            "\n" +
            "Button A: X+20, Y+57\n" +
            "Button B: X+54, Y+18\n" +
            "Prize: X=19442, Y=3419\n" +
            "\n" +
            "Button A: X+11, Y+25\n" +
            "Button B: X+72, Y+42\n" +
            "Prize: X=8781, Y=6799\n" +
            "\n" +
            "Button A: X+20, Y+48\n" +
            "Button B: X+61, Y+37\n" +
            "Prize: X=10609, Y=5109\n" +
            "\n" +
            "Button A: X+19, Y+45\n" +
            "Button B: X+42, Y+12\n" +
            "Prize: X=253, Y=1835\n" +
            "\n" +
            "Button A: X+15, Y+48\n" +
            "Button B: X+64, Y+16\n" +
            "Prize: X=17517, Y=13728\n" +
            "\n" +
            "Button A: X+52, Y+13\n" +
            "Button B: X+25, Y+66\n" +
            "Prize: X=8798, Y=10188\n" +
            "\n" +
            "Button A: X+20, Y+46\n" +
            "Button B: X+51, Y+30\n" +
            "Prize: X=12086, Y=9494\n" +
            "\n" +
            "Button A: X+21, Y+58\n" +
            "Button B: X+63, Y+22\n" +
            "Prize: X=17063, Y=1590\n" +
            "\n" +
            "Button A: X+11, Y+39\n" +
            "Button B: X+75, Y+30\n" +
            "Prize: X=2732, Y=8453\n" +
            "\n" +
            "Button A: X+57, Y+26\n" +
            "Button B: X+26, Y+47\n" +
            "Prize: X=16605, Y=523\n" +
            "\n" +
            "Button A: X+64, Y+21\n" +
            "Button B: X+18, Y+80\n" +
            "Prize: X=2504, Y=5860\n" +
            "\n" +
            "Button A: X+83, Y+15\n" +
            "Button B: X+56, Y+57\n" +
            "Prize: X=4586, Y=4251\n" +
            "\n" +
            "Button A: X+33, Y+13\n" +
            "Button B: X+27, Y+58\n" +
            "Prize: X=12359, Y=17846\n" +
            "\n" +
            "Button A: X+19, Y+39\n" +
            "Button B: X+59, Y+19\n" +
            "Prize: X=7183, Y=19763\n" +
            "\n" +
            "Button A: X+17, Y+11\n" +
            "Button B: X+22, Y+49\n" +
            "Prize: X=9203, Y=17789\n" +
            "\n" +
            "Button A: X+28, Y+99\n" +
            "Button B: X+87, Y+11\n" +
            "Prize: X=2165, Y=6765\n" +
            "\n" +
            "Button A: X+69, Y+28\n" +
            "Button B: X+52, Y+70\n" +
            "Prize: X=10406, Y=8428\n" +
            "\n" +
            "Button A: X+30, Y+12\n" +
            "Button B: X+53, Y+76\n" +
            "Prize: X=13030, Y=14808\n" +
            "\n" +
            "Button A: X+17, Y+49\n" +
            "Button B: X+47, Y+28\n" +
            "Prize: X=9223, Y=9615\n" +
            "\n" +
            "Button A: X+33, Y+34\n" +
            "Button B: X+76, Y+15\n" +
            "Prize: X=2661, Y=1982\n" +
            "\n" +
            "Button A: X+19, Y+50\n" +
            "Button B: X+44, Y+15\n" +
            "Prize: X=8425, Y=17470\n" +
            "\n" +
            "Button A: X+80, Y+45\n" +
            "Button B: X+17, Y+65\n" +
            "Prize: X=3863, Y=4335\n" +
            "\n" +
            "Button A: X+27, Y+16\n" +
            "Button B: X+14, Y+28\n" +
            "Prize: X=8861, Y=17640\n" +
            "\n" +
            "Button A: X+32, Y+91\n" +
            "Button B: X+61, Y+52\n" +
            "Prize: X=5445, Y=10504\n" +
            "\n" +
            "Button A: X+13, Y+42\n" +
            "Button B: X+58, Y+38\n" +
            "Prize: X=6888, Y=14140\n" +
            "\n" +
            "Button A: X+25, Y+61\n" +
            "Button B: X+40, Y+11\n" +
            "Prize: X=1375, Y=16891\n" +
            "\n" +
            "Button A: X+11, Y+52\n" +
            "Button B: X+75, Y+29\n" +
            "Prize: X=4368, Y=12074\n" +
            "\n" +
            "Button A: X+22, Y+53\n" +
            "Button B: X+56, Y+29\n" +
            "Prize: X=7670, Y=8250\n" +
            "\n" +
            "Button A: X+32, Y+11\n" +
            "Button B: X+32, Y+68\n" +
            "Prize: X=7360, Y=16987\n" +
            "\n" +
            "Button A: X+18, Y+46\n" +
            "Button B: X+33, Y+16\n" +
            "Prize: X=3564, Y=2548\n" +
            "\n" +
            "Button A: X+11, Y+46\n" +
            "Button B: X+54, Y+32\n" +
            "Prize: X=10843, Y=10358\n" +
            "\n" +
            "Button A: X+60, Y+83\n" +
            "Button B: X+32, Y+13\n" +
            "Prize: X=16748, Y=18281\n" +
            "\n" +
            "Button A: X+32, Y+59\n" +
            "Button B: X+97, Y+19\n" +
            "Prize: X=6823, Y=6346\n" +
            "\n" +
            "Button A: X+96, Y+60\n" +
            "Button B: X+47, Y+94\n" +
            "Prize: X=9828, Y=10020\n" +
            "\n" +
            "Button A: X+12, Y+72\n" +
            "Button B: X+81, Y+86\n" +
            "Prize: X=3333, Y=8398\n" +
            "\n" +
            "Button A: X+59, Y+30\n" +
            "Button B: X+54, Y+97\n" +
            "Prize: X=7038, Y=5804\n" +
            "\n" +
            "Button A: X+21, Y+45\n" +
            "Button B: X+48, Y+27\n" +
            "Prize: X=12056, Y=269\n" +
            "\n" +
            "Button A: X+80, Y+31\n" +
            "Button B: X+30, Y+82\n" +
            "Prize: X=4020, Y=5921\n" +
            "\n" +
            "Button A: X+80, Y+35\n" +
            "Button B: X+25, Y+55\n" +
            "Prize: X=6620, Y=4130\n" +
            "\n" +
            "Button A: X+31, Y+18\n" +
            "Button B: X+13, Y+31\n" +
            "Prize: X=15898, Y=6859\n" +
            "\n" +
            "Button A: X+80, Y+30\n" +
            "Button B: X+20, Y+43\n" +
            "Prize: X=5820, Y=3283\n" +
            "\n" +
            "Button A: X+13, Y+27\n" +
            "Button B: X+34, Y+15\n" +
            "Prize: X=17252, Y=377\n" +
            "\n" +
            "Button A: X+49, Y+11\n" +
            "Button B: X+40, Y+76\n" +
            "Prize: X=16449, Y=15823\n" +
            "\n" +
            "Button A: X+92, Y+32\n" +
            "Button B: X+28, Y+48\n" +
            "Prize: X=7096, Y=2736\n" +
            "\n" +
            "Button A: X+22, Y+76\n" +
            "Button B: X+54, Y+13\n" +
            "Prize: X=19030, Y=18217\n" +
            "\n" +
            "Button A: X+98, Y+24\n" +
            "Button B: X+56, Y+62\n" +
            "Prize: X=1162, Y=864\n" +
            "\n" +
            "Button A: X+32, Y+80\n" +
            "Button B: X+72, Y+45\n" +
            "Prize: X=4448, Y=7340\n" +
            "\n" +
            "Button A: X+45, Y+16\n" +
            "Button B: X+14, Y+27\n" +
            "Prize: X=13215, Y=3378\n" +
            "\n" +
            "Button A: X+13, Y+25\n" +
            "Button B: X+34, Y+19\n" +
            "Prize: X=8660, Y=3962\n" +
            "\n" +
            "Button A: X+78, Y+32\n" +
            "Button B: X+12, Y+61\n" +
            "Prize: X=14312, Y=6693\n" +
            "\n" +
            "Button A: X+17, Y+72\n" +
            "Button B: X+53, Y+53\n" +
            "Prize: X=1650, Y=5445\n" +
            "\n" +
            "Button A: X+99, Y+51\n" +
            "Button B: X+12, Y+53\n" +
            "Prize: X=10587, Y=9293\n" +
            "\n" +
            "Button A: X+19, Y+62\n" +
            "Button B: X+72, Y+52\n" +
            "Prize: X=6359, Y=8310\n" +
            "\n" +
            "Button A: X+75, Y+31\n" +
            "Button B: X+13, Y+40\n" +
            "Prize: X=8828, Y=551\n" +
            "\n" +
            "Button A: X+64, Y+14\n" +
            "Button B: X+26, Y+42\n" +
            "Prize: X=6138, Y=3122\n" +
            "\n" +
            "Button A: X+23, Y+89\n" +
            "Button B: X+92, Y+15\n" +
            "Prize: X=10143, Y=5490\n" +
            "\n" +
            "Button A: X+19, Y+45\n" +
            "Button B: X+71, Y+52\n" +
            "Prize: X=1728, Y=1421\n" +
            "\n" +
            "Button A: X+72, Y+19\n" +
            "Button B: X+32, Y+62\n" +
            "Prize: X=8328, Y=4929\n" +
            "\n" +
            "Button A: X+15, Y+77\n" +
            "Button B: X+44, Y+11\n" +
            "Prize: X=16875, Y=8812\n" +
            "\n" +
            "Button A: X+13, Y+66\n" +
            "Button B: X+82, Y+31\n" +
            "Prize: X=10424, Y=874\n" +
            "\n" +
            "Button A: X+53, Y+27\n" +
            "Button B: X+36, Y+58\n" +
            "Prize: X=1610, Y=2010\n" +
            "\n" +
            "Button A: X+16, Y+82\n" +
            "Button B: X+71, Y+16\n" +
            "Prize: X=6923, Y=8694\n" +
            "\n" +
            "Button A: X+95, Y+73\n" +
            "Button B: X+13, Y+61\n" +
            "Prize: X=8506, Y=10464\n" +
            "\n" +
            "Button A: X+78, Y+23\n" +
            "Button B: X+12, Y+59\n" +
            "Prize: X=4266, Y=4031\n" +
            "\n" +
            "Button A: X+31, Y+87\n" +
            "Button B: X+71, Y+36\n" +
            "Prize: X=1330, Y=2100\n" +
            "\n" +
            "Button A: X+15, Y+55\n" +
            "Button B: X+38, Y+13\n" +
            "Prize: X=16129, Y=12049\n" +
            "\n" +
            "Button A: X+74, Y+18\n" +
            "Button B: X+14, Y+50\n" +
            "Prize: X=6380, Y=1904\n" +
            "\n" +
            "Button A: X+36, Y+19\n" +
            "Button B: X+13, Y+31\n" +
            "Prize: X=13245, Y=15500\n" +
            "\n" +
            "Button A: X+37, Y+16\n" +
            "Button B: X+18, Y+33\n" +
            "Prize: X=13068, Y=10692\n" +
            "\n" +
            "Button A: X+56, Y+20\n" +
            "Button B: X+29, Y+62\n" +
            "Prize: X=5211, Y=3462\n" +
            "\n" +
            "Button A: X+26, Y+59\n" +
            "Button B: X+45, Y+19\n" +
            "Prize: X=399, Y=7100\n" +
            "\n" +
            "Button A: X+52, Y+14\n" +
            "Button B: X+25, Y+77\n" +
            "Prize: X=2490, Y=9454\n" +
            "\n" +
            "Button A: X+42, Y+11\n" +
            "Button B: X+20, Y+36\n" +
            "Prize: X=9786, Y=1137\n" +
            "\n" +
            "Button A: X+61, Y+14\n" +
            "Button B: X+49, Y+93\n" +
            "Prize: X=6529, Y=7303\n" +
            "\n" +
            "Button A: X+27, Y+17\n" +
            "Button B: X+12, Y+41\n" +
            "Prize: X=11438, Y=1948\n" +
            "\n" +
            "Button A: X+53, Y+11\n" +
            "Button B: X+54, Y+88\n" +
            "Prize: X=5465, Y=5665\n" +
            "\n" +
            "Button A: X+15, Y+77\n" +
            "Button B: X+78, Y+18\n" +
            "Prize: X=4700, Y=10332\n" +
            "\n" +
            "Button A: X+11, Y+59\n" +
            "Button B: X+48, Y+19\n" +
            "Prize: X=15210, Y=9409\n" +
            "\n" +
            "Button A: X+16, Y+52\n" +
            "Button B: X+41, Y+17\n" +
            "Prize: X=8584, Y=11248\n" +
            "\n" +
            "Button A: X+56, Y+13\n" +
            "Button B: X+29, Y+68\n" +
            "Prize: X=2453, Y=17869\n" +
            "\n" +
            "Button A: X+35, Y+91\n" +
            "Button B: X+76, Y+17\n" +
            "Prize: X=3918, Y=6033\n" +
            "\n" +
            "Button A: X+77, Y+57\n" +
            "Button B: X+21, Y+50\n" +
            "Prize: X=5152, Y=6708\n" +
            "\n" +
            "Button A: X+91, Y+83\n" +
            "Button B: X+75, Y+12\n" +
            "Prize: X=12690, Y=8190\n" +
            "\n" +
            "Button A: X+14, Y+55\n" +
            "Button B: X+73, Y+19\n" +
            "Prize: X=11601, Y=15256\n" +
            "\n" +
            "Button A: X+50, Y+22\n" +
            "Button B: X+15, Y+90\n" +
            "Prize: X=5055, Y=5310\n" +
            "\n" +
            "Button A: X+18, Y+89\n" +
            "Button B: X+68, Y+44\n" +
            "Prize: X=3436, Y=7638\n" +
            "\n" +
            "Button A: X+39, Y+17\n" +
            "Button B: X+33, Y+62\n" +
            "Prize: X=3546, Y=5593\n" +
            "\n" +
            "Button A: X+12, Y+37\n" +
            "Button B: X+69, Y+37\n" +
            "Prize: X=14282, Y=9906\n" +
            "\n" +
            "Button A: X+63, Y+14\n" +
            "Button B: X+12, Y+59\n" +
            "Prize: X=13250, Y=17592\n" +
            "\n" +
            "Button A: X+36, Y+13\n" +
            "Button B: X+11, Y+27\n" +
            "Prize: X=2067, Y=13051\n" +
            "\n" +
            "Button A: X+20, Y+41\n" +
            "Button B: X+66, Y+12\n" +
            "Prize: X=5388, Y=3894\n" +
            "\n" +
            "Button A: X+20, Y+56\n" +
            "Button B: X+67, Y+13\n" +
            "Prize: X=19450, Y=8218\n" +
            "\n" +
            "Button A: X+78, Y+54\n" +
            "Button B: X+12, Y+79\n" +
            "Prize: X=1170, Y=6324\n" +
            "\n" +
            "Button A: X+90, Y+18\n" +
            "Button B: X+85, Y+85\n" +
            "Prize: X=3190, Y=2542\n" +
            "\n" +
            "Button A: X+41, Y+55\n" +
            "Button B: X+33, Y+11\n" +
            "Prize: X=4748, Y=13212\n" +
            "\n" +
            "Button A: X+14, Y+32\n" +
            "Button B: X+71, Y+43\n" +
            "Prize: X=7996, Y=7508\n" +
            "\n" +
            "Button A: X+21, Y+62\n" +
            "Button B: X+29, Y+12\n" +
            "Prize: X=9063, Y=14936\n" +
            "\n" +
            "Button A: X+22, Y+62\n" +
            "Button B: X+55, Y+16\n" +
            "Prize: X=2156, Y=4130\n" +
            "\n" +
            "Button A: X+59, Y+14\n" +
            "Button B: X+74, Y+83\n" +
            "Prize: X=12057, Y=8358\n" +
            "\n" +
            "Button A: X+14, Y+37\n" +
            "Button B: X+76, Y+19\n" +
            "Prize: X=5898, Y=2312\n" +
            "\n" +
            "Button A: X+91, Y+15\n" +
            "Button B: X+59, Y+69\n" +
            "Prize: X=3305, Y=1671\n" +
            "\n" +
            "Button A: X+15, Y+37\n" +
            "Button B: X+49, Y+36\n" +
            "Prize: X=7184, Y=9695\n" +
            "\n" +
            "Button A: X+20, Y+41\n" +
            "Button B: X+43, Y+18\n" +
            "Prize: X=463, Y=10089\n" +
            "\n" +
            "Button A: X+94, Y+44\n" +
            "Button B: X+30, Y+82\n" +
            "Prize: X=7600, Y=5868\n" +
            "\n" +
            "Button A: X+96, Y+13\n" +
            "Button B: X+32, Y+33\n" +
            "Prize: X=3424, Y=693\n" +
            "\n" +
            "Button A: X+36, Y+68\n" +
            "Button B: X+79, Y+14\n" +
            "Prize: X=7294, Y=4312\n" +
            "\n" +
            "Button A: X+20, Y+68\n" +
            "Button B: X+60, Y+23\n" +
            "Prize: X=8420, Y=15573\n" +
            "\n" +
            "Button A: X+27, Y+74\n" +
            "Button B: X+62, Y+17\n" +
            "Prize: X=3968, Y=16866\n" +
            "\n" +
            "Button A: X+73, Y+29\n" +
            "Button B: X+17, Y+45\n" +
            "Prize: X=3900, Y=5444\n" +
            "\n" +
            "Button A: X+27, Y+52\n" +
            "Button B: X+36, Y+12\n" +
            "Prize: X=693, Y=876\n" +
            "\n" +
            "Button A: X+37, Y+18\n" +
            "Button B: X+31, Y+51\n" +
            "Prize: X=6019, Y=18734\n" +
            "\n" +
            "Button A: X+29, Y+76\n" +
            "Button B: X+42, Y+13\n" +
            "Prize: X=11614, Y=2906\n" +
            "\n" +
            "Button A: X+14, Y+42\n" +
            "Button B: X+59, Y+35\n" +
            "Prize: X=18349, Y=11813\n" +
            "\n" +
            "Button A: X+68, Y+48\n" +
            "Button B: X+39, Y+92\n" +
            "Prize: X=6801, Y=9636\n" +
            "\n" +
            "Button A: X+25, Y+41\n" +
            "Button B: X+75, Y+35\n" +
            "Prize: X=7025, Y=4481\n" +
            "\n" +
            "Button A: X+64, Y+37\n" +
            "Button B: X+11, Y+21\n" +
            "Prize: X=6001, Y=11072\n" +
            "\n" +
            "Button A: X+58, Y+26\n" +
            "Button B: X+28, Y+70\n" +
            "Prize: X=6296, Y=7648\n" +
            "\n" +
            "Button A: X+14, Y+53\n" +
            "Button B: X+81, Y+42\n" +
            "Prize: X=6345, Y=17070\n" +
            "\n" +
            "Button A: X+14, Y+42\n" +
            "Button B: X+62, Y+18\n" +
            "Prize: X=2166, Y=18194\n" +
            "\n" +
            "Button A: X+20, Y+75\n" +
            "Button B: X+48, Y+33\n" +
            "Prize: X=2368, Y=5058\n" +
            "\n" +
            "Button A: X+25, Y+46\n" +
            "Button B: X+47, Y+19\n" +
            "Prize: X=13106, Y=17558\n" +
            "\n" +
            "Button A: X+44, Y+16\n" +
            "Button B: X+45, Y+82\n" +
            "Prize: X=3277, Y=2570\n" +
            "\n" +
            "Button A: X+86, Y+30\n" +
            "Button B: X+21, Y+91\n" +
            "Prize: X=4067, Y=8029\n" +
            "\n" +
            "Button A: X+31, Y+80\n" +
            "Button B: X+85, Y+38\n" +
            "Prize: X=4335, Y=7560\n" +
            "\n" +
            "Button A: X+61, Y+23\n" +
            "Button B: X+17, Y+47\n" +
            "Prize: X=4852, Y=2260\n" +
            "\n" +
            "Button A: X+60, Y+15\n" +
            "Button B: X+21, Y+57\n" +
            "Prize: X=13505, Y=1985\n" +
            "\n" +
            "Button A: X+36, Y+16\n" +
            "Button B: X+27, Y+43\n" +
            "Prize: X=16037, Y=9885\n" +
            "\n" +
            "Button A: X+46, Y+13\n" +
            "Button B: X+21, Y+66\n" +
            "Prize: X=13369, Y=6940\n" +
            "\n" +
            "Button A: X+14, Y+45\n" +
            "Button B: X+26, Y+16\n" +
            "Prize: X=9320, Y=13990\n" +
            "\n" +
            "Button A: X+14, Y+26\n" +
            "Button B: X+92, Y+25\n" +
            "Prize: X=8294, Y=4318\n" +
            "\n" +
            "Button A: X+53, Y+19\n" +
            "Button B: X+14, Y+26\n" +
            "Prize: X=16384, Y=10312\n" +
            "\n" +
            "Button A: X+52, Y+75\n" +
            "Button B: X+63, Y+26\n" +
            "Prize: X=6045, Y=2816\n" +
            "\n" +
            "Button A: X+15, Y+43\n" +
            "Button B: X+71, Y+23\n" +
            "Prize: X=16775, Y=9495\n" +
            "\n" +
            "Button A: X+69, Y+33\n" +
            "Button B: X+40, Y+99\n" +
            "Prize: X=6091, Y=4191\n" +
            "\n" +
            "Button A: X+99, Y+32\n" +
            "Button B: X+36, Y+51\n" +
            "Prize: X=7065, Y=5787\n" +
            "\n" +
            "Button A: X+47, Y+70\n" +
            "Button B: X+60, Y+26\n" +
            "Prize: X=2586, Y=2014\n" +
            "\n" +
            "Button A: X+91, Y+27\n" +
            "Button B: X+31, Y+68\n" +
            "Prize: X=8982, Y=8310\n" +
            "\n" +
            "Button A: X+93, Y+45\n" +
            "Button B: X+32, Y+62\n" +
            "Prize: X=2799, Y=1773\n" +
            "\n" +
            "Button A: X+19, Y+38\n" +
            "Button B: X+45, Y+13\n" +
            "Prize: X=13235, Y=531\n" +
            "\n" +
            "Button A: X+25, Y+44\n" +
            "Button B: X+59, Y+27\n" +
            "Prize: X=5501, Y=2843\n" +
            "\n" +
            "Button A: X+18, Y+36\n" +
            "Button B: X+68, Y+43\n" +
            "Prize: X=2396, Y=13667\n" +
            "\n" +
            "Button A: X+67, Y+31\n" +
            "Button B: X+16, Y+61\n" +
            "Prize: X=9339, Y=13839\n" +
            "\n" +
            "Button A: X+50, Y+18\n" +
            "Button B: X+59, Y+94\n" +
            "Prize: X=7668, Y=6544\n" +
            "\n" +
            "Button A: X+76, Y+12\n" +
            "Button B: X+56, Y+66\n" +
            "Prize: X=7032, Y=6426\n" +
            "\n" +
            "Button A: X+14, Y+37\n" +
            "Button B: X+65, Y+35\n" +
            "Prize: X=13499, Y=18892\n" +
            "\n" +
            "Button A: X+17, Y+35\n" +
            "Button B: X+21, Y+12\n" +
            "Prize: X=4779, Y=16569\n" +
            "\n" +
            "Button A: X+35, Y+41\n" +
            "Button B: X+83, Y+16\n" +
            "Prize: X=4487, Y=1276\n" +
            "\n" +
            "Button A: X+39, Y+37\n" +
            "Button B: X+95, Y+15\n" +
            "Prize: X=6688, Y=2814\n" +
            "\n" +
            "Button A: X+26, Y+55\n" +
            "Button B: X+35, Y+15\n" +
            "Prize: X=8743, Y=6110\n" +
            "\n" +
            "Button A: X+42, Y+34\n" +
            "Button B: X+22, Y+75\n" +
            "Prize: X=958, Y=2720\n" +
            "\n" +
            "Button A: X+67, Y+20\n" +
            "Button B: X+18, Y+60\n" +
            "Prize: X=14996, Y=6200\n" +
            "\n" +
            "Button A: X+13, Y+49\n" +
            "Button B: X+68, Y+33\n" +
            "Prize: X=17288, Y=1213\n" +
            "\n" +
            "Button A: X+13, Y+56\n" +
            "Button B: X+67, Y+31\n" +
            "Prize: X=4233, Y=3808\n" +
            "\n" +
            "Button A: X+65, Y+17\n" +
            "Button B: X+13, Y+45\n" +
            "Prize: X=7790, Y=14958\n" +
            "\n" +
            "Button A: X+42, Y+17\n" +
            "Button B: X+11, Y+44\n" +
            "Prize: X=18067, Y=5940\n" +
            "\n" +
            "Button A: X+14, Y+40\n" +
            "Button B: X+49, Y+11\n" +
            "Prize: X=5873, Y=4009\n" +
            "\n" +
            "Button A: X+70, Y+27\n" +
            "Button B: X+26, Y+42\n" +
            "Prize: X=9094, Y=6513\n" +
            "\n" +
            "Button A: X+58, Y+31\n" +
            "Button B: X+16, Y+30\n" +
            "Prize: X=2210, Y=10445\n" +
            "\n" +
            "Button A: X+38, Y+79\n" +
            "Button B: X+80, Y+54\n" +
            "Prize: X=10226, Y=10477\n" +
            "\n" +
            "Button A: X+61, Y+51\n" +
            "Button B: X+34, Y+96\n" +
            "Prize: X=1296, Y=1962\n" +
            "\n" +
            "Button A: X+66, Y+24\n" +
            "Button B: X+60, Y+83\n" +
            "Prize: X=5970, Y=7249\n" +
            "\n" +
            "Button A: X+77, Y+33\n" +
            "Button B: X+15, Y+56\n" +
            "Prize: X=5348, Y=10861\n" +
            "\n" +
            "Button A: X+97, Y+16\n" +
            "Button B: X+15, Y+75\n" +
            "Prize: X=3718, Y=2644\n" +
            "\n" +
            "Button A: X+18, Y+66\n" +
            "Button B: X+57, Y+23\n" +
            "Prize: X=1331, Y=461\n" +
            "\n" +
            "Button A: X+86, Y+19\n" +
            "Button B: X+11, Y+68\n" +
            "Prize: X=11493, Y=13480\n" +
            "\n" +
            "Button A: X+58, Y+19\n" +
            "Button B: X+27, Y+65\n" +
            "Prize: X=4463, Y=3989\n" +
            "\n" +
            "Button A: X+22, Y+99\n" +
            "Button B: X+58, Y+47\n" +
            "Prize: X=4658, Y=9619\n" +
            "\n" +
            "Button A: X+41, Y+77\n" +
            "Button B: X+83, Y+15\n" +
            "Prize: X=3826, Y=5354\n" +
            "\n" +
            "Button A: X+61, Y+87\n" +
            "Button B: X+88, Y+23\n" +
            "Prize: X=9185, Y=7872\n" +
            "\n" +
            "Button A: X+29, Y+85\n" +
            "Button B: X+92, Y+70\n" +
            "Prize: X=1756, Y=3350\n" +
            "\n" +
            "Button A: X+34, Y+14\n" +
            "Button B: X+34, Y+53\n" +
            "Prize: X=9560, Y=6383\n" +
            "\n" +
            "Button A: X+58, Y+22\n" +
            "Button B: X+27, Y+57\n" +
            "Prize: X=3229, Y=11191\n" +
            "\n" +
            "Button A: X+23, Y+11\n" +
            "Button B: X+24, Y+63\n" +
            "Prize: X=17926, Y=17857\n" +
            "\n" +
            "Button A: X+13, Y+73\n" +
            "Button B: X+99, Y+22\n" +
            "Prize: X=979, Y=1760\n" +
            "\n" +
            "Button A: X+85, Y+14\n" +
            "Button B: X+69, Y+68\n" +
            "Prize: X=3893, Y=1604\n" +
            "\n" +
            "Button A: X+35, Y+70\n" +
            "Button B: X+48, Y+13\n" +
            "Prize: X=13198, Y=8123\n" +
            "\n" +
            "Button A: X+19, Y+48\n" +
            "Button B: X+41, Y+17\n" +
            "Prize: X=12712, Y=4069\n" +
            "\n" +
            "Button A: X+76, Y+29\n" +
            "Button B: X+74, Y+98\n" +
            "Prize: X=2248, Y=1974\n" +
            "\n" +
            "Button A: X+18, Y+60\n" +
            "Button B: X+36, Y+33\n" +
            "Prize: X=4716, Y=7716\n" +
            "\n" +
            "Button A: X+13, Y+38\n" +
            "Button B: X+35, Y+21\n" +
            "Prize: X=15360, Y=18553\n" +
            "\n" +
            "Button A: X+30, Y+86\n" +
            "Button B: X+79, Y+47\n" +
            "Prize: X=8027, Y=8115\n" +
            "\n" +
            "Button A: X+29, Y+11\n" +
            "Button B: X+43, Y+59\n" +
            "Prize: X=9067, Y=12323\n" +
            "\n" +
            "Button A: X+37, Y+12\n" +
            "Button B: X+13, Y+37\n" +
            "Prize: X=5632, Y=200\n" +
            "\n" +
            "Button A: X+83, Y+20\n" +
            "Button B: X+19, Y+72\n" +
            "Prize: X=6469, Y=6548\n" +
            "\n" +
            "Button A: X+65, Y+20\n" +
            "Button B: X+21, Y+61\n" +
            "Prize: X=16475, Y=4040\n" +
            "\n" +
            "Button A: X+44, Y+14\n" +
            "Button B: X+36, Y+78\n" +
            "Prize: X=5748, Y=16506\n" +
            "\n" +
            "Button A: X+30, Y+11\n" +
            "Button B: X+20, Y+57\n" +
            "Prize: X=14450, Y=18684\n" +
            "\n" +
            "Button A: X+67, Y+19\n" +
            "Button B: X+22, Y+72\n" +
            "Prize: X=13334, Y=18046\n" +
            "\n" +
            "Button A: X+44, Y+46\n" +
            "Button B: X+85, Y+16\n" +
            "Prize: X=4389, Y=2184\n" +
            "\n" +
            "Button A: X+61, Y+28\n" +
            "Button B: X+24, Y+62\n" +
            "Prize: X=9152, Y=946\n" +
            "\n" +
            "Button A: X+62, Y+11\n" +
            "Button B: X+30, Y+63\n" +
            "Prize: X=6224, Y=5084\n" +
            "\n" +
            "Button A: X+60, Y+33\n" +
            "Button B: X+15, Y+28\n" +
            "Prize: X=16985, Y=17028\n" +
            "\n" +
            "Button A: X+17, Y+45\n" +
            "Button B: X+45, Y+26\n" +
            "Prize: X=12775, Y=255\n" +
            "\n" +
            "Button A: X+32, Y+52\n" +
            "Button B: X+39, Y+14\n" +
            "Prize: X=16202, Y=7912\n" +
            "\n" +
            "Button A: X+51, Y+11\n" +
            "Button B: X+90, Y+96\n" +
            "Prize: X=2856, Y=1918\n" +
            "\n" +
            "Button A: X+55, Y+14\n" +
            "Button B: X+21, Y+59\n" +
            "Prize: X=7579, Y=18566\n" +
            "\n" +
            "Button A: X+20, Y+45\n" +
            "Button B: X+47, Y+32\n" +
            "Prize: X=6786, Y=15691\n" +
            "\n" +
            "Button A: X+83, Y+59\n" +
            "Button B: X+11, Y+83\n" +
            "Prize: X=1447, Y=4111\n" +
            "\n" +
            "Button A: X+70, Y+23\n" +
            "Button B: X+16, Y+59\n" +
            "Prize: X=14404, Y=585\n" +
            "\n" +
            "Button A: X+20, Y+50\n" +
            "Button B: X+55, Y+28\n" +
            "Prize: X=9160, Y=1204\n" +
            "\n" +
            "Button A: X+68, Y+55\n" +
            "Button B: X+12, Y+42\n" +
            "Prize: X=3188, Y=3838\n" +
            "\n" +
            "Button A: X+69, Y+80\n" +
            "Button B: X+11, Y+89\n" +
            "Prize: X=5158, Y=6819\n" +
            "\n" +
            "Button A: X+29, Y+61\n" +
            "Button B: X+55, Y+13\n" +
            "Prize: X=3197, Y=8483\n" +
            "\n" +
            "Button A: X+74, Y+25\n" +
            "Button B: X+11, Y+56\n" +
            "Prize: X=12703, Y=15991\n" +
            "\n" +
            "Button A: X+60, Y+15\n" +
            "Button B: X+42, Y+95\n" +
            "Prize: X=4998, Y=9615\n" +
            "\n" +
            "Button A: X+23, Y+32\n" +
            "Button B: X+87, Y+34\n" +
            "Prize: X=10409, Y=6300\n" +
            "\n" +
            "Button A: X+11, Y+44\n" +
            "Button B: X+71, Y+24\n" +
            "Prize: X=13268, Y=17872\n" +
            "\n" +
            "Button A: X+13, Y+60\n" +
            "Button B: X+63, Y+22\n" +
            "Prize: X=6522, Y=5106\n" +
            "\n" +
            "Button A: X+87, Y+32\n" +
            "Button B: X+11, Y+66\n" +
            "Prize: X=4834, Y=4504\n" +
            "\n" +
            "Button A: X+55, Y+22\n" +
            "Button B: X+21, Y+52\n" +
            "Prize: X=11757, Y=2214\n" +
            "\n" +
            "Button A: X+28, Y+69\n" +
            "Button B: X+37, Y+13\n" +
            "Prize: X=3138, Y=17965\n" +
            "\n" +
            "Button A: X+77, Y+13\n" +
            "Button B: X+19, Y+30\n" +
            "Prize: X=4100, Y=2782\n" +
            "\n" +
            "Button A: X+29, Y+55\n" +
            "Button B: X+49, Y+27\n" +
            "Prize: X=17241, Y=12611\n" +
            "\n" +
            "Button A: X+23, Y+13\n" +
            "Button B: X+23, Y+75\n" +
            "Prize: X=3427, Y=7703\n" +
            "\n" +
            "Button A: X+43, Y+32\n" +
            "Button B: X+17, Y+55\n" +
            "Prize: X=907, Y=1649\n" +
            "\n" +
            "Button A: X+20, Y+71\n" +
            "Button B: X+65, Y+39\n" +
            "Prize: X=6270, Y=5768\n" +
            "\n" +
            "Button A: X+11, Y+58\n" +
            "Button B: X+81, Y+17\n" +
            "Prize: X=330, Y=17911\n" +
            "\n" +
            "Button A: X+22, Y+31\n" +
            "Button B: X+54, Y+16\n" +
            "Prize: X=4142, Y=1570\n" +
            "\n" +
            "Button A: X+25, Y+79\n" +
            "Button B: X+68, Y+12\n" +
            "Prize: X=19174, Y=458\n" +
            "\n" +
            "Button A: X+15, Y+55\n" +
            "Button B: X+47, Y+18\n" +
            "Prize: X=6941, Y=19714\n" +
            "\n" +
            "Button A: X+60, Y+30\n" +
            "Button B: X+48, Y+77\n" +
            "Prize: X=4812, Y=5533\n" +
            "\n" +
            "Button A: X+71, Y+48\n" +
            "Button B: X+15, Y+61\n" +
            "Prize: X=2520, Y=3026\n" +
            "\n" +
            "Button A: X+26, Y+12\n" +
            "Button B: X+18, Y+29\n" +
            "Prize: X=3506, Y=16969\n" +
            "\n" +
            "Button A: X+16, Y+80\n" +
            "Button B: X+82, Y+39\n" +
            "Prize: X=8130, Y=10599\n" +
            "\n" +
            "Button A: X+32, Y+79\n" +
            "Button B: X+89, Y+36\n" +
            "Prize: X=8654, Y=4095\n" +
            "\n" +
            "Button A: X+28, Y+75\n" +
            "Button B: X+85, Y+60\n" +
            "Prize: X=2856, Y=2955\n" +
            "\n" +
            "Button A: X+91, Y+51\n" +
            "Button B: X+20, Y+68\n" +
            "Prize: X=9032, Y=6936\n" +
            "\n" +
            "Button A: X+36, Y+80\n" +
            "Button B: X+43, Y+12\n" +
            "Prize: X=14547, Y=14252\n" +
            "\n" +
            "Button A: X+95, Y+16\n" +
            "Button B: X+25, Y+23\n" +
            "Prize: X=2855, Y=1627\n" +
            "\n" +
            "Button A: X+46, Y+23\n" +
            "Button B: X+49, Y+93\n" +
            "Prize: X=2124, Y=2295\n" +
            "\n" +
            "Button A: X+27, Y+84\n" +
            "Button B: X+53, Y+11\n" +
            "Prize: X=10279, Y=17893\n" +
            "\n" +
            "Button A: X+19, Y+55\n" +
            "Button B: X+42, Y+23\n" +
            "Prize: X=12761, Y=2299\n" +
            "\n" +
            "Button A: X+50, Y+66\n" +
            "Button B: X+75, Y+30\n" +
            "Prize: X=1550, Y=1770\n" +
            "\n" +
            "Button A: X+27, Y+95\n" +
            "Button B: X+85, Y+17\n" +
            "Prize: X=3986, Y=3306\n" +
            "\n" +
            "Button A: X+95, Y+49\n" +
            "Button B: X+19, Y+85\n" +
            "Prize: X=8056, Y=7088\n" +
            "\n" +
            "Button A: X+49, Y+68\n" +
            "Button B: X+88, Y+34\n" +
            "Prize: X=3014, Y=2244\n" +
            "\n" +
            "Button A: X+46, Y+30\n" +
            "Button B: X+17, Y+41\n" +
            "Prize: X=13436, Y=18172\n" +
            "\n" +
            "Button A: X+69, Y+28\n" +
            "Button B: X+23, Y+60\n" +
            "Prize: X=5566, Y=3576\n" +
            "\n" +
            "Button A: X+44, Y+54\n" +
            "Button B: X+12, Y+82\n" +
            "Prize: X=4236, Y=11186\n" +
            "\n" +
            "Button A: X+11, Y+64\n" +
            "Button B: X+79, Y+24\n" +
            "Prize: X=13813, Y=11296\n" +
            "\n" +
            "Button A: X+68, Y+68\n" +
            "Button B: X+13, Y+93\n" +
            "Prize: X=1895, Y=3095\n" +
            "\n" +
            "Button A: X+45, Y+17\n" +
            "Button B: X+44, Y+77\n" +
            "Prize: X=284, Y=19673\n" +
            "\n" +
            "Button A: X+68, Y+14\n" +
            "Button B: X+67, Y+78\n" +
            "Prize: X=8070, Y=7440\n" +
            "\n" +
            "Button A: X+73, Y+11\n" +
            "Button B: X+21, Y+95\n" +
            "Prize: X=1919, Y=7085\n" +
            "\n" +
            "Button A: X+26, Y+72\n" +
            "Button B: X+97, Y+35\n" +
            "Prize: X=2263, Y=3697\n" +
            "\n" +
            "Button A: X+33, Y+13\n" +
            "Button B: X+36, Y+51\n" +
            "Prize: X=17687, Y=14407\n" +
            "\n" +
            "Button A: X+62, Y+35\n" +
            "Button B: X+31, Y+60\n" +
            "Prize: X=15832, Y=16295\n" +
            "\n" +
            "Button A: X+62, Y+29\n" +
            "Button B: X+36, Y+89\n" +
            "Prize: X=8392, Y=10059\n" +
            "\n" +
            "Button A: X+55, Y+28\n" +
            "Button B: X+48, Y+91\n" +
            "Prize: X=6081, Y=8554\n" +
            "\n" +
            "Button A: X+13, Y+34\n" +
            "Button B: X+84, Y+42\n" +
            "Prize: X=2351, Y=3128\n" +
            "\n" +
            "Button A: X+14, Y+31\n" +
            "Button B: X+47, Y+30\n" +
            "Prize: X=13965, Y=6961\n" +
            "\n" +
            "Button A: X+88, Y+74\n" +
            "Button B: X+15, Y+63\n" +
            "Prize: X=7553, Y=10735\n" +
            "\n" +
            "Button A: X+70, Y+20\n" +
            "Button B: X+55, Y+77\n" +
            "Prize: X=11750, Y=9118\n" +
            "\n" +
            "Button A: X+43, Y+61\n" +
            "Button B: X+35, Y+15\n" +
            "Prize: X=5417, Y=8049\n" +
            "\n" +
            "Button A: X+46, Y+25\n" +
            "Button B: X+28, Y+52\n" +
            "Prize: X=4390, Y=3379\n" +
            "\n" +
            "Button A: X+25, Y+57\n" +
            "Button B: X+50, Y+13\n" +
            "Prize: X=2025, Y=3102\n" +
            "\n" +
            "Button A: X+62, Y+13\n" +
            "Button B: X+24, Y+64\n" +
            "Prize: X=1698, Y=1023\n" +
            "\n" +
            "Button A: X+16, Y+71\n" +
            "Button B: X+61, Y+19\n" +
            "Prize: X=5497, Y=4908\n" +
            "\n" +
            "Button A: X+23, Y+97\n" +
            "Button B: X+35, Y+20\n" +
            "Prize: X=3969, Y=10486\n" +
            "\n" +
            "Button A: X+96, Y+24\n" +
            "Button B: X+71, Y+71\n" +
            "Prize: X=5168, Y=2144\n" +
            "\n" +
            "Button A: X+44, Y+73\n" +
            "Button B: X+33, Y+11\n" +
            "Prize: X=15511, Y=6412\n" +
            "\n" +
            "Button A: X+42, Y+23\n" +
            "Button B: X+17, Y+40\n" +
            "Prize: X=1178, Y=2018\n" +
            "\n" +
            "Button A: X+44, Y+95\n" +
            "Button B: X+47, Y+32\n" +
            "Prize: X=7163, Y=9560";
    ArrayList<ClawMachine> clawMachines = new ArrayList<>();

    public void read() {
        String[] lines = input.split("\n");
        for (int i = 0; i < lines.length; i += 4) {
            int buttonAx = Integer.parseInt(lines[i].substring(lines[i].indexOf("X+") + 1, lines[i].indexOf(",")));
            int buttonAy = Integer.parseInt(lines[i].substring(lines[i].indexOf("Y+") + 1));
            int buttonBx = Integer.parseInt(lines[i + 1].substring(lines[i + 1].indexOf("X+") + 1, lines[i + 1].indexOf(",")));
            int buttonBy = Integer.parseInt(lines[i + 1].substring(lines[i + 1].indexOf("Y+") + 1));
            int prizeX = Integer.parseInt(lines[i + 2].substring(lines[i + 2].indexOf("X=") + 2, lines[i + 2].indexOf(",")));
            int prizeY = Integer.parseInt(lines[i + 2].substring(lines[i + 2].indexOf("Y=") + 2));
            ClawMachine claw = new ClawMachine(buttonAx, buttonAy, buttonBx, buttonBy, prizeX, prizeY);
            clawMachines.add(claw);
        }

    }

    public void part1() {
//        input = "Button A: X+94, Y+34\n" + "Button B: X+22, Y+67\n" + "Prize: X=8400, Y=5400\n" + "\n" + "Button A: X+26, Y+66\n" + "Button B: X+67, Y+21\n" + "Prize: X=12748, Y=12176\n" + "\n" + "Button A: X+17, Y+86\n" + "Button B: X+84, Y+37\n" + "Prize: X=7870, Y=6450\n" + "\n" + "Button A: X+69, Y+23\n" + "Button B: X+27, Y+71\n" + "Prize: X=18641, Y=10279";
        read();

        int totalCost = 0;
        for (ClawMachine clawMachine : clawMachines) {
            clawMachine.reset();
            boolean valid = false;

//        int rateAx = c.aX / 3;
//        int rateAy = c.aY / 3;
//        boolean aXRateIsBigger = rateAx > c.bX;
//        boolean aYRateIsBigger = rateAy > c.bY;

            //start at a random number of presses
            int apress = 50;
            int bpress = 50;
            clawMachine.setaPresses(apress);
            clawMachine.setbPresses(bpress);
            double dax = (((double) clawMachine.getXDistanceToPrize() / clawMachine.getaX()) * -1) + apress;
            double day = (((double) clawMachine.getYDistanceToPrize() / clawMachine.getaY()) * -1) + apress;
            double dbx = (((double) clawMachine.getXDistanceToPrize() / clawMachine.getbX()) * -1) + bpress;
            double dby = (((double) clawMachine.getYDistanceToPrize() / clawMachine.getbY()) * -1) + bpress;

            boolean daxdby = true;
            //
            if (dax > 0 && dax < 100 && dby > 0 && dby < 100) {
                daxdby = true;
            } else if (dbx > 0 && dbx < 100 && day > 0 && day < 100) {
                daxdby = false;
            } else {
                System.out.println("none");
            }
            int turn = -1;
            int turns = -1;

            while (!valid) {
                turns++;
                if (turns > 200) {
                    break;
                }
                turn = turns % 2;
                dax = (((double) clawMachine.getXDistanceToPrize() / clawMachine.getaX()) * -1) + apress;
                day = (((double) clawMachine.getYDistanceToPrize() / clawMachine.getaY()) * -1) + apress;
                dbx = (((double) clawMachine.getXDistanceToPrize() / clawMachine.getbX()) * -1) + bpress;
                dby = (((double) clawMachine.getYDistanceToPrize() / clawMachine.getbY()) * -1) + bpress;
                System.out.println("DA: " + dax + "," + dby);
                System.out.println("DB: " + dbx + "," + day);
                System.out.println(clawMachine);
                if (clawMachine.getXDistanceToPrize() == 0 && clawMachine.getYDistanceToPrize() == 0) {
                    valid = true;
                    break;
                }
//                if (dax > 0 && dax < 100 && dby > 0 && dby < 100) {
//                    daxdby = true;
//                } else if (dbx > 0 && dbx < 100 && day > 0 && day < 100) {
//                    daxdby = false;
//                } else {
//                    System.out.println("none");
//                    break;
//                }
                if (daxdby) {
                    if (turn == 0 && dax > 0 && dax < 100) {
                        apress = (int) Math.round(dax);
                        clawMachine.setaPresses(apress);
                    }
                    if (turn == 1 && dby > 0 && dby < 100) {
                        bpress = (int) Math.round(dby);
                        clawMachine.setbPresses(bpress);
                    }
                } else {
                    if (turn == 0 && dbx > 0 && dbx < 100) {
                        bpress = (int) Math.round(dbx);
                        clawMachine.setbPresses(bpress);
                    }
                    if (turn == 1 && day > 0 && day < 100) {
                        apress = (int) Math.round(day);
                        clawMachine.setaPresses(apress);
                    }
                }
            }
            if (valid) {
                totalCost += clawMachine.getTokenCost();
            }
            System.out.println(totalCost);
        }
    }

    public void part2() {

    }
}
