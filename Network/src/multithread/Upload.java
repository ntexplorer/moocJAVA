package multithread;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @author Tian Z
 */
public class Upload implements Runnable {
    private final Socket socket;

    public Upload(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream in = null;
        try {
            in = socket.getInputStream();

            File upload = new File("Network/src/multithread/upload");
            if (!upload.exists()) {
                upload.mkdirs();
            }

            String fileName = "new_test.jpg";
            FileOutputStream fos = new FileOutputStream(upload + File.separator + fileName);

            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = in.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }

            socket.getOutputStream().write("Upload complete!".getBytes());
            fos.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
