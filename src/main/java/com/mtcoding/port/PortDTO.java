package com.mtcoding.port;

/**
 * https://apis.data.go.kr/1613000/DmstcFlightNvgInfoService/getArprtList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&_type=json
 */

// DTO -> Data Transfer Object
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PortDTO {

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
    // Item (Airport)
    // =======================
    @Getter
    @Setter
    public static class Item {
        private String airportId;
        private String airportNm;
    }
}
