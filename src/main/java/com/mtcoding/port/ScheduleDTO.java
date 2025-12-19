package com.mtcoding.port;

/**
 * https://apis.data.go.kr/1613000/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&pageNo=1&numOfRows=10&_type=json&depAirportId=NAARKJJ&arrAirportId=NAARKPC&depPlandTime=20251220
 */

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ScheduleDTO {

    private Response response;

    // =======================
    // Response
    // =======================
    @Getter
    @Setter
    public static class Response {
        private Header header;
        private Body body;
    }

    // =======================
    // Header
    // =======================
    @Getter
    @Setter
    public static class Header {
        private String resultCode;
        private String resultMsg;
    }

    // =======================
    // Body
    // =======================
    @Getter
    @Setter
    public static class Body {
        private Items items;
        private Integer numOfRows;
        private Integer pageNo;
        private Integer totalCount;
    }

    // =======================
    // Items
    // =======================
    @Getter
    @Setter
    public static class Items {
        private List<Item> item;
    }

    // =======================
    // Item (Flight Schedule)
    // =======================
    @Getter
    @Setter
    public static class Item {
        private String airlineNm;
        private String arrAirportNm;
        private Long arrPlandTime;
        private String depAirportNm;
        private Long depPlandTime;

        private Integer economyCharge;   // optional
        private Integer prestigeCharge;  // optional

        private String vihicleId;
    }
}
