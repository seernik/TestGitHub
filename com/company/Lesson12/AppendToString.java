package com.company.Lesson12;

public class AppendToString {
    public static void main(String[] args) {
        int a = 3, b = 56;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a).append(" + ").append(b).append(" = ").append(a + b);
        stringBuilder.append("\n").append(a).append(" - ").append(b).append(" = ").append(b - a);
        stringBuilder.append("\n").append(a).append(" * ").append(b).append(" = ").append(a * b);
        System.out.println(stringBuilder);
        replace(stringBuilder);
        System.out.println(stringBuilder);
    }

    private static void replace(StringBuilder stringBuilder) {
        int pos = 0;
        while ((pos = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.replace(pos, (pos + 1), "equal");
        }
    }
}
