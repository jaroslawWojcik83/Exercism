import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {

        List<Signal> listOfSignal = new ArrayList<>();

        int signalWINK = 0b00001;
        if((number & signalWINK) == signalWINK) {
            listOfSignal.add(Signal.WINK);
        }

        int signalDOUBLE_BLINK = 0b00010;
        if ((number & signalDOUBLE_BLINK) == signalDOUBLE_BLINK) {
            listOfSignal.add(Signal.DOUBLE_BLINK);
        }

        int signalCLOSE_YOUR_EYES = 0b00100;
        if ((number & signalCLOSE_YOUR_EYES) == signalCLOSE_YOUR_EYES) {
            listOfSignal.add(Signal.CLOSE_YOUR_EYES);
        }

        int signalJUMP = 0b01000;
        if ((number & signalJUMP) == signalJUMP) {
            listOfSignal.add(Signal.JUMP);
        }

        int signalREVERSE = 0b10000;
        if ((number & signalREVERSE) == signalREVERSE) {
            Collections.reverse(listOfSignal);
        }

        return listOfSignal;
    }
}
