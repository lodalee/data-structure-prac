package com.example.codingtest.string;

public class Solution3 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        switch (ineq) {
            case ">":
                if (eq.equals("=")) {
                    if (n >= m) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    if (n > m) {
                        return 1;
                    } else {
                        return 0;
                    }
                }

            case "<":
                if (eq.equals("=")) {
                    if (n <= m) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    if (n < m) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
        }
        return answer;
    }

    public int solution_2(String ineq, String eq, int n, int m) {
        switch (ineq) {
            case ">":
                if (eq.equals("=")) {
                    return n >= m ? 1 : 0;
                } else {
                    return n > m ? 1 : 0;
                }

            case "<":
                if (eq.equals("=")) {
                    return n <= m ? 1 : 0;
                } else {
                    return n < m ? 1 : 0;
                }
        }

        return 0; // 잘못된 부등식이 주어진 경우 기본값으로 0을 반환
    }
}
