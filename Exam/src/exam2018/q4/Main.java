package exam2018.q4;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author Tian Z
 */
public class Main {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");
        String s = "5+8-2*3-2/2+7";
        Object d = engine.eval(s);
        System.out.println(d.getClass());
    }
}
