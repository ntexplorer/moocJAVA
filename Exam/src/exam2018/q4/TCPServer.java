package exam2018.q4;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

/**
 * @author Tian Z
 */
public class TCPServer {
    public static void main(String[] args) throws IOException, ScriptException {
        double currentValue = 0;

        ServerSocket service = new ServerSocket(6000);
        Socket socket = service.accept();
        while (true) {
            try {
                InputStream in = socket.getInputStream();
                byte[] data = new byte[1024];
                int len = in.read(data);
                String operation = new String(data, 0, len);
                if (operation.equals("/0")) {
                    OutputStream out = socket.getOutputStream();
                    out.write("Error".getBytes());
                } else if (operation.equals("stop")) {
                    socket.close();
                    service.close();
                } else {
                    String all = currentValue + operation;
                    ScriptEngineManager manager = new ScriptEngineManager();
                    ScriptEngine engine = manager.getEngineByName("javascript");
                    Object d = engine.eval(all);
                    currentValue = (double) d;

                    OutputStream out = socket.getOutputStream();
                    out.write(("The new current value is " + currentValue).getBytes());
                }
            } catch (SocketException e) {
                e.printStackTrace();
            }

        }

    }
}
