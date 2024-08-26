package com.example.handyutils.utils;

public class StringUtils {

    /**
     * 문자열을 역순으로 변환합니다.
     * 입력된 문자열의 문자를 거꾸로 배열하여 새로운 문자열을 반환합니다.
     *
     * <pre>{@code
     * StringUtils.reverse("Hello") // 출력: "olleH"
     * }</pre>
     *
     * @param input 역순으로 변환할 문자열
     * @return 역순으로 변환된 새로운 문자열
     */
    public static String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return new StringBuilder(input).reverse().toString();
    }

}
