public class ErrorMessage {
    String messages[] = {
            "Output Error",
            "Input Error",
            "No available space on the disk",
            "Index Out of Range"
    };
    String getErrorMessage(int i) {
        if (i >= 0 & i < messages.length)
            return messages[i];
        else return "Error code doesn't exist";
    }
}
