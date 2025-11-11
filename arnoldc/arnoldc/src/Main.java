import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classloader.getResourceAsStream(args[0]);
        CharStream charStream = CharStreams.fromStream(inputStream);

        arnoldcLexer lexer = new arnoldcLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        arnoldcParser parser = new arnoldcParser(tokenStream);

        ParseTree tree = parser.prog();

        arnoldc interpreter = new arnoldc(new Conf());
        interpreter.visit(tree);
    }
}
