package com.mtcoding.ex05;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer3 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(20000);
            Socket socket = ss.accept();

            // 읽기 버퍼
            Scanner sc = new Scanner(socket.getInputStream());

            // 쓰기 버퍼
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            while(true){
                String line = sc.nextLine(); // 엔터키까지 읽기
                String response = "";
                if(line.equals("/html")){
                    response = """
                        data-kgs-option="weatherNews"> 
                        <a nocr onclick="goOtherTCR(this, 'a=nco_x7t*4.slcparrow&r=1&i=88157038_00000065035F');
                        return false;" href="#" class="tab_link"> 
                        <span class="text">웨더뉴스</span> </a> </li> </ul> </div> </div> 
                        <a nocr onclick="return goOtherCR(this, 'a=nco_x7t*4.compare&r=1&i=88157038_00000065035F&u='
                         + urlencode(this.href));" href="https://weather.naver.com/compare/08230510" 
                         role="button" class="btn_comparison"><span class="text_comparison">예보비교</span></a> 
                         </div> <div class="weather_info"> <div class="status_wrap"> <h3 class="blind">오늘의 날씨</h3>
                          <div class="_today"> <div class="weather_graphic"> <div class="weather_main"> 
                          <i class="wt_icon ico_wt1"><span class="blind">맑음</span></i> </div> 
                          <div class="temperature_text"> <strong>
                          <span class="blind">현재 온도</span>5.7<span class="celsius">°</span></strong> 
                          </div> </div> <div class="temperature_info"> <p class="summary">어제보다
                           <span class="temperature down">4.3° <span class="blind">낮아요</span> 
                           </span> <span class="weather before_slash">맑음</span> </p> 
                           <dl class="summary_list"> <div class="sort"> <dt class="term">체감</dt> 
                           <dd class="desc">2.9°</dd> </div> <div class="sort"> <dt class="term">습도</dt> 
                           <dd class="desc">44%</dd> </div> <div class="sort"> <dt class="term">북서풍</dt> 
                           <dd class="desc">3.6m/s</dd> </div> </dl> </div> </div> <div class="report_card_wrap">
                            <ul class="today_chart_list"> <li class="item_today level1"> <a nocr onclick="return goOtherCR(this, 'a=nco_x7t*4&r=1&i=88157038_00000065035F&u=' + urlencode(this.href));" href="?where=nexearch&sm=tab_etc&pkid=227&qvt=0&query=%EB%B6%80%EC%82%B0%EA%B4%91%EC%97%AD%EC%8B%9C%20%EB%B6%80%EC%82%B0%EC%A7%84%EA%B5%AC%20%EB%B6%80%EC%A0%841%EB%8F%99%20%EB%AF%B8%EC%84%B8%EB%A8%BC%EC%A7%80" class="box"> <strong class="title">미세먼지</strong> <span class="txt">보통</span> </a> </li> <li class="item_today level3"> <a nocr onclick="return goOtherCR(this, 'a=nco_x7t*4&r=1&i=88157038_00000065035F&u=' + urlencode(this.href));" href="?where=nexearch&sm=tab_etc&pkid=227&qvt=0&query=%EB%B6%80%EC%82%B0%EA%B4%91%EC%97%AD%EC%8B%9C%20%EB%B6%80%EC%82%B0%EC%A7%84%EA%B5%AC%20%EB%B6%80%EC%A0%841%EB%8F%99%20%EC%B4%88%EB%AF%B8%EC%84%B8%EB%A8%BC%EC%A7%80" class="box"> <strong class="title">초미세먼지</strong> <span class="txt">나쁨</span> </a> </li> <li class="item_today level2"> <span class="box"> <strong class="title">자외선</strong> <span class="txt">좋음</span> </span> </li> <li class="item_today type_sun"> <span class="box"> <strong class="title">일몰</strong> <span class="txt">17:14</span> </span> </li> <li class="item_today type_talk"> <span class="box"> <strong class="title">날씨를 공유해보세요!</strong> <a nocr onclick="return goOtherCR(this, 'a=nco_x7t*4.towtalk&r=1&i=88157038_00000065035F&u=' + urlencode(this.href));" href="https://weather.naver.com/today/08230510/talk" target="_blank" class="txt">날씨 제보톡</a> </span> </li> </ul> </div> <div class="btn_area"> <a nocr onclick="return goOtherCR(this, 'a=nco_x7t*4.cctv&r=1&i=88157038_00000065035F&u=' + urlencode(this.href));" href="https://weather.naver.com/map/08230510?cctv=true" class="link link_cctv" target="_blank">CCTV</a> <a nocr onclick="return goOtherCR(this, 'a=nco_x7t*4.tomap&r=1&i=88157038_00000065035F&u=' + urlencode(this.href));" href="https://weather.naver.com/map/08230510" class="link" target="_blank">날씨 지도</a> </div> </div> </div> </div> </div> <div class="content_area"> <div class="inner"> <div class="forecast_wrap _selectable_tab"> <h3 class="blind">시간별 예보</h3> <div class="sub_tab"> <div> <ul role="tablist" class="tab_list" data-kgs-selectable> <li class="tab" data-kgs-option role="tab" aria-selected="true"> <a nocr onclick="goOtherTCR(this, 'a=nco_x7t*4.wth&r=1&i=88157038_00000065035F');return false;" href="#"><span class="menu">날씨</span></a> </li> <li class="tab" data-kgs-option role="tab"> <a nocr onclick="goOtherTCR(this, 'a=nco_x7t*4.pre&r=1&i=88157038_00000065035F');return false;" href="#"><span class="menu">강수</span></a> </li> <li class="tab" data-kgs-option role="tab"> <a nocr onclick="goOtherTCR(this, 'a=nco_x7t*4.wid&r=1&i=88157038_00000065035F');return false;" href="#"><span class="menu">바람</
                        """;
                }else if(line.equals("/data")){
                    response = "5.7";
                }
                System.out.println(response);
                pw.println(response);
                pw.println("__END__");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
