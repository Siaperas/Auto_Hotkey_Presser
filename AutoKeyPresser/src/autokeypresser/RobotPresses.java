/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autokeypresser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 123
 */
public class RobotPresses extends Thread {

    private volatile boolean alive;
    private Object[][] tableData;
    private int between;
    private int pick;

    public RobotPresses(Object[][] tableData, int between, int pick) {
        this.tableData = tableData;
        this.between = between;
        this.pick = pick;
        this.alive = true;
    }
    
    //depending on the key derived from the sequence let the robot class press the key desired
    @Override
    public void run() {
        Robot r;
        try {
            r = new Robot();
            int nRow = tableData.length;
            int i = 0;
            while (i < nRow) {
                String key = (String) tableData[i][1];
                switch (key) {
                    case "OEM_PERIOD":
                        doPress(r, KeyEvent.VK_PERIOD, between);
                        break;
                    case "OEM_COMMA":
                        doPress(r, KeyEvent.VK_COMMA, between);
                        break;
                    case "UNDEFINED":
                        doPress(r, KeyEvent.VK_UNDEFINED, between);

                        break;
                    case "LBUTTON":
                        break;
                    case "RBUTTON":
                        break;
                    case "CANCEL":
                        doPress(r, KeyEvent.VK_CANCEL, between);
                        break;
                    case "MBUTTON":
                        break;
                    case "XBUTTON1":
                        break;
                    case "XBUTTON2":
                        break;
                    case "BACK":
                        doPress(r, KeyEvent.VK_BACK_SPACE, between);
                        break;
                    case "TAB":
                        doPress(r, KeyEvent.VK_TAB, between);
                        break;
                    case "CLEAR":
                        doPress(r, KeyEvent.VK_CLEAR, between);
                        break;
                    case "RETURN":
                        doPress(r, KeyEvent.VK_ENTER, between);
                        break;
                    case "SHIFT":
                        doPress(r, KeyEvent.VK_SHIFT, between);
                        break;
                    case "CONTROL":
                        doPress(r, KeyEvent.VK_CONTROL, between);
                        break;
                    case "MENU":
                        doPress(r, KeyEvent.VK_CONTEXT_MENU, between);
                        break;
                    case "PAUSE":
                        doPress(r, KeyEvent.VK_PAUSE, between);
                        break;
                    case "CAPITAL":
                        break;
                    case "KANA":
                        doPress(r, KeyEvent.VK_KANA, between);
                        break;
                    case "HANGUEL":
                        break;
                    case "HANGUL":
                        break;
                    case "JUNJA":
                        break;
                    case "FINAL":
                        doPress(r, KeyEvent.VK_FINAL, between);
                        break;
                    case "HANJA":
                        break;
                    case "KANJI":
                        doPress(r, KeyEvent.VK_KANJI, between);
                        break;
                    case "ESCAPE":
                        doPress(r, KeyEvent.VK_ESCAPE, between);
                        break;
                    case "CONVERT":
                        doPress(r, KeyEvent.VK_CONVERT, between);
                        break;
                    case "NONCONVERT":
                        doPress(r, KeyEvent.VK_NONCONVERT, between);
                        break;
                    case "ACCEPT":
                        doPress(r, KeyEvent.VK_ACCEPT, between);
                        break;
                    case "MODECHANGE":
                        doPress(r, KeyEvent.VK_MODECHANGE, between);
                        break;
                    case "SPACE":
                        doPress(r, KeyEvent.VK_SPACE, between);
                        break;
                    case "PRIOR":
                        doPress(r, KeyEvent.VK_PAGE_UP, between);
                        break;
                    case "NEXT":
                        doPress(r, KeyEvent.VK_PAGE_DOWN, between);
                        break;
                    case "END":
                        doPress(r, KeyEvent.VK_END, between);
                        break;
                    case "HOME":
                        doPress(r, KeyEvent.VK_HOME, between);
                        break;
                    case "LEFT":
                        doPress(r, KeyEvent.VK_LEFT, between);
                        break;
                    case "UP":
                        doPress(r, KeyEvent.VK_UP, between);
                        break;
                    case "RIGHT":
                        doPress(r, KeyEvent.VK_RIGHT, between);
                        break;
                    case "DOWN":
                        doPress(r, KeyEvent.VK_DOWN, between);
                        break;
                    case "SELECT":
                        break;
                    case "PRINT":
                        break;
                    case "EXECUTE":
                        doPress(r, KeyEvent.VK_0, between);
                        break;
                    case "SNAPSHOT":
                        doPress(r, KeyEvent.VK_PRINTSCREEN, between);
                        break;
                    case "INSERT":
                        doPress(r, KeyEvent.VK_INSERT, between);
                        break;
                    case "DELETE":
                        doPress(r, KeyEvent.VK_DELETE, between);
                        break;
                    case "HELP":
                        doPress(r, KeyEvent.VK_HELP, between);
                        break;
                    case "0":
                        doPress(r, KeyEvent.VK_0, between);
                        break;
                    case "1":
                        doPress(r, KeyEvent.VK_1, between);
                        break;
                    case "2":
                        doPress(r, KeyEvent.VK_2, between);
                        break;
                    case "3":
                        doPress(r, KeyEvent.VK_3, between);
                        break;
                    case "4":
                        doPress(r, KeyEvent.VK_4, between);
                        break;
                    case "5":
                        doPress(r, KeyEvent.VK_5, between);
                        break;
                    case "6":
                        doPress(r, KeyEvent.VK_6, between);
                        break;
                    case "7":
                        doPress(r, KeyEvent.VK_7, between);
                        break;
                    case "8":
                        doPress(r, KeyEvent.VK_8, between);
                        break;
                    case "9":
                        doPress(r, KeyEvent.VK_9, between);
                        break;
                    case "a":
                        doPress(r, KeyEvent.VK_A, between);

                        break;
                    case "b":
                        doPress(r, KeyEvent.VK_B, between);

                        break;
                    case "c":
                        doPress(r, KeyEvent.VK_C, between);

                        break;
                    case "d":
                        doPress(r, KeyEvent.VK_D, between);

                        break;
                    case "e":
                        doPress(r, KeyEvent.VK_E, between);

                        break;
                    case "f":
                        doPress(r, KeyEvent.VK_F, between);

                        break;
                    case "g":
                        doPress(r, KeyEvent.VK_G, between);

                        break;
                    case "h":
                        doPress(r, KeyEvent.VK_H, between);

                        break;
                    case "i":
                        doPress(r, KeyEvent.VK_I, between);

                        break;
                    case "j":
                        doPress(r, KeyEvent.VK_J, between);

                        break;
                    case "k":
                        doPress(r, KeyEvent.VK_K, between);

                        break;
                    case "l":
                        doPress(r, KeyEvent.VK_L, between);

                        break;
                    case "m":
                        doPress(r, KeyEvent.VK_M, between);

                        break;
                    case "n":
                        doPress(r, KeyEvent.VK_N, between);

                        break;
                    case "o":
                        doPress(r, KeyEvent.VK_O, between);

                        break;
                    case "p":
                        doPress(r, KeyEvent.VK_P, between);

                        break;
                    case "q":
                        doPress(r, KeyEvent.VK_Q, between);
                        break;
                    case "r":
                        doPress(r, KeyEvent.VK_R, between);
                        break;
                    case "s":
                        doPress(r, KeyEvent.VK_S, between);
                        break;
                    case "t":
                        doPress(r, KeyEvent.VK_T, between);
                        break;
                    case "u":
                        doPress(r, KeyEvent.VK_U, between);
                        break;
                    case "v":
                        doPress(r, KeyEvent.VK_V, between);
                        break;
                    case "w":
                        doPress(r, KeyEvent.VK_W, between);
                        break;
                    case "x":
                        doPress(r, KeyEvent.VK_X, between);
                        break;
                    case "y":
                        doPress(r, KeyEvent.VK_Y, between);
                        break;
                    case "z":
                        doPress(r, KeyEvent.VK_Z, between);
                        break;
                    case "LWIN":
                        doPress(r, KeyEvent.VK_WINDOWS, between);
                        break;
                    case "RWIN":
                        doPress(r, KeyEvent.VK_WINDOWS, between);
                        break;
                    case "APPS":
                        break;
                    case "SLEEP":
                        break;
                    case "NUMPAD0":
                        doPress(r, KeyEvent.VK_NUMPAD0, between);
                        break;
                    case "NUMPAD1":
                        doPress(r, KeyEvent.VK_NUMPAD1, between);
                        break;
                    case "NUMPAD2":
                        doPress(r, KeyEvent.VK_NUMPAD2, between);
                        break;
                    case "NUMPAD3":
                        doPress(r, KeyEvent.VK_NUMPAD3, between);
                        break;
                    case "NUMPAD4":
                        doPress(r, KeyEvent.VK_NUMPAD4, between);
                        break;
                    case "NUMPAD5":
                        doPress(r, KeyEvent.VK_NUMPAD5, between);
                        break;
                    case "NUMPAD6":
                        doPress(r, KeyEvent.VK_NUMPAD6, between);
                        break;
                    case "NUMPAD7":
                        doPress(r, KeyEvent.VK_NUMPAD7, between);
                        break;
                    case "NUMPAD8":
                        doPress(r, KeyEvent.VK_NUMPAD8, between);
                        break;
                    case "NUMPAD9":
                        doPress(r, KeyEvent.VK_NUMPAD9, between);
                        break;
                    case "MULTIPLY":
                        doPress(r, KeyEvent.VK_MULTIPLY, between);
                        break;
                    case "ADD":
                        doPress(r, KeyEvent.VK_ADD, between);
                        break;
                    case "SEPARATOR":
                        doPress(r, KeyEvent.VK_SEPARATOR, between);
                        break;
                    case "SUBTRACT":
                        doPress(r, KeyEvent.VK_SUBTRACT, between);
                        break;
                    case "DECIMAL":
                        doPress(r, KeyEvent.VK_DECIMAL, between);
                        break;
                    case "DIVIDE":
                        doPress(r, KeyEvent.VK_DIVIDE, between);
                        break;
                    case "F1":
                        doPress(r, KeyEvent.VK_F1, between);
                        break;
                    case "F2":
                        doPress(r, KeyEvent.VK_F2, between);
                        break;
                    case "F3":
                        doPress(r, KeyEvent.VK_F3, between);
                        break;
                    case "F4":
                        doPress(r, KeyEvent.VK_F4, between);
                        break;
                    case "F5":
                        doPress(r, KeyEvent.VK_F5, between);
                        break;
                    case "F6":
                        doPress(r, KeyEvent.VK_F6, between);
                        break;
                    case "F7":
                        doPress(r, KeyEvent.VK_F7, between);
                        break;
                    case "F8":
                        doPress(r, KeyEvent.VK_F8, between);
                        break;
                    case "F9":
                        doPress(r, KeyEvent.VK_F9, between);
                        break;
                    case "F10":
                        doPress(r, KeyEvent.VK_F10, between);
                        break;
                    case "F11":
                        doPress(r, KeyEvent.VK_F11, between);
                        break;
                    case "F12":
                        doPress(r, KeyEvent.VK_F12, between);
                        break;
                    case "F13":
                        doPress(r, KeyEvent.VK_F13, between);
                        break;
                    case "F14":
                        doPress(r, KeyEvent.VK_F14, between);
                        break;
                    case "F15":
                        doPress(r, KeyEvent.VK_F15, between);
                        break;
                    case "F16":
                        doPress(r, KeyEvent.VK_F16, between);
                        break;
                    case "F17":
                        doPress(r, KeyEvent.VK_F17, between);
                        break;
                    case "F18":
                        doPress(r, KeyEvent.VK_F18, between);
                        break;
                    case "F19":
                        doPress(r, KeyEvent.VK_F19, between);
                        break;
                    case "F20":
                        doPress(r, KeyEvent.VK_F20, between);
                        break;
                    case "F21":
                        doPress(r, KeyEvent.VK_F21, between);
                        break;
                    case "F22":
                        doPress(r, KeyEvent.VK_F22, between);
                        break;
                    case "F23":
                        doPress(r, KeyEvent.VK_F23, between);
                        break;
                    case "F24":
                        doPress(r, KeyEvent.VK_F24, between);
                        break;
                    case "NUMLOCK":
                        doPress(r, KeyEvent.VK_NUM_LOCK, between);
                        break;
                    case "SCROLL":
                        doPress(r, KeyEvent.VK_SCROLL_LOCK, between);
                        break;
                    case "LSHIFT":
                        doPress(r, KeyEvent.VK_SHIFT, between);
                        break;
                    case "RSHIFT":
                        doPress(r, KeyEvent.VK_SHIFT, between);
                        break;
                    case "LCONTROL":
                        doPress(r, KeyEvent.VK_CONTROL, between);
                        break;
                    case "RCONTROL":
                        doPress(r, KeyEvent.VK_CONTROL, between);
                        break;
                    case "LMENU":
                        doPress(r, KeyEvent.VK_CONTEXT_MENU, between);
                        break;
                    case "RMENU":
                        doPress(r, KeyEvent.VK_CONTEXT_MENU, between);
                        break;
                    case "BROWSER_BACK":
                        break;
                    case "BROWSER_FORWARD":
                        break;
                    case "BROWSER_REFRESH":
                        break;
                    case "BROWSER_STOP":
                        break;
                    case "BROWSER_SEARCH":
                        break;
                    case "BROWSER_FAVORITES":
                        break;
                    case "BROWSER_HOME":
                        break;
                    case "VOLUME_MUTE":
                        break;
                    case "VOLUME_DOWN":
                        break;
                    case "VOLUME_UP":
                        break;
                    case "MEDIA_NEXT_TRACK":
                        break;
                    case "MEDIA_PREV_TRACK":
                        break;
                    case "MEDIA_STOP":
                        break;
                    case "MEDIA_PLAY_PAUSE":
                        break;
                    case "LAUNCH_MAIL":
                        break;
                    case "LAUNCH_MEDIA_SELECT":
                        break;
                    case "LAUNCH_APP1":
                        break;
                    case "LAUNCH_APP2":
                        break;
                    case "OEM_1":
                        doPress(r, KeyEvent.VK_SEMICOLON, between);
                        break;
                    case "OEM_PLUS":
                        doPress(r, KeyEvent.VK_PLUS, between);
                        break;
                    case "OEM_MINUS":
                        doPress(r, KeyEvent.VK_MINUS, between);
                        break;
                    case "OEM_2":
                        doPress(r, KeyEvent.VK_SLASH, between);
                        break;
                    case "OEM_3":
                        break;
                    case "OEM_4":
                        doPress(r, KeyEvent.VK_OPEN_BRACKET, between);
                        break;
                    case "OEM_5":
                        doPress(r, KeyEvent.VK_BACK_SLASH, between);
                        break;
                    case "OEM_6":
                        doPress(r, KeyEvent.VK_CLOSE_BRACKET, between);
                        break;
                    case "OEM_7":
                        doPress(r, KeyEvent.VK_QUOTE, between);
                        break;
                    case "OEM_8":
                        break;
                    case "OEM_102":
                        break;
                    case "PROCESSKEY":
                        break;
                    case "PACKET":
                        break;
                    case "ATTN":
                        break;
                    case "CRSEL":
                        break;
                    case "EXSEL":
                        break;
                    case "EREOF":
                        break;
                    case "PLAY":
                        break;
                    case "ZOOM":
                        break;
                    case "PA1":
                        break;
                    case "NONAME":
                        break;
                    case "OEM_CLEAR":
                        break;
                    default:
                        break;
                }
                i++;

            }

        } catch (AWTException | InterruptedException ex) {
            Logger.getLogger(RobotPresses.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //method to faciliate the press, release and time in between of the key press
    private void doPress(Robot r, int k, int between) throws InterruptedException {
        r.keyPress(k);
        TimeUnit.MILLISECONDS.sleep(between);
        r.keyRelease(k);

    }

    public void stopThread() {
        alive = false;
    }

    public void resumeThread() {
        alive = true;
    }

}
