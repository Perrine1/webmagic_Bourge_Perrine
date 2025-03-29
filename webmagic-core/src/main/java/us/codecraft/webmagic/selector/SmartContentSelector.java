package us.codecraft.webmagic.selector;

import us.codecraft.webmagic.utils.Experimental;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Borrowed from https://code.google.com/p/cx-extractor/
 *
 * @author code4crafter@gmail.com <br>
 * @since 0.4.1
 *
 */
@Experimental
public class SmartContentSelector implements Selector {

    private int threshold = 86;

    public SmartContentSelector() {
    }

    public SmartContentSelector(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public String select(String html) {
        // Step 1: Clean HTML
        html = cleanHtml(html);

        // Step 2: Split into lines
        List<String> lines = Arrays.asList(html.split("\n"));

        // Step 3: Compute text density distribution
        List<Integer> indexDistribution = computeTextDensity(lines, 3);

        // Step 4: Extract meaningful text blocks
        return extractTextBlocks(lines, indexDistribution);
    }

    /**
     * Removes unnecessary elements from the HTML.
     * @param html the HTML content
     * @return cleaned HTML
     */
    private String cleanHtml(String html) {
        return html.replaceAll("(?is)<!DOCTYPE.*?>", "")
                .replaceAll("(?is)<!--.*?-->", "")
                .replaceAll("(?is)<script.*?>.*?</script>", "")
                .replaceAll("(?is)<style.*?>.*?</style>", "")
                .replaceAll("&.{2,5};|&#.{2,5};", " ")
                .replaceAll("(?is)<.*?>", "");
    }

    /**
     * Computes the number of characters per block of lines.
     *@param lines the list of lines
    *@param blockSize the size of the block
    *@return the list of text density values 
    */
    private List<Integer> computeTextDensity(List<String> lines, int blockSize) {
        List<Integer> indexDistribution = new ArrayList<>();
        
        for (int i = 0; i < lines.size() - blockSize; i++) {
            int wordsNum = lines.subList(i, i + blockSize)
                                .stream()
                                .map(line -> line.replaceAll("\\s+", "").length())
                                .reduce(0, Integer::sum);
            indexDistribution.add(wordsNum);
        }
        return indexDistribution;
    }

    /**
     * Extracts meaningful text blocks from the given lines based on text density.
     *@param lines the list of lines
    *@param indexDistribution the list of text density values
    *@return the extracted text blocks as a single string  
    */
    private String extractTextBlocks(List<String> lines, List<Integer> indexDistribution) {
        StringBuilder text = new StringBuilder();
        int start = -1, end = -1;
        boolean boolStart = false, boolEnd = false;

        for (int i = 0; i < indexDistribution.size() - 1; i++) {
            if (!boolStart && indexDistribution.get(i) > threshold && 
                (indexDistribution.get(i + 1) != 0 || indexDistribution.get(i + 2) != 0 || indexDistribution.get(i + 3) != 0)) {
                boolStart = true;
                start = i;
                continue;
            }
            if (boolStart && (indexDistribution.get(i) == 0 || indexDistribution.get(i + 1) == 0)) {
                end = i;
                boolEnd = true;
            }
            if (boolEnd) {
                // Extract the detected text block
                String extractedText = lines.subList(start, end + 1)
                                            .stream()
                                            .filter(line -> line.length() >= 5)
                                            .collect(Collectors.joining("\n"));

                // Ignore text containing "Copyright"
                if (!extractedText.contains("Copyright")) {
                    text.append(extractedText).append("\n");
                }
                boolStart = boolEnd = false;
            }
        }
        return text.toString();
    }

    @Override
    public List<String> selectList(String text) {
        throw new UnsupportedOperationException();
    }
}
