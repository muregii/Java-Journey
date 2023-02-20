//import java.security.NoSuchAlgorithmException;
import java.util.*;


public class HashMarkov implements MarkovInterface {
    protected String[] myWords;     // Training text split into array of words 
    protected Random myRandom;      // Random number generator
    protected int myOrder;          // Length of WordGrams used
    protected HashMap <WordGram, ArrayList<String>> myMap;

    public HashMarkov() {
        this(2);
    }

    public HashMarkov(int order){
        myOrder = order;
        myRandom = new Random();
        myMap =  new HashMap<>();
    }

    @Override
    public void setTraining(String text){
        myWords = text.split("\\s+");
        myMap.clear();

        for (int i = 0; i<myWords.length-myOrder; i++) {
            WordGram wordG = new WordGram(myWords, i, myOrder);

                myMap.putIfAbsent(wordG, new ArrayList<>());
                myMap.get(wordG).add(myWords[i+myOrder]);
        }
    }
    

    @Override
    public List<String> getFollows(WordGram wGramm) {

        List<String> follows = new ArrayList<>();
    
        if(myMap.containsKey(wGramm)){
            follows= myMap.get(wGramm) ;
        }
        return follows;
    }

    private String getNext(WordGram wGramm) {
        List<String> follows = getFollows(wGramm);
        if (follows.size() == 0) {
            int randomIndex = myRandom.nextInt(myWords.length);
            follows.add(myWords[randomIndex]);
        }
        int randomIndex = myRandom.nextInt(follows.size());
        return follows.get(randomIndex);
    }


    @Override
    public String getRandomText(int length){
        ArrayList<String> randomWords = new ArrayList<>(length);
        int index = myRandom.nextInt(myWords.length - myOrder + 1);
        WordGram current = new WordGram(myWords,index,myOrder);
        randomWords.add(current.toString());

        for(int k=0; k < length-myOrder; k += 1) {
            String nextWord = getNext(current);
            randomWords.add(nextWord);
            current = current.shiftAdd(nextWord);
        }
        return String.join(" ", randomWords);

        
    }

    @Override
    public int getOrder() {
        return myOrder;
    }

    @Override
    public void setSeed(long seed) {
        myRandom.setSeed(seed);
    }
}
