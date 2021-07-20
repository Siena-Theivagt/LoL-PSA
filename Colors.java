/**
 * Colors.java  01/02/15
 *
 * @author - Eve Juarez
 * @author - Period 0
 * @author - Id 212345|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from no one.
 *
 */

import java.awt.Color;

public class Colors
{
/*
  Predefine some color objects...  Data was liberally borrowed from the
  Open Group's X11 rbg.txt file

  $XConsortium: rgb.txt,v 10.41 94/02/20 18:39:36 rws Exp 
*/

   public static final Color SNOW = new Color(255, 250, 250);
   public static final Color GHOSTWHITE = new Color(248, 248, 255);
   public static final Color WHITESMOKE = new Color(245, 245, 245);
   public static final Color GAINSBORO = new Color(220, 220, 220);
   public static final Color FLORALWHITE = new Color(255, 250, 240);
   public static final Color OLDLACE = new Color(253, 245, 230);
   public static final Color LINEN = new Color(250, 240, 230);
   public static final Color ANTIQUEWHITE = new Color(250, 235, 215);
   public static final Color PAPAYAWHIP = new Color(255, 239, 213);
   public static final Color BLANCHEDALMOND = new Color(255, 235, 205);
   public static final Color BISQUE = new Color(255, 228, 196);
   public static final Color PEACHPUFF = new Color(255, 218, 185);
   public static final Color NAVAJOWHITE = new Color(255, 222, 173);
   public static final Color MOCCASIN = new Color(255, 228, 181);
   public static final Color CORNSILK = new Color(255, 248, 220);
   public static final Color IVORY = new Color(255, 255, 240);
   public static final Color LEMONCHIFFON = new Color(255, 250, 205);
   public static final Color SEASHELL = new Color(255, 245, 238);
   public static final Color HONEYDEW = new Color(240, 255, 240);
   public static final Color MINTCREAM = new Color(245, 255, 250);
   public static final Color AZURE = new Color(240, 255, 255);
   public static final Color ALICEBLUE = new Color(240, 248, 255);
   public static final Color LAVENDER = new Color(230, 230, 250);
   public static final Color MISTYROSE = new Color(255, 228, 225);
   public static final Color WHITE = new Color(255, 255, 255);
   public static final Color BLACK = new Color(0, 0, 0);
//public static final Color DARKSLATEGREY = new Color(47, 79, 79);
   public static final Color DIMGRAY = new Color(105, 105, 105);
   public static final Color DIMGREY = new Color(105, 105, 105);
   public static final Color SLATEGRAY = new Color(112, 128, 144);
   public static final Color SLATEGREY = new Color(112, 128, 144);
   public static final Color LIGHTSLATEGRAY = new Color(119, 136, 153);
   public static final Color LIGHTSLATEGREY = new Color(119, 136, 153);
   public static final Color GRAY = new Color(190, 190, 190);
   public static final Color GREY = new Color(190, 190, 190);
   public static final Color LIGHTGREY = new Color(211, 211, 211);
   public static final Color MIDNIGHTBLUE = new Color(25, 25, 112);
   public static final Color NAVY = new Color(0, 0, 128);
   public static final Color NAVYBLUE = new Color(0, 0, 128);
   public static final Color CORNFLOWERBLUE = new Color(100, 149, 237);
   public static final Color DARKSLATEBLUE = new Color(72, 61, 139);
   public static final Color SLATEBLUE = new Color(106, 90, 205);
   public static final Color MEDIUMSLATEBLUE = new Color(123, 104, 238);
   public static final Color LIGHTSLATEBLUE = new Color(132, 112, 255);
   public static final Color MEDIUMBLUE = new Color(0, 0, 205);
   public static final Color ROYALBLUE = new Color(65, 105, 225);
   public static final Color BLUE = new Color(0, 0, 255);
   public static final Color DODGERBLUE = new Color(30, 144, 255);
   public static final Color DEEPSKYBLUE = new Color(0, 191, 255);
   public static final Color SKYBLUE = new Color(135, 206, 235);
   public static final Color LIGHTSKYBLUE = new Color(135, 206, 250);
   public static final Color STEELBLUE = new Color(70, 130, 180);
   public static final Color LIGHTSTEELBLUE = new Color(176, 196, 222);
   public static final Color LIGHTBLUE = new Color(173, 216, 230);
   public static final Color POWDERBLUE = new Color(176, 224, 230);
   public static final Color PALETURQUOISE = new Color(175, 238, 238);
   public static final Color DARKTURQUOISE = new Color(0, 206, 209);
   public static final Color MEDIUMTURQUOISE = new Color(72, 209, 204);
   public static final Color TURQUOISE = new Color(64, 224, 208);
   public static final Color CYAN = new Color(0, 255, 255);
   public static final Color LIGHTCYAN = new Color(224, 255, 255);
   public static final Color CADETBLUE = new Color(70, 164, 255);
   public static final Color MEDIUMAQUAMARINE = new Color(102, 205, 170);
   public static final Color AQUAMARINE = new Color(127, 255, 212);
   public static final Color DARKGREEN = new Color(0, 100, 0);
   public static final Color DARKOLIVEGREEN = new Color(85, 107, 47);
   public static final Color DARKSEAGREEN = new Color(143, 188, 143);
   public static final Color SEAGREEN = new Color(46, 139, 87);
   public static final Color MEDIUMSEAGREEN = new Color(60, 179, 113);
   public static final Color LIGHTSEAGREEN = new Color(32, 178, 170);
   public static final Color PALEGREEN = new Color(152, 251, 152);
   public static final Color SPRINGGREEN = new Color(0, 255, 127);
   public static final Color LAWNGREEN = new Color(124, 252, 0);
   public static final Color CHARTREUSE = new Color(127, 255, 0);
   public static final Color MEDIUMSPRINGGREEN = new Color(0, 250, 154);
   public static final Color GREENYELLOW = new Color(173, 255, 47);
   public static final Color LIMEGREEN = new Color(50, 205, 50);
   public static final Color FORESTGREEN = new Color(34, 139, 34);
   public static final Color OLIVEDRAB = new Color(107, 142, 35);
   public static final Color DARKKHAKI = new Color(189, 183, 107);
   public static final Color KHAKI = new Color(240, 230, 140);
   public static final Color PALEGOLDENROD = new Color(238, 232, 170);
   public static final Color LIGHTGOLDENRODYELLOW = new Color(250, 250, 210);
   public static final Color LIGHTYELLOW = new Color(255, 255, 224);
   public static final Color YELLOW = new Color(255, 255, 0);
   public static final Color GOLD = new Color(255, 215, 0);
   public static final Color LIGHTGOLDENROD = new Color(238, 221, 130);
   public static final Color GOLDENROD = new Color(218, 165, 32);
   public static final Color DARKGOLDENROD = new Color(184, 134, 11);
   public static final Color ROSYBROWN = new Color(188, 143, 143);
   public static final Color INDIAN = new Color(205, 92, 92);
   public static final Color INDIANRED = new Color(205, 92, 92);
   public static final Color SADDLEBROWN = new Color(139, 69, 19);
   public static final Color SIENNA = new Color(160, 82, 45);
   public static final Color PERU = new Color(205, 133, 63);
   public static final Color BURLYWOOD = new Color(222, 184, 135);
   public static final Color BEIGE = new Color(245, 245, 220);
   public static final Color WHEAT = new Color(245, 222, 179);
   public static final Color SANDYBROWN = new Color(244, 164, 96);
   public static final Color TAN = new Color(210, 180, 140);
   public static final Color CHOCOLATE = new Color(210, 105, 30);
   public static final Color FIREBRICK = new Color(178, 34, 34);
   public static final Color BROWN = new Color(165, 42, 42);
   public static final Color DARKSALMON = new Color(233, 150, 122);
   public static final Color SALMON = new Color(250, 128, 114);
   public static final Color LIGHTSALMON = new Color(255, 160, 122);
   public static final Color ORANGE = new Color(255, 165, 0);
   public static final Color DARKORANGE = new Color(255, 140, 0);
   public static final Color CORAL = new Color(255, 127, 80);
   public static final Color LIGHTCORAL = new Color(240, 128, 128);
   public static final Color TOMATO = new Color(255, 99, 71);
   public static final Color ORANGERED = new Color(255, 69, 0);
   public static final Color RED = new Color(255, 0, 0);
   public static final Color FUCHSIA = new Color(255, 0, 128);
   public static final Color HOTPINK = new Color(255, 105, 180);
   public static final Color DEEPPINK = new Color(255, 20, 147);
   public static final Color PINK = new Color(255, 192, 203);
   public static final Color LIGHTPINK = new Color(255, 182, 193);
   public static final Color PALEVIOLETRED = new Color(219, 112, 147);
   public static final Color MAROON = new Color(176, 48, 96);
   public static final Color MEDIUMVIOLETRED = new Color(199, 21, 133);
   public static final Color VIOLETRED = new Color(208, 32, 144);
   public static final Color MAGENTA = new Color(255, 0, 255);
   public static final Color VIOLET = new Color(238, 130, 238);
   public static final Color PLUM = new Color(221, 160, 221);
   public static final Color ORCHID = new Color(218, 112, 214);
   public static final Color MEDIUMORCHID = new Color(186, 85, 211);
   public static final Color DARKORCHID = new Color(153, 50, 204);
   public static final Color DARKVIOLET = new Color(148, 0, 211);
   public static final Color BLUEVIOLET = new Color(138, 43, 226);
   public static final Color PURPLE = new Color(160, 32, 240);
   public static final Color MEDIUMPURPLE = new Color(147, 112, 219);
   public static final Color THISTLE = new Color(216, 191, 216);
   public static final Color DARKGREY = new Color(169, 169, 169);
   public static final Color DARKGRAY = new Color(169, 169, 169);
   public static final Color DARKBLUE = new Color(0, 0, 139);
   public static final Color DARKCYAN = new Color(0, 139, 139);
   public static final Color DARKMAGENTA = new Color(139, 0, 139);
   public static final Color DARKRED = new Color(139, 0, 0);
   public static final Color LIGHTGREEN = new Color(144, 238, 144);
   public static final Color EMERALD = new Color(70, 212, 128);
   public static final Color SHAMROCKGREEN = new Color(47, 159, 93);
   public static final Color CADMIUMGREEN = new Color(25, 99, 56);
   public static final Color CHAMPAGNEPINK = new Color(255, 232, 214);
   public static final Color CONGOPINK = new Color(244, 151, 143);
   public static final Color LAVENDERBLUSH = new Color(250, 214, 218);
   //vehicle
   public static final Color ORANGEYELLOW = new Color(240, 186, 40);
   public static final Color GOLDWEBGOLDEN = new Color(251, 214, 47);
   public static final Color COLUMBIABLUE = new Color(196, 238, 255);
   public static final Color RICHBLACK = new Color(4, 3, 1);
   public static final Color LIGHTGRAY = new Color(204, 204, 204);
   //bush colors from light to dark
   public static final Color INDIAGREEN = new Color(14, 140, 0);
   public static final Color AOENGLISH = new Color(7, 127, 0);
   
