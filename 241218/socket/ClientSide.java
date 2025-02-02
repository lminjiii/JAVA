package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientSide {
    public static void main(String[] args) {
        new ClientSide();
    }
    BufferedWriter bw; // 서버에서 보내는 용도
    BufferedReader keyboard; //키보드에서 입력받는 용도
    BufferedReader br; //서버에서 보낸 소켓에서 읽는 용도
    Socket soket;

    public ClientSide() {
        try {
            System.out.println("1.클라이언트 소켓 시작 -----");
            soket = new Socket("localhost", 10000);//127.0.0.1 = localhost
            System.out.println("2. 버퍼연결 완료");
            bw = new BufferedWriter(new OutputStreamWriter(soket.getOutputStream()));
            //서버로 메세지를 보내기 위한 키보드를 연결
            keyboard = new BufferedReader(new InputStreamReader(System.in));
            //서버가 보낸 메세지 받는 용도
            br = new BufferedReader(new InputStreamReader(soket.getInputStream()));

            ReadThread rEadThread = new ReadThread();
            Thread thread = new Thread(rEadThread);
            thread.start();

            while (true) {
                System.out.println("3. 키보드 메세지 입력 대기 중.....");
                String keyboardMessenger = keyboard.readLine();
                bw.write(keyboardMessenger + "\n");
                //버퍼를 비워서 서버에 있는 소켓 메세지 전송
                bw.flush();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    class ReadThread implements Runnable{

        @Override
        public void run() {
            while (true) {
                try {
                    String message = br.readLine();
                    System.out.println("서버가 보낸 메세지 : " + message);
                } catch (Exception e) {
                    System.out.println("서버 메세지 수신 오류" + e.getMessage());
                }
            }
        }
    }
}
