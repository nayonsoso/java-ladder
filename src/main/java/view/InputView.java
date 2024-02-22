package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);

    public List<String> readNames() {
        String inputNames = readLine("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");

        return Arrays.stream(inputNames.split(",")).toList();
    }

    public int readHeight() {
        try {
            String inputHeight = readLine("최대 사다리 높이는 몇 개인가요?");
            return Integer.parseInt(inputHeight);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("높이는 정수여야 합니다.");
        }
    }

    private String readLine(String message) {
        System.out.println(message);
        return scanner.nextLine().trim();
    }
}
