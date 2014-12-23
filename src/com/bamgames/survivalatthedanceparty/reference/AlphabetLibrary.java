package com.bamgames.survivalatthedanceparty.reference;

/**
 * Created by James Hulsizer on 11/27/2014.
 */
public class AlphabetLibrary {
    boolean isCap;
    boolean ovrCap;
    int count = 0;
    public boolean stop = false;

    public String getName(int k, String name, boolean caps, int chars) {
        if (isCap == false && ovrCap == false && stop == false) {
            switch (k) {
                case 48:
                    name += "0";
                    count++;
                    break;
                case 49:
                    name += "1";
                    count++;
                    break;
                case 50:
                    name += "2";
                    count++;
                    break;
                case 51:
                    name += "3";
                    count++;
                    break;
                case 52:
                    name += "4";
                    count++;
                    break;
                case 53:
                    name += "5";
                    count++;
                case 54:
                    name += "6";
                    count++;
                    break;
                case 55:
                    name += "7";
                    count++;
                    break;
                case 56:
                    name += "8";
                    count++;
                    break;
                case 57:
                    name += "9";
                    count++;
                    break;
                case 65:
                    name += "a";
                    count++;
                    break;
                case 66:
                    name += "b";
                    count++;
                    break;
                case 67:
                    name += "c";
                    count++;
                    break;
                case 68:
                    name += "d";
                    count++;
                    break;
                case 69:
                    name += "e";
                    count++;
                    break;
                case 70:
                    name += "f";
                    count++;
                    break;
                case 71:
                    name += "g";
                    count++;
                    break;
                case 72:
                    name += "h";
                    count++;
                    break;
                case 73:
                    name += "i";
                    count++;
                    break;
                case 74:
                    name += "j";
                    count++;
                    break;
                case 75:
                    name += "k";
                    count++;
                    break;
                case 76:
                    name += "l";
                    count++;
                    break;
                case 77:
                    name += "m";
                    count++;
                    break;
                case 78:
                    name += "n";
                    count++;
                    break;
                case 79:
                    name += "o";
                    count++;
                    break;
                case 80:
                    name += "p";
                    count++;
                    break;
                case 81:
                    name += "q";
                    count++;
                    break;
                case 82:
                    name += "r";
                    count++;
                    break;
                case 83:
                    name += "s";
                    count++;
                    break;
                case 84:
                    name += "t";
                    count++;
                    break;
                case 85:
                    name += "u";
                    count++;
                    break;
                case 86:
                    name += "v";
                    count++;
                    break;
                case 87:
                    name += "w";
                    count++;
                    break;
                case 88:
                    name += "x";
                    count++;
                    break;
                case 89:
                    name += "y";
                    count++;
                    break;
                case 90:
                    name += "z";
                    count++;
                    break;
                case 16:
                    isCap = true;
                    break;
                case 32:
                    name += " ";
                    count++;
                    break;
                default:
                    if (caps == true) {
                        ovrCap = true;
                    }
                    break;
            }
        }
        if ((isCap == true || ovrCap == true) && stop == false) {
            switch (k) {
                case 65:
                    name += "A";
                    isCap = false;
                    count++;
                    break;
                case 66:
                    name += "B";
                    isCap = false;
                    count++;
                    break;
                case 67:
                    name += "C";
                    isCap = false;
                    count++;
                    break;
                case 68:
                    name += "D";
                    isCap = false;
                    count++;
                    break;
                case 69:
                    name += "E";
                    isCap = false;
                    count++;
                    break;
                case 70:
                    name += "F";
                    isCap = false;
                    count++;
                    break;
                case 71:
                    name += "G";
                    isCap = false;
                    count++;
                    break;
                case 72:
                    name += "H";
                    isCap = false;
                    count++;
                    break;
                case 73:
                    name += "I";
                    isCap = false;
                    count++;
                    break;
                case 74:
                    name += "J";
                    isCap = false;
                    count++;
                    break;
                case 75:
                    name += "K";
                    isCap = false;
                    count++;
                    break;
                case 76:
                    name += "L";
                    isCap = false;
                    count++;
                    break;
                case 77:
                    name += "M";
                    isCap = false;
                    count++;
                    break;
                case 78:
                    name += "N";
                    isCap = false;
                    count++;
                    break;
                case 79:
                    name += "O";
                    isCap = false;
                    count++;
                    break;
                case 80:
                    name += "P";
                    isCap = false;
                    count++;
                    break;
                case 81:
                    name += "Q";
                    isCap = false;
                    count++;
                    break;
                case 82:
                    name += "R";
                    isCap = false;
                    count++;
                    break;
                case 83:
                    name += "S";
                    isCap = false;
                    count++;
                    break;
                case 84:
                    name += "T";
                    isCap = false;
                    count++;
                    break;
                case 85:
                    name += "U";
                    isCap = false;
                    count++;
                    break;
                case 86:
                    name += "V";
                    isCap = false;
                    count++;
                    break;
                case 87:
                    name += "W";
                    isCap = false;
                    count++;
                    break;
                case 88:
                    name += "X";
                    isCap = false;
                    count++;
                    break;
                case 89:
                    name += "Y";
                    isCap = false;
                    count++;
                    break;
                case 90:
                    name += "Z";
                    isCap = false;
                    count++;
                    break;
                case 32:
                    name += " ";
                    count++;
                    break;
                case 8:

                    break;
                case 20:
                    if (caps == false) {
                        ovrCap = false;
                    }
                    break;
            }
        }
        if (count >= chars) {
            stop = true;
        }
        return name;
    }
}