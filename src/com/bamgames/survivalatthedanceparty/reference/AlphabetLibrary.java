package com.bamgames.survivalatthedanceparty.reference;

/**
 * Created by James Hulsizer on 11/27/2014.
 */
public class AlphabetLibrary {
    boolean isCap;
    boolean ovrCap;

    public String getName(int k, String name, boolean caps) {
        if (isCap == false && ovrCap == false) {
            switch (k) {
                case 48:
                    name += "0";
                    break;
                case 49:
                    name += "1";
                    break;
                case 50:
                    name += "2";
                    break;
                case 51:
                    name += "3";
                    break;
                case 52:
                    name += "4";
                    break;
                case 53:
                    name += "5";
                case 54:
                    name += "6";
                    break;
                case 55:
                    name += "7";
                    break;
                case 56:
                    name += "8";
                    break;
                case 57:
                    name += "9";
                    break;
                case 65:
                    name += "a";
                    break;
                case 66:
                    name += "b";
                    break;
                case 67:
                    name += "c";
                    break;
                case 68:
                    name += "d";
                    break;
                case 69:
                    name += "e";
                    break;
                case 70:
                    name += "f";
                    break;
                case 71:
                    name += "g";
                    break;
                case 72:
                    name += "h";
                    break;
                case 73:
                    name += "i";
                    break;
                case 74:
                    name += "j";
                    break;
                case 75:
                    name += "k";
                    break;
                case 76:
                    name += "l";
                    break;
                case 77:
                    name += "m";
                    break;
                case 78:
                    name += "n";
                    break;
                case 79:
                    name += "o";
                    break;
                case 80:
                    name += "p";
                    break;
                case 81:
                    name += "q";
                    break;
                case 82:
                    name += "r";
                    break;
                case 83:
                    name += "s";
                    break;
                case 84:
                    name += "t";
                    break;
                case 85:
                    name += "u";
                    break;
                case 86:
                    name += "v";
                    break;
                case 87:
                    name += "w";
                    break;
                case 88:
                    name += "x";
                    break;
                case 89:
                    name += "y";
                    break;
                case 90:
                    name += "z";
                    break;
                case 16:
                    isCap = true;
                    break;
                default:
                    if (caps == true) {
                        ovrCap = true;
                    }
                    break;
            }
        }
        if (isCap == true || ovrCap == true) {
            switch (k) {
                case 65:
                    name += "A";
                    isCap = false;
                    break;
                case 66:
                    name += "B";
                    isCap = false;
                    break;
                case 67:
                    name += "C";
                    isCap = false;
                    break;
                case 68:
                    name += "D";
                    isCap = false;
                    break;
                case 69:
                    name += "E";
                    isCap = false;
                    break;
                case 70:
                    name += "F";
                    isCap = false;
                    break;
                case 71:
                    name += "G";
                    isCap = false;
                    break;
                case 72:
                    name += "H";
                    isCap = false;
                    break;
                case 73:
                    name += "I";
                    isCap = false;
                    break;
                case 74:
                    name += "J";
                    isCap = false;
                    break;
                case 75:
                    name += "K";
                    isCap = false;
                    break;
                case 76:
                    name += "L";
                    isCap = false;
                    break;
                case 77:
                    name += "M";
                    isCap = false;
                    break;
                case 78:
                    name += "N";
                    isCap = false;
                    break;
                case 79:
                    name += "O";
                    isCap = false;
                    break;
                case 80:
                    name += "P";
                    isCap = false;
                    break;
                case 81:
                    name += "Q";
                    isCap = false;
                    break;
                case 82:
                    name += "R";
                    isCap = false;
                    break;
                case 83:
                    name += "S";
                    isCap = false;
                    break;
                case 84:
                    name += "T";
                    isCap = false;
                    break;
                case 85:
                    name += "U";
                    isCap = false;
                    break;
                case 86:
                    name += "V";
                    isCap = false;
                    break;
                case 87:
                    name += "W";
                    isCap = false;
                    break;
                case 88:
                    name += "X";
                    isCap = false;
                    break;
                case 89:
                    name += "Y";
                    isCap = false;
                    break;
                case 90:
                    name += "Z";
                    isCap = false;
                    break;
                case 20:
                    if (caps == false) {
                        ovrCap = false;
                    }
                    break;
            }
        }
        return name;
    }
}
