package com.mtcoding.ex01;

import java.io.*;
import java.util.Scanner;

public class Buf04 {
    public static void main(String[] args) {


        // 1. 바이트 스트림 연결
        OutputStream out = System.out; // 모니터 연결
        OutputStreamWriter ow = new OutputStreamWriter(out);
        BufferedWriter bw = new BufferedWriter(ow);
        try {
            bw.write("ABC"); //
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