   public static final Color PAKISTANGREEN = new Color(0, 114, 0);
   //SKY
   public static final Color BABYBLUE = new Color(168, 206, 239);
   
   //background tree
   public static final Color LIGHTBARK = new Color(161, 145, 138);
   
   //bird
   public static final Color CRIMSON = new Color(220, 20, 60);
   
   //outside background
   public static final Color FORESTGREENTRADITIONAL = new Color(30, 63, 32);
   public static final Color HUNTERGREEN = new Color(52, 88, 48);
   public static final Color GREEN = new Color(67, 160, 71);
   
   //text
   public static final Color CHARCOAL = new Color(52, 40, 44);
   
   //poluted sky
   public static final Color XANADU = new Color(106, 123, 118);
   public static final Color DARKSLATEGRAY = new Color(58, 78, 72);
   //meat
   public static final Color MEAT = new Color(206, 57, 94);
   //factory
   public static final Color DARKSIENNA = new Color(46, 14, 12);
   public static final Color ONYX = new Color(61, 61, 61);
   public static final Color CAPUTMORTUUM = new Color(94, 34, 28);
   public static final Color XIKETIC = new Color(56, 59, 121);
   public static final Color MISTYMOSS = new Color(191, 185, 130);
   
   //brown cow
   //spots
   public static final Color UPSBROWN = new Color(100, 65, 23);
   public static final Color COPPER = new Color(181, 127, 55);
   
  //burger
   public static final Color AMBER = new Color(255, 192, 0); //cheese
   public static final Color ALLOYORANGE = new Color(196, 91, 16); //TOMATO
   public static final Color BUN = new Color(254, 217, 102); //bun
   public static final Color LETTUCE = new Color(104, 180, 53);
   public static final Color PATTY = new Color(126, 95, 0);
   //sloth
   public static final Color FAWN = new Color(224, 172, 122);
   public static final Color BANANAMANIA = new Color(255, 236, 196);
   public static final Color COPPERS = new Color(175, 123, 73);
//    public static final Color FAWN = new Color(221, 168, 117);
}