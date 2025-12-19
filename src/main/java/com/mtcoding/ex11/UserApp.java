package com.mtcoding.ex11;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
class User{
        private Integer id;
        private String name;
        private String username;
        private String email;
        private String phone;
        private String website;
        private Good company;

        @Getter @Setter
        static class Good {
            private String name;
            private String catchPhrase;
            private String bs;
        }
}

public class UserApp {
    public static void main(String[] args) {
        try {
            // https://jsonplaceholder.typicode.com/users/1
            // 1. 다운로드 Repository download()
            Repository r = new Repository();
            String json = r.download("https://jsonplaceholder.typicode.com/users/1");

            // 2. 다운로드 확인
            System.out.println(1);
            
            // 3. User 클래스 완성하기

            // 4. 오브젝트로 변환 (json -> User) - gson필요
            Gson gson = new Gson();
            User u = gson.fromJson(json, User.class);

            // 5. 변환 확인
            System.out.println(1);

            // 6. 콘솔에 유저 정보 출력
            System.out.println(u.getId());
            System.out.println(u.getName());
            System.out.println(u.getUsername());
            System.out.println(u.getEmail());
            System.out.println(u.getPhone());
            System.out.println(u.getWebsite());
            System.out.println(u.getCompany().getName());
            System.out.println(u.getCompany().getCatchPhrase());
            System.out.println(u.getCompany().getBs());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
