package EPAM_LECTURE11;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Parser {
    private Map<Character, DefHandler> _handlers = new HashMap<Character, DefHandler>();
    private DefHandler _defaultHandler;

    public void Add(char controlCharacter, DefHandler handler) {
        _handlers.put(controlCharacter, handler);
    }

    private void Parse(Scanner scanner) {
        //StringBuilder scope = new StringBuilder();
        ContextProcessor context = null; // create your context here.

        String line = scanner.nextLine();
        while (line != null) {
            DefHandler handler = null;
            if (_handlers.get(line.charAt(0)) == null) {
                handler = _defaultHandler;
            }else {
                handler = _handlers.get(line.charAt(0));
            }
            handler.Process(context, line);
            line = scanner.nextLine();
        }
    }
}