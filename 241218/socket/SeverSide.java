package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverSide {
    public static void main(String[] args) {
        new SeverSide();
    }
    //클라이언트 연결을 받는소포켓(서버소켓)
    ServerSocket severSoket;
    //실제 통신용 소켓
    Socket soket;

    BufferedReader br;//클라이언트가 보낸 글을 읽어내는 용도

    //키보드 입력용 버포
    BufferedReader keyboard;

    BufferedWriter bw;


    public SeverSide() {
        System.out.println("1. 서버소켓 시작 -----");
        try {
            severSoket = new ServerSocket(10000);
            System.out.println("2. 서버소켓 생성완료 -----");
            System.out.println("3. 클라이언트 연결 대기 중 -----");
            soket = severSoket.accept();
            System.out.println("4. 클라이언트 접속 완료");
            //클라이언트가 보낸 메세지를 읽어들이는 바파 생성
            br = new BufferedReader(new InputStreamReader(soket.getInputStream()));
            //서버쪽에서 키보드로 입력받는 용도
            keyboard = new BufferedReader(new InputStreamReader(System.in));
            //입력받은 글을 클라이언트로 흘려보내는 역할
            bw = new BufferedWriter(new OutputStreamWriter(soket.getOutputStream()));

            //클라이언트로 보내는 기능 추가
            WriteThread writeThread = new WriteThread();
            Thread severThread = new Thread(writeThread);
            severThread.start();

            while (true) {
                String clientMessenger = br.readLine();
                System.out.println("5. 클라이언트로부터 받은 메세지 : " + clientMessenger);
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }

     //내부 클래스
    //키보드에서 ㅇ입력받아 클라이언트에 보내는 역할을 하는 기능
    class  WriteThread implements Runnable{

         @Override
         public void run() {
             while (true) {
                 try {
                     String keyboardMessenger = keyboard.readLine();
                     bw.write(keyboardMessenger + "\n");
                     bw.flush();
                 } catch (Exception e) {
                     System.out.println("서버 메세지 수신 오류" + e.getMessage());
                 }
             }
         }
     }
}
