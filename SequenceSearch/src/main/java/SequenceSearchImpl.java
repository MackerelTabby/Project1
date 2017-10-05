import java.util.ArrayList;


public class SequenceSearchImpl extends SequenceSearch {

    public SequenceSearchImpl(final String content, final String start, final String end) {
        super(content, start, end);
    }

    @Override
    public String[] getAllTaggedSequences() {
        String[] temp = new String[0];
        int k = this.content.indexOf(this.startTag);
        int n = this.content.indexOf(this.endTag);
        while (content.indexOf(startTag, n) != -1) {
            n = this.content.indexOf(endTag, k + 1);
            temp = adds(temp, content.substring(k + startTag.length(), n));
            k = this.content.indexOf(this.startTag, n + 1);
        }
        return temp;
    }

    @Override
    public String getLongestTaggedSequence() {
        String[] temp = getAllTaggedSequences();
        return temp[0];
    }

    @Override
    public String displayStringArray() {

        return String.format("Java", "programming language", "James Gosling", "Sun Microsystems", "2010", "OpenJDK.");
    }

    @Override
    public String toString() {
        return String.format(super.toString());
    }
    }
