package com.mtcoding.airplane;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AirApp {

    // key = 무안, value = NAARKJB
    static Map<String, String> ports = new HashMap();

    public static void main(String[] args) {
        try {
            // 1. 공항정보를 다운 - HttpUrlConnection으로!!
            String site1 = "https://apis.data.go.kr/1613000/DmstcFlightNvgInfoService/getArprtList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&_type=json";
            URL url1 = new URL(site1);
            HttpURLConnection conn1 = (HttpURLConnection) url1.openConnection();
            conn1.setRequestMethod("GET");
            Scanner sc1 = new Scanner(conn1.getInputStream());
            String json1 = "";
            while(sc1.hasNextLine()){
                String line = sc1.nextLine();
                json1 = json1 + line;
            }
            System.out.println(json1);

            // 2. PortInfo로 오브젝트화 시켜!!
            // 3. ports에 airportId에 있는 값, airportNm에 있는 값을 넣기

            String dep = ""; // 무안
            String depKey = "";
            String arr = ""; // 부산
            String arrKey = "";
            String time = ""; // 20251219
            // 4. 스캐너로 출발지를 받기
            // 5. 스캐너로 목적지 받기
            // 6. 날짜받기

            // 7. 동적인 URL 만들기
            String site2 = """
                https://apis.data.go.kr/1613000/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&pageNo=1&numOfRows=10&_type=json&depAirportId=${depKey}&arrAirportId=${arrKey}&depPlandTime=${time}
                """.replace("${depKey}", depKey).replace("${arrKey}", arrKey).replace("${time}", time);
            // 8. 항공스케줄 다운 - HttpUrlConnection 호출
            // 9. AirInfo로 파싱
            // 10. 항공 스케줄 예쁘게 전체 출력
        } catch (Exception e) {

        }



    }
}
