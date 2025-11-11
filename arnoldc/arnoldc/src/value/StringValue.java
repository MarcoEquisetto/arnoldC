package value;

public class StringValue extends ExpValue<String>{
    public StringValue(String value) {
        super(value);
    }

    public static String unescapeString(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (c == '\\' && i + 1 < length) {
                char next = str.charAt(i + 1);
                switch (next) {
                    case 'n' -> sb.append('\n');
                    case 't' -> sb.append('\t');
                    case '\\' -> sb.append('\\');
                    case '"' -> sb.append('"');
                    case 'b' -> sb.append('\b');
                    case 'r' -> sb.append('\r');
                    case 'f' -> sb.append('\f');
                    default -> sb.append(c).append(next);
                }
                i++;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
